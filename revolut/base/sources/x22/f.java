package x22;

import c12.r;
import cli.k;
import cli.y;
import com.revolut.feature.apm.core.ui.api.navigation.ApmPendingNavigation$InputData;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import w72.g;
import wr1.s;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends h implements b {

    @NotNull
    public static final e Companion = new e();
    public final ApmPendingNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f302462p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f302463q;

    public f(ApmPendingNavigation$InputData inputData, r extension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.o = inputData;
        this.f302462p = extension;
        this.f302463q = mra.d.b(this, k.f25028a, new g(this), null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, ta6.a.J(this.o.d, TimeUnit.MILLISECONDS), null, null, new s(this, null, 19), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f302463q;
    }
}
