package ma9;

import cli.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends oki.h implements g {

    @NotNull
    public static final i Companion = new i();
    public final s70.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y80.a f203967p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cl3.a f203968q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f203969r;

    public k(s70.a intentProvider, y80.a permissionProvider, cl3.a contactsInteractor, l stateMapper) {
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = intentProvider;
        this.f203967p = permissionProvider;
        this.f203968q = contactsInteractor;
        this.f203969r = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f203969r;
    }
}
