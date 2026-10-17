package nfj;

import com.google.gson.reflect.TypeToken;
import com.revolut.retail.feature.esim.impl.network.EsimWidgetsConfigService;
import java.lang.reflect.Type;
import kfj.d5;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class w2 implements t2 {

    @NotNull
    public static final u2 Companion = new u2();
    public static final Type e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimWidgetsConfigService f215063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f215064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f215065c;
    public final x4l.c d;

    static {
        Type type = new TypeToken<d5>() { // from class: com.revolut.retail.feature.esim.impl.repositories.EsimWidgetsConfigRepositoryImpl$Companion$widgetsConfigDtoType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        e = type;
    }

    public w2(EsimWidgetsConfigService api2, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f215063a = api2;
        this.f215064b = memoryCache;
        this.f215065c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new mtj.k(this, continuation, 20), new l(this, 6), new n8i.e(this, 21), new naf.j(this, continuation, 15), new l1(this, continuation, 2));
    }
}
