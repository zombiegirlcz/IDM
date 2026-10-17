package zll;

import bjl.p0;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.sso.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import rp0.k1;
import tll.e;
import yki.g;
import yki.j;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b extends h implements j, g, e {

    @NotNull
    public static final a Companion = new a();
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g1 f323301p;

    public b(p0 revolutSsoDependenciesProvider, g1 shotDialogDisplayer) {
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        this.o = revolutSsoDependenciesProvider;
        this.f323301p = shotDialogDisplayer;
    }

    public final void I2() {
        ((k1) this.f323301p).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "DIALOG_ID_CONFIRMATION_WAS_SUCCESSFUL", new TextLocalisedClause(R$string.revolut_sso_request_confirmation_success, null, null, 14), null, null, null, 60));
    }

    @Override // tll.e
    public final boolean f() {
        return !s().c();
    }
}
