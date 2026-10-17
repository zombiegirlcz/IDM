package yr3;

import a0.d;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.credit.application.impl.repositories.entrypoints.CreditEntryPointsRepositoryImpl$CacheKey$storageCacheType$1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import xx4.c;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements xx4.b, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f316112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f316113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f316114c;

    public a(String origin, ArrayList productPaths) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(productPaths, "productPaths");
        this.f316112a = origin;
        this.f316113b = productPaths;
        this.f316114c = d.s("credit_entry_points_", origin, "_", d0.k0(d0.O0(productPaths), "_", null, null, 0, null, 62));
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new CreditEntryPointsRepositoryImpl$CacheKey$storageCacheType$1();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f316112a, aVar.f316112a) && this.f316113b.equals(aVar.f316113b);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f316114c;
    }

    public final int hashCode() {
        return this.f316113b.hashCode() + (this.f316112a.hashCode() * 31);
    }
}
