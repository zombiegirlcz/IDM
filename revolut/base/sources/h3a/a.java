package h3a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f149043a;

    public a(t transferFeaturesProvider) {
        Intrinsics.checkNotNullParameter(transferFeaturesProvider, "transferFeaturesProvider");
        this.f149043a = transferFeaturesProvider;
    }

    public final ufm.i a(Collection initialFilters) {
        Intrinsics.checkNotNullParameter(initialFilters, "initialFilters");
        ufm.i iVar = new ufm.i(this.f149043a.a(), new h0l.g(new b2.a(initialFilters, 3), 4), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
