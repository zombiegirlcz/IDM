package sic;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tul.b f263540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd0.c f263541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f263542c;

    public e(tul.b compactNumberFormatter, d perkIconImageMapper, qd0.c localizedDistanceUnitFactory, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(compactNumberFormatter, "compactNumberFormatter");
        Intrinsics.checkNotNullParameter(perkIconImageMapper, "perkIconImageMapper");
        Intrinsics.checkNotNullParameter(localizedDistanceUnitFactory, "localizedDistanceUnitFactory");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f263540a = compactNumberFormatter;
        this.f263541b = localizedDistanceUnitFactory;
        this.f263542c = dateProvider;
    }
}
