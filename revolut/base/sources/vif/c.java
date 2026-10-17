package vif;

import com.revolut.feature.external_accounts.impl.ui.link.screens.iban.IbanScreen;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreen;
import com.revolut.shared.feature.event_appearance.api.models.WelcomeAppearance;
import efm.h0;
import java.util.List;
import kfm.g;
import kfm.o;
import kfm.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import od0.i;
import ulm.l0;
import ulm.m0;
import uyh.w;
import v1.m;
import ylm.q;
import zm3.l;
import zp0.x;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements o, p, g, l0, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f289590b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f289589a = i;
        this.f289590b = obj2;
    }

    @Override // ulm.l0
    public m0 a(q it8) {
        m0 m0Var = (m0) this.f289590b;
        Intrinsics.checkNotNullParameter(it8, "it");
        return m0Var;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f289589a) {
            case 19:
                ((vgk.f) this.f289590b).invoke(obj2);
                break;
            case 20:
                ((vli.g) this.f289590b).invoke(obj2);
                break;
            default:
                ((vm.a) this.f289590b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f289589a) {
            case 0:
                vgk.g gVar = (vgk.g) this.f289590b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) gVar.invoke(p0);
            case 1:
                m mVar = (m) this.f289590b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) mVar.invoke(p0);
            case 2:
            case 3:
            case 4:
            case 9:
            case 19:
            case 20:
            case 23:
            case 24:
            case 26:
            case 27:
            default:
                vn8.a aVar = (vn8.a) this.f289590b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (WelcomeAppearance) aVar.invoke(p0);
            case 5:
                vkb.b bVar = (vkb.b) this.f289590b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) bVar.invoke(p0);
            case 6:
                vkb.b bVar2 = (vkb.b) this.f289590b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) bVar2.invoke(p0);
            case 7:
                vjk.b bVar3 = (vjk.b) this.f289590b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) bVar3.invoke(p0);
            case 8:
                vjk.b bVar4 = (vjk.b) this.f289590b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                bVar4.invoke(p0);
                return Boolean.TRUE;
            case 10:
                vjk.b bVar5 = (vjk.b) this.f289590b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (l) bVar5.invoke(p0);
            case 11:
                vjk.b bVar6 = (vjk.b) this.f289590b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                bVar6.invoke(p0);
                return Boolean.TRUE;
            case 12:
                vjk.b bVar7 = (vjk.b) this.f289590b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FeatureCommand) bVar7.invoke(p0);
            case 13:
                vli.e eVar = (vli.e) this.f289590b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) eVar.invoke(p0);
            case 14:
                w wVar = (w) this.f289590b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) wVar.invoke(p0);
            case 15:
                vjk.b bVar8 = (vjk.b) this.f289590b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                bVar8.invoke(p0);
                return Boolean.TRUE;
            case 16:
                vli.e eVar2 = (vli.e) this.f289590b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) eVar2.invoke(p0);
            case 17:
                vgk.f fVar = (vgk.f) this.f289590b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) fVar.invoke(p0);
            case 18:
                vli.e eVar3 = (vli.e) this.f289590b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) eVar3.invoke(p0);
            case 21:
                ryd.f fVar2 = (ryd.f) this.f289590b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) fVar2.invoke(p0);
            case 22:
                vjk.b bVar9 = (vjk.b) this.f289590b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                bVar9.invoke(p0);
                return Boolean.FALSE;
            case 25:
                vm.a aVar2 = (vm.a) this.f289590b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) aVar2.invoke(p0);
            case 28:
                vn8.a aVar3 = (vn8.a) this.f289590b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wi0.b) aVar3.invoke(p0);
        }
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zp0.x
    public void e(String str, String extractedValue, String rawValue, boolean z) {
        IbanScreen ibanScreen = (IbanScreen) this.f289590b;
        IbanScreen.Companion aVar = IbanScreen.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(rawValue, "formattedValue");
        vn6.i iVar = (vn6.i) ((vn6.g) ibanScreen.O.getValue());
        iVar.getClass();
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        iVar.H2(iVar.f290765p, new w(rawValue, 20, iVar, extractedValue));
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f289589a;
        Object obj2 = this.f289590b;
        switch (i) {
            case 2:
                KProperty[] kPropertyArr = EsimMobilePlanDetailsScreen.V;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 3:
                KProperty[] kPropertyArr2 = EsimMobilePlanDetailsScreen.V;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 4:
                KProperty[] kPropertyArr3 = EsimMobilePlanDetailsScreen.V;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) ((vjk.b) obj2).invoke(p0)).booleanValue();
    }
}
