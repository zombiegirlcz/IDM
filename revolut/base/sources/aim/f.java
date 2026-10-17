package aim;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \b*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006\t\n\u000b\f\f\rB\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Laim/f;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "Companion", "a", "aim/i", "aim/j", "aim/g", "aim/h", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f<K, V> implements Map<K, V>, Serializable, pim.f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f5319n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f5320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f5321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f5322c;
    public int[] d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5324h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l f5325j;
    public m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k f5326l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5327m;

    /* JADX INFO: renamed from: aim.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Laim/f$a;", "", "", "MAGIC", "I", "INITIAL_CAPACITY", "INITIAL_MAX_PROBE_DISTANCE", "TOMBSTONE", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        f fVar = new f(0);
        fVar.f5327m = true;
        f5319n = fVar;
    }

    public f() {
        this(8);
    }

    public final int a(Object obj2) {
        c();
        while (true) {
            int iL = l(obj2);
            int i = this.e * 2;
            int length = this.d.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                int i3 = iArr[iL];
                if (i3 <= 0) {
                    int i5 = this.f;
                    Object[] objArr = this.f5320a;
                    if (i5 < objArr.length) {
                        int i6 = i5 + 1;
                        this.f = i6;
                        objArr[i5] = obj2;
                        this.f5322c[i5] = iL;
                        iArr[iL] = i6;
                        this.i++;
                        this.f5324h++;
                        if (i2 > this.e) {
                            this.e = i2;
                        }
                        return i5;
                    }
                    h(1);
                } else {
                    if (Intrinsics.f(this.f5320a[i3 - 1], obj2)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        m(this.d.length * 2);
                        break;
                    }
                    iL = iL == 0 ? this.d.length - 1 : iL - 1;
                }
            }
        }
    }

    public final f b() {
        c();
        this.f5327m = true;
        if (this.i > 0) {
            return this;
        }
        f fVar = f5319n;
        Intrinsics.i(fVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return fVar;
    }

    public final void c() {
        if (this.f5327m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f5322c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        com.bumptech.glide.c.z(0, this.f, this.f5320a);
        Object[] objArr = this.f5321b;
        if (objArr != null) {
            com.bumptech.glide.c.z(0, this.f, objArr);
        }
        this.i = 0;
        this.f = 0;
        this.f5324h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj2) {
        return i(obj2) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj2) {
        return k(obj2) >= 0;
    }

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.f5321b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f5322c;
            int i5 = iArr[i2];
            if (i5 >= 0) {
                Object[] objArr2 = this.f5320a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i5;
                    this.d[i5] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        com.bumptech.glide.c.z(i3, i, this.f5320a);
        if (objArr != null) {
            com.bumptech.glide.c.z(i3, this.f, objArr);
        }
        this.f = i3;
    }

    public final boolean e(Collection m3) {
        Intrinsics.checkNotNullParameter(m3, "m");
        for (Object obj2 : m3) {
            if (obj2 != null) {
                try {
                    if (!f((Map.Entry) obj2)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        k kVar = this.f5326l;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this);
        this.f5326l = kVar2;
        return kVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof Map)) {
            return false;
        }
        Map map = (Map) obj2;
        return this.i == map.size() && e(map.entrySet());
    }

    public final boolean f(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int i = i(entry.getKey());
        if (i < 0) {
            return false;
        }
        Object[] objArr = this.f5321b;
        Intrinsics.h(objArr);
        return Intrinsics.f(objArr[i], entry.getValue());
    }

    @Override // java.util.Map
    public final Object get(Object obj2) {
        int i = i(obj2);
        if (i < 0) {
            return null;
        }
        Object[] objArr = this.f5321b;
        Intrinsics.h(objArr);
        return objArr[i];
    }

    public final void h(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f5320a;
        int length = objArr.length;
        int i2 = this.f;
        int i3 = length - i2;
        int i5 = i2 - this.i;
        if (i3 < i && i3 + i5 >= i && i5 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i6 = i2 + i;
        if (i6 < 0) {
            throw new OutOfMemoryError();
        }
        if (i6 > objArr.length) {
            a.Companion c1058a = kotlin.collections.a.INSTANCE;
            int length2 = objArr.length;
            c1058a.getClass();
            int iE = a.Companion.e(length2, i6);
            Object[] objArr2 = this.f5320a;
            Intrinsics.checkNotNullParameter(objArr2, "<this>");
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, iE);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
            this.f5320a = objArrCopyOf2;
            Object[] objArr3 = this.f5321b;
            if (objArr3 != null) {
                Intrinsics.checkNotNullParameter(objArr3, "<this>");
                objArrCopyOf = Arrays.copyOf(objArr3, iE);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f5321b = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f5322c, iE);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f5322c = iArrCopyOf;
            INSTANCE.getClass();
            int iHighestOneBit = Integer.highestOneBit((iE >= 1 ? iE : 1) * 3);
            if (iHighestOneBit > this.d.length) {
                m(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int iD = 0;
        g gVar = new g(this, 0);
        while (gVar.hasNext()) {
            iD += gVar.d();
        }
        return iD;
    }

    public final int i(Object obj2) {
        int iL = l(obj2);
        int i = this.e;
        while (true) {
            int i2 = this.d[iL];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (Intrinsics.f(this.f5320a[i3], obj2)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iL = iL == 0 ? this.d.length - 1 : iL - 1;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.i == 0;
    }

    public final int k(Object obj2) {
        int i = this.f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f5322c[i] >= 0) {
                Object[] objArr = this.f5321b;
                Intrinsics.h(objArr);
                if (Intrinsics.f(objArr[i], obj2)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        l lVar = this.f5325j;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        this.f5325j = lVar2;
        return lVar2;
    }

    public final int l(Object obj2) {
        return ((obj2 != null ? obj2.hashCode() : 0) * (-1640531527)) >>> this.f5323g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r3[r0] = r6;
        r5.f5322c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r6) {
        /*
            r5 = this;
            int r0 = r5.f5324h
            int r0 = r0 + 1
            r5.f5324h = r0
            int r0 = r5.f
            int r1 = r5.i
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.d = r0
            aim.f$a r0 = aim.f.INSTANCE
            r0.getClass()
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f5323g = r6
        L21:
            int r6 = r5.f
            if (r2 >= r6) goto L55
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f5320a
            r0 = r0[r2]
            int r0 = r5.l(r0)
            int r1 = r5.e
        L31:
            int[] r3 = r5.d
            r4 = r3[r0]
            if (r4 != 0) goto L3f
            r3[r0] = r6
            int[] r1 = r5.f5322c
            r1[r2] = r0
            r2 = r6
            goto L21
        L3f:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L4d
            int r4 = r0 + (-1)
            if (r0 != 0) goto L4b
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L31
        L4b:
            r0 = r4
            goto L31
        L4d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aim.f.m(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0027->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f5320a
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r2 = 0
            r0[r12] = r2
            java.lang.Object[] r0 = r11.f5321b
            if (r0 == 0) goto L13
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0[r12] = r2
        L13:
            int[] r0 = r11.f5322c
            r0 = r0[r12]
            int r1 = r11.e
            int r1 = r1 * 2
            int[] r2 = r11.d
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L23
            r1 = r2
        L23:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L27:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L31
            int[] r0 = r11.d
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L32
        L31:
            r0 = r5
        L32:
            int r4 = r4 + 1
            int r5 = r11.e
            r6 = -1
            if (r4 <= r5) goto L3e
            int[] r0 = r11.d
            r0[r1] = r2
            goto L6f
        L3e:
            int[] r5 = r11.d
            r7 = r5[r0]
            if (r7 != 0) goto L47
            r5[r1] = r2
            goto L6f
        L47:
            if (r7 >= 0) goto L4e
            r5[r1] = r6
        L4b:
            r1 = r0
            r4 = r2
            goto L68
        L4e:
            java.lang.Object[] r5 = r11.f5320a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.l(r5)
            int r5 = r5 - r0
            int[] r9 = r11.d
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L68
            r9[r1] = r7
            int[] r4 = r11.f5322c
            r4[r8] = r1
            goto L4b
        L68:
            int r3 = r3 + r6
            if (r3 >= 0) goto L27
            int[] r0 = r11.d
            r0[r1] = r6
        L6f:
            int[] r0 = r11.f5322c
            r0[r12] = r6
            int r12 = r11.i
            int r12 = r12 + r6
            r11.i = r12
            int r12 = r11.f5324h
            int r12 = r12 + 1
            r11.f5324h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aim.f.n(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj2, Object obj3) {
        c();
        int iA = a(obj2);
        Object[] objArr = this.f5321b;
        if (objArr == null) {
            int length = this.f5320a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f5321b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj3;
            return null;
        }
        int i = (-iA) - 1;
        Object obj4 = objArr[i];
        objArr[i] = obj3;
        return obj4;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        c();
        Set<Map.Entry<K, V>> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        h(setEntrySet.size());
        for (Map.Entry<K, V> entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f5321b;
            if (objArr == null) {
                int length = this.f5320a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f5321b = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!Intrinsics.f(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj2) {
        c();
        int i = i(obj2);
        if (i < 0) {
            return null;
        }
        Object[] objArr = this.f5321b;
        Intrinsics.h(objArr);
        Object obj3 = objArr[i];
        n(i);
        return obj3;
    }

    @Override // java.util.Map
    public final int size() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder((this.i * 3) + 2);
        sb6.append("{");
        int i = 0;
        g gVar = new g(this, 0);
        while (gVar.hasNext()) {
            if (i > 0) {
                sb6.append(", ");
            }
            gVar.c(sb6);
            i++;
        }
        sb6.append("}");
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        m mVar = this.k;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this);
        this.k = mVar2;
        return mVar2;
    }

    public f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        INSTANCE.getClass();
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f5320a = objArr;
        this.f5321b = null;
        this.f5322c = iArr;
        this.d = new int[iHighestOneBit];
        this.e = 2;
        this.f = 0;
        this.f5323g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
