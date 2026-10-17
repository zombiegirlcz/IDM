package frk;

import com.google.gson.reflect.TypeToken;
import com.revolut.retail.feature.stockdetails.impl.data.network.AssetDataPointsService;
import dp4.f1;
import fgj.g;
import fjd.w;
import fna.f;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import krk.l;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();
    public static final Type e = new TypeToken<Map<krk.b, ? extends l>>() { // from class: com.revolut.retail.feature.stockdetails.impl.data.dod.AssetDataPointsDodProvider$Companion$storageType$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetDataPointsService f137491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f137492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f137493c;
    public final x4l.c d;

    public d(AssetDataPointsService service, j cache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f137491a = service;
        this.f137492b = cache;
        this.f137493c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new a(this, continuation, 1), new w(this, 29), new g(this, 26), new f(this, null, 8), new f1(this, continuation, 20));
    }

    public static String a(cel.b bVar) {
        return "ASSET_DATA_POINTS_" + bVar.f23497a + "_" + bVar.f23498b + "_" + bVar.f23499c + "_" + bVar.d;
    }
}
