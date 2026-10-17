package yj2;

import com.revolut.feature.atm.api.model.AtmLocation;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtmLocation f314383g = new AtmLocation(51.505643d, -0.0248464d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f314384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w39.b f314385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d49.a f314386c;
    public final CoroutineScope d;
    public final AtomicReference e;
    public final Lazy f;

    public d(l atmsInteractor, w39.b locationInteractor, d49.a locationDistanceMeter, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(atmsInteractor, "atmsInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(locationDistanceMeter, "locationDistanceMeter");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f314384a = atmsInteractor;
        this.f314385b = locationInteractor;
        this.f314386c = locationDistanceMeter;
        this.d = rd0.e.a(dispatcher);
        this.e = new AtomicReference(null);
        this.f = yhm.j.b(new y99.c(this, 15));
    }
}
