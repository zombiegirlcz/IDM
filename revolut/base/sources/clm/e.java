package clm;

import efm.y;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ifm.c f25070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f25071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25072c;
    public final /* synthetic */ skm.l d;
    public final /* synthetic */ a e;
    public final /* synthetic */ Object f;

    public e(skm.l lVar, a aVar, Object obj2) {
        this.d = lVar;
        this.e = aVar;
        this.f = obj2;
    }

    @Override // efm.y
    public final void onComplete() {
        boolean z = this.f25072c;
        skm.l lVar = this.d;
        if (z) {
            if (lVar.d()) {
                m.Companion companion = yhm.m.INSTANCE;
                lVar.resumeWith(this.f25071b);
                return;
            }
            return;
        }
        a aVar = a.FIRST_OR_DEFAULT;
        a aVar2 = this.e;
        if (aVar2 == aVar) {
            m.Companion companion2 = yhm.m.INSTANCE;
            lVar.resumeWith(this.f);
        } else if (lVar.d()) {
            m.Companion companion3 = yhm.m.INSTANCE;
            lVar.resumeWith(yhm.o.a(new NoSuchElementException("No value received via onNext for " + aVar2)));
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        m.Companion companion = yhm.m.INSTANCE;
        this.d.resumeWith(yhm.o.a(th10));
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        int[] iArr = d.f25069a;
        a aVar = this.e;
        int i = iArr[aVar.ordinal()];
        skm.l lVar = this.d;
        if (i == 1 || i == 2) {
            if (this.f25072c) {
                return;
            }
            this.f25072c = true;
            m.Companion companion = yhm.m.INSTANCE;
            lVar.resumeWith(obj2);
            ifm.c cVar = this.f25070a;
            if (cVar != null) {
                cVar.dispose();
                return;
            } else {
                Intrinsics.r("subscription");
                throw null;
            }
        }
        if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (aVar != a.SINGLE || !this.f25072c) {
            this.f25071b = obj2;
            this.f25072c = true;
            return;
        }
        if (lVar.d()) {
            m.Companion companion2 = yhm.m.INSTANCE;
            lVar.resumeWith(yhm.o.a(new IllegalArgumentException("More than one onNext value for " + aVar)));
        }
        ifm.c cVar2 = this.f25070a;
        if (cVar2 != null) {
            cVar2.dispose();
        } else {
            Intrinsics.r("subscription");
            throw null;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        this.f25070a = cVar;
        this.d.r(new bjm.c(cVar, 1));
    }
}
