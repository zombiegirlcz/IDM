package vlg;

import cli.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class s extends oki.h implements k {

    @NotNull
    public static final q Companion = new q();
    public final n8b.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hlg.b f290445p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f290446q;

    public s(cli.n stateMapper, n8b.a countryInteractor, hlg.b sendChecksInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(sendChecksInteractor, "sendChecksInteractor");
        this.o = countryInteractor;
        this.f290445p = sendChecksInteractor;
        this.f290446q = mra.d.b(this, new e(l.INDIVIDUAL, null, new ilg.b(0)), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f290446q;
    }
}
