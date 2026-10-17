package wlm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class n implements Iterator, pim.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f298551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f298552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f298553c;
    public final /* synthetic */ o d;

    public n(o oVar) {
        this.d = oVar;
        Iterator it8 = new ArrayList(oVar.i.values()).iterator();
        Intrinsics.checkNotNullExpressionValue(it8, "iterator(...)");
        this.f298551a = it8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        k kVarA;
        if (this.f298552b != null) {
            return true;
        }
        o oVar = this.d;
        synchronized (oVar) {
            if (oVar.f298565n) {
                return false;
            }
            while (this.f298551a.hasNext()) {
                j jVar = (j) this.f298551a.next();
                if (jVar != null && (kVarA = jVar.a()) != null) {
                    this.f298552b = kVarA;
                    return true;
                }
            }
            Unit unit = Unit.f186387a;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        k kVar = this.f298552b;
        this.f298553c = kVar;
        this.f298552b = null;
        Intrinsics.h(kVar);
        return kVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        k kVar = this.f298553c;
        if (kVar == null) {
            throw new IllegalStateException("remove() before next()");
        }
        try {
            this.d.o(kVar.f298548a);
        } catch (IOException unused) {
        } finally {
            this.f298553c = null;
        }
    }
}
