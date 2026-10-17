package wo2;

import android.content.SharedPreferences;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import com.revolut.feature.add.new_product.impl.ui.add_new_product.AddNewProductScreen;
import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;
import com.revolut.feature.card_screen.api.navigation.CardsCarouselFlowDestination;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.retail.savings.api.core.SavingsCoreApi$Toggles$SalaryStudentHys;
import com.revolut.feature.robo.api.RoboApi$Toggles;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.statements.api.navigation.SavingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.SpendingAnalyticsAccount;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.ContactTargetAccount;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$OutputData;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$StatusDialog;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import efm.r;
import fmb.t0;
import ft3.d1;
import h93.f0;
import hs3.y1;
import java.io.File;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import n38.x;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import nkm.y;
import pcd.s;
import skm.e0;
import tof.s9;
import vdl.i0;
import vkm.j2;
import x84.q;
import xg6.b0;
import xnd.a1;
import xnd.v0;
import xnd.w0;
import xnd.x0;
import xnd.z0;
import xob.t;
import ybh.a0;
import yed.g0;
import yf1.z;
import yg6.v;
import zh9.u0;
import zhm.d0;
import zhm.h0;
import zhm.r0;
import zhm.u;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f298871w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f298872x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f298871w = obj3;
        this.f298872x = obj4;
    }

    private final Object b(Object obj2) {
        xy9.o oVar = (xy9.o) this.f298872x;
        n1 n1Var = (n1) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (n1Var instanceof m1) {
            zm3.a aVar2 = ((g8a.f) this.f298871w).f141304a;
            if (aVar2 instanceof zm3.i) {
                yji.n.P2(oVar, oVar.o2(new s8k.e(PeerToPeerTransferInputData.Companion.a(PeerToPeerTransferInputData.INSTANCE, new PeerToPeerRecipient(aVar2, ContactTargetAccount.PersonalAccount.f102259a), hrf.f.OUTGOING, TransferFlowType.Default.f92257b, null, new TransferScheduleData(0L, (jli.c) null, 7), m1l.a.SCHEDULE_ENABLED, false, null, null, null, null, null, null, null, null, 131016))), null, null, 3);
            } else {
                oVar.A2(u0.c(((uz9.a) oVar.f309675q).a(new ChatTransferRecipient.ContactRecipient(aVar2), null)));
            }
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[PHI: r4
      0x0026: PHI (r4v7 java.lang.String) = (r4v6 java.lang.String), (r4v8 java.lang.String) binds: [B:14:0x002e, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r20)
            java.lang.Object r1 = r0.v
            y48.f r1 = (y48.f) r1
            y48.g r2 = r1.f310830p
            java.lang.Object r3 = r0.f298871w
            n38.z r3 = (n38.z) r3
            r2.getClass()
            r2 = 0
            if (r3 == 0) goto L41
            java.lang.String r4 = r3.e
            if (r4 == 0) goto L28
            int r5 = r4.length()
            if (r5 <= 0) goto L22
            goto L23
        L22:
            r4 = r2
        L23:
            if (r4 != 0) goto L26
            goto L28
        L26:
            r6 = r4
            goto L32
        L28:
            java.lang.String r4 = r3.d
            int r3 = r4.length()
            if (r3 <= 0) goto L31
            goto L26
        L31:
            r6 = r2
        L32:
            if (r6 == 0) goto L41
            com.revolut.core.ui_kit.models.TextClause r5 = new com.revolut.core.ui_kit.models.TextClause
            r11 = 0
            r12 = 126(0x7e, float:1.77E-43)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            goto L42
        L41:
            r5 = r2
        L42:
            r3 = 14
            if (r5 != 0) goto L57
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.feature.joint.impl.R$string.joint_account_mcy_error_other_member_title
            r4.<init>(r5, r2, r2, r3)
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r6 = com.revolut.feature.joint.impl.R$string.joint_account_mcy_error_other_member_description
            r5.<init>(r6, r2, r2, r3)
            r11 = r5
        L55:
            r10 = r4
            goto L71
        L57:
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r6 = com.revolut.feature.joint.impl.R$string.joint_account_mcy_error_title
            java.util.List r7 = zhm.u.c(r5)
            r8 = 12
            r4.<init>(r6, r7, r2, r8)
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r7 = com.revolut.feature.joint.impl.R$string.joint_account_mcy_error_description
            java.util.List r5 = zhm.u.c(r5)
            r6.<init>(r7, r5, r2, r8)
            r11 = r6
            goto L55
        L71:
            nii.y0 r4 = new nii.y0
            nii.l0 r9 = new nii.l0
            com.revolut.core.ui_kit.models.TextLocalisedClause r13 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.feature.joint.impl.R$string.joint_account_mcy_error_button_title
            r13.<init>(r5, r2, r2, r3)
            r17 = 0
            r18 = 1012(0x3f4, float:1.418E-42)
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3 = 0
            r5 = 5
            r4.<init>(r2, r9, r3, r5)
            kotlinx.coroutines.flow.Flow r3 = r1.L2(r4)
            xge.f r4 = new xge.f
            java.lang.Object r5 = r0.f298872x
            n38.x r5 = (n38.x) r5
            r6 = 26
            r4.<init>(r1, r5, r2, r6)
            r5 = 3
            skm.a2 r1 = yji.n.j2(r1, r3, r2, r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wo2.l.c(java.lang.Object):java.lang.Object");
    }

    private final Object n(Object obj2) {
        Object value;
        Data data = (Data) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j2 j2Var = ((y69.f) this.f298871w).d;
        ProductArticleParams productArticleParams = (ProductArticleParams) this.f298872x;
        do {
            value = j2Var.getValue();
        } while (!j2Var.h(value, r0.q((Map) value, new Pair(productArticleParams, data))));
        return Unit.f186387a;
    }

    private final Object o(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ye0.b bVar = (ye0.b) this.v;
        String str = (String) this.f298871w;
        Set setB = ((ij.a) this.f298872x).b();
        Intrinsics.checkNotNullExpressionValue(setB, "keys(...)");
        ye0.b.b(bVar, str, setB);
        File file = new File(bVar.f312741b.getFilesDir(), p.a.p("preferences/", str, "/values"));
        long length = 0;
        if (file.exists()) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            nkm.g gVar = new nkm.g(y.n(lim.n.k(file, FileWalkDirection.TOP_DOWN), new a0(29)));
            while (gVar.hasNext()) {
                length += ((File) gVar.next()).length();
            }
        }
        ye0.b.a(bVar, str, length);
        return Unit.f186387a;
    }

    private final Object p(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ye0.b bVar = (ye0.b) this.v;
        String str = (String) this.f298871w;
        ye0.b.b(bVar, str, ((SharedPreferences) this.f298872x).getAll().keySet());
        bVar.getClass();
        ye0.b.a(bVar, str, new File(bVar.f312741b.getApplicationInfo().dataDir, p.a.p("shared_prefs/", str, ".xml")).length());
        return Unit.f186387a;
    }

    private final Object s(Object obj2) {
        z zVar = (z) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) this.f298871w;
        if (screenContentRecyclerView.getScrollState() == 0) {
            screenContentRecyclerView.post(new vf.c((AddNewProductScreen) this.f298872x, 8, screenContentRecyclerView, zVar));
        }
        return Unit.f186387a;
    }

    private final Object t(Object obj2) {
        yi4.g gVar = (yi4.g) this.f298871w;
        n1 n1Var = (n1) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (n1Var instanceof l1) {
            hs3.o oVar = ((y1) this.f298872x).d;
            if (oVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String str = oVar.f154923b;
            gVar.l2(new v(str, gVar, null, 2), new g0(gVar, 14));
        } else {
            gVar.C2(yi4.d.f314235a);
        }
        return Unit.f186387a;
    }

    private final Object u(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        try {
            ((yii.c) this.v).f314331b.G((States$PersistentDomain) this.f298872x, (String) this.f298871w, wim.z.d(o0.b(States$PersistentDomain.class)));
        } catch (Throwable th10) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
        }
        return Unit.f186387a;
    }

    private final Object v(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z8d.j jVar = (z8d.j) this.f298871w;
        if (jVar.f320078p.f((String) this.f298872x)) {
            Object obj3 = this.v;
            Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
            jVar.v2(new z8d.d((String) obj3));
        }
        return Unit.f186387a;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l((m) this.f298871w, (yo2.d) this.f298872x, continuation, 0);
                lVar.v = obj2;
                return lVar;
            case 1:
                return new l((x4l.c) this.f298871w, this.v, this.f298872x, continuation);
            case 2:
                l lVar2 = new l((x5f.e) this.f298871w, (String) this.f298872x, continuation, 2);
                lVar2.v = obj2;
                return lVar2;
            case 3:
                l lVar3 = new l((x66.d) this.f298871w, (wk5.a) this.f298872x, continuation, 3);
                lVar3.v = obj2;
                return lVar3;
            case 4:
                l lVar4 = new l((q) this.f298871w, (pu3.b) this.f298872x, continuation, 4);
                lVar4.v = obj2;
                return lVar4;
            case 5:
                l lVar5 = new l((x8b.d) this.f298871w, (xi0.b) this.f298872x, continuation, 5);
                lVar5.v = obj2;
                return lVar5;
            case 6:
                l lVar6 = new l((PendingPaymentResult$StatusDialog) this.f298871w, (com.revolut.retail.feature.pending_payments.impl.ui.a) this.f298872x, continuation, 6);
                lVar6.v = obj2;
                return lVar6;
            case 7:
                l lVar7 = new l((xf1.c) this.f298871w, (qf1.f) this.f298872x, continuation, 7);
                lVar7.v = obj2;
                return lVar7;
            case 8:
                l lVar8 = new l((b0) this.f298871w, (String) this.f298872x, continuation, 8);
                lVar8.v = obj2;
                return lVar8;
            case 9:
                return new l((b0) this.v, (String) this.f298871w, (dj0.d) this.f298872x, continuation, 9);
            case 10:
                l lVar9 = new l((List) this.f298871w, (xnd.a0) this.f298872x, continuation, 10);
                lVar9.v = obj2;
                return lVar9;
            case 11:
                l lVar10 = new l((a1) this.f298871w, (xnd.u0) this.f298872x, continuation, 11);
                lVar10.v = obj2;
                return lVar10;
            case 12:
                return new l((com.revolut.feature.retail.savings.impl.ui.details.a) this.v, (List) this.f298871w, (List) this.f298872x, continuation, 12);
            case 13:
                l lVar11 = new l((com.revolut.feature.retail.savings.impl.ui.details.a) this.f298871w, (s) this.f298872x, continuation, 13);
                lVar11.v = obj2;
                return lVar11;
            case 14:
                l lVar12 = new l((Function0) this.f298871w, (com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a) this.f298872x, continuation, 14);
                lVar12.v = obj2;
                return lVar12;
            case 15:
                l lVar13 = new l((Set) this.f298871w, (xq3.j) this.f298872x, continuation, 15);
                lVar13.v = obj2;
                return lVar13;
            case 16:
                l lVar14 = new l((com.revolut.feature.rev_points.buying.impl.ui.flow.a) this.f298871w, (bvb.h) this.f298872x, continuation, 16);
                lVar14.v = obj2;
                return lVar14;
            case 17:
                l lVar15 = new l((vyg.a) this.f298871w, (xxg.m) this.f298872x, continuation, 17);
                lVar15.v = obj2;
                return lVar15;
            case 18:
                l lVar16 = new l((iwg.a) this.f298871w, (xxg.m) this.f298872x, continuation, 18);
                lVar16.v = obj2;
                return lVar16;
            case 19:
                l lVar17 = new l((g8a.f) this.f298871w, (xy9.o) this.f298872x, continuation, 19);
                lVar17.v = obj2;
                return lVar17;
            case 20:
                return new l((y48.f) this.v, (n38.z) this.f298871w, (x) this.f298872x, continuation, 20);
            case 21:
                l lVar18 = new l((y69.f) this.f298871w, (ProductArticleParams) this.f298872x, continuation, 21);
                lVar18.v = obj2;
                return lVar18;
            case 22:
                return new l((com.revolut.feature.card_screen.impl.kompot.cards_list.c) this.v, (f0) this.f298871w, (CardsCarouselFlowDestination) this.f298872x, continuation, 22);
            case 23:
                return new l((ye0.b) this.v, (String) this.f298871w, (ij.a) this.f298872x, continuation, 23);
            case 24:
                return new l((ye0.b) this.v, (String) this.f298871w, (SharedPreferences) this.f298872x, continuation, 24);
            case 25:
                l lVar19 = new l((ScreenContentRecyclerView) this.f298871w, (AddNewProductScreen) this.f298872x, continuation, 25);
                lVar19.v = obj2;
                return lVar19;
            case 26:
                l lVar20 = new l((yi4.g) this.f298871w, (y1) this.f298872x, continuation, 26);
                lVar20.v = obj2;
                return lVar20;
            case 27:
                return new l((yii.c) this.v, (String) this.f298871w, (States$PersistentDomain) this.f298872x, continuation, 27);
            case 28:
                return new l((z8d.j) this.f298871w, (String) this.f298872x, this.v, continuation);
            default:
                l lVar21 = new l((za0.g) this.f298871w, (BottomPromptScreen) this.f298872x, continuation, 29);
                lVar21.v = obj2;
                return lVar21;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((l) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((l) create((e16.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((l) create((mii.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((l) create((Set) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((l) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((l) create((qf1.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((l) create((uib.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((l) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((l) create((SavingsProductData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((l) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((l) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((l) create((mwg.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((l) create((mwg.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((l) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((l) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((l) create((z) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((l) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Flow flowV;
        dj0.d dVarO;
        Flow gVar;
        od0.i iVar;
        SavingsProduct savingsProduct;
        r rVarW;
        Flow a0Var;
        Throwable th10;
        dj0.d dVarD;
        Flow flowV2;
        Flow flowI;
        Flow flowP;
        Flow flowD;
        Flow flowD2;
        int i = 25;
        int i2 = 27;
        int i3 = 12;
        final int i5 = 2;
        int i6 = 6;
        int i21 = 5;
        int i22 = 26;
        int i32 = 3;
        Continuation continuation = null;
        switch (this.u) {
            case 0:
                n1 n1Var = (n1) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    m mVar = (m) this.f298871w;
                    mVar.l2(new wgb.v(mVar, (yo2.d) this.f298872x, null, 15), new yi5.b(i22));
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((x4l.c) this.f298871w).f302896a.j(this.v, this.f298872x);
                return Unit.f186387a;
            case 2:
                final x5f.e eVar = (x5f.e) this.f298871w;
                od0.i iVar2 = (od0.i) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str = (String) iVar2.f224257a;
                if (str == null) {
                    return nim.a.v(eVar.f302956c.a((String) this.f298872x), new Function1() { // from class: x5f.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            vel.j jVarA;
                            vel.j jVarA2;
                            switch (i5) {
                                case 0:
                                    yhm.r rVar = (yhm.r) obj3;
                                    Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                                    return eVar.a((RoboPortfolioInfo) rVar.f314201a, (del.b) rVar.f314202b, ((ilc.a) rVar.f314203c) == ilc.a.GB, null);
                                case 1:
                                    Pair pair = (Pair) obj3;
                                    Intrinsics.checkNotNullParameter(pair, "<destruct>");
                                    return eVar.a((RoboPortfolioInfo) pair.f186385a, (del.b) pair.f186386b, false, null);
                                case 2:
                                    Template it8 = (Template) obj3;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    e eVar2 = eVar;
                                    return new y6f.b(eVar2.f302955b.g(it8), eVar2.f302955b.f(it8), null);
                                case 3:
                                    Pair pair2 = (Pair) obj3;
                                    Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                                    Pair pair3 = (Pair) pair2.f186385a;
                                    Pair pair4 = (Pair) pair2.f186386b;
                                    RoboPortfolioInfo roboPortfolioInfo = (RoboPortfolioInfo) pair3.f186385a;
                                    del.b bVar = (del.b) pair3.f186386b;
                                    ilc.a aVar4 = (ilc.a) pair4.f186385a;
                                    List list = (List) pair4.f186386b;
                                    boolean z = aVar4 == ilc.a.GB;
                                    e eVar3 = eVar;
                                    eVar3.getClass();
                                    vel.l lVar = (vel.l) d0.d0(list);
                                    if (lVar != null) {
                                        ael.z zVar = eVar3.f302958h;
                                        dj0.d dVarQ = mif.a.Q(bVar.f113708a);
                                        vel.k kVar = lVar.f288366c;
                                        jVarA = zVar.a(dVarQ, kVar.f288362a, kVar.f288363b);
                                    } else {
                                        jVarA = null;
                                    }
                                    return eVar3.a(roboPortfolioInfo, bVar, z, jVarA);
                                default:
                                    yhm.r rVar2 = (yhm.r) obj3;
                                    Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                                    RoboPortfolioInfo roboPortfolioInfo2 = (RoboPortfolioInfo) rVar2.f314201a;
                                    del.b bVar2 = (del.b) rVar2.f314202b;
                                    List list2 = (List) rVar2.f314203c;
                                    e eVar4 = eVar;
                                    eVar4.getClass();
                                    vel.l lVar2 = (vel.l) d0.d0(list2);
                                    if (lVar2 != null) {
                                        ael.z zVar2 = eVar4.f302958h;
                                        dj0.d dVarQ2 = mif.a.Q(bVar2.f113708a);
                                        vel.k kVar2 = lVar2.f288366c;
                                        jVarA2 = zVar2.a(dVarQ2, kVar2.f288362a, kVar2.f288363b);
                                    } else {
                                        jVarA2 = null;
                                    }
                                    return eVar4.a(roboPortfolioInfo2, bVar2, false, jVarA2);
                            }
                        }
                    });
                }
                qmc.b bVar = eVar.e;
                gte.a aVar4 = eVar.f;
                qmc.h hVar = eVar.f302954a;
                qmc.d dVar = eVar.d;
                if (!((jte.d) aVar4).c(RoboApi$Toggles.RoboUkBePerformanceCalculation.f85025c)) {
                    if (((jte.d) aVar4).c(WealthUiApi$Toggles.RoboStrategies.f95863c)) {
                        final int i33 = 0;
                        return nim.a.v(u0.i(glc.a.a(hVar, str), dVar.a(str), bVar.a()), new Function1() { // from class: x5f.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                vel.j jVarA;
                                vel.j jVarA2;
                                switch (i33) {
                                    case 0:
                                        yhm.r rVar = (yhm.r) obj3;
                                        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                                        return eVar.a((RoboPortfolioInfo) rVar.f314201a, (del.b) rVar.f314202b, ((ilc.a) rVar.f314203c) == ilc.a.GB, null);
                                    case 1:
                                        Pair pair = (Pair) obj3;
                                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                                        return eVar.a((RoboPortfolioInfo) pair.f186385a, (del.b) pair.f186386b, false, null);
                                    case 2:
                                        Template it8 = (Template) obj3;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        e eVar2 = eVar;
                                        return new y6f.b(eVar2.f302955b.g(it8), eVar2.f302955b.f(it8), null);
                                    case 3:
                                        Pair pair2 = (Pair) obj3;
                                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                                        Pair pair3 = (Pair) pair2.f186385a;
                                        Pair pair4 = (Pair) pair2.f186386b;
                                        RoboPortfolioInfo roboPortfolioInfo = (RoboPortfolioInfo) pair3.f186385a;
                                        del.b bVar2 = (del.b) pair3.f186386b;
                                        ilc.a aVar42 = (ilc.a) pair4.f186385a;
                                        List list = (List) pair4.f186386b;
                                        boolean z = aVar42 == ilc.a.GB;
                                        e eVar3 = eVar;
                                        eVar3.getClass();
                                        vel.l lVar = (vel.l) d0.d0(list);
                                        if (lVar != null) {
                                            ael.z zVar = eVar3.f302958h;
                                            dj0.d dVarQ = mif.a.Q(bVar2.f113708a);
                                            vel.k kVar = lVar.f288366c;
                                            jVarA = zVar.a(dVarQ, kVar.f288362a, kVar.f288363b);
                                        } else {
                                            jVarA = null;
                                        }
                                        return eVar3.a(roboPortfolioInfo, bVar2, z, jVarA);
                                    default:
                                        yhm.r rVar2 = (yhm.r) obj3;
                                        Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                                        RoboPortfolioInfo roboPortfolioInfo2 = (RoboPortfolioInfo) rVar2.f314201a;
                                        del.b bVar22 = (del.b) rVar2.f314202b;
                                        List list2 = (List) rVar2.f314203c;
                                        e eVar4 = eVar;
                                        eVar4.getClass();
                                        vel.l lVar2 = (vel.l) d0.d0(list2);
                                        if (lVar2 != null) {
                                            ael.z zVar2 = eVar4.f302958h;
                                            dj0.d dVarQ2 = mif.a.Q(bVar22.f113708a);
                                            vel.k kVar2 = lVar2.f288366c;
                                            jVarA2 = zVar2.a(dVarQ2, kVar2.f288362a, kVar2.f288363b);
                                        } else {
                                            jVarA2 = null;
                                        }
                                        return eVar4.a(roboPortfolioInfo2, bVar22, false, jVarA2);
                                }
                            }
                        });
                    }
                    final int i43 = 1;
                    return nim.a.v(u0.m(glc.a.a(hVar, str), dVar.a(str)), new Function1() { // from class: x5f.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            vel.j jVarA;
                            vel.j jVarA2;
                            switch (i43) {
                                case 0:
                                    yhm.r rVar = (yhm.r) obj3;
                                    Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                                    return eVar.a((RoboPortfolioInfo) rVar.f314201a, (del.b) rVar.f314202b, ((ilc.a) rVar.f314203c) == ilc.a.GB, null);
                                case 1:
                                    Pair pair = (Pair) obj3;
                                    Intrinsics.checkNotNullParameter(pair, "<destruct>");
                                    return eVar.a((RoboPortfolioInfo) pair.f186385a, (del.b) pair.f186386b, false, null);
                                case 2:
                                    Template it8 = (Template) obj3;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    e eVar2 = eVar;
                                    return new y6f.b(eVar2.f302955b.g(it8), eVar2.f302955b.f(it8), null);
                                case 3:
                                    Pair pair2 = (Pair) obj3;
                                    Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                                    Pair pair3 = (Pair) pair2.f186385a;
                                    Pair pair4 = (Pair) pair2.f186386b;
                                    RoboPortfolioInfo roboPortfolioInfo = (RoboPortfolioInfo) pair3.f186385a;
                                    del.b bVar2 = (del.b) pair3.f186386b;
                                    ilc.a aVar42 = (ilc.a) pair4.f186385a;
                                    List list = (List) pair4.f186386b;
                                    boolean z = aVar42 == ilc.a.GB;
                                    e eVar3 = eVar;
                                    eVar3.getClass();
                                    vel.l lVar = (vel.l) d0.d0(list);
                                    if (lVar != null) {
                                        ael.z zVar = eVar3.f302958h;
                                        dj0.d dVarQ = mif.a.Q(bVar2.f113708a);
                                        vel.k kVar = lVar.f288366c;
                                        jVarA = zVar.a(dVarQ, kVar.f288362a, kVar.f288363b);
                                    } else {
                                        jVarA = null;
                                    }
                                    return eVar3.a(roboPortfolioInfo, bVar2, z, jVarA);
                                default:
                                    yhm.r rVar2 = (yhm.r) obj3;
                                    Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                                    RoboPortfolioInfo roboPortfolioInfo2 = (RoboPortfolioInfo) rVar2.f314201a;
                                    del.b bVar22 = (del.b) rVar2.f314202b;
                                    List list2 = (List) rVar2.f314203c;
                                    e eVar4 = eVar;
                                    eVar4.getClass();
                                    vel.l lVar2 = (vel.l) d0.d0(list2);
                                    if (lVar2 != null) {
                                        ael.z zVar2 = eVar4.f302958h;
                                        dj0.d dVarQ2 = mif.a.Q(bVar22.f113708a);
                                        vel.k kVar2 = lVar2.f288366c;
                                        jVarA2 = zVar2.a(dVarQ2, kVar2.f288362a, kVar2.f288363b);
                                    } else {
                                        jVarA2 = null;
                                    }
                                    return eVar4.a(roboPortfolioInfo2, bVar22, false, jVarA2);
                            }
                        }
                    });
                }
                i0 i0Var = eVar.f302957g;
                if (((jte.d) aVar4).c(WealthUiApi$Toggles.RoboStrategies.f95863c)) {
                    final int i59 = 3;
                    return nim.a.v(u0.j(glc.a.a(hVar, str), dVar.a(str), bVar.a(), i0.a(i0Var, u.c(str))), new Function1() { // from class: x5f.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            vel.j jVarA;
                            vel.j jVarA2;
                            switch (i59) {
                                case 0:
                                    yhm.r rVar = (yhm.r) obj3;
                                    Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                                    return eVar.a((RoboPortfolioInfo) rVar.f314201a, (del.b) rVar.f314202b, ((ilc.a) rVar.f314203c) == ilc.a.GB, null);
                                case 1:
                                    Pair pair = (Pair) obj3;
                                    Intrinsics.checkNotNullParameter(pair, "<destruct>");
                                    return eVar.a((RoboPortfolioInfo) pair.f186385a, (del.b) pair.f186386b, false, null);
                                case 2:
                                    Template it8 = (Template) obj3;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    e eVar2 = eVar;
                                    return new y6f.b(eVar2.f302955b.g(it8), eVar2.f302955b.f(it8), null);
                                case 3:
                                    Pair pair2 = (Pair) obj3;
                                    Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                                    Pair pair3 = (Pair) pair2.f186385a;
                                    Pair pair4 = (Pair) pair2.f186386b;
                                    RoboPortfolioInfo roboPortfolioInfo = (RoboPortfolioInfo) pair3.f186385a;
                                    del.b bVar2 = (del.b) pair3.f186386b;
                                    ilc.a aVar42 = (ilc.a) pair4.f186385a;
                                    List list = (List) pair4.f186386b;
                                    boolean z = aVar42 == ilc.a.GB;
                                    e eVar3 = eVar;
                                    eVar3.getClass();
                                    vel.l lVar = (vel.l) d0.d0(list);
                                    if (lVar != null) {
                                        ael.z zVar = eVar3.f302958h;
                                        dj0.d dVarQ = mif.a.Q(bVar2.f113708a);
                                        vel.k kVar = lVar.f288366c;
                                        jVarA = zVar.a(dVarQ, kVar.f288362a, kVar.f288363b);
                                    } else {
                                        jVarA = null;
                                    }
                                    return eVar3.a(roboPortfolioInfo, bVar2, z, jVarA);
                                default:
                                    yhm.r rVar2 = (yhm.r) obj3;
                                    Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                                    RoboPortfolioInfo roboPortfolioInfo2 = (RoboPortfolioInfo) rVar2.f314201a;
                                    del.b bVar22 = (del.b) rVar2.f314202b;
                                    List list2 = (List) rVar2.f314203c;
                                    e eVar4 = eVar;
                                    eVar4.getClass();
                                    vel.l lVar2 = (vel.l) d0.d0(list2);
                                    if (lVar2 != null) {
                                        ael.z zVar2 = eVar4.f302958h;
                                        dj0.d dVarQ2 = mif.a.Q(bVar22.f113708a);
                                        vel.k kVar2 = lVar2.f288366c;
                                        jVarA2 = zVar2.a(dVarQ2, kVar2.f288362a, kVar2.f288363b);
                                    } else {
                                        jVarA2 = null;
                                    }
                                    return eVar4.a(roboPortfolioInfo2, bVar22, false, jVarA2);
                            }
                        }
                    });
                }
                akg.n nVarI = u0.i(glc.a.a(hVar, str), dVar.a(str), i0.a(i0Var, u.c(str)));
                final int i66 = 4;
                return nim.a.v(nVarI, new Function1() { // from class: x5f.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        vel.j jVarA;
                        vel.j jVarA2;
                        switch (i66) {
                            case 0:
                                yhm.r rVar = (yhm.r) obj3;
                                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                                return eVar.a((RoboPortfolioInfo) rVar.f314201a, (del.b) rVar.f314202b, ((ilc.a) rVar.f314203c) == ilc.a.GB, null);
                            case 1:
                                Pair pair = (Pair) obj3;
                                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                                return eVar.a((RoboPortfolioInfo) pair.f186385a, (del.b) pair.f186386b, false, null);
                            case 2:
                                Template it8 = (Template) obj3;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                e eVar2 = eVar;
                                return new y6f.b(eVar2.f302955b.g(it8), eVar2.f302955b.f(it8), null);
                            case 3:
                                Pair pair2 = (Pair) obj3;
                                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                                Pair pair3 = (Pair) pair2.f186385a;
                                Pair pair4 = (Pair) pair2.f186386b;
                                RoboPortfolioInfo roboPortfolioInfo = (RoboPortfolioInfo) pair3.f186385a;
                                del.b bVar2 = (del.b) pair3.f186386b;
                                ilc.a aVar42 = (ilc.a) pair4.f186385a;
                                List list = (List) pair4.f186386b;
                                boolean z = aVar42 == ilc.a.GB;
                                e eVar3 = eVar;
                                eVar3.getClass();
                                vel.l lVar = (vel.l) d0.d0(list);
                                if (lVar != null) {
                                    ael.z zVar = eVar3.f302958h;
                                    dj0.d dVarQ = mif.a.Q(bVar2.f113708a);
                                    vel.k kVar = lVar.f288366c;
                                    jVarA = zVar.a(dVarQ, kVar.f288362a, kVar.f288363b);
                                } else {
                                    jVarA = null;
                                }
                                return eVar3.a(roboPortfolioInfo, bVar2, z, jVarA);
                            default:
                                yhm.r rVar2 = (yhm.r) obj3;
                                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                                RoboPortfolioInfo roboPortfolioInfo2 = (RoboPortfolioInfo) rVar2.f314201a;
                                del.b bVar22 = (del.b) rVar2.f314202b;
                                List list2 = (List) rVar2.f314203c;
                                e eVar4 = eVar;
                                eVar4.getClass();
                                vel.l lVar2 = (vel.l) d0.d0(list2);
                                if (lVar2 != null) {
                                    ael.z zVar2 = eVar4.f302958h;
                                    dj0.d dVarQ2 = mif.a.Q(bVar22.f113708a);
                                    vel.k kVar2 = lVar2.f288366c;
                                    jVarA2 = zVar2.a(dVarQ2, kVar2.f288362a, kVar2.f288363b);
                                } else {
                                    jVarA2 = null;
                                }
                                return eVar4.a(roboPortfolioInfo2, bVar22, false, jVarA2);
                        }
                    }
                });
            case 3:
                e16.d dVar2 = (e16.d) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List listP0 = d0.P0(foh.i.l(dVar2, h0.f322473a), new x66.c());
                x66.d dVar3 = (x66.d) this.f298871w;
                wk5.a aVar6 = (wk5.a) this.f298872x;
                dVar3.getClass();
                if (listP0.isEmpty()) {
                    flowV = new go.g(new Data(zhm.f0.f322471a, null, false, 6, null), 2);
                } else {
                    List list = listP0;
                    ArrayList arrayList = new ArrayList(w.t(list, 10));
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(dVar3.f303050c.a(((e16.g) it8.next()).f121894a.f71635a, w4l.j.f294644c));
                    }
                    flowV = nim.a.v(u0.k(arrayList), new bcj.i(aVar6, 11));
                }
                return xam.a.h(new x66.b(dVar3, aVar6, null), flowV);
            case 4:
                final pu3.b bVar2 = (pu3.b) this.f298872x;
                q qVar = (q) this.f298871w;
                mii.q qVar2 = (mii.q) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (qVar2 instanceof mii.p) {
                    final int i74 = 0;
                    qVar.x2(new Function1() { // from class: x84.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            Data debts;
                            ArrayList arrayList2;
                            Data debts2;
                            ArrayList arrayList3;
                            switch (i74) {
                                case 0:
                                    pu3.b bVar3 = bVar2;
                                    Data data = ((g) obj3).f303280a;
                                    try {
                                        Object content = data.getContent();
                                        if (content != null) {
                                            arrayList2 = new ArrayList();
                                            arrayList2.addAll((List) content);
                                            arrayList2.remove(bVar3);
                                        } else {
                                            arrayList2 = null;
                                        }
                                        debts = new Data(arrayList2, data.getError(), data.getLoading());
                                        break;
                                    } catch (Throwable th11) {
                                        debts = new Data(null, th11, data.getLoading());
                                    }
                                    Intrinsics.checkNotNullParameter(debts, "debts");
                                    return new g(debts);
                                default:
                                    pu3.b bVar4 = bVar2;
                                    Data data2 = ((g) obj3).f303280a;
                                    try {
                                        Object content2 = data2.getContent();
                                        if (content2 != null) {
                                            List list2 = (List) content2;
                                            arrayList3 = new ArrayList();
                                            arrayList3.addAll(list2);
                                            arrayList3.add(bVar4);
                                            d0.O0(list2);
                                        } else {
                                            arrayList3 = null;
                                        }
                                        debts2 = new Data(arrayList3, data2.getError(), data2.getLoading());
                                        break;
                                    } catch (Throwable th12) {
                                        debts2 = new Data(null, th12, data2.getLoading());
                                    }
                                    Intrinsics.checkNotNullParameter(debts2, "debts");
                                    return new g(debts2);
                            }
                        }
                    });
                } else if (qVar2 instanceof mii.m) {
                    final int i92 = 1;
                    qVar.x2(new Function1() { // from class: x84.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            Data debts;
                            ArrayList arrayList2;
                            Data debts2;
                            ArrayList arrayList3;
                            switch (i92) {
                                case 0:
                                    pu3.b bVar3 = bVar2;
                                    Data data = ((g) obj3).f303280a;
                                    try {
                                        Object content = data.getContent();
                                        if (content != null) {
                                            arrayList2 = new ArrayList();
                                            arrayList2.addAll((List) content);
                                            arrayList2.remove(bVar3);
                                        } else {
                                            arrayList2 = null;
                                        }
                                        debts = new Data(arrayList2, data.getError(), data.getLoading());
                                        break;
                                    } catch (Throwable th11) {
                                        debts = new Data(null, th11, data.getLoading());
                                    }
                                    Intrinsics.checkNotNullParameter(debts, "debts");
                                    return new g(debts);
                                default:
                                    pu3.b bVar4 = bVar2;
                                    Data data2 = ((g) obj3).f303280a;
                                    try {
                                        Object content2 = data2.getContent();
                                        if (content2 != null) {
                                            List list2 = (List) content2;
                                            arrayList3 = new ArrayList();
                                            arrayList3.addAll(list2);
                                            arrayList3.add(bVar4);
                                            d0.O0(list2);
                                        } else {
                                            arrayList3 = null;
                                        }
                                        debts2 = new Data(arrayList3, data2.getError(), data2.getLoading());
                                        break;
                                    } catch (Throwable th12) {
                                        debts2 = new Data(null, th12, data2.getLoading());
                                    }
                                    Intrinsics.checkNotNullParameter(debts2, "debts");
                                    return new g(debts2);
                            }
                        }
                    });
                } else {
                    if (!(qVar2 instanceof mii.n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list2 = (List) ((x84.g) qVar.t2()).f303280a.getContent();
                    if (list2 != null && !list2.contains(bVar2)) {
                        qVar.l2(new wtj.f(qVar, bVar2, null, i22), new yi5.b(i22));
                    }
                }
                return Unit.f186387a;
            case 5:
                Set set = (Set) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return nim.a.v(rd0.e.b(((x8b.d) this.f298871w).f303310b.a(false)), new b7j.d((xi0.b) this.f298872x, set, 3));
            case 6:
                com.revolut.retail.feature.pending_payments.impl.ui.a aVar9 = (com.revolut.retail.feature.pending_payments.impl.ui.a) this.f298872x;
                n1 n1Var2 = (n1) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((n1Var2 instanceof k1) || (n1Var2 instanceof l1)) {
                    ParcelableDestination parcelableDestination = ((PendingPaymentResult$StatusDialog) this.f298871w).f102417c;
                    if (parcelableDestination != null) {
                        aVar9.C1(parcelableDestination);
                    }
                } else if (!(n1Var2 instanceof j1) && !(n1Var2 instanceof m1)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar9.C2(PendingPaymentContract$OutputData.Rejected.f102406a);
                return Unit.f186387a;
            case 7:
                qf1.d dVar4 = (qf1.d) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xf1.c cVar = (xf1.c) this.f298871w;
                qf1.f fVar = (qf1.f) this.f298872x;
                ue0.c cVar2 = cVar.f304763b;
                ne0.j jVar = cVar.f304762a;
                String id10 = fVar.getId();
                if (dVar4 == null) {
                    wf1.c cVar3 = new wf1.c(fVar.getId());
                    jVar.f(id10, cVar3);
                    xf1.c.a(cVar2, id10, cVar3);
                } else {
                    jVar.f(id10, dVar4);
                    xf1.c.a(cVar2, id10, dVar4);
                }
                return Unit.f186387a;
            case 8:
                CoroutineScope coroutineScope = (CoroutineScope) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0Var = (b0) this.f298871w;
                String str2 = (String) this.f298872x;
                synchronized (coroutineScope) {
                    try {
                        String str3 = "KEY_STORAGE_METHOD_TOP_UP_DATA_" + str2;
                        jo3.a aVar13 = (jo3.a) b0Var.f305575a.T2(str3, wim.z.d(o0.b(jo3.a.class)));
                        dVarO = aVar13 != null ? mo3.a.o(aVar13) : null;
                        b0Var.f305575a.I0(str3);
                    } catch (Throwable th11) {
                        throw th11;
                    }
                }
                return dVarO;
            case 9:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((b0) this.v).f305575a.G(mo3.a.p((dj0.d) this.f298872x), j6.a.q("KEY_STORAGE_METHOD_TOP_UP_DATA_", (String) this.f298871w), wim.z.d(o0.b(jo3.a.class)));
                return Unit.f186387a;
            case 10:
                uib.c cVar4 = (uib.c) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List<AnalyticsAccount> list3 = (List) this.f298871w;
                xnd.a0 a0Var2 = (xnd.a0) this.f298872x;
                g6e.d dVar5 = a0Var2.f307371c;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                for (AnalyticsAccount analyticsAccount : list3) {
                    AccountId.Personal personal = AccountId.Personal.f51414a;
                    int i96 = 23;
                    try {
                        if ((analyticsAccount instanceof AnalyticsAccount.Personal.All) || (analyticsAccount instanceof AnalyticsAccount.Joint.All) || (analyticsAccount instanceof AnalyticsAccount.Savings.PersonalAll) || (analyticsAccount instanceof AnalyticsAccount.Savings.JointAll) || (analyticsAccount instanceof AnalyticsAccount.Junior.All) || (analyticsAccount instanceof AnalyticsAccount.Pro.All)) {
                            od0.h hVar2 = od0.i.Companion;
                            ynd.b bVar3 = new ynd.b(analyticsAccount);
                            hVar2.getClass();
                            gVar = zi0.c.i(od0.h.a(bVar3));
                        } else {
                            int i99 = 24;
                            if (analyticsAccount instanceof AnalyticsAccount.Personal.CreditCard) {
                                gVar = nim.a.v(zi0.c.i(new ynd.c((AnalyticsAccount.Personal.CreditCard) analyticsAccount)), new xlj.h(i99));
                            } else if (analyticsAccount instanceof AnalyticsAccount.Linked) {
                                AnalyticsAccount.Linked linked = (AnalyticsAccount.Linked) analyticsAccount;
                                String str4 = linked.d;
                                if (kotlin.text.d0.W(str4)) {
                                    str4 = null;
                                }
                                String str5 = linked.f99191c;
                                if (str5 == null || kotlin.text.d0.W(str5)) {
                                    str5 = null;
                                }
                                String str6 = str4 == null ? str5 == null ? "" : str5 : str4;
                                if (str4 == null) {
                                    str5 = null;
                                }
                                gVar = nim.a.v(zi0.c.i(new ynd.e(linked, str6, str5)), new xlj.h(i99));
                            } else if (analyticsAccount instanceof AnalyticsAccount.Personal.CurrencyPocket) {
                                gVar = a0Var2.a(analyticsAccount, personal, ((AnalyticsAccount.Personal.CurrencyPocket) analyticsAccount).f99194a);
                            } else if (analyticsAccount instanceof AnalyticsAccount.Joint.CurrencyPocket) {
                                gVar = a0Var2.a(analyticsAccount, ((AnalyticsAccount.Joint.CurrencyPocket) analyticsAccount).f99180a, ((AnalyticsAccount.Joint.CurrencyPocket) analyticsAccount).f99181b);
                            } else if (analyticsAccount instanceof AnalyticsAccount.Pro.CurrencyPocket) {
                                gVar = a0Var2.a(analyticsAccount, personal, ((AnalyticsAccount.Pro.CurrencyPocket) analyticsAccount).f99197a);
                            } else if (analyticsAccount instanceof AnalyticsAccount.Junior.CurrencyPocket) {
                                gVar = nim.a.v(rd0.e.b(a0Var2.f307370b.P()), new xe7.a((AnalyticsAccount.Junior.CurrencyPocket) analyticsAccount, i96));
                            } else if (analyticsAccount instanceof AnalyticsAccount.Personal.Subaccount) {
                                gVar = nim.a.v(nim.a.v(((s6e.z) dVar5).u(((AnalyticsAccount.Personal.Subaccount) analyticsAccount).f99195a), new xe7.a((SpendingAnalyticsAccount) analyticsAccount, i99)), new xlj.h(i99));
                            } else if (analyticsAccount instanceof AnalyticsAccount.Joint.Subaccount) {
                                gVar = nim.a.v(nim.a.v(((s6e.z) dVar5).u(((AnalyticsAccount.Joint.Subaccount) analyticsAccount).f99183b), new xe7.a((SpendingAnalyticsAccount) analyticsAccount, i99)), new xlj.h(i99));
                            } else if (analyticsAccount instanceof AnalyticsAccount.Savings.PersonalIndividual) {
                                gVar = nim.a.v(a0Var2.b((AnalyticsAccount.Savings) analyticsAccount, ((AnalyticsAccount.Savings.PersonalIndividual) analyticsAccount).f99204a), new xlj.h(i99));
                            } else if (analyticsAccount instanceof AnalyticsAccount.Savings.JointIndividual) {
                                gVar = nim.a.v(a0Var2.b((AnalyticsAccount.Savings) analyticsAccount, ((AnalyticsAccount.Savings.JointIndividual) analyticsAccount).f99200b), new xlj.h(i99));
                            } else {
                                if (!(analyticsAccount instanceof AnalyticsAccount.Savings.JuniorSaving)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                gVar = nim.a.v(a0Var2.b((AnalyticsAccount.Savings) analyticsAccount, ((AnalyticsAccount.Savings.JuniorSaving) analyticsAccount).f99201a), new xlj.h(i99));
                            }
                        }
                    } catch (Throwable th12) {
                        gVar = new go.g(new Data(null, th12, false, 5, null), 2);
                    }
                    arrayList2.add(nim.a.y(rd0.e.n(gVar, h0.f322473a), new xlj.h(i96)));
                }
                return nim.a.v(u0.k(arrayList2), new xe7.a(cVar4, i));
            case 11:
                List list4 = (List) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a1 a1Var = (a1) this.f298871w;
                xnd.u0 u0Var = (xnd.u0) this.f298872x;
                int size = list4.size();
                if (size == 0) {
                    od0.h hVar3 = od0.i.Companion;
                    v0 v0Var = new v0(u0Var);
                    hVar3.getClass();
                    return zi0.c.i(od0.h.a(v0Var));
                }
                if (size != 1) {
                    od0.h hVar4 = od0.i.Companion;
                    w0 w0Var = new w0(list4.size());
                    hVar4.getClass();
                    return zi0.c.i(od0.h.a(w0Var));
                }
                IncomeSorter incomeSorter = (IncomeSorter) d0.K0(list4);
                od0.h hVar5 = od0.i.Companion;
                k71.q.Companion.getClass();
                x0 x0Var = new x0(null, k71.p.a());
                hVar5.getClass();
                od0.i iVarA = od0.h.a(x0Var);
                return rd0.e.e(nim.a.A(nim.a.v(rd0.e.b(whf.b.a(a1Var.d, te0.w.h(new s9(y0.b(incomeSorter.f99162c))), null, null, null, 14)), new xe7.a(incomeSorter, i2)), new djc.z(i, iVarA)), h0.f322473a, new z0(iVarA, null, 1));
            case 12:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return ((com.revolut.feature.retail.savings.impl.ui.details.a) this.v).C1(new SavingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination((List) this.f298871w, (List) this.f298872x));
            case 13:
                w4l.h hVar6 = w4l.h.f294642c;
                od0.i iVar3 = od0.i.f224256b;
                SavingsProductData productData = (SavingsProductData) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.savings.impl.ui.details.a aVar19 = (com.revolut.feature.retail.savings.impl.ui.details.a) this.f298871w;
                s vault = (s) this.f298872x;
                xob.k kVar = xob.k.f307775a;
                SavingsProduct savingsProduct2 = productData.f86683a;
                SavingsProduct savingsProduct3 = productData.f86683a;
                if (savingsProduct2.f86621h.f86645b.f86647a == ncd.k.REFERENCE) {
                    a0Var = zi0.c.i(kVar);
                    iVar = iVar3;
                    savingsProduct = savingsProduct2;
                } else {
                    bpb.d dVar6 = aVar19.f83372w;
                    dVar6.getClass();
                    Intrinsics.checkNotNullParameter(vault, "vault");
                    Intrinsics.checkNotNullParameter(productData, "productData");
                    LocalDate localDate = vault.i().f;
                    dj0.d dVar7 = vault.i().d;
                    long j2 = dVar7.f115082a;
                    if (j2 > 0) {
                        Intrinsics.checkNotNullParameter(productData, "<this>");
                        LocalDate localDate2 = ocd.c.f224221a;
                        Intrinsics.checkNotNullParameter(productData, "<this>");
                        iVar = iVar3;
                        savingsProduct = savingsProduct2;
                        BigDecimal bigDecimal = new BigDecimal(String.valueOf(savingsProduct3.f86621h.a().f86651c));
                        double d = j2;
                        xi0.b bVar4 = dVar7.f115083b;
                        double dDoubleValue = ((bigDecimal.doubleValue() / ((double) 100)) * (d / cp5.d.k(bVar4))) / ((double) 366);
                        bpb.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(bVar4, "<this>");
                        if (dDoubleValue < 1.0d / cp5.d.k(bVar4) && opg.a.f(productData)) {
                            try {
                                Intrinsics.checkNotNullParameter(productData, "<this>");
                                Intrinsics.checkNotNullParameter(productData, "<this>");
                                dVarD = l9.l.d(dVar7, new BigDecimal(String.valueOf(savingsProduct3.f86621h.a().f86651c)));
                                th10 = null;
                            } catch (Exception e) {
                                h0 h0Var = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                th10 = null;
                                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                                dVarD = null;
                            }
                            rVarW = te0.w.h(dVarD != null ? zi0.c.P(new xob.l(dVarD), false, th10, 3) : new Data(null, new IllegalArgumentException("Fail to calculate next interest payment"), false, 5, null));
                        }
                        a0Var = new xo8.a0(rd0.e.b(ue0.e.E(rVarW, zi0.c.P(kVar, false, null, 3))), 1);
                    } else {
                        iVar = iVar3;
                        savingsProduct = savingsProduct2;
                    }
                    Intrinsics.checkNotNullParameter(productData, "<this>");
                    rVarW = ocd.a.d(productData) ? nim.a.w(pd.b.r(com.revolut.domain.interactors.transactions.a.d(dVar6.f17571a, dVar6.f17572b.a(vault), null, null, TransactionsSort.STARTED_DATE_DESC, null, 22), new bpb.b(dVar6, 0)), new bnj.n(dVar6, localDate, 6)) : zi0.c.j(localDate != null ? new xob.j(localDate) : kVar);
                    a0Var = new xo8.a0(rd0.e.b(ue0.e.E(rVarW, zi0.c.P(kVar, false, null, 3))), 1);
                }
                akg.n nVarV = nim.a.v(ijb.a.d(aVar19.f83368q, productData), new nmb.u(productData, 5));
                t0 t0Var = new t0(aVar19.z.r(), 3);
                if (vault.f234889n != pcd.b.YOUTH) {
                    od0.i.Companion.getClass();
                    flowV2 = zi0.c.i(iVar);
                } else {
                    flowV2 = nim.a.v(aVar19.A.w(vault.f, u.c(vault.f234881a)), new xo8.i0(4));
                }
                cxe.u uVarA = aVar19.E.a(w4l.j.f294644c);
                pcd.a aVarA = opg.c.a(vault);
                String str7 = aVarA != null ? aVarA.f234844g : null;
                if (str7 == null || str7.length() == 0) {
                    od0.i.Companion.getClass();
                    flowI = zi0.c.i(iVar);
                } else {
                    flowI = xam.a.h(new t(aVar19, null, 0), aVar19.H.j(str7, hVar6));
                }
                SavingsProduct savingsProduct4 = savingsProduct;
                cxe.u uVarA2 = nim.a.A(rd0.e.n(((nne.a) aVar19.D).a(savingsProduct4.f86619c.name(), w4l.i.f294643c), h0.f322473a), new xo8.i0(5));
                if (aVar19.f83371t.a(SavingsCoreApi$Toggles$SalaryStudentHys.f83119c)) {
                    od0.i.Companion.getClass();
                    flowP = zi0.c.i(iVar);
                } else {
                    flowP = n14.k.p(aVar19.I.u(savingsProduct4.f86617a, hVar6), new xo8.i0(6));
                }
                return nim.a.u(new xjl.g((Continuation) null, vault, 12), u0.i(u0.i(a0Var, nVarV, t0Var), u0.i(flowV2, uVarA, flowI), u0.m(uVarA2, flowP)));
            case 14:
                com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a aVar20 = (com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a) this.f298872x;
                n1 n1Var3 = (n1) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var3 instanceof l1) {
                    ((Function0) this.f298871w).invoke();
                } else if (!(n1Var3 instanceof k1)) {
                    if (!(n1Var3 instanceof m1) && !(n1Var3 instanceof j1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hx7.e.n(new IllegalArgumentException(com.revolut.data.database.models.openbanking.d.s("Unexpected dialog result ", n1Var3)));
                } else if (aVar20.u.d() == null) {
                    aVar20.B2();
                }
                return Unit.f186387a;
            case 15:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Set set2 = (Set) this.f298871w;
                xq3.j jVar2 = (xq3.j) this.f298872x;
                Iterator it9 = set2.iterator();
                while (it9.hasNext()) {
                    e0.C(coroutineScope2, null, null, new xnl.f(jVar2, (d1) it9.next(), continuation, i32), 3);
                }
                return Unit.f186387a;
            case 16:
                com.revolut.feature.rev_points.buying.impl.ui.flow.a aVar23 = (com.revolut.feature.rev_points.buying.impl.ui.flow.a) this.f298871w;
                n1 n1Var4 = (n1) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var4 instanceof l1) {
                    dj0.d dVar8 = ((bvb.h) this.f298872x).f18987a;
                    aVar23.getClass();
                    aVar23.l2(new xub.i(aVar23, dVar8, null), new yi5.b(i22));
                } else {
                    com.revolut.feature.rev_points.buying.impl.ui.flow.a.J2(aVar23);
                }
                return Unit.f186387a;
            case 17:
                xxg.m mVar2 = (xxg.m) this.f298872x;
                mwg.e eVar2 = (mwg.e) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vyg.a aVar26 = (vyg.a) this.f298871w;
                if (aVar26 == vyg.a.PRODUCT) {
                    xxg.c cVar5 = xxg.m.Companion;
                    mVar2.getClass();
                    Map map = eVar2.e;
                    ArrayList arrayList3 = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        iwg.a aVar27 = (iwg.a) entry.getKey();
                        List list5 = (List) entry.getValue();
                        List list6 = list5;
                        dj0.d.Companion.getClass();
                        dj0.d dVarO2 = dj0.d.e;
                        int i100 = 0;
                        for (Object obj3 : list6) {
                            int i101 = i100 + 1;
                            if (i100 < 0) {
                                zhm.v.s();
                                throw null;
                            }
                            dVarO2 = i100 == 0 ? ((mwg.c) obj3).f209444c : pyd.c.O(dVarO2, ((mwg.c) obj3).f209444c);
                            i100 = i101;
                        }
                        Iterator it10 = list6.iterator();
                        double d5 = 0.0d;
                        while (it10.hasNext()) {
                            d5 += (double) ((mwg.c) it10.next()).d;
                        }
                        arrayList3.add(new wxg.i(aVar27, list5.size(), dVarO2, (float) d5));
                    }
                    return nim.a.v(xxg.m.b(w.u(eVar2.d.values())), new xpe.c(eVar2, d0.P0(arrayList3, new xxg.e()), i22));
                }
                Map map2 = eVar2.e;
                ArrayList arrayList4 = new ArrayList(map2.size());
                for (Map.Entry entry2 : map2.entrySet()) {
                    iwg.a aVar28 = (iwg.a) entry2.getKey();
                    List list7 = (List) entry2.getValue();
                    switch (xxg.g.f309520a[aVar28.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            xxg.c cVar6 = xxg.m.Companion;
                            mVar2.getClass();
                            if (aVar26 == vyg.a.SECTOR) {
                                List list8 = list7;
                                ArrayList arrayList5 = new ArrayList(w.t(list8, 10));
                                Iterator it11 = list8.iterator();
                                while (it11.hasNext()) {
                                    arrayList5.add(new wxg.k((mwg.c) it11.next()));
                                }
                                flowD = zi0.c.i(arrayList5);
                            } else {
                                flowD = mVar2.d(list7, aVar28, aVar26);
                            }
                            break;
                        case 6:
                            xxg.c cVar7 = xxg.m.Companion;
                            mVar2.getClass();
                            flowD = xxg.m.c(list7);
                            break;
                        case 7:
                            flowD = xxg.m.a(mVar2, list7);
                            break;
                        case 8:
                            xxg.c cVar8 = xxg.m.Companion;
                            mVar2.getClass();
                            flowD = list7.isEmpty() ? zi0.c.i(zhm.f0.f322471a) : nim.a.v(glc.a.c(mVar2.d), new xxg.b(mVar2, list7, aVar26));
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList4.add(flowD);
                }
                ArrayList arrayListU = w.u(eVar2.d.values());
                xxg.c cVar9 = xxg.m.Companion;
                mVar2.getClass();
                return nim.a.v(u0.k(d0.F0(xxg.m.b(arrayListU), arrayList4)), new xw9.c(eVar2, i6));
            case 18:
                xxg.m mVar3 = (xxg.m) this.f298872x;
                mwg.l lVar = (mwg.l) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                switch (xxg.k.f309522a[((iwg.a) this.f298871w).ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        List list9 = lVar.d;
                        iwg.a aVar30 = lVar.f209474a;
                        vyg.a aVar31 = vyg.a.SECTOR;
                        xxg.c cVar10 = xxg.m.Companion;
                        flowD2 = mVar3.d(list9, aVar30, aVar31);
                        break;
                    case 5:
                        flowD2 = xxg.m.a(mVar3, lVar.d);
                        break;
                    case 6:
                        List list10 = lVar.d;
                        xxg.c cVar11 = xxg.m.Companion;
                        mVar3.getClass();
                        flowD2 = xxg.m.c(list10);
                        break;
                    case 7:
                    case 8:
                        flowD2 = vkm.i.f290039a;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return nim.a.v(flowD2, new xw9.c(lVar, 8));
            case 19:
                return b(obj2);
            case 20:
                return c(obj2);
            case 21:
                return n(obj2);
            case 22:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.card_screen.impl.kompot.cards_list.c) this.v).P2((f0) this.f298871w, (CardsCarouselFlowDestination) this.f298872x);
                return Unit.f186387a;
            case 23:
                return o(obj2);
            case 24:
                return p(obj2);
            case 25:
                return s(obj2);
            case 26:
                return t(obj2);
            case 27:
                return u(obj2);
            case 28:
                return v(obj2);
            default:
                za0.g gVar2 = (za0.g) this.f298871w;
                Data preloadingItems = (Data) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list11 = (List) preloadingItems.getContent();
                if (list11 != null) {
                    BottomPromptScreen bottomPromptScreen = (BottomPromptScreen) this.f298872x;
                    BottomPromptScreen bottomPromptScreenJ = BottomPromptScreen.J(bottomPromptScreen, hx7.a.q(bottomPromptScreen.f, list11), null, null, 991);
                    Intrinsics.checkNotNullParameter(bottomPromptScreenJ, "<set-?>");
                    gVar2.f303768l = bottomPromptScreenJ;
                }
                j60.a aVar34 = gVar2.f320549q;
                yc0.j jVar3 = gVar2.f320550r;
                BottomPromptScreen screen = (BottomPromptScreen) gVar2.Z2();
                jVar3.getClass();
                Intrinsics.checkNotNullParameter(screen, "screen");
                Intrinsics.checkNotNullParameter(preloadingItems, "preloadingItems");
                aVar34.A((rp0.y) iii.c.f(preloadingItems, new y7k.g0(jVar3, screen, i3), new u3a.p(jVar3, screen, i2), new y66.q(jVar3, screen, i21)));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f298871w = obj2;
        this.f298872x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(x4l.c cVar, Object obj2, Object obj3, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f298871w = cVar;
        this.v = obj2;
        this.f298872x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(z8d.j jVar, String str, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.u = 28;
        this.f298871w = jVar;
        this.f298872x = str;
        this.v = obj2;
    }
}
