package ol5;

import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import sl5.h;
import ul5.g;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f226335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f226336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xvh.c f226337c;
    public final j d;
    public final ue0.c e;

    public c(g spareChangeMultipliersProvider, h cryptoSparePocketsInteractor, xvh.c autoInvestInteractor, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(spareChangeMultipliersProvider, "spareChangeMultipliersProvider");
        Intrinsics.checkNotNullParameter(cryptoSparePocketsInteractor, "cryptoSparePocketsInteractor");
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f226335a = spareChangeMultipliersProvider;
        this.f226336b = cryptoSparePocketsInteractor;
        this.f226337c = autoInvestInteractor;
        this.d = memoryCache;
        this.e = storage;
    }
}
