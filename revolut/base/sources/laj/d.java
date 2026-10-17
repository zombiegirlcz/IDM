package laj;

import com.google.gson.reflect.TypeToken;
import com.revolut.retail.feature.crypto.newlyadded.impl.data.network.NewlyAddedCryptoService;
import java.lang.reflect.Type;
import java.util.List;
import k3c.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l0c.v;
import la8.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements a {

    @NotNull
    public static final c Companion = new c();
    public static final Type e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NewlyAddedCryptoService f193408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f193409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f193410c;
    public final x4l.c d;

    static {
        Type type = new TypeToken<List<? extends String>>() { // from class: com.revolut.retail.feature.crypto.newlyadded.impl.data.repositories.NewlyAddedCryptoRepositoryImpl$Companion$type$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        e = type;
    }

    public d(NewlyAddedCryptoService service, ne0.d memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f193408a = service;
        this.f193409b = memoryCache;
        this.f193410c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new k(this, continuation, 11), new b(this, 0), new v(this, 26), new h(this, null, 2), new l05.b(this, continuation, 10));
    }
}
