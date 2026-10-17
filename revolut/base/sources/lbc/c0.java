package lbc;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 implements cli.n {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nbc.d f193631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kac.e f193632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f193633c;

    public c0(nbc.d sectionMapper, nbc.b itemMapper, kac.e flightBookingUiMapper, kbc.c orderImageMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(sectionMapper, "sectionMapper");
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(flightBookingUiMapper, "flightBookingUiMapper");
        Intrinsics.checkNotNullParameter(orderImageMapper, "orderImageMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f193631a = sectionMapper;
        this.f193632b = flightBookingUiMapper;
        this.f193633c = featureToggleInteractor;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (u) iii.c.f(t1.u(domainState.f193637a, domainState.f193638b, domainState.f193639c), new l9j.k(this, 29), new l9j.j(this, 8), new koe.y(this, domainState, 10));
    }
}
