package hpi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l f154547m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l rootContainerConfiguration) {
        super(rootContainerConfiguration);
        Intrinsics.checkNotNullParameter(rootContainerConfiguration, "rootContainerConfiguration");
        this.f154547m = rootContainerConfiguration;
    }

    @Override // hpi.c
    public final l a() {
        return this.f154547m;
    }
}
