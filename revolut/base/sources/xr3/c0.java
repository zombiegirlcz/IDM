package xr3;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.credit.application.impl.repositories.CreditPrimaryEntryPointsRepositoryImpl$Companion$PrimaryEntryPointsCacheKey$V2$storageCacheType$1;
import grl.r2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c0 implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r2 f308206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308207b;

    public c0(r2 entryPointType) {
        Intrinsics.checkNotNullParameter(entryPointType, "entryPointType");
        this.f308206a = entryPointType;
        this.f308207b = "PRIMARY_ENTRY_POINTS_KEY_V2-" + entryPointType;
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new CreditPrimaryEntryPointsRepositoryImpl$Companion$PrimaryEntryPointsCacheKey$V2$storageCacheType$1();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && this.f308206a == ((c0) obj2).f308206a;
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f308207b;
    }

    public final int hashCode() {
        return this.f308206a.hashCode();
    }
}
