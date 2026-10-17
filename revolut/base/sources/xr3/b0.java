package xr3;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.credit.application.impl.repositories.CreditPrimaryEntryPointsRepositoryImpl$Companion$PrimaryEntryPointsCacheKey$V1$storageCacheType$1;

/* JADX INFO: loaded from: classes21.dex */
public final class b0 implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f308205a = new b0();

    private b0() {
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new CreditPrimaryEntryPointsRepositoryImpl$Companion$PrimaryEntryPointsCacheKey$V1$storageCacheType$1();
    }

    @Override // ne0.a
    public final /* bridge */ /* synthetic */ String getKey() {
        return "PRIMARY_ENTRY_POINTS_KEY";
    }
}
