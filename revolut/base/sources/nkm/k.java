package nkm;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class k implements Iterator, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f216850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f216851b = -2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f216852c;

    public k(l lVar) {
        this.f216852c = lVar;
    }

    public final void a() {
        Object objInvoke;
        int i = this.f216851b;
        l lVar = this.f216852c;
        if (i == -2) {
            objInvoke = ((Function0) lVar.f216855c).invoke();
        } else {
            Function1 function1 = lVar.f216854b;
            Object obj2 = this.f216850a;
            Intrinsics.h(obj2);
            objInvoke = function1.invoke(obj2);
        }
        this.f216850a = objInvoke;
        this.f216851b = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f216851b < 0) {
            a();
        }
        return this.f216851b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f216851b < 0) {
            a();
        }
        if (this.f216851b == 0) {
            throw new NoSuchElementException();
        }
        Object obj2 = this.f216850a;
        Intrinsics.i(obj2, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f216851b = -1;
        return obj2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
