package hw3;

import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes22.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yv3.b f156059a;

    public d0(yv3.b repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f156059a = repository;
    }

    public final Object a(String str, gim.c cVar) {
        q34.d dVar = (q34.d) this.f156059a;
        dVar.getClass();
        q03.m mVar = new q03.m(dVar, str, null, 7);
        p0 p0Var = p0.f264001a;
        return skm.e0.J(elm.f.f127540b, mVar, cVar);
    }
}
