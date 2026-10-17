package vc2;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.defi.remittances.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import ft3.h1;
import java.io.Serializable;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import vch.x0;
import vdl.d0;
import vdl.d1;
import vdl.j1;
import vdl.l1;
import vdl.z0;
import vha.q0;
import vy5.v0;

/* JADX INFO: loaded from: classes20.dex */
public final class s extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f287634w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f287635x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f287634w = obj2;
        this.f287635x = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a.I2(r1, r9, r0, r8) == r2) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f287635x
            ko5.l r0 = (ko5.l) r0
            java.lang.Object r1 = r8.f287634w
            com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a r1 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.v
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L24
            if (r3 == r5) goto L20
            if (r3 != r4) goto L18
            yhm.o.b(r9)
            goto L56
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            yhm.o.b(r9)
            goto L45
        L24:
            yhm.o.b(r9)
            no5.b r9 = r1.o
            ko5.m r3 = new ko5.m
            java.lang.String r6 = r0.f186238a
            com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.CryptoSendConfirmationControllerContract$InputData r7 = r1.B
            com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty r7 = r7.f71317h
            java.lang.String r7 = r7.f70977a
            r3.<init>(r6, r7)
            hp5.o r9 = (hp5.o) r9
            ufm.n r9 = r9.d(r3)
            r8.v = r5
            java.lang.Object r9 = nim.a.b(r9, r8)
            if (r9 != r2) goto L45
            goto L55
        L45:
            com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawOrder r9 = (com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawOrder) r9
            com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawOrderTransaction r9 = r9.f71096a
            java.lang.String r9 = r9.f71101a
            dj0.d r0 = r0.e
            r8.v = r4
            java.lang.Object r9 = com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a.I2(r1, r9, r0, r8)
            if (r9 != r2) goto L56
        L55:
            return r2
        L56:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vc2.s.b(java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2) {
        String str = (String) this.f287635x;
        vrl.m mVar = (vrl.m) this.f287634w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            this.v = 1;
            if (mVar.h(str, this) != aVar) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        jhi.b bVarH = mo3.a.h(mVar.d(str), new uw2.n(23), null, 6);
        this.v = 2;
        Object objX = vkm.q.x(bVarH, this);
        return objX == aVar ? aVar : objX;
    }

    private final Object n(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        vy5.w wVar = (vy5.w) this.f287634w;
        sfe.m mVar = (sfe.m) this.f287635x;
        this.v = 1;
        wVar.getClass();
        String str = mVar.f262420b.f89729a;
        v0.Companion.getClass();
        String str2 = v0.f293220q;
        Serializable serializableB3 = Intrinsics.f(str, str2) ? wVar.b3(str2, this) : vy5.w.g3(mVar);
        return serializableB3 == aVar ? aVar : serializableB3;
    }

    private final Object o(Object obj2) {
        Object objA;
        w56.p pVar = (w56.p) this.f287634w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            h56.c cVar = pVar.f294713q;
            i56.g gVar = new i56.g(((i56.e) this.f287635x).k);
            this.v = 1;
            objA = cVar.a(gVar, this);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objA = obj2;
        }
        i56.h hVar = (i56.h) objA;
        w56.l lVar = pVar.f294715s;
        ej0.b amountOut = hVar.f158774a;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(amountOut, "amountOut");
        yji.l.a1(pVar, pVar.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.crypto_defi_send_review_transfer_success_title, zhm.u.c(u5l.a.e(amountOut, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254))), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 5)), null, null, new w50.g((Continuation) null, pVar, hVar), 3);
        return Unit.f186387a;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s((u) this.f287634w, (o02.e) this.f287635x, continuation, 0);
            case 1:
                return new s((x0) this.f287634w, (dj0.d) this.f287635x, continuation, 1);
            case 2:
                return new s((vdl.f) this.f287634w, (String) this.f287635x, continuation, 2);
            case 3:
                return new s((vdl.r) this.f287634w, (Set) this.f287635x, continuation, 3);
            case 4:
                return new s((d0) this.f287634w, (String) this.f287635x, continuation, 4);
            case 5:
                return new s((d0) this.f287634w, (Set) this.f287635x, continuation, 5);
            case 6:
                return new s((d1) this.f287634w, (z0) this.f287635x, continuation, 6);
            case 7:
                return new s((l1) this.f287634w, (j1) this.f287635x, continuation, 7);
            case 8:
                return new s((ve4.s) this.f287634w, (yy3.i) this.f287635x, continuation, 8);
            case 9:
                return new s((vg4.d) this.f287634w, (it3.d) this.f287635x, continuation, 9);
            case 10:
                return new s((vg6.k) this.f287635x, continuation, 10);
            case 11:
                return new s((com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a) this.f287634w, (uhf.i) this.f287635x, continuation, 11);
            case 12:
                return new s((com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d) this.f287634w, (zm3.l) this.f287635x, continuation, 12);
            case 13:
                return new s((com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.a) this.f287634w, (it3.d) this.f287635x, continuation, 13);
            case 14:
                return new s((vha.l) this.f287634w, (io3.d) this.f287635x, continuation, 14);
            case 15:
                return new s((q0) this.f287634w, (io3.d) this.f287635x, continuation, 15);
            case 16:
                return new s((q0) this.f287634w, (String) this.f287635x, continuation, 16);
            case 17:
                return new s((q0) this.f287635x, continuation, 17);
            case 18:
                return new s((q0) this.f287635x, continuation, 18);
            case 19:
                return new s((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c) this.f287634w, (String) this.f287635x, continuation, 19);
            case 20:
                return new s((com.revolut.feature.rfi_tool.impl.navigation.b) this.f287634w, (String) this.f287635x, continuation, 20);
            case 21:
                return new s((FlowCollector) this.f287634w, (Ref$ObjectRef) this.f287635x, continuation, 21);
            case 22:
                return new s((com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.a) this.f287634w, (String) this.f287635x, continuation, 22);
            case 23:
                return new s((com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b) this.f287634w, (String) this.f287635x, continuation, 23);
            case 24:
                return new s((com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a) this.f287634w, (ko5.l) this.f287635x, continuation, 24);
            case 25:
                return new s((vrl.m) this.f287634w, (String) this.f287635x, continuation, 25);
            case 26:
                return new s((com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.make_claim.a) this.f287634w, (String) this.f287635x, continuation, 26);
            case 27:
                return new s((vy5.w) this.f287634w, (sfe.m) this.f287635x, continuation, 27);
            case 28:
                return new s((w56.p) this.f287634w, (i56.e) this.f287635x, continuation, 28);
            default:
                return new s((com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b) this.f287634w, (h1) this.f287635x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((s) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x014b, code lost:
    
        if (r6 != r2) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:521:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014a  */
    /* JADX WARN: Type inference failed for: r0v10, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v37, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j60.a] */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v3, types: [oel.b] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.revolut.core.ui_kit.models.Style, java.util.List, rp0.x] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v10, types: [rp0.y] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vc2.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f287635x = obj2;
    }
}
