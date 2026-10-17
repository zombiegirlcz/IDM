package com.fourthline.orca.internal;

import com.fourthline.orca.internal.io;
import com.fourthline.orca.internal.si;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class b50 implements ww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f26986a;

    public b50(fe1 viewNavigator) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        this.f26986a = viewNavigator;
    }

    @Override // com.fourthline.orca.internal.ww
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPrimaryClicked(kd1 intent, si.f error, String source, Function0 retryBlock) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(retryBlock, "retryBlock");
        this.f26986a.b(io.a.C0218a.f29649a);
    }

    @Override // com.fourthline.orca.internal.ww
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onSecondaryClicked(kd1 intent, si.f error, String source, Function0 retryBlock) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(retryBlock, "retryBlock");
        throw new IllegalStateException((error.a() + " secondary button should not be clickable in KYC flow!").toString());
    }
}
