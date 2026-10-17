package nfj;

import com.revolut.retail.feature.esim.impl.network.EsimPhoneNumberPortingService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPortingService f214966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ynj.i f214967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kg.o f214968c;

    public j0(EsimPhoneNumberPortingService phoneNumberPortingService, ynj.i defaultPollingDurationProvider, kg.o gson) {
        Intrinsics.checkNotNullParameter(phoneNumberPortingService, "phoneNumberPortingService");
        Intrinsics.checkNotNullParameter(defaultPollingDurationProvider, "defaultPollingDurationProvider");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f214966a = phoneNumberPortingService;
        this.f214967b = defaultPollingDurationProvider;
        this.f214968c = gson;
    }

    public final long a(ulm.u0 u0Var) {
        Long lN;
        String strA = u0Var.a("Retry-After");
        return (strA == null || (lN = kotlin.text.z.n(strA)) == null) ? ynj.i.a(this.f214967b) : kotlin.time.c.h(Math.abs(lN.longValue()), pkm.e.SECONDS);
    }

    public final long b(ulm.u0 u0Var) {
        Long lN;
        String strA = u0Var.a("X-Retry-Timeout");
        return (strA == null || (lN = kotlin.text.z.n(strA)) == null) ? ynj.i.b(this.f214967b) : kotlin.time.c.h(Math.abs(lN.longValue()), pkm.e.SECONDS);
    }
}
