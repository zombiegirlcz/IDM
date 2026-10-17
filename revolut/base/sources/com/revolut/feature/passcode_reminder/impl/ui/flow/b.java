package com.revolut.feature.passcode_reminder.impl.ui.flow;

import cn0.c;
import com.revolut.feature.passcode_reminder.impl.ui.flow.PasscodeReminderFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import hn0.n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import oki.h;
import se9.d;
import te0.w;
import wim.z;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements ve9.b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f78651p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final oe9.a f78652q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ue9.c f78653r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f78654s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f78655t;
    public final yki.a u;

    public b(c passcodeMetadataProvider, n securityRepositoryInteractor, oe9.a passcodeVerificationDispatcher, ue9.c passcodeReminderRepository, d passcodeReminderPigeonRepository) {
        FlowStep flowStep;
        Intrinsics.checkNotNullParameter(passcodeMetadataProvider, "passcodeMetadataProvider");
        Intrinsics.checkNotNullParameter(securityRepositoryInteractor, "securityRepositoryInteractor");
        Intrinsics.checkNotNullParameter(passcodeVerificationDispatcher, "passcodeVerificationDispatcher");
        Intrinsics.checkNotNullParameter(passcodeReminderRepository, "passcodeReminderRepository");
        Intrinsics.checkNotNullParameter(passcodeReminderPigeonRepository, "passcodeReminderPigeonRepository");
        this.o = passcodeMetadataProvider;
        this.f78651p = securityRepositoryInteractor;
        this.f78652q = passcodeVerificationDispatcher;
        this.f78653r = passcodeReminderRepository;
        this.f78654s = passcodeReminderPigeonRepository;
        this.f78655t = w.y0(new vch.a(this, 2));
        ue0.c cVar = passcodeReminderRepository.f279316a;
        if (passcodeReminderRepository.a()) {
            if (((Number) cVar.v0(0, "KEY_FAILED_ATTEMPT_COUNT", z.d(o0.b(Integer.TYPE)))).intValue() >= 3) {
                flowStep = PasscodeReminderFlowContract$Step.ChangePasscodeDialog.f78647a;
            }
            this.u = cp5.d.a(this, flowStep, f0.f322471a, new v48.d(this, 21));
        }
        cVar.I0("KEY_FAILED_ATTEMPT_COUNT");
        flowStep = PasscodeReminderFlowContract$Step.EnterPasscode.f78648a;
        this.u = cp5.d.a(this, flowStep, f0.f322471a, new v48.d(this, 21));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
