package com.fourthline.orca.internal;

import com.fourthline.orca.internal.io;
import com.fourthline.orca.internal.si;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class sm implements ww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f33060a;

    public sm(fe1 viewNavigator) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        this.f33060a = viewNavigator;
    }

    @Override // com.fourthline.orca.internal.ww
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPrimaryClicked(kd1 intent, si.e error, String source, Function0 retryBlock) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(retryBlock, "retryBlock");
        this.f33060a.b(new io.a.c(error));
    }

    @Override // com.fourthline.orca.internal.ww
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onSecondaryClicked(kd1 intent, si.e error, String source, Function0 retryBlock) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(retryBlock, "retryBlock");
        throw new IllegalStateException((error.a() + " secondary button should not be clickable in Document flow!").toString());
    }
}
