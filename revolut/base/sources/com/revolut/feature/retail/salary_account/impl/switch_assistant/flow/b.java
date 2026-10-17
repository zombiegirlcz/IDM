package com.revolut.feature.retail.salary_account.impl.switch_assistant.flow;

import android.content.Intent;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.SwitchAssistantFlowContract$InputData;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.SwitchAssistantFlowContract$Step;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import d8l.d;
import fnc.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import u7k.w;
import uhb.c;
import uhb.f;
import uhb.g;
import yki.i;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements c {

    @NotNull
    public static final f Companion = new f();
    public final SwitchAssistantFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yhb.c f83050p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t1j.b f83051q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s f83052r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fkg.a f83053s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final uhb.a f83054t;
    public final s70.a u;
    public final bhb.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final wpc.b f83055w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i f83056x;

    public b(SwitchAssistantFlowContract$InputData inputData, yhb.c payrollPlatformEmailSentPromptProvider, t1j.b updatePayrollPlatformInteractor, s salarySwitchRequestStatusInteractor, fkg.a emailPayrollManagerInteractor, uhb.a bottomSheetProvider, s70.a intentProvider, bhb.a salarySwitchAssistantStatusDialogProvider, wpc.b shareSalaryDetailsDestinationProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(payrollPlatformEmailSentPromptProvider, "payrollPlatformEmailSentPromptProvider");
        Intrinsics.checkNotNullParameter(updatePayrollPlatformInteractor, "updatePayrollPlatformInteractor");
        Intrinsics.checkNotNullParameter(salarySwitchRequestStatusInteractor, "salarySwitchRequestStatusInteractor");
        Intrinsics.checkNotNullParameter(emailPayrollManagerInteractor, "emailPayrollManagerInteractor");
        Intrinsics.checkNotNullParameter(bottomSheetProvider, "bottomSheetProvider");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(salarySwitchAssistantStatusDialogProvider, "salarySwitchAssistantStatusDialogProvider");
        Intrinsics.checkNotNullParameter(shareSalaryDetailsDestinationProvider, "shareSalaryDetailsDestinationProvider");
        this.o = inputData;
        this.f83050p = payrollPlatformEmailSentPromptProvider;
        this.f83051q = updatePayrollPlatformInteractor;
        this.f83052r = salarySwitchRequestStatusInteractor;
        this.f83053s = emailPayrollManagerInteractor;
        this.f83054t = bottomSheetProvider;
        this.u = intentProvider;
        this.v = salarySwitchAssistantStatusDialogProvider;
        this.f83055w = shareSalaryDetailsDestinationProvider;
        this.f83056x = d.a(this, new w(this, 20));
    }

    @Override // yki.j
    public final void M0() {
        SwitchAssistantFlowContract$InputData.Empty empty = SwitchAssistantFlowContract$InputData.Empty.f83033a;
        SwitchAssistantFlowContract$InputData switchAssistantFlowContract$InputData = this.o;
        boolean zF = Intrinsics.f(switchAssistantFlowContract$InputData, empty);
        i iVar = this.f83056x;
        if (zF) {
            h.t2(this, iVar, SwitchAssistantFlowContract$Step.Entry.f83042a, false, null, false, 12);
            return;
        }
        Continuation continuation = null;
        if (Intrinsics.f(switchAssistantFlowContract$InputData, SwitchAssistantFlowContract$InputData.OpenEmailApp.f83036a)) {
            ((s70.b) this.u).getClass();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.APP_EMAIL");
            intent.addFlags(268435456);
            C1(new ExternalDestination.ByIntent(intent, null));
            h.D2(iVar);
            return;
        }
        if (Intrinsics.f(switchAssistantFlowContract$InputData, SwitchAssistantFlowContract$InputData.PayrollManagerInput.f83037a)) {
            h.t2(this, iVar, SwitchAssistantFlowContract$Step.PayrollManagerInput.f83043a, false, null, false, 12);
            return;
        }
        if (Intrinsics.f(switchAssistantFlowContract$InputData, SwitchAssistantFlowContract$InputData.UpdatePayroll.f83041a)) {
            h.t2(this, iVar, SwitchAssistantFlowContract$Step.PayrollPlatformAccountDetails.f83044a, false, null, false, 12);
            return;
        }
        if (switchAssistantFlowContract$InputData instanceof SwitchAssistantFlowContract$InputData.EnterWorkEmail) {
            h.t2(this, iVar, SwitchAssistantFlowContract$Step.PayrollPlatformEmailInput.f83045a, false, null, false, 12);
            return;
        }
        boolean z = switchAssistantFlowContract$InputData instanceof SwitchAssistantFlowContract$InputData.SendFollowUp;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (z) {
            h.w2(iVar, new SwitchAssistantFlowContract$Step.ReviewEmail(((SwitchAssistantFlowContract$InputData.SendFollowUp) switchAssistantFlowContract$InputData).f83038a), bottom_dialog);
            return;
        }
        if (switchAssistantFlowContract$InputData instanceof SwitchAssistantFlowContract$InputData.MarkCompleted) {
            l2(new uhb.i(this, ((SwitchAssistantFlowContract$InputData.MarkCompleted) switchAssistantFlowContract$InputData).f83035a, continuation, 1), new yi5.b(26));
        } else if (switchAssistantFlowContract$InputData instanceof SwitchAssistantFlowContract$InputData.StartOver) {
            h.w2(iVar, new SwitchAssistantFlowContract$Step.StartOverConfirmation(((SwitchAssistantFlowContract$InputData.StartOver) switchAssistantFlowContract$InputData).f83039a), bottom_dialog);
        } else {
            if (!Intrinsics.f(switchAssistantFlowContract$InputData, SwitchAssistantFlowContract$InputData.Tracker.f83040a)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new g(this, continuation, 0), new yi5.b(26));
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f83056x;
    }
}
