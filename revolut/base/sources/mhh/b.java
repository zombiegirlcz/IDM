package mhh;

import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends zgh.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zjh.f f205571c;
    public final zgh.b d;

    public b(zjh.f screen, zgh.b controllerModel) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        this.f205571c = screen;
        this.d = controllerModel;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, rd0.e.b(((VaultsProgressDelegate) this.f205571c.f322835b).r()), new a(this, null), 3);
    }
}
