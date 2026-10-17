package bv6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u17.c;
import u17.d;
import u17.h;
import u17.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f18968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u17.b f18969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f18970c;
    public final c d;

    public b(l generalFilterChipProvider, h currencyFilterChipProvider, u17.b dateRangeFilterChipProvider, d paymentStateFilterChipProvider, c paymentMethodFilterChipProvider) {
        Intrinsics.checkNotNullParameter(generalFilterChipProvider, "generalFilterChipProvider");
        Intrinsics.checkNotNullParameter(currencyFilterChipProvider, "currencyFilterChipProvider");
        Intrinsics.checkNotNullParameter(dateRangeFilterChipProvider, "dateRangeFilterChipProvider");
        Intrinsics.checkNotNullParameter(paymentStateFilterChipProvider, "paymentStateFilterChipProvider");
        Intrinsics.checkNotNullParameter(paymentMethodFilterChipProvider, "paymentMethodFilterChipProvider");
        this.f18968a = currencyFilterChipProvider;
        this.f18969b = dateRangeFilterChipProvider;
        this.f18970c = paymentStateFilterChipProvider;
        this.d = paymentMethodFilterChipProvider;
    }
}
