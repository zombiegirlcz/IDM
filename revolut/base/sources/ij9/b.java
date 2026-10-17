package ij9;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import grl.k9;
import no.m;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f161739a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AnalyticsProduct.Retail f161740b;

    static {
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f;
        f161740b = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
    }

    private b() {
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getQ() {
        return f161740b;
    }
}
