package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;

/* JADX INFO: loaded from: classes23.dex */
public final class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeMark f26734a;

    public aa(TimeMark requestStart) {
        Intrinsics.checkNotNullParameter(requestStart, "requestStart");
        this.f26734a = requestStart;
    }

    public final long a() {
        return kotlin.time.b.f(this.f26734a.a());
    }
}
