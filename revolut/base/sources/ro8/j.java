package ro8;

import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends oki.h implements dli.b {
    public final k18.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zq.a f255945p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f255946q;

    public j(k18.c juniorSignInMethodsInteractor, zq.a remoteLoginInteractor, e inputData, k stateMapper) {
        Intrinsics.checkNotNullParameter(juniorSignInMethodsInteractor, "juniorSignInMethodsInteractor");
        Intrinsics.checkNotNullParameter(remoteLoginInteractor, "remoteLoginInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = juniorSignInMethodsInteractor;
        this.f255945p = remoteLoginInteractor;
        this.f255946q = mra.d.b(this, new d(inputData.f255936a, inputData.f255937b, inputData.f255938c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f255946q;
    }
}
