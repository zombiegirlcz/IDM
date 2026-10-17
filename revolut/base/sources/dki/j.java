package dki;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ao.h f115545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f115546b;

    public j(ao.h withId, k modalHost) {
        Intrinsics.checkNotNullParameter(withId, "withId");
        Intrinsics.checkNotNullParameter(modalHost, "modalHost");
        this.f115545a = withId;
        this.f115546b = modalHost;
    }

    @Override // dki.m
    public final ao.h a() {
        return this.f115545a;
    }

    public final k b() {
        return this.f115546b;
    }
}
