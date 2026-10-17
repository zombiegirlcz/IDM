package ch6;

import com.revolut.feature.external_accounts.impl.mandate.create_mandate.CreateMandateScreen;
import com.revolut.feature.tab.accounts.impl.ui.tab.AccountsController;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.search.TravelMilesAirlinesSearchScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.home.search.TravelMilesAirlinesHomeSearchScreen;
import com.revolut.sso.impl.ui.card_pin.card_pin.enter_card_number.EnterCardNumberScreen;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zp0.x;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements kfm.p, kfm.o, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24128b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f24127a = i;
        this.f24128b = obj2;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f24127a;
        Object obj2 = this.f24128b;
        switch (i) {
            case 1:
                KProperty[] kPropertyArr = TravelMilesAirlinesSearchScreen.W;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 3:
            case 15:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 4:
                KProperty[] kPropertyArr2 = AccountsController.O0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 5:
                KProperty[] kPropertyArr3 = AccountsController.O0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 6:
                KProperty[] kPropertyArr4 = TravelMilesAirlinesHomeSearchScreen.T;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((cjj.j) obj2).invoke(p0);
                break;
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return (cmc.i) ((cjj.j) obj2).invoke(p0);
    }

    @Override // zp0.x
    public void e(String str, String str2, String formattedValue, boolean z) {
        EnterCardNumberScreen enterCardNumberScreen = (EnterCardNumberScreen) this.f24128b;
        KProperty[] kPropertyArr = EnterCardNumberScreen.f106397e0;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        enterCardNumberScreen.X.k(formattedValue);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f24127a;
        cge.g gVar = (cge.g) this.f24128b;
        switch (i) {
            case 0:
                CreateMandateScreen.Companion aVar = CreateMandateScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                KProperty[] kPropertyArr = AccountsController.O0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) gVar.invoke(p0)).booleanValue();
    }
}
