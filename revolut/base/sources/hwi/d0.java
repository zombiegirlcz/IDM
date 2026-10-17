package hwi;

import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungesDisclaimerService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 {

    @NotNull
    private static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungesDisclaimerService f156203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f156204b;

    public d0(AirportLoungesDisclaimerService service, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f156203a = service;
        this.f156204b = storage;
    }
}
