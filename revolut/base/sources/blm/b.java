package blm;

import a26.s;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import skm.e0;
import skm.l;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements dom.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dom.b f16746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f16747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16748c;
    public boolean d;
    public final /* synthetic */ l e;
    public final /* synthetic */ d f;

    public b(l lVar, d dVar) {
        this.e = lVar;
        this.f = dVar;
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (this.f16746a != null) {
            synchronized (this) {
                bVar.cancel();
                Unit unit = Unit.f186387a;
            }
        } else {
            this.f16746a = bVar;
            this.e.r(new s(this, bVar, 9));
            d dVar = this.f;
            synchronized (this) {
                bVar.a((dVar == d.FIRST || dVar == d.FIRST_OR_DEFAULT) ? 1L : Long.MAX_VALUE);
                Unit unit2 = Unit.f186387a;
            }
        }
    }

    @Override // dom.a
    public final void onComplete() {
        boolean z = this.d;
        l lVar = this.e;
        if (z) {
            e0.v(lVar.e, new IllegalStateException("'onComplete' was called after the publisher already signalled being in a terminal state"));
            return;
        }
        this.d = true;
        boolean z3 = this.f16748c;
        d dVar = this.f;
        if (z3) {
            if (dVar == d.FIRST_OR_DEFAULT || dVar == d.FIRST || !lVar.d()) {
                return;
            }
            m.Companion companion = m.INSTANCE;
            lVar.resumeWith(this.f16747b);
            return;
        }
        if (dVar == d.FIRST_OR_DEFAULT || dVar == d.SINGLE_OR_DEFAULT) {
            m.Companion companion2 = m.INSTANCE;
            lVar.resumeWith(null);
        } else if (lVar.d()) {
            m.Companion companion3 = m.INSTANCE;
            lVar.resumeWith(o.a(new NoSuchElementException("No value received via onNext for " + dVar)));
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        boolean z = this.d;
        l lVar = this.e;
        if (z) {
            e0.v(lVar.e, new IllegalStateException("'onError' was called after the publisher already signalled being in a terminal state"));
            return;
        }
        this.d = true;
        m.Companion companion = m.INSTANCE;
        lVar.resumeWith(o.a(th10));
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        dom.b bVar = this.f16746a;
        l lVar = this.e;
        if (bVar == null) {
            e0.v(lVar.e, new IllegalStateException("'onNext' was called before 'onSubscribe'"));
            return;
        }
        if (this.d) {
            e0.v(lVar.e, new IllegalStateException("'onNext' was called after the publisher already signalled being in a terminal state"));
            return;
        }
        int i = a.f16745a[this.f.ordinal()];
        if (i == 1 || i == 2) {
            if (this.f16748c) {
                e0.v(this.e.e, new IllegalStateException("Only a single value was requested in '" + this.f + "', but the publisher provided more"));
                return;
            }
            this.f16748c = true;
            synchronized (this) {
                bVar.cancel();
                Unit unit = Unit.f186387a;
            }
            l lVar2 = this.e;
            m.Companion companion = m.INSTANCE;
            lVar2.resumeWith(obj2);
            return;
        }
        if (i != 3 && i != 4 && i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        d dVar = this.f;
        if ((dVar != d.SINGLE && dVar != d.SINGLE_OR_DEFAULT) || !this.f16748c) {
            this.f16747b = obj2;
            this.f16748c = true;
            return;
        }
        synchronized (this) {
            bVar.cancel();
            Unit unit2 = Unit.f186387a;
        }
        if (this.e.d()) {
            l lVar3 = this.e;
            m.Companion companion2 = m.INSTANCE;
            lVar3.resumeWith(o.a(new IllegalArgumentException("More than one onNext value for " + this.f)));
        }
    }
}
