package pkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f237121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vlf.b f237122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final thf.m f237123c;

    public s(klf.h0 commonDataSource, vlf.b commonUiMapper, thf.m transactionTextResourcesMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        this.f237121a = commonDataSource;
        this.f237122b = commonUiMapper;
        this.f237123c = transactionTextResourcesMapper;
    }
}
