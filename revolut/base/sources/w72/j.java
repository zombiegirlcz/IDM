package w72;

import cli.y;
import com.revolut.feature.apm.multibanco.impl.ui.enrollment.entry.MultibancoExternalEnrollmentEntryScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vmf.k;
import w3c.n;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends oki.h implements dli.b {

    @NotNull
    public static final h Companion = new h();
    public final l72.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l72.c f295461p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f295462q;

    public j(MultibancoExternalEnrollmentEntryScreenContract$InputData inputData, l72.e multibancoInteractor, l72.c cardInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(multibancoInteractor, "multibancoInteractor");
        Intrinsics.checkNotNullParameter(cardInteractor, "cardInteractor");
        this.o = multibancoInteractor;
        this.f295461p = cardInteractor;
        this.f295462q = mra.d.b(this, new b(inputData.f62590a), new g(0), null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new k(this, null, 28), new n(this, 11));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f295462q;
    }
}
