package eif;

import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.api.navigation.CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData;
import ej9.e0;
import ej9.f0;
import elf.d1;
import elf.n0;
import elf.s1;
import epg.u;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import lo5.c0;
import nii.n1;
import nq.i0;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f126615w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f126616x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f126615w = obj2;
        this.f126616x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j((k) this.f126615w, (List) this.f126616x, continuation, 0);
            case 1:
                return new j((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g) this.f126615w, (zm3.l) this.f126616x, continuation, 1);
            case 2:
                return new j((com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow.b) this.f126615w, (ArrayList) this.f126616x, continuation, 2);
            case 3:
                return new j((com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d) this.f126615w, (String) this.f126616x, continuation, 3);
            case 4:
                j jVar = new j((com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d) this.f126616x, continuation, 4);
                jVar.f126615w = obj2;
                return jVar;
            case 5:
                return new j((e0) this.f126615w, (String) this.f126616x, continuation, 5);
            case 6:
                return new j((f0) this.f126615w, (String) this.f126616x, continuation, 6);
            case 7:
                j jVar2 = new j((com.revolut.feature.atm.impl.ui.redesign.details.a) this.f126616x, continuation, 7);
                jVar2.f126615w = obj2;
                return jVar2;
            case 8:
                return new j((n0) this.f126615w, (a3) this.f126616x, continuation, 8);
            case 9:
                return new j((d1) this.f126615w, (ty0.a) this.f126616x, continuation, 9);
            case 10:
                return new j((s1) this.f126615w, (File) this.f126616x, continuation, 10);
            case 11:
                j jVar3 = new j((eli.j) this.f126616x, continuation, 11);
                jVar3.f126615w = obj2;
                return jVar3;
            case 12:
                return new j((elk.f) this.f126615w, (blk.a) this.f126616x, continuation, 12);
            case 13:
                j jVar4 = new j((elk.f) this.f126616x, continuation, 13);
                jVar4.f126615w = obj2;
                return jVar4;
            case 14:
                return new j((com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e) this.f126615w, (CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData) this.f126616x, continuation, 14);
            case 15:
                return new j((en1.a) this.f126615w, (String) this.f126616x, continuation, 15);
            case 16:
                return new j((enb.g) this.f126615w, (String) this.f126616x, continuation, 16);
            case 17:
                return new j((com.revolut.feature.tax_residency.impl.flows.submit.a) this.f126615w, (Boolean) this.f126616x, continuation, 17);
            case 18:
                return new j((com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.b) this.f126615w, (String) this.f126616x, continuation, 18);
            case 19:
                return new j((u) this.f126616x, continuation, 19);
            case 20:
                j jVar5 = new j((u) this.f126616x, continuation, 20);
                jVar5.f126615w = obj2;
                return jVar5;
            case 21:
                return new j((com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) this.f126615w, (xi0.b) this.f126616x, continuation, 21);
            case 22:
                return new j((com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) this.f126615w, (wk5.a) this.f126616x, continuation, 22);
            case 23:
                return new j((com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) this.f126615w, (h1j.b) this.f126616x, continuation, 23);
            case 24:
                return new j((er5.d) this.f126615w, (String) this.f126616x, continuation, 24);
            case 25:
                return new j((er5.d) this.f126615w, (c0) this.f126616x, continuation, 25);
            case 26:
                return new j((com.revolut.biometric_verification.impl.ui.flow.launcher.d) this.f126615w, (vr.i) this.f126616x, continuation, 26);
            case 27:
                return new j((com.revolut.biometric_verification.impl.ui.flow.launcher.d) this.f126615w, (i0) this.f126616x, continuation, 27);
            case 28:
                j jVar6 = new j((com.revolut.biometric_verification.impl.ui.flow.launcher.d) this.f126616x, continuation, 28);
                jVar6.f126615w = obj2;
                return jVar6;
            default:
                return new j((com.revolut.biometric_verification.impl.ui.flow.launcher.d) this.f126616x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((j) create((j1j.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((j) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((j) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((j) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((j) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((j) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:463:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eif.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f126616x = obj2;
    }
}
