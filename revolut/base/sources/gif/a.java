package gif;

import foh.i;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import tof.q6;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f144170a;

    public a(b transactionLoaderFactory) {
        Intrinsics.checkNotNullParameter(transactionLoaderFactory, "transactionLoaderFactory");
        this.f144170a = transactionLoaderFactory;
    }

    public final h a(q6 scope) {
        h hVar;
        b bVar = this.f144170a;
        synchronized (bVar) {
            try {
                Intrinsics.checkNotNullParameter(scope, "scope");
                LinkedHashMap linkedHashMap = bVar.f144173c;
                Object obj2 = linkedHashMap.get(scope);
                Object obj3 = obj2;
                if (obj2 == null) {
                    phm.a aVar = (phm.a) bVar.f144171a.get(scope.getClass());
                    if (aVar == null) {
                        throw new IllegalArgumentException("Loader provider for " + scope + " not found in " + bVar.f144171a);
                    }
                    h hVar2 = (h) aVar.get();
                    hVar2.b(bVar.f144172b.a(scope), scope);
                    i.t(linkedHashMap, scope, hVar2);
                    obj3 = hVar2;
                }
                hVar = (h) obj3;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return hVar;
    }
}
