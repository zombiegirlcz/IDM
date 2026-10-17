package ewh;

import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.FreelancerProfileSettings;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.feature_autoinvest_api.R$string;
import com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import ip0.ti0;
import ip0.ui0;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130294a;

    public /* synthetic */ y(int i) {
        this.f130294a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        ArrayList arrayList;
        ti0 ti0Var = null;
        switch (this.f130294a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return new lw0.a(new TextLocalisedClause(R$string.auto_invest_spare_change_move_title, null, null, 14), null, null, null, false, 30);
            case 1:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 2:
                Throwable error = (Throwable) obj2;
                e7l.f fVar = (e7l.f) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (fVar == null) {
                    return error;
                }
                return null;
            case 3:
                Data data2 = (Data) data;
                return Boolean.valueOf(Intrinsics.f(org.bouncycastle.jcajce.provider.digest.a.m((Data) obj2, data2, "previous", "current"), data2.getContent()));
            case 4:
                Throwable error2 = (Throwable) obj2;
                dj0.d dVar = (dj0.d) data;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (dVar == null) {
                    return error2;
                }
                return null;
            case 5:
                Throwable error3 = (Throwable) obj2;
                l71.d dVar2 = (l71.d) data;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (dVar2 == null) {
                    return error3;
                }
                return null;
            case 6:
                Throwable error4 = (Throwable) obj2;
                do3.n nVar = (do3.n) data;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (nVar == null) {
                    return error4;
                }
                return null;
            case 7:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 8:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 9:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 10:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 11:
                Data remoteData = (Data) obj2;
                List localList = (List) data;
                Intrinsics.checkNotNullParameter(remoteData, "remoteData");
                Intrinsics.checkNotNullParameter(localList, "localList");
                try {
                    Object content = remoteData.getContent();
                    if (content != null) {
                        arrayList = new ArrayList();
                        zhm.a0.x((List) content, arrayList);
                        zhm.a0.x(localList, arrayList);
                    } else {
                        arrayList = null;
                    }
                    return new Data(arrayList, remoteData.getError(), remoteData.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, remoteData.getLoading());
                }
            case 12:
                Throwable th11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                if (th11 != null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th11, h0Var);
                }
                return f0.f322471a;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 14:
                Function1 getDefaultErrorItems2 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new c0c.m((List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null)));
            case 15:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 16:
                Function1 defaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return (List) defaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 17:
                Throwable th12 = (Throwable) obj2;
                if (((FreelancerProfileSettings) data) == null) {
                    return th12;
                }
                return null;
            case 18:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return zhm.u.c(new ui0("ERROR_ITEM_ID", zhm.u.c(new FullScreenStateDelegate.Model("ERROR_STATE_ID", new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), false, null, null, true, 0, 0, 31684)), ti0Var, 12));
            case 19:
                Throwable error5 = (Throwable) obj2;
                TradingAccounts tradingAccounts = (TradingAccounts) data;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (tradingAccounts == null) {
                    return error5;
                }
                return null;
            case 20:
                Throwable error6 = (Throwable) obj2;
                OnboardingPart onboardingPart = (OnboardingPart) data;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (onboardingPart == null) {
                    return error6;
                }
                return null;
            case 21:
                return SaverKt.AutoSaver$lambda$0((SaverScope) obj2, data);
            case 22:
                Function1 getDefaultErrorItems3 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null));
            case 23:
                Throwable error7 = (Throwable) obj2;
                k77.l lVar = (k77.l) data;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (lVar == null) {
                    return error7;
                }
                return null;
            case 24:
                Throwable error8 = (Throwable) obj2;
                List list = (List) data;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (list == null) {
                    return error8;
                }
                return null;
            case 25:
                Throwable error9 = (Throwable) obj2;
                CombinedWatchlistContext combinedWatchlistContext = (CombinedWatchlistContext) data;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (combinedWatchlistContext == null) {
                    return error9;
                }
                return null;
            case 26:
                Throwable error10 = (Throwable) obj2;
                List list2 = (List) data;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (list2 == null) {
                    return error10;
                }
                return null;
            case 27:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 28:
                Throwable error11 = (Throwable) obj2;
                od0.i iVar = (od0.i) data;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (iVar == null) {
                    return error11;
                }
                return null;
            default:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof f5g.b);
        }
    }

    public /* synthetic */ y(cli.n nVar, int i) {
        this.f130294a = i;
    }
}
