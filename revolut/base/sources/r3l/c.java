package r3l;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import rp0.k1;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends fsi.c implements a {

    @NotNull
    private static final b Companion = new b();
    public static final fsi.b i = new fsi.b("SHOT_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g1 f251317h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g1 shotDialogDisplayer) {
        super(i);
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        this.f251317h = shotDialogDisplayer;
    }

    public final void N(ShotDialogDisplayer$Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        ((k1) this.f251317h).d(configuration);
    }
}
