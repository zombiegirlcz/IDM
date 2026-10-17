package t95;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f268949a = new c();

    private c() {
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<List<? extends r95.c>>() { // from class: com.revolut.feature.credit.overdraft.impl.repositories.OverdraftCacheKey$Facility$storageCacheType$1
        };
    }

    @Override // ne0.a
    public final /* bridge */ /* synthetic */ String getKey() {
        return "overdraft_facilities";
    }
}
