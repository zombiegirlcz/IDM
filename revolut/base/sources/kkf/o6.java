package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f184866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vlf.b f184867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final thf.m f184868c;

    public o6(klf.h0 commonDataSource, vlf.b commonUiMapper, thf.m transactionTextResourcesMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        this.f184866a = commonDataSource;
        this.f184867b = commonUiMapper;
        this.f184868c = transactionTextResourcesMapper;
    }

    public final cmf.p a() {
        return new cmf.p(new kh4.f(this.f184866a.d(), this, 27), new z5(1), zhm.f0.f322471a, "SimpleStatus");
    }
}
