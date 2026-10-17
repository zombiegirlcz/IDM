package eif;

import com.google.common.collect.ImmutableMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import tof.q6;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f126604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f126605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f126606c;

    public e(ImmutableMap cacheInflatersProviders, ImmutableMap remoteProviders) {
        Intrinsics.checkNotNullParameter(cacheInflatersProviders, "cacheInflatersProviders");
        Intrinsics.checkNotNullParameter(remoteProviders, "remoteProviders");
        this.f126604a = cacheInflatersProviders;
        this.f126605b = remoteProviders;
        this.f126606c = new LinkedHashMap();
    }

    public final synchronized k a(q6 scope) {
        Object obj2;
        try {
            Intrinsics.checkNotNullParameter(scope, "scope");
            LinkedHashMap linkedHashMap = this.f126606c;
            obj2 = linkedHashMap.get(scope);
            if (obj2 == null) {
                vif.f fVar = (vif.f) this.f126605b.get(scope.getClass());
                if (fVar == null) {
                    throw new IllegalArgumentException("Remote provider for " + scope + " not found in " + this.f126605b);
                }
                phm.a aVar = (phm.a) this.f126604a.get(scope.getClass());
                if (aVar == null) {
                    throw new IllegalArgumentException("Cache inflater provider for " + scope + " not found in " + this.f126604a);
                }
                k kVar = (k) aVar.get();
                Intrinsics.i(kVar, "null cannot be cast to non-null type com.revolut.feature.transactions.impl.data.cache_inflater.InitableTransactionsCacheInflater");
                kVar.i(fVar, scope);
                foh.i.t(linkedHashMap, scope, kVar);
                obj2 = kVar;
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return (k) obj2;
    }
}
