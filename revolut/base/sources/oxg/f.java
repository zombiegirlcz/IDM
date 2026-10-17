package oxg;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f f230823a = new f();

    private f() {
    }

    public static l a(rxg.j asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        if (asset instanceof rxg.a) {
            rxg.a aVar = (rxg.a) asset;
            return new b(aVar.f258154a, aVar.f258155b);
        }
        if (asset instanceof rxg.f) {
            rxg.f fVar = (rxg.f) asset;
            return new i(fVar.f258171a, fVar.f258172b);
        }
        if (asset instanceof rxg.d) {
            return new e(((rxg.d) asset).f258165a);
        }
        if (asset instanceof rxg.e) {
            return new h(((rxg.e) asset).f258168a);
        }
        if (asset instanceof rxg.b) {
            rxg.b bVar = (rxg.b) asset;
            return new k(bVar.f258157a, bVar.f258158b);
        }
        if (asset instanceof rxg.i) {
            rxg.i iVar = (rxg.i) asset;
            return new k(iVar.f258181a, iVar.f258182b);
        }
        if (asset instanceof rxg.c) {
            rxg.c cVar = (rxg.c) asset;
            return new d(cVar.f258161b, cVar.e, cVar.f);
        }
        if (asset instanceof rxg.h) {
            rxg.h hVar = (rxg.h) asset;
            return new g(hVar.f258177a, hVar.d, hVar.f258178b, hVar.f258179c);
        }
        if (asset instanceof rxg.g) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
