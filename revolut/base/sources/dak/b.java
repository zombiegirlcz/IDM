package dak;

import com.google.gson.reflect.TypeToken;
import efm.r;
import java.lang.reflect.Type;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ba5.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Type f112542c = new TypeToken<cak.a>() { // from class: com.revolut.retail.feature.pcw_auth.impl.repositories.PcwAuthRepositoryImpl$Companion$SESSION_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f112543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f112544b;

    public b(j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f112543a = memoryCache;
        this.f112544b = storage;
    }

    public final r a() {
        Type SESSION_TYPE = f112542c;
        Intrinsics.checkNotNullExpressionValue(SESSION_TYPE, "SESSION_TYPE");
        r map = rd0.e.c(this.f112544b.C0("pcw_user_session", SESSION_TYPE), g.f186406a).map(new ag.j(new an0.e(11), 14));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return w.f0(map);
    }

    @Override // od0.e
    public final void clear() {
        this.f112544b.clear();
        this.f112543a.clear();
    }
}
