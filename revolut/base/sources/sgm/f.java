package sgm;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;

/* JADX INFO: loaded from: classes14.dex */
public final class f implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f262819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f262820c;

    public /* synthetic */ f(Object obj2, int i) {
        this.f262818a = i;
        this.f262820c = obj2;
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.g a() {
        kotlin.reflect.jvm.internal.impl.protobuf.g gVar;
        Stack stack = (Stack) this.f262819b;
        kotlin.reflect.jvm.internal.impl.protobuf.g gVar2 = (kotlin.reflect.jvm.internal.impl.protobuf.g) this.f262820c;
        if (gVar2 == null) {
            throw new NoSuchElementException();
        }
        while (true) {
            if (stack.isEmpty()) {
                gVar = null;
                break;
            }
            ByteString byteString = ((kotlin.reflect.jvm.internal.impl.protobuf.i) stack.pop()).f187536c;
            while (byteString instanceof kotlin.reflect.jvm.internal.impl.protobuf.i) {
                kotlin.reflect.jvm.internal.impl.protobuf.i iVar = (kotlin.reflect.jvm.internal.impl.protobuf.i) byteString;
                stack.push(iVar);
                byteString = iVar.f187535b;
            }
            kotlin.reflect.jvm.internal.impl.protobuf.g gVar3 = (kotlin.reflect.jvm.internal.impl.protobuf.g) byteString;
            if (!gVar3.isEmpty()) {
                gVar = gVar3;
                break;
            }
        }
        this.f262820c = gVar;
        return gVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f262818a) {
            case 0:
                Object obj2 = ((g) this.f262820c).f262838b;
                this.f262819b = obj2;
                return !(obj2 == ygm.l.COMPLETE);
            case 1:
                return ((Iterator) this.f262819b).hasNext();
            case 2:
                this.f262819b = ((tfm.e) this.f262820c).f270418b;
                return !zfm.m.c(r0);
            default:
                return ((kotlin.reflect.jvm.internal.impl.protobuf.g) this.f262820c) != null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f262818a) {
            case 0:
                try {
                    if (this.f262819b == null) {
                        this.f262819b = ((g) this.f262820c).f262838b;
                    }
                    Object obj2 = this.f262819b;
                    if (obj2 == ygm.l.COMPLETE) {
                        throw new NoSuchElementException();
                    }
                    if (obj2 instanceof ygm.j) {
                        throw ygm.g.f(((ygm.j) obj2).f313674a);
                    }
                    this.f262819b = null;
                    return obj2;
                } catch (Throwable th10) {
                    this.f262819b = null;
                    throw th10;
                }
            case 1:
                Object key = ((Map.Entry) ((Iterator) this.f262819b).next()).getKey();
                smm.b bVar = new smm.b(((smm.d) this.f262820c).f264463b, key);
                rmm.a aVar = new rmm.a();
                aVar.f255365a = key;
                aVar.f255366b = bVar;
                return aVar;
            case 2:
                try {
                    if (this.f262819b == null) {
                        this.f262819b = ((tfm.e) this.f262820c).f270418b;
                    }
                    if (zfm.m.c(this.f262819b)) {
                        throw new NoSuchElementException();
                    }
                    Object obj3 = this.f262819b;
                    if (obj3 instanceof zfm.k) {
                        throw zfm.h.d(((zfm.k) obj3).f322037a);
                    }
                    this.f262819b = null;
                    return obj3;
                } catch (Throwable th11) {
                    this.f262819b = null;
                    throw th11;
                }
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f262818a) {
            case 0:
                throw new UnsupportedOperationException("Read only iterator");
            case 1:
                ((Iterator) this.f262819b).remove();
                return;
            case 2:
                throw new UnsupportedOperationException("Read only iterator");
            default:
                throw new UnsupportedOperationException();
        }
    }

    public f(ByteString byteString) {
        this.f262818a = 3;
        this.f262819b = new Stack();
        while (byteString instanceof kotlin.reflect.jvm.internal.impl.protobuf.i) {
            kotlin.reflect.jvm.internal.impl.protobuf.i iVar = (kotlin.reflect.jvm.internal.impl.protobuf.i) byteString;
            ((Stack) this.f262819b).push(iVar);
            byteString = iVar.f187535b;
        }
        this.f262820c = (kotlin.reflect.jvm.internal.impl.protobuf.g) byteString;
    }

    public f(smm.d dVar, Iterator it8) {
        this.f262818a = 1;
        this.f262820c = dVar;
        this.f262818a = 1;
        if (it8 != null) {
            this.f262819b = it8;
            return;
        }
        throw new NullPointerException("Iterator must not be null");
    }
}
