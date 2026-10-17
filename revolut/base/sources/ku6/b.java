package ku6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u17.e;
import u17.f;
import u17.h;
import u17.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f189721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u17.b f189722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f189723c;
    public final u17.a d;

    public b(l generalFilterChipProvider, f amountFilterChipProvider, h currencyFilterChipProvider, u17.b dateRangeFilterChipProvider, e statusFilterChipsProvider, u17.a channelFilterChipProvider) {
        Intrinsics.checkNotNullParameter(generalFilterChipProvider, "generalFilterChipProvider");
        Intrinsics.checkNotNullParameter(amountFilterChipProvider, "amountFilterChipProvider");
        Intrinsics.checkNotNullParameter(currencyFilterChipProvider, "currencyFilterChipProvider");
        Intrinsics.checkNotNullParameter(dateRangeFilterChipProvider, "dateRangeFilterChipProvider");
        Intrinsics.checkNotNullParameter(statusFilterChipsProvider, "statusFilterChipsProvider");
        Intrinsics.checkNotNullParameter(channelFilterChipProvider, "channelFilterChipProvider");
        this.f189721a = currencyFilterChipProvider;
        this.f189722b = dateRangeFilterChipProvider;
        this.f189723c = statusFilterChipsProvider;
        this.d = channelFilterChipProvider;
    }
}
