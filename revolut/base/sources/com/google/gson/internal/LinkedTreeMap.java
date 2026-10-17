package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new m(0);
    private final boolean allowNullValues;
    private final Comparator<? super K> comparator;
    private o entrySet;
    final q header;
    private p keySet;
    int modCount;
    q root;
    int size;

    public LinkedTreeMap() {
        this(NATURAL_ORDER, true);
    }

    private static boolean equal(Object obj2, Object obj3) {
        return Objects.equals(obj2, obj3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private void rebalance(q qVar, boolean z) {
        while (qVar != null) {
            q qVar2 = qVar.f49652b;
            q qVar3 = qVar.f49653c;
            int i = qVar2 != null ? qVar2.i : 0;
            int i2 = qVar3 != null ? qVar3.i : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                q qVar4 = qVar3.f49652b;
                q qVar5 = qVar3.f49653c;
                int i5 = (qVar4 != null ? qVar4.i : 0) - (qVar5 != null ? qVar5.i : 0);
                if (i5 == -1 || (i5 == 0 && !z)) {
                    rotateLeft(qVar);
                } else {
                    rotateRight(qVar3);
                    rotateLeft(qVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                q qVar6 = qVar2.f49652b;
                q qVar7 = qVar2.f49653c;
                int i6 = (qVar6 != null ? qVar6.i : 0) - (qVar7 != null ? qVar7.i : 0);
                if (i6 == 1 || (i6 == 0 && !z)) {
                    rotateRight(qVar);
                } else {
                    rotateLeft(qVar2);
                    rotateRight(qVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                qVar.i = i + 1;
                if (z) {
                    return;
                }
            } else {
                qVar.i = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            qVar = qVar.f49651a;
        }
    }

    private void replaceInParent(q qVar, q qVar2) {
        q qVar3 = qVar.f49651a;
        qVar.f49651a = null;
        if (qVar2 != null) {
            qVar2.f49651a = qVar3;
        }
        if (qVar3 == null) {
            this.root = qVar2;
        } else if (qVar3.f49652b == qVar) {
            qVar3.f49652b = qVar2;
        } else {
            qVar3.f49653c = qVar2;
        }
    }

    private void rotateLeft(q qVar) {
        q qVar2 = qVar.f49652b;
        q qVar3 = qVar.f49653c;
        q qVar4 = qVar3.f49652b;
        q qVar5 = qVar3.f49653c;
        qVar.f49653c = qVar4;
        if (qVar4 != null) {
            qVar4.f49651a = qVar;
        }
        replaceInParent(qVar, qVar3);
        qVar3.f49652b = qVar;
        qVar.f49651a = qVar3;
        int iMax = Math.max(qVar2 != null ? qVar2.i : 0, qVar4 != null ? qVar4.i : 0) + 1;
        qVar.i = iMax;
        qVar3.i = Math.max(iMax, qVar5 != null ? qVar5.i : 0) + 1;
    }

    private void rotateRight(q qVar) {
        q qVar2 = qVar.f49652b;
        q qVar3 = qVar.f49653c;
        q qVar4 = qVar2.f49652b;
        q qVar5 = qVar2.f49653c;
        qVar.f49652b = qVar5;
        if (qVar5 != null) {
            qVar5.f49651a = qVar;
        }
        replaceInParent(qVar, qVar2);
        qVar2.f49653c = qVar;
        qVar.f49651a = qVar2;
        int iMax = Math.max(qVar3 != null ? qVar3.i : 0, qVar5 != null ? qVar5.i : 0) + 1;
        qVar.i = iMax;
        qVar2.i = Math.max(iMax, qVar4 != null ? qVar4.i : 0) + 1;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        q qVar = this.header;
        qVar.e = qVar;
        qVar.d = qVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj2) {
        return findByObject(obj2) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        o oVar = this.entrySet;
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(this);
        this.entrySet = oVar2;
        return oVar2;
    }

    public q find(K k, boolean z) {
        int iCompareTo;
        q qVar;
        Comparator<? super K> comparator = this.comparator;
        q qVar2 = this.root;
        if (qVar2 != null) {
            Comparable comparable = comparator == NATURAL_ORDER ? (Comparable) k : null;
            while (true) {
                a00.c cVar = (Object) qVar2.f;
                iCompareTo = comparable != null ? comparable.compareTo(cVar) : comparator.compare(k, cVar);
                if (iCompareTo == 0) {
                    return qVar2;
                }
                q qVar3 = iCompareTo < 0 ? qVar2.f49652b : qVar2.f49653c;
                if (qVar3 == null) {
                    break;
                }
                qVar2 = qVar3;
            }
        } else {
            iCompareTo = 0;
        }
        q qVar4 = qVar2;
        if (!z) {
            return null;
        }
        q qVar5 = this.header;
        if (qVar4 != null) {
            qVar = new q(this.allowNullValues, qVar4, k, qVar5, qVar5.e);
            if (iCompareTo < 0) {
                qVar4.f49652b = qVar;
            } else {
                qVar4.f49653c = qVar;
            }
            rebalance(qVar4, true);
        } else {
            if (comparator == NATURAL_ORDER && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName().concat(" is not Comparable"));
            }
            qVar = new q(this.allowNullValues, qVar4, k, qVar5, qVar5.e);
            this.root = qVar;
        }
        this.size++;
        this.modCount++;
        return qVar;
    }

    public q findByEntry(Map.Entry<?, ?> entry) {
        q qVarFindByObject = findByObject(entry.getKey());
        if (qVarFindByObject == null || !equal(qVarFindByObject.f49655h, entry.getValue())) {
            return null;
        }
        return qVarFindByObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q findByObject(Object obj2) {
        if (obj2 != 0) {
            try {
                return find(obj2, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj2) {
        q qVarFindByObject = findByObject(obj2);
        if (qVarFindByObject != null) {
            return (V) qVarFindByObject.f49655h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        p pVar = this.keySet;
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(this);
        this.keySet = pVar2;
        return pVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        if (v == null && !this.allowNullValues) {
            throw new NullPointerException("value == null");
        }
        q qVarFind = find(k, true);
        V v2 = (V) qVarFind.f49655h;
        qVarFind.f49655h = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj2) {
        q qVarRemoveInternalByKey = removeInternalByKey(obj2);
        if (qVarRemoveInternalByKey != null) {
            return (V) qVarRemoveInternalByKey.f49655h;
        }
        return null;
    }

    public void removeInternal(q qVar, boolean z) {
        q qVar2;
        q qVar3;
        int i;
        if (z) {
            q qVar4 = qVar.e;
            qVar4.d = qVar.d;
            qVar.d.e = qVar4;
        }
        q qVar5 = qVar.f49652b;
        q qVar6 = qVar.f49653c;
        q qVar7 = qVar.f49651a;
        int i2 = 0;
        if (qVar5 == null || qVar6 == null) {
            if (qVar5 != null) {
                replaceInParent(qVar, qVar5);
                qVar.f49652b = null;
            } else if (qVar6 != null) {
                replaceInParent(qVar, qVar6);
                qVar.f49653c = null;
            } else {
                replaceInParent(qVar, null);
            }
            rebalance(qVar7, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (qVar5.i > qVar6.i) {
            q qVar8 = qVar5.f49653c;
            while (true) {
                q qVar9 = qVar8;
                qVar3 = qVar5;
                qVar5 = qVar9;
                if (qVar5 == null) {
                    break;
                } else {
                    qVar8 = qVar5.f49653c;
                }
            }
        } else {
            q qVar10 = qVar6.f49652b;
            while (true) {
                qVar2 = qVar6;
                qVar6 = qVar10;
                if (qVar6 == null) {
                    break;
                } else {
                    qVar10 = qVar6.f49652b;
                }
            }
            qVar3 = qVar2;
        }
        removeInternal(qVar3, false);
        q qVar11 = qVar.f49652b;
        if (qVar11 != null) {
            i = qVar11.i;
            qVar3.f49652b = qVar11;
            qVar11.f49651a = qVar3;
            qVar.f49652b = null;
        } else {
            i = 0;
        }
        q qVar12 = qVar.f49653c;
        if (qVar12 != null) {
            i2 = qVar12.i;
            qVar3.f49653c = qVar12;
            qVar12.f49651a = qVar3;
            qVar.f49653c = null;
        }
        qVar3.i = Math.max(i, i2) + 1;
        replaceInParent(qVar, qVar3);
    }

    public q removeInternalByKey(Object obj2) {
        q qVarFindByObject = findByObject(obj2);
        if (qVarFindByObject != null) {
            removeInternal(qVarFindByObject, true);
        }
        return qVarFindByObject;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public LinkedTreeMap(boolean z) {
        this(NATURAL_ORDER, z);
    }

    public LinkedTreeMap(Comparator<? super K> comparator, boolean z) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator == null ? NATURAL_ORDER : comparator;
        this.allowNullValues = z;
        this.header = new q(z);
    }
}
