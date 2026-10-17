package zh9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class i0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f322285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f322286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f322287c;
    public final boolean d;
    public final boolean e;

    public i0(io3.d pocket, i accountConfig) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(accountConfig, "accountConfig");
        this.f322285a = pocket;
        this.f322286b = accountConfig;
        xi0.a aVar = xi0.b.Companion;
        String str = pocket.f163147c;
        aVar.getClass();
        this.f322287c = xi0.a.a(str);
        l lVar = m.Companion;
        wi0.b bVar = accountConfig.d;
        lVar.getClass();
        this.d = l.a(bVar).f322305c;
        this.e = l.a(accountConfig.d).f322304b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f322285a, i0Var.f322285a) && Intrinsics.f(this.f322286b, i0Var.f322286b);
    }

    public final int hashCode() {
        return this.f322286b.hashCode() + (this.f322285a.hashCode() * 31);
    }
}
