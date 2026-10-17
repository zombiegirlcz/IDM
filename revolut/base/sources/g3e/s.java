package g3e;

import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.feature.card_order_new.api.CardOrderNewFeatureConfig;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140289a;

    public /* synthetic */ s(int i) {
        this.f140289a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f140289a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(10, null, false, false, "EXCLUSIVES_ERROR_STATE_HERO_ITEM_ID"));
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, false);
            case 2:
                n38.a jointAccount = (n38.a) obj2;
                NaviCommand homeCommand = (NaviCommand) obj3;
                Intrinsics.checkNotNullParameter(jointAccount, "jointAccount");
                Intrinsics.checkNotNullParameter(homeCommand, "homeCommand");
                return new FeatureCommand(new CardDesignFeatureConfig(b93.e.VIRTUAL, l38.a.c(jointAccount), null, null, null, false, null, false, false, null, null, null, homeCommand, null, null, null, null, null, null, null, null, false, false, null, 536838138));
            case 3:
                n38.a jointAccount2 = (n38.a) obj2;
                Intrinsics.checkNotNullParameter(jointAccount2, "jointAccount");
                Intrinsics.checkNotNullParameter((NaviCommand) obj3, "homeCommand");
                return new FeatureCommand(new CardsScreenFeatureConfig(null, l38.a.c(jointAccount2).f51413b, null, l38.a.c(jointAccount2), new CardScreenAction.AddToGooglePay((String) null), 5));
            case 4:
                n38.a jointAccount3 = (n38.a) obj2;
                NaviCommand homeCommand2 = (NaviCommand) obj3;
                Intrinsics.checkNotNullParameter(jointAccount3, "jointAccount");
                Intrinsics.checkNotNullParameter(homeCommand2, "homeCommand");
                return new FeatureCommand(new CardOrderNewFeatureConfig(SelectedTab.JOINT, l38.a.c(jointAccount3), homeCommand2, null, null, false, null, null, null, null, null, null, 16368));
            case 5:
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, (Throwable) obj2, h0Var);
                return null;
            case 6:
                Throwable th10 = (Throwable) obj2;
                if (((n38.a) obj3) == null) {
                    return th10;
                }
                return null;
            case 7:
                Throwable th11 = (Throwable) obj2;
                if (((Pair) obj3) == null) {
                    return th11;
                }
                return null;
            case 8:
                Throwable th12 = (Throwable) obj2;
                if (((od0.i) obj3) == null) {
                    return th12;
                }
                return null;
            case 9:
                Throwable th13 = (Throwable) obj2;
                if (((od0.i) obj3) == null) {
                    return th13;
                }
                return null;
            case 10:
                Throwable th14 = (Throwable) obj2;
                if (((od0.i) obj3) == null) {
                    return th14;
                }
                return null;
            case 11:
                Throwable th15 = (Throwable) obj2;
                if (((od0.i) obj3) == null) {
                    return th15;
                }
                return null;
            case 12:
                Throwable th16 = (Throwable) obj2;
                if (((od0.i) obj3) == null) {
                    return th16;
                }
                return null;
            case 13:
                Throwable th17 = (Throwable) obj2;
                if (((od0.i) obj3) == null) {
                    return th17;
                }
                return null;
            case 14:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var2);
                return null;
            case 15:
                ((Boolean) obj2).booleanValue();
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 16:
                Throwable error2 = (Throwable) obj2;
                n38.r rVar = (n38.r) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (rVar == null) {
                    return error2;
                }
                return null;
            case 17:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 18:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 20:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, false, true, null));
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 22:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null));
            case 23:
                Throwable error3 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list == null) {
                    return error3;
                }
                return null;
            case 24:
                Throwable error4 = (Throwable) obj2;
                LoanDetails loanDetails = (LoanDetails) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (loanDetails == null) {
                    return error4;
                }
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return g57.r.d();
            case 26:
                ((Boolean) obj2).getClass();
                return null;
            case 27:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            default:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, false, false, null));
        }
    }

    public /* synthetic */ s(g57.r rVar) {
        this.f140289a = 25;
    }
}
