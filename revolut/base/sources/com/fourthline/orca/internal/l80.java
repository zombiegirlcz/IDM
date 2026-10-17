package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class l80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m80 f30533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f30534b;

    public l80(m80 buttonState, Function1 onClick) {
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f30533a = buttonState;
        this.f30534b = onClick;
    }

    public final m80 a() {
        return this.f30533a;
    }

    public final Function1 b() {
        return this.f30534b;
    }
}
