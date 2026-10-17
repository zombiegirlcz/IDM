package r40;

import androidx.content.fragment.FragmentNavigator;
import androidx.lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.BankTransferReviewScreen;
import ip0.ek;
import java.util.List;
import java.util.Map;
import jel.w2;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class y0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251384a;

    public /* synthetic */ y0(int i) {
        this.f251384a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z = false;
        switch (this.f251384a) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return zhm.f0.f322471a;
            case 1:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 2:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.FALSE;
            case 3:
                String str = (String) obj2;
                return a10.b.t(str, "it", "• ", str);
            case 4:
                CellDetailsDelegate.Model it10 = (CellDetailsDelegate.Model) obj2;
                KProperty[] kPropertyArr = BankTransferReviewScreen.f102115n0;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new k5k.b(it10.f51832a, it10.o);
            case 5:
                CellDetailsDelegate.Model it11 = (CellDetailsDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = BankTransferReviewScreen.f102115n0;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new k5k.b(it11.f51832a, it11.o);
            case 6:
                CellDetailsActionDelegate.Model it12 = (CellDetailsActionDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = BankTransferReviewScreen.f102115n0;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new k5k.b(it12.f51781a, it12.f51787l);
            case 7:
                CellDetailsNoteDelegate.Model it13 = (CellDetailsNoteDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = BankTransferReviewScreen.f102115n0;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new k5k.b(it13.f51871a, it13.f51877l);
            case 8:
                ty0.a it14 = (ty0.a) obj2;
                KProperty[] kPropertyArr5 = BankTransferReviewScreen.f102115n0;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new k5k.b(it14.f275445a, it14.d);
            case 9:
                CellDetailsStandaloneNoteDelegate.Model it15 = (CellDetailsStandaloneNoteDelegate.Model) obj2;
                KProperty[] kPropertyArr6 = BankTransferReviewScreen.f102115n0;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new k5k.b(it15.f51902a, it15.f51903b);
            case 10:
                RowDelegate.Model it16 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr7 = BankTransferReviewScreen.f102115n0;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new k5k.b(it16.f53228a, it16.u);
            case 11:
                RowDelegate.Model it17 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr8 = BankTransferReviewScreen.f102115n0;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new k5k.b(it17.f53228a, it17.u);
            case 12:
                ty0.a it18 = (ty0.a) obj2;
                KProperty[] kPropertyArr9 = BankTransferReviewScreen.f102115n0;
                Intrinsics.checkNotNullParameter(it18, "it");
                return new k5k.b(it18.f275445a, it18.d);
            case 13:
                k5k.b it19 = (k5k.b) obj2;
                KProperty[] kPropertyArr10 = BankTransferReviewScreen.f102115n0;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Boolean.valueOf(!(it19.f181530b instanceof k5k.h0));
            case 14:
                BankTransferData updateTransferData = (BankTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                return BankTransferData.a(updateTransferData, 0L, null, null, null, null, null, null, null, null, null, null, null, null, 524287);
            case 15:
                r4k.m updateExtraData = (r4k.m) obj2;
                Intrinsics.checkNotNullParameter(updateExtraData, "$this$updateExtraData");
                TransferTrustData trustData = com.revolut.feature.transfer.models.transfer.a.b(updateExtraData.f);
                kq2.a aVar = updateExtraData.f251483a;
                kq2.f fVar = updateExtraData.f251484b;
                n61.d dVar = updateExtraData.f251485c;
                boolean z3 = updateExtraData.d;
                prf.g countryData = updateExtraData.e;
                Map additionalInputConfigs = updateExtraData.f251486g;
                boolean z4 = updateExtraData.f251487h;
                r4k.j bankTransferReviewType = updateExtraData.i;
                n61.q qVar = updateExtraData.f251488j;
                Clause clause = updateExtraData.k;
                Intrinsics.checkNotNullParameter(countryData, "countryData");
                Intrinsics.checkNotNullParameter(trustData, "trustData");
                Intrinsics.checkNotNullParameter(additionalInputConfigs, "additionalInputConfigs");
                Intrinsics.checkNotNullParameter(bankTransferReviewType, "bankTransferReviewType");
                return new r4k.m(aVar, fVar, dVar, z3, countryData, trustData, additionalInputConfigs, z4, bankTransferReviewType, qVar, clause);
            case 16:
                r4k.l it20 = (r4k.l) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                BankTransferData bankTransferData = it20.f251480c;
                return new yhm.r(bankTransferData.u, it20.d, mra.d.i(bankTransferData.f101927g));
            case 17:
                r4k.l it21 = (r4k.l) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.f251480c;
            case 18:
                return FragmentNavigator.popBackStack$lambda$14$lambda$13((Pair) obj2);
            case 19:
                return FragmentNavigator.attachClearViewModel$lambda$9$lambda$8((CreationExtras) obj2);
            case 20:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 21:
                jel.c it22 = (jel.c) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                if (it22 instanceof w2) {
                    return (w2) it22;
                }
                return null;
            case 22:
                Function0 it23 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return zhm.u.c(new ek("LIST_ID_WEB_VIEW_LOADER", 0, 0, 0, 0, true, SyslogConstants.LOG_CLOCK, false));
            case 23:
                r6f.e it24 = (r6f.e) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return it24;
            case 24:
                r6g.h update = (r6g.h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return r6g.h.a(update, update.f251841a + 1, null, null, 6);
            case 25:
                r6g.h update2 = (r6g.h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return r6g.h.a(update2, update2.f251841a - 1, null, null, 6);
            case 26:
                r6g.h update3 = (r6g.h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return r6g.h.a(update3, 0, zhm.d0.W(1, update3.f251842b), null, 5);
            case 27:
                return r7b.h.a((r7b.h) obj2, null, 1);
            case 28:
                Throwable it25 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return Boolean.FALSE;
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                boolean zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) pair.f186386b).booleanValue();
                if (zBooleanValue && zBooleanValue2) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ y0(r6d.k kVar) {
        this.f251384a = 22;
    }
}
