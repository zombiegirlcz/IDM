package fjj;

import com.revolut.data.model.Data;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.EsimMobilePlanBillingScreen;
import efm.h0;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements kfm.p, kfm.o, kfm.k, kfm.c, kfm.j, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f135654b;

    public /* synthetic */ b(Function function, int i) {
        this.f135653a = i;
        this.f135654b = function;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((fjd.w) this.f135654b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f135653a) {
            case 6:
                av8.o oVar = (av8.o) this.f135654b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) oVar.invoke(p0);
            case 7:
            case 11:
            case 12:
            case 19:
            case 20:
            case 21:
            case 23:
            case 24:
            default:
                fs5.c cVar = (fs5.c) this.f135654b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) cVar.invoke(p0);
            case 8:
                fp1.c cVar2 = (fp1.c) this.f135654b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) cVar2.invoke(p0);
            case 9:
                fp1.c cVar3 = (fp1.c) this.f135654b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) cVar3.invoke(p0);
            case 10:
                fp1.c cVar4 = (fp1.c) this.f135654b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) cVar4.invoke(p0);
            case 13:
                fp5.c cVar5 = (fp5.c) this.f135654b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) cVar5.invoke(p0);
            case 14:
                eed.i iVar = (eed.i) this.f135654b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) iVar.invoke(p0);
            case 15:
                fo9.a aVar = (fo9.a) this.f135654b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) aVar.invoke(p0);
            case 16:
                fp5.c cVar6 = (fp5.c) this.f135654b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) cVar6.invoke(p0);
            case 17:
                fg8.y yVar = (fg8.y) this.f135654b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (KompotDestination) yVar.invoke(p0);
            case 18:
                fo9.a aVar2 = (fo9.a) this.f135654b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yoj.f) aVar2.invoke(p0);
            case 22:
                fo9.a aVar3 = (fo9.a) this.f135654b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) aVar3.invoke(p0);
            case 25:
                fo9.a aVar4 = (fo9.a) this.f135654b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Throwable) aVar4.invoke(p0);
            case 26:
                fpk.b bVar = (fpk.b) this.f135654b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) bVar.invoke(p0);
            case 27:
                fqj.b bVar2 = (fqj.b) this.f135654b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) bVar2.invoke(p0);
            case 28:
                fqj.b bVar3 = (fqj.b) this.f135654b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) bVar3.invoke(p0);
        }
    }

    @Override // kfm.k
    public Object c(Object p0, Object p17, Object p2, Object p3, Object p42, Object p510) {
        fp1.b bVar = (fp1.b) this.f135654b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        Intrinsics.checkNotNullParameter(p3, "p3");
        Intrinsics.checkNotNullParameter(p42, "p4");
        Intrinsics.checkNotNullParameter(p510, "p5");
        return (Boolean) bVar.invoke(p0, p17, p2, p3, p42, p510);
    }

    @Override // kfm.j
    public Object d(Object p0, Object p17, Object p2, Object p3, Object p42) {
        fp1.e eVar = (fp1.e) this.f135654b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        Intrinsics.checkNotNullParameter(p3, "p3");
        Intrinsics.checkNotNullParameter(p42, "p4");
        return (vo1.b) eVar.invoke(p0, p17, p2, p3, p42);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f135653a;
        Function function = this.f135654b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = EsimMobilePlanBillingScreen.U;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 1:
                KProperty[] kPropertyArr2 = EsimMobilePlanBillingScreen.U;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 2:
                KProperty[] kPropertyArr3 = EsimMobilePlanBillingScreen.U;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 3:
                KProperty[] kPropertyArr4 = EsimMobilePlanBillingScreen.U;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 4:
                KProperty[] kPropertyArr5 = EsimMobilePlanBillingScreen.U;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 5:
                KProperty[] kPropertyArr6 = EsimMobilePlanBillingScreen.U;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) ((fo9.a) function).invoke(p0)).booleanValue();
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        fk4.r rVar = (fk4.r) this.f135654b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (vo1.d) rVar.invoke(p0, p17);
    }
}
