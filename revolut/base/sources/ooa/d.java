package ooa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements j7a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d61.a f227020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zxd.b f227021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f227022c;
    public final zxd.c d;

    public d(d61.a profileConfirmationInteractor, zxd.b mustacheTemplatesProvider, a state, zxd.c statementInteractor) {
        Intrinsics.checkNotNullParameter(profileConfirmationInteractor, "profileConfirmationInteractor");
        Intrinsics.checkNotNullParameter(mustacheTemplatesProvider, "mustacheTemplatesProvider");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(statementInteractor, "statementInteractor");
        this.f227020a = profileConfirmationInteractor;
        this.f227021b = mustacheTemplatesProvider;
        this.f227022c = state;
        this.d = statementInteractor;
    }
}
