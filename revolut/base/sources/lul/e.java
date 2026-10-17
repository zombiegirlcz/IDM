package lul;

import bul.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r10.a f200256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f200257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vrl.c f200258c;

    public e(r10.a frequencySettingsBuilder, r marketHolidayEventsProvider, vrl.c investOrderInteractor) {
        Intrinsics.checkNotNullParameter(frequencySettingsBuilder, "frequencySettingsBuilder");
        Intrinsics.checkNotNullParameter(marketHolidayEventsProvider, "marketHolidayEventsProvider");
        Intrinsics.checkNotNullParameter(investOrderInteractor, "investOrderInteractor");
        this.f200256a = frequencySettingsBuilder;
        this.f200257b = marketHolidayEventsProvider;
        this.f200258c = investOrderInteractor;
    }
}
