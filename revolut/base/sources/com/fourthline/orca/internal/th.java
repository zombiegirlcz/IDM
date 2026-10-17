package com.fourthline.orca.internal;

import com.fourthline.orca.internal.p2;
import com.fourthline.orca.internal.xh;
import com.fourthline.orca.kyc.internal.error.KycError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class th implements ww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mq0 f33774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j20 f33775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wr f33776c;
    private final fe1 d;

    public th(mq0 presenter, j20 stateProvider, wr effectHandler, fe1 viewNavigator) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        this.f33774a = presenter;
        this.f33775b = stateProvider;
        this.f33776c = effectHandler;
        this.d = viewNavigator;
    }

    @Override // com.fourthline.orca.internal.ww
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPrimaryClicked(kd1 intent, t2 error, String source, Function0 retryBlock) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(retryBlock, "retryBlock");
        this.f33774a.a(new mp1(this, 28));
        this.f33776c.a(new nr1(15));
    }

    @Override // com.fourthline.orca.internal.ww
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onSecondaryClicked(kd1 intent, t2 error, String source, Function0 retryBlock) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(retryBlock, "retryBlock");
        this.d.b(new xh.b(KycError.IssuingCountryNotSupported.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s2 a(th thVar, s2 present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return s2.a((s2) thVar.f33775b.getInitialState(), null, null, null, null, r2.a(present.n(), null, null, false, null, null, null, l20.f30508b, null, null, null, null, null, 4031, null), 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p2 a() {
        return p2.c.f31803a;
    }
}
