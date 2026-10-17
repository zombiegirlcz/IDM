package p2a;

import cm2.c;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.jvm.internal.Intrinsics;
import os9.t;
import q2a.f;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends d2a.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f232190l;

    public b(f transfersWallpaperInteractor) {
        Intrinsics.checkNotNullParameter(transfersWallpaperInteractor, "transfersWallpaperInteractor");
        this.f232190l = transfersWallpaperInteractor;
    }

    @Override // d2a.a
    public final ViewController Z2(String entityId) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        em2.b.Companion.getClass();
        ViewController viewControllerO2 = o2(new c(em2.a.a()));
        t block = new t(this, entityId, 19);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerO2.H = block;
        return viewControllerO2;
    }
}
