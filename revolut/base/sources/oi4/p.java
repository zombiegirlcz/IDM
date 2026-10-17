package oi4;

import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.request_consent.RequestConsentScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class p extends jki.g implements i {

    @NotNull
    private static final k Companion = new k();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hw3.e f225445p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hw3.c f225446q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RequestConsentScreenContract$InputData f225447r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mn3.a f225448s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f225449t;
    public final a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(hw3.e creditApplicationConfigInteractor, hw3.c spousalConsentInitiatorInteractor, RequestConsentScreenContract$InputData inputData, mn3.a contactsChooserResultObservable, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(creditApplicationConfigInteractor, "creditApplicationConfigInteractor");
        Intrinsics.checkNotNullParameter(spousalConsentInitiatorInteractor, "spousalConsentInitiatorInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contactsChooserResultObservable, "contactsChooserResultObservable");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f225445p = creditApplicationConfigInteractor;
        this.f225446q = spousalConsentInitiatorInteractor;
        this.f225447r = inputData;
        this.f225448s = contactsChooserResultObservable;
        this.f225449t = new e(1);
        this.u = new a();
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, new o9a.e(rd0.e.b(this.f225448s.f207359a), 3), null, null, new n(this, null, 0), 3);
        l2(new l(this, null), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f225449t;
    }

    @Override // jki.g
    public final kki.a s2() {
        return this.u;
    }
}
