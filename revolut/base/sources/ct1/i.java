package ct1;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import ip0.zj;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        ct1.a domainState = (ct1.a) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new e(u.c(new FullScreenStateDelegate.Model("FULLSCREEN_ICON_ID", null, null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D404", null, null, null, 30)), null, zj.REGULAR, true, null, null, null, 1862)));
    }
}
