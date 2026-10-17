package oqk;

import android.accounts.Account;
import com.revolut.core.ui_kit.background.BlurredImageBackgroundView;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.bank_account_switching.impl.data.network.BankAccountSwitchingService;
import com.revolut.feature.bank_account_switching.impl.ui.review.domain.BankInformation;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutRequestStatus;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.DocumentValidationConfig;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.OpenBankingAuthPaymentFlowContract$Step;
import com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreen;
import com.revolut.feature.onboarding.impl.onboarding.product_lifecycle.OnboardingProductLifecycleFlowContract$Step;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.sso.api.accounts.RevolutAccount;
import ft3.h1;
import ft3.j1;
import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import nii.n1;
import pjl.z0;
import pqg.i0;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f227952w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f227953x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f227954y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(com.revolut.feature.payments_migration.impl.ui.screen.search.b bVar, String str, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 10;
        this.f227952w = bVar;
        this.f227953x = str;
        this.f227954y = (gim.i) function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    private final Object b(Object obj2) {
        qn2.j jVar;
        LocalDate localDate;
        LocalDate localDate2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            BankAccountSwitchingService bankAccountSwitchingService = ((pn2.d) this.f227953x).f237658a;
            String str = (String) this.f227954y;
            qn2.j jVar2 = qn2.j.f247860a;
            this.f227952w = jVar2;
            this.v = 1;
            obj2 = bankAccountSwitchingService.getSwitchOutReview(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
            jVar = jVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (qn2.j) this.f227952w;
            yhm.o.b(obj2);
        }
        rn2.i iVar = (rn2.i) obj2;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        mn2.a aVarM = i2b.a.M(iVar.getSwitchMethod());
        wn2.d dVarN = i2b.a.N(iVar.getSwitchMethod());
        BankInformation bankInformationA = qn2.a.a(iVar.getFromBank());
        BankInformation bankInformationA2 = qn2.a.a(iVar.getToBank());
        String startDate = iVar.getStartDate();
        ?? arrayList = 0;
        if (startDate != null) {
            localDate = LocalDate.parse(startDate, DateTimeFormatter.ISO_LOCAL_DATE);
            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        } else {
            localDate = null;
        }
        String endDate = iVar.getEndDate();
        if (endDate != null) {
            localDate2 = LocalDate.parse(endDate, DateTimeFormatter.ISO_LOCAL_DATE);
            Intrinsics.checkNotNullExpressionValue(localDate2, "parse(...)");
        } else {
            localDate2 = null;
        }
        List sections = iVar.getSections();
        if (sections != null) {
            List list = sections;
            arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(qn2.c.a((rn2.c) it8.next()));
            }
        }
        if (arrayList == 0) {
            arrayList = zhm.f0.f322471a;
        }
        return new SwitchOutRequestStatus(aVarM, dVarN, bankInformationA, bankInformationA2, localDate, localDate2, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r14 == r3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f227954y
            po0.n r0 = (po0.n) r0
            java.lang.Object r1 = r13.f227953x
            com.revolut.core.ui_kit.background.BlurredImageBackgroundView r1 = (com.revolut.core.ui_kit.background.BlurredImageBackgroundView) r1
            java.lang.Object r2 = r13.f227952w
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r13.v
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L2d
            if (r4 == r6) goto L25
            if (r4 != r5) goto L1d
            yhm.o.b(r14)
            r12 = r13
            goto L75
        L1d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L25:
            yhm.o.b(r14)     // Catch: java.lang.Exception -> L2a
            r12 = r13
            goto L57
        L2a:
            r12 = r13
            goto L9d
        L2d:
            yhm.o.b(r14)
            wy0.a r14 = or0.u.k(r1)     // Catch: java.lang.Exception -> L2a
            yy0.f r7 = r14.Q()     // Catch: java.lang.Exception -> L2a
            com.revolut.core.ui_kit_core.displayers.image.models.UrlImage r8 = r0.f237855a     // Catch: java.lang.Exception -> L2a
            android.content.Context r9 = r1.getContext()     // Catch: java.lang.Exception -> L2a
            java.lang.String r14 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r14)     // Catch: java.lang.Exception -> L2a
            int r10 = r1.getWidth()     // Catch: java.lang.Exception -> L2a
            int r11 = r1.getHeight()     // Catch: java.lang.Exception -> L2a
            r13.f227952w = r2     // Catch: java.lang.Exception -> L2a
            r13.v = r6     // Catch: java.lang.Exception -> L2a
            r12 = r13
            java.lang.Object r14 = ofm.q.J(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L9d
            if (r14 != r3) goto L57
            goto L74
        L57:
            android.graphics.drawable.Drawable r14 = (android.graphics.drawable.Drawable) r14     // Catch: java.lang.Exception -> L9d
            boolean r4 = skm.e0.y(r2)
            if (r4 == 0) goto L9a
            po0.n r4 = r1.f51496g
            if (r4 != r0) goto L9a
            boolean r4 = r1.isAttachedToWindow()
            if (r4 != 0) goto L6a
            goto L9a
        L6a:
            r12.f227952w = r2
            r12.v = r5
            java.lang.Object r14 = com.revolut.core.ui_kit.background.BlurredImageBackgroundView.a(r1, r0, r14, r13)
            if (r14 != r3) goto L75
        L74:
            return r3
        L75:
            android.graphics.drawable.Drawable r14 = (android.graphics.drawable.Drawable) r14
            if (r14 != 0) goto L7c
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        L7c:
            boolean r2 = skm.e0.y(r2)
            if (r2 == 0) goto L97
            po0.n r2 = r1.f51496g
            if (r2 != r0) goto L97
            boolean r0 = r1.isAttachedToWindow()
            if (r0 != 0) goto L8d
            goto L97
        L8d:
            r1.f51497h = r6
            com.revolut.core.ui_kit.internal.drawables.CrossfadeDrawable r0 = r1.f
            r0.b(r14, r6)
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        L97:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        L9a:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        L9d:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: oqk.i.c(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i((k) this.f227953x, (ssi.r) this.f227954y, continuation, 0);
            case 1:
                i iVar = new i((g0) this.f227953x, (s) this.f227954y, continuation, 1);
                iVar.f227952w = obj2;
                return iVar;
            case 2:
                return new i((com.revolut.feature.kyc.impl.flow.input_document_id.a) this.f227952w, (com.revolut.feature.kyc.impl.screens.documentid_input.a) this.f227953x, (KYCDocumentIdInputScreen) this.f227954y, continuation, 2);
            case 3:
                return new i((com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d) this.f227953x, (TermsScope) this.f227954y, continuation, 3);
            case 4:
                return new i((p24.p) this.f227952w, (h1) this.f227953x, (String) this.f227954y, continuation, 4);
            case 5:
                return new i((p24.v) this.f227953x, (j1) this.f227954y, continuation, 5);
            case 6:
                return new i((p25.a) this.f227952w, (String) this.f227953x, (lg0.a) this.f227954y, continuation, 6);
            case 7:
                return new i((p2a.b) this.f227952w, (String) this.f227953x, (em2.g) this.f227954y, continuation, 7);
            case 8:
                return new i((String) this.f227952w, (p34.a) this.f227953x, (h1) this.f227954y, continuation, 8);
            case 9:
                return new i((jid.z) this.f227952w, (FavouritesAssetTypeKey) this.f227953x, (String) this.f227954y, continuation, 9);
            case 10:
                return new i((com.revolut.feature.payments_migration.impl.ui.screen.search.b) this.f227952w, (String) this.f227953x, (Function1) this.f227954y, continuation);
            case 11:
                i iVar2 = new i((lg0.b) this.f227953x, (String) this.f227954y, continuation, 11);
                iVar2.f227952w = obj2;
                return iVar2;
            case 12:
                i iVar3 = new i((com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c) this.f227953x, (it3.d) this.f227954y, continuation, 12);
                iVar3.f227952w = obj2;
                return iVar3;
            case 13:
                return new i((com.revolut.feature.junior.isa.impl.ui.jisa_details.a) this.f227952w, (String) this.f227953x, (Address) this.f227954y, continuation, 13);
            case 14:
                return new i((pae.e) this.f227952w, (List) this.f227953x, (String) this.f227954y, continuation, 14);
            case 15:
                return new i((kja.r) this.f227952w, (pb9.k) this.f227953x, (OnboardingProductLifecycleFlowContract$Step) this.f227954y, continuation, 15);
            case 16:
                return new i((com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d) this.f227952w, (File) this.f227953x, (DocumentValidationConfig) this.f227954y, continuation, 16);
            case 17:
                return new i((com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b) this.f227952w, (dx4.y) this.f227953x, (e54.p) this.f227954y, continuation, 17);
            case 18:
                return new i((pfk.e) this.f227952w, (String) this.f227953x, (String) this.f227954y, continuation, 18);
            case 19:
                return new i((AtomicReference) this.f227952w, (ph4.c) this.f227953x, (com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.a) this.f227954y, continuation, 19);
            case 20:
                return new i((phc.j) this.f227952w, (String) this.f227953x, (String) this.f227954y, continuation, 20);
            case 21:
                return new i((com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d) this.f227952w, (OpenBankingAuthPaymentFlowContract$Step) this.f227953x, (ej6.u) this.f227954y, continuation, 21);
            case 22:
                return new i((pjl.c) this.f227952w, (Account) this.f227953x, (String) this.f227954y, continuation, 22);
            case 23:
                return new i((z0) this.f227953x, (RevolutAccount) this.f227954y, continuation, 23);
            case 24:
                i iVar4 = new i((pk1.d) this.f227954y, continuation, 24);
                iVar4.f227953x = obj2;
                return iVar4;
            case 25:
                i iVar5 = new i((plh.g) this.f227954y, continuation, 25);
                iVar5.f227953x = obj2;
                return iVar5;
            case 26:
                return new i((pn2.d) this.f227953x, (String) this.f227954y, continuation, 26);
            case 27:
                return new i((pn2.d) this.f227953x, (String) this.f227954y, continuation, 27);
            case 28:
                i iVar6 = new i((BlurredImageBackgroundView) this.f227953x, (po0.n) this.f227954y, continuation, 28);
                iVar6.f227952w = obj2;
                return iVar6;
            default:
                i iVar7 = new i((i0) this.f227953x, (xi0.b) this.f227954y, continuation, 29);
                iVar7.f227952w = obj2;
                return iVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((i) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:130:0x032b, B:128:0x031e], limit reached: 548 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0240 A[LOOP:2: B:99:0x023a->B:101:0x0240, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:553:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:555:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0219 A[LOOP:1: B:95:0x0213->B:97:0x0219, LOOP_END] */
    /* JADX WARN: Type inference failed for: r10v9, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x0385 -> B:150:0x0388). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x03de -> B:141:0x036a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x03ec -> B:141:0x036a). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oqk.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f227952w = obj2;
        this.f227953x = obj3;
        this.f227954y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f227953x = obj2;
        this.f227954y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f227954y = obj2;
    }
}
