package dkk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class r {

    @NotNull
    public static final p Companion = new p();
    public static final wi0.b d;
    public static final wi0.b e;
    public static final wi0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wi0.b f115614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final wi0.b f115615h;
    public static final wi0.b i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f115616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jla.h f115617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final si7.a f115618c;

    static {
        wi0.a aVar = wi0.b.Companion;
        aVar.getClass();
        d = wi0.b.f297770q3;
        aVar.getClass();
        e = wi0.b.J2;
        aVar.getClass();
        f = wi0.b.E;
        aVar.getClass();
        f115614g = wi0.b.X0;
        aVar.getClass();
        f115615h = wi0.b.l2;
        aVar.getClass();
        i = wi0.b.f297756l;
    }

    public r(ang.f userInteractor, jla.h productCatalogueInteractor, si7.a insuranceInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(insuranceInteractor, "insuranceInteractor");
        this.f115616a = userInteractor;
        this.f115617b = productCatalogueInteractor;
        this.f115618c = insuranceInteractor;
    }
}
