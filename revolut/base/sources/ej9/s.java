package ej9;

import com.revolut.feature.insurance.impl.ui.cfac.claim.review_claim.CFACInsuranceReviewClaimScreen;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s implements kfm.o, kfm.g, kfm.p, efm.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f126831b;

    public /* synthetic */ s(Object obj2, int i) {
        this.f126830a = i;
        this.f126831b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f126830a) {
            case 1:
                ((q) this.f126831b).invoke(obj2);
                break;
            case 3:
                ((q) this.f126831b).invoke(obj2);
                break;
            case 14:
                ((eli.c) this.f126831b).invoke(obj2);
                break;
            case 18:
                ((eli.c) this.f126831b).invoke(obj2);
                break;
            case 19:
                ((eli.e) this.f126831b).invoke(obj2);
                break;
            case 20:
                ((eli.c) this.f126831b).invoke(obj2);
                break;
            case 22:
                ((eli.e) this.f126831b).invoke(obj2);
                break;
            case 24:
                ((eli.c) this.f126831b).invoke(obj2);
                break;
            default:
                ((ei8.d) this.f126831b).invoke(obj2);
                break;
        }
    }

    @Override // efm.x
    public efm.w apply(efm.r observable) {
        eli.j jVar = (eli.j) this.f126831b;
        Intrinsics.checkNotNullParameter(observable, "observable");
        return observable.retryWhen(new s(new eli.c(jVar, 3), 13)).doOnNext(new s(new eli.c(jVar, 4), 14)).retryWhen(new s(new eli.c(jVar, 5), 15));
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f126830a;
        Object obj2 = this.f126831b;
        switch (i) {
            case 4:
                KProperty[] kPropertyArr = CFACInsuranceReviewClaimScreen.f75097h0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((ej6.x) obj2).invoke(p0)).booleanValue();
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((ei8.d) obj2).invoke(p0)).booleanValue();
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((elb.a) obj2).invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f126830a) {
            case 0:
                eed.j jVar = (eed.j) this.f126831b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ux4.b) jVar.invoke(p0);
            case 1:
            case 3:
            case 4:
            case 12:
            case 14:
            case 18:
            case 19:
            case 20:
            case 22:
            case 23:
            case 24:
            default:
                elb.a aVar = (elb.a) this.f126831b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (zm0.d) aVar.invoke(p0);
            case 2:
                ej6.x xVar = (ej6.x) this.f126831b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) xVar.invoke(p0);
            case 5:
                ej6.x xVar2 = (ej6.x) this.f126831b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) xVar2.invoke(p0);
            case 6:
                ej6.x xVar3 = (ej6.x) this.f126831b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) xVar3.invoke(p0);
            case 7:
                eli.c cVar = (eli.c) this.f126831b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) cVar.invoke(p0);
            case 8:
                eli.c cVar2 = (eli.c) this.f126831b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) cVar2.invoke(p0);
            case 9:
                eli.d dVar = (eli.d) this.f126831b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) dVar.invoke(p0);
            case 10:
                eli.c cVar3 = (eli.c) this.f126831b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) cVar3.invoke(p0);
            case 11:
                eli.d dVar2 = (eli.d) this.f126831b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) dVar2.invoke(p0);
            case 13:
                eli.c cVar4 = (eli.c) this.f126831b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) cVar4.invoke(p0);
            case 15:
                eli.c cVar5 = (eli.c) this.f126831b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) cVar5.invoke(p0);
            case 16:
                eli.c cVar6 = (eli.c) this.f126831b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) cVar6.invoke(p0);
            case 17:
                eli.c cVar7 = (eli.c) this.f126831b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) cVar7.invoke(p0);
            case 21:
                eli.d dVar3 = (eli.d) this.f126831b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) dVar3.invoke(p0);
            case 25:
                eli.c cVar8 = (eli.c) this.f126831b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) cVar8.invoke(p0);
            case 26:
                eli.d dVar4 = (eli.d) this.f126831b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) dVar4.invoke(p0);
        }
    }
}
