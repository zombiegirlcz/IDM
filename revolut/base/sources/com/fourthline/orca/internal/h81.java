package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class h81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f29178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j81 f29179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f29180c;

    public h81(long j2, j81 timeProvider) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f29178a = j2;
        this.f29179b = timeProvider;
    }

    private final boolean a() {
        return this.f29179b.a() - this.f29180c > this.f29178a;
    }

    public final void a(Function0 onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        if (a()) {
            onClick.invoke();
            this.f29180c = this.f29179b.a();
        }
    }

    public /* synthetic */ h81(long j2, j81 j81Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, (i & 2) != 0 ? new dw() : j81Var);
    }
}
