package ud2;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.spin.api.R$string;
import com.revolut.feature.apm.spin.impl.ui.deregister.SpinDeregisterPromptScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import u7k.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class q extends oki.h implements dli.b {

    @NotNull
    public static final k Companion = new k();
    public final SpinDeregisterPromptScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vw1.b f279083p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xd2.f f279084q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v02.c f279085r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f279086s;

    public q(SpinDeregisterPromptScreenContract$InputData inputData, vw1.b aliasRepository, xd2.f spinAliasExtension, v02.c aliasDialogProvider, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(aliasRepository, "aliasRepository");
        Intrinsics.checkNotNullParameter(spinAliasExtension, "spinAliasExtension");
        Intrinsics.checkNotNullParameter(aliasDialogProvider, "aliasDialogProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f279083p = aliasRepository;
        this.f279084q = spinAliasExtension;
        this.f279085r = aliasDialogProvider;
        this.f279086s = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    public static final void I2(q qVar) {
        yji.l.a1(qVar, qVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.spin_settings_registration_error_generic_title, null, null, 14), new TextLocalisedClause(R$string.spin_settings_registration_error_generic_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5)), null, null, new l(qVar, null, 2), 3);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, nim.a.v(vw1.b.c(this.f279083p), new te8.a(this.o.f62876a, 24)), null, null, new f0(this, null, 20), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f279086s;
    }
}
