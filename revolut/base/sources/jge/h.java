package jge;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uie.i f174006a;

    public h(uie.i iVar) {
        this.f174006a = iVar;
    }

    public final she.g a() {
        uie.i iVar = this.f174006a;
        uie.j dependenciesApi = iVar.f280394a;
        Intrinsics.checkNotNullParameter(dependenciesApi, "dependenciesApi");
        return new she.g(new she.h((vie.a) dependenciesApi.a().f13500c), iVar.f280395b.b());
    }
}
