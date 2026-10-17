package bpd;

import knd.v;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f17606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f17607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f17608c;

    public g(v analyticsDataProvider, e earningsDataProvider, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(analyticsDataProvider, "analyticsDataProvider");
        Intrinsics.checkNotNullParameter(earningsDataProvider, "earningsDataProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f17606a = analyticsDataProvider;
        this.f17607b = earningsDataProvider;
        this.f17608c = coroutineScope;
    }
}
