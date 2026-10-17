package i9g;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f159786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f159787b;

    public d0(b0 travelHotelsPropertyInteractor, h0 travelSearchParamsInteractor) {
        Intrinsics.checkNotNullParameter(travelHotelsPropertyInteractor, "travelHotelsPropertyInteractor");
        Intrinsics.checkNotNullParameter(travelSearchParamsInteractor, "travelSearchParamsInteractor");
        this.f159786a = travelHotelsPropertyInteractor;
        this.f159787b = travelSearchParamsInteractor;
    }

    public final efm.r a(String propertyId, LocalDate localDate, LocalDate localDate2) {
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        Boolean bool = Boolean.FALSE;
        h0 h0Var = this.f159787b;
        if (localDate == null) {
            localDate = h0Var.b();
        }
        LocalDate localDate3 = localDate;
        if (localDate2 == null) {
            localDate2 = h0Var.c();
        }
        return this.f159786a.a(new yfi.a(propertyId, bool, localDate3, localDate2, hx7.a.F(h0Var.f159799a.a().d)), false);
    }
}
