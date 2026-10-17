package cs;

import a0.d;
import android.content.Intent;
import androidx.core.content.IntentCompat;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.internal.views.order_book.OrderBookChartView;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.data.model.Data;
import com.revolut.feature.kyc.api.model.KycFinalCommand;
import com.revolut.feature.kyc.impl.KycScreenContract$Step;
import com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.models.CategoryBudgetEditingInfo;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.StockFinancialsStatementsActivity;
import com.revolut.retail.feature.stockdetails.impl.ui.utils.TabNavigationId;
import csj.i;
import csj.o;
import cu8.n1;
import do3.n;
import do3.q;
import ip0.on0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import my8.l;
import my8.s;
import my8.t;
import my8.y;
import pyd.c;
import rs8.a;
import uqk.e;
import vim.f;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108408a;

    public /* synthetic */ a(int i) {
        this.f108408a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Collection collection;
        switch (this.f108408a) {
            case 0:
                BiometricVerificationDocument document = (BiometricVerificationDocument) obj2;
                Intrinsics.checkNotNullParameter(document, "document");
                return document.f50375a.V3();
            case 1:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.FALSE;
            case 2:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.FALSE;
            case 3:
                CategoryBudgetEditingInfo it10 = (CategoryBudgetEditingInfo) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return c.i0(it10.f101548b);
            case 4:
                CategoryBudgetEditingInfo it11 = (CategoryBudgetEditingInfo) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return c.i0(it11.d);
            case 5:
                Throwable it12 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new i(new Data(null, it12, false, 5, null));
            case 6:
                return new i(new Data(null, null, true, 3, null));
            case 7:
                Function0 it13 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                on0 on0Var = new on0("ITEM_ID_PROGRESS");
                yp0.b.l(on0Var, 0, 0, 0, 0, null, false, 63);
                List listC = u.c(on0Var);
                IntRange intRange = new IntRange(0, 5, 1);
                ArrayList arrayList = new ArrayList(w.t(intRange, 10));
                f it14 = intRange.iterator();
                int i = 0;
                while (it14.f289625c) {
                    it14.nextInt();
                    int i2 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    arrayList.add(new pb0(d.n("ITEM_ID_LOADING_CATEGORY_ROW", i)));
                    i = i2;
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                ArrayList arrayListU = w.u(v.k(listC, arrayList));
                f0 f0Var = f0.f322471a;
                return new o(arrayListU, f0Var, f0Var, false, false);
            case 8:
                TabNavigationId it15 = (TabNavigationId) obj2;
                KProperty[] kPropertyArr = StockFinancialsStatementsActivity.A0;
                Intrinsics.checkNotNullParameter(it15, "it");
                return z92.f.O(it15.f104064a);
            case 9:
                ActionsView.Item it16 = (ActionsView.Item) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                Object obj3 = it16.f58324n;
                if (obj3 instanceof e) {
                    return (e) obj3;
                }
                return null;
            case 10:
                SingleChoiceDelegate.Model it17 = (SingleChoiceDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                Object obj4 = it17.f;
                if (obj4 instanceof e) {
                    return (e) obj4;
                }
                return null;
            case 11:
                String it18 = (String) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return z92.f.O(it18);
            case 12:
                Function0 it19 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return f0.f322471a;
            case 13:
                int i3 = OrderBookChartView.f57430g;
                return Unit.f186387a;
            case 14:
                n it20 = (n) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return q.y(it20);
            case 15:
                Boolean it21 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return Boolean.valueOf(!it21.booleanValue());
            case 16:
                SelectedKycDocs selectedDocs = (SelectedKycDocs) obj2;
                Intrinsics.checkNotNullParameter(selectedDocs, "selectedDocs");
                return com.revolut.feature.kyc.impl.choosedocument.model.a.a(selectedDocs);
            case 17:
                my8.o kycDocs = (my8.o) obj2;
                Intrinsics.checkNotNullParameter(kycDocs, "kycDocs");
                List list = kycDocs.f210393b.f210404a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : list) {
                    if (((y) obj5).f210403b.isEmpty()) {
                        arrayList2.add(obj5);
                    }
                }
                return arrayList2;
            case 18:
                Boolean it22 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return Boolean.TRUE;
            case 19:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                KycScreenContract$Step kycScreenContract$Step = (KycScreenContract$Step) pair.f186385a;
                l lVar = (l) pair.f186386b;
                KycScreenContract$Step kycScreenContract$Step2 = kycScreenContract$Step instanceof KycScreenContract$Step.USVisaDisclosure ? ((KycScreenContract$Step.USVisaDisclosure) kycScreenContract$Step).f77563b : kycScreenContract$Step instanceof KycScreenContract$Step.IncodeDocumentProcessingConsent ? ((KycScreenContract$Step.IncodeDocumentProcessingConsent) kycScreenContract$Step).f77558b : kycScreenContract$Step instanceof KycScreenContract$Step.Vision ? ((KycScreenContract$Step.Vision) kycScreenContract$Step).f77565b : kycScreenContract$Step;
                if ((kycScreenContract$Step2 instanceof KycScreenContract$Step.RemoteDocs) || (kycScreenContract$Step2 instanceof KycScreenContract$Step.DocumentCollection)) {
                    collection = f0.f322471a;
                } else {
                    if (!(kycScreenContract$Step2 instanceof KycScreenContract$Step.MoreDocs)) {
                        throw new IllegalStateException(a10.b.s("Unsupported step ", o0.f186429a.b(kycScreenContract$Step.getClass()).m(), " for remote documents"));
                    }
                    collection = ((KycScreenContract$Step.MoreDocs) kycScreenContract$Step2).f77559a;
                }
                return d0.F0(lVar, collection);
            case 20:
                my8.o kycDocs2 = (my8.o) obj2;
                Intrinsics.checkNotNullParameter(kycDocs2, "kycDocs");
                List list2 = kycDocs2.f210393b.f210404a;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : list2) {
                    if (!((y) obj6).f210403b.isEmpty()) {
                        arrayList3.add(obj6);
                    }
                }
                return arrayList3;
            case 21:
                String str = (String) obj2;
                return prk.o.m(str, "it", str, "MENU_ITEM_SKIP");
            case 22:
                kpi.a result = (kpi.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                Intent intent = result.f188248c;
                t tVar = intent != null ? (t) IntentCompat.getSerializableExtra(intent, "KYC_SUBMISSION_STATUS", t.class) : null;
                if (tVar == null) {
                    tVar = result.f188247b == -1 ? t.SUCCESS : t.CANCEL;
                }
                return new s(tVar, null);
            case 23:
                kpi.a it23 = (kpi.a) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                Intent intent2 = it23.f188248c;
                if (intent2 != null && intent2.hasExtra("EXTRA_SUBMIT_CITIZENSHIP_RESULT")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 24:
                rs8.a result2 = (rs8.a) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                return new s(result2 instanceof a.C1416a ? t.SUCCESS : t.CANCEL, null);
            case 25:
                kpi.a it24 = (kpi.a) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                Intent intent3 = it24.f188248c;
                if (intent3 != null && intent3.hasExtra("KYC_DOCUMENT_FILE_EXTRA_URI")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 26:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return (List) pair2.f186386b;
            case 27:
                KycFinalCommand finalCommand = (KycFinalCommand) obj2;
                Intrinsics.checkNotNullParameter(finalCommand, "finalCommand");
                if (finalCommand instanceof KycFinalCommand.Next) {
                    ufm.b bVarM = efm.d0.m(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), ((KycFinalCommand.Next) finalCommand).f77475a));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                if (finalCommand instanceof KycFinalCommand.Success) {
                    return te0.w.j(((KycFinalCommand.Success) finalCommand).f77476a);
                }
                throw new NoWhenBranchMatchedException();
            case 28:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return Boolean.valueOf(((KycScreenContract$Step) pair3.f186386b) != null);
            default:
                SelectedKycDocs selectedKycDocs = (SelectedKycDocs) obj2;
                KProperty[] kPropertyArr2 = n1.f108861y;
                Intrinsics.checkNotNullParameter(selectedKycDocs, "selectedKycDocs");
                return com.revolut.feature.kyc.impl.choosedocument.model.a.a(selectedKycDocs);
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f108408a = i;
    }
}
