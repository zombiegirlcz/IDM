package a9d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.onboarding.api.user_migration.model.UserMigration;
import com.revolut.feature.trading_asset_quotes.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.wealth.domain.api.interactors.TradingStatementsInteractor$NotReadyException;
import ip0.dg;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2417a;

    public /* synthetic */ p(int i) {
        this.f2417a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Throwable {
        switch (this.f2417a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 1:
                Throwable th10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                if (th10 == null) {
                    throw new IllegalStateException("Unable to fetch instrument");
                }
                throw th10;
            case 2:
                Throwable th11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                if (th11 == null) {
                    throw new IllegalStateException("Smart tile without chart is not supported");
                }
                throw th11;
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 4:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                List list = (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
                m70.a.c(t0.f186434a);
                return new ab4.o(list, ab4.u.a(""), null, null);
            case 5:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null));
            case 6:
                Throwable error = (Throwable) obj2;
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (juniorBankingProfile == null) {
                    return error;
                }
                return null;
            case 7:
                ((Boolean) obj2).booleanValue();
                return Optional.empty();
            case 8:
                Throwable error2 = (Throwable) obj2;
                qua.p pVar = (qua.p) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (pVar == null) {
                    return error2;
                }
                return null;
            case 9:
                Throwable error3 = (Throwable) obj2;
                of8.b bVar = (of8.b) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (bVar == null) {
                    return error3;
                }
                return null;
            case 10:
                Throwable th12 = (Throwable) obj2;
                if (((Pair) obj3) == null) {
                    return th12;
                }
                return null;
            case 11:
                Throwable error4 = (Throwable) obj2;
                acb.b bVar2 = (acb.b) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (bVar2 == null) {
                    return error4;
                }
                return null;
            case 12:
                Throwable error5 = (Throwable) obj2;
                OrderQuote orderQuote = (OrderQuote) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (orderQuote == null) {
                    return error5;
                }
                return null;
            case 13:
                Throwable th13 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th13;
                }
                return null;
            case 14:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                od0.i.Companion.getClass();
                if (zBooleanValue) {
                    return null;
                }
                return od0.i.f224256b;
            case 15:
                Throwable error6 = (Throwable) obj2;
                UserMigration userMigration = (UserMigration) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (userMigration == null) {
                    return error6;
                }
                return null;
            case 16:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new cii.b(null, (List) getDefaultErrorItems3.invoke(new iii.d(14, null, false, false, null)), new lw0.a(new TextLocalisedClause(R$string.trading_asset_quotes_total_exchange_fees_title, null, null, 14), null, null, null, false, 30));
            case 17:
                Throwable th14 = (Throwable) obj2;
                if (((Boolean) obj3) == null) {
                    return th14;
                }
                return null;
            case 18:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new aeg.e((List) getDefaultErrorItems4.invoke(new iii.d(12, null, true, true, null)), new aeg.d(f0.f322471a), false);
            case 19:
                Throwable e = (Throwable) obj2;
                String str = (String) obj3;
                Intrinsics.checkNotNullParameter(e, "e");
                if (str == null) {
                    return e;
                }
                return null;
            case 20:
                Throwable error7 = (Throwable) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.checkNotNullParameter(error7, "error");
                return Boolean.valueOf((error7 instanceof TradingStatementsInteractor$NotReadyException) && iIntValue < 2);
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, true);
            case 22:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(12, null, true, false, null));
            case 23:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return (List) getDefaultErrorItems6.invoke(new iii.d(12, null, true, false, null));
            case 24:
                gef.b bVar3 = (gef.b) obj2;
                gef.b bVar4 = (gef.b) obj3;
                Intrinsics.checkNotNullParameter(bVar4, "new");
                if (bVar3 == null) {
                    return bVar4;
                }
                LocalDateTime createdSince = bVar4.f143282a;
                boolean z = bVar4.f143283b;
                ArrayList transactions = d0.E0(bVar4.f143284c, bVar3.f143284c);
                Intrinsics.checkNotNullParameter(createdSince, "createdSince");
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return new gef.b(createdSince, z, transactions);
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.u.c(new dg("ERROR_ITEM_ID", new TextLocalisedClause(R.string.error_generic, null, null, 14), new TextLocalisedClause(R.string.common_action_try_again, null, null, 14)));
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                int i = com.revolut.feature.travel.hotels.api.R$string.hotels_booking_details_suggested_experiences_title;
                m70.a.c(t0.f186434a);
                return new TextLocalisedClause(i, zhm.u.c(""), null, 12);
            case 27:
                Throwable error8 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (list2 == null) {
                    return error8;
                }
                return null;
            case 28:
                Function1 getDefaultErrorItems7 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                return (List) getDefaultErrorItems7.invoke(new iii.d(14, null, false, false, null));
            default:
                Function1 getDefaultErrorItems8 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems8, "getDefaultErrorItems");
                return (List) getDefaultErrorItems8.invoke(new iii.d(12, null, false, true, null));
        }
    }

    public /* synthetic */ p(cli.n nVar, int i) {
        this.f2417a = i;
    }
}
