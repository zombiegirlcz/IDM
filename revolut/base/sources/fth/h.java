package fth;

import ip0.qe0;
import ip0.we0;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g(u.c(new we0("IMAGE_LIST_ID", new qe0(-2, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D292", null, null, "mobile/3d_images/v2", 22)))));
    }
}
