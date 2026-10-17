package ge6;

import com.revolut.data.model.Data;
import com.revolut.feature.rewards.api.model.rewards.RewardAction;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlow;
import efm.h0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements kfm.o, kfm.p, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f143239b;

    public /* synthetic */ j(int i, Function1 function1) {
        this.f143238a = i;
        this.f143239b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f143238a) {
            case 5:
                ((m) this.f143239b).invoke(obj2);
                break;
            case 6:
                ((m) this.f143239b).invoke(obj2);
                break;
            case 7:
                ((m) this.f143239b).invoke(obj2);
                break;
            case 8:
                ((m) this.f143239b).invoke(obj2);
                break;
            case 10:
                ((m) this.f143239b).invoke(obj2);
                break;
            case 11:
                ((m) this.f143239b).invoke(obj2);
                break;
            case 23:
                ((gif.d) this.f143239b).invoke(obj2);
                break;
            default:
                ((g9i.s) this.f143239b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f143238a) {
            case 0:
                gd8.j jVar = (gd8.j) this.f143239b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) jVar.invoke(p0);
            case 1:
                m mVar = (m) this.f143239b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) mVar.invoke(p0);
            case 2:
                m mVar2 = (m) this.f143239b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) mVar2.invoke(p0);
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 15:
            case 16:
            case 22:
            case 23:
            case 24:
            case 25:
            default:
                gif.d dVar = (gif.d) this.f143239b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) dVar.invoke(p0);
            case 4:
                m mVar3 = (m) this.f143239b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) mVar3.invoke(p0);
            case 9:
                m mVar4 = (m) this.f143239b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) mVar4.invoke(p0);
            case 13:
                ghk.r rVar = (ghk.r) this.f143239b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) rVar.invoke(p0);
            case 14:
                ghk.r rVar2 = (ghk.r) this.f143239b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) rVar2.invoke(p0);
            case 17:
                gic.i iVar = (gic.i) this.f143239b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) iVar.invoke(p0);
            case 18:
                g31.e eVar = (g31.e) this.f143239b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (RewardAction) eVar.invoke(p0);
            case 19:
                gic.i iVar2 = (gic.i) this.f143239b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) iVar2.invoke(p0);
            case 20:
                ghk.r rVar3 = (ghk.r) this.f143239b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) rVar3.invoke(p0);
            case 21:
                ghk.r rVar4 = (ghk.r) this.f143239b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) rVar4.invoke(p0);
            case 26:
                ghk.r rVar5 = (ghk.r) this.f143239b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Throwable) rVar5.invoke(p0);
            case 27:
                gif.d dVar2 = (gif.d) this.f143239b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) dVar2.invoke(p0);
            case 28:
                gif.d dVar3 = (gif.d) this.f143239b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) dVar3.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f143238a;
        Function1 function1 = this.f143239b;
        switch (i) {
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 12:
                KProperty[] kPropertyArr = PlanPagerFlow.U;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) ((ghk.r) function1).invoke(p0)).booleanValue();
    }
}
