package r05;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l05.i;
import w4l.h;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f250705a;

    public g(i repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f250705a = repository;
    }

    public static vkm.d a(g gVar) {
        gVar.getClass();
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        i iVar = gVar.f250705a;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return iVar.d.b(Unit.f186387a, loadingStrategy);
    }
}
