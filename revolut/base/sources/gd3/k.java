package gd3;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.cashback.impl.network.CashbackStatusService;
import dp4.z0;
import java.lang.reflect.Type;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements h {

    @NotNull
    public static final j Companion = new j();
    public static final Type e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashbackStatusService f143062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f143063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f143064c;
    public final x4l.c d;

    static {
        Type type = new TypeToken<fd3.h>() { // from class: com.revolut.feature.cashback.impl.repository.CashbackStatusRepositoryImpl$Companion$cashbackStatusDtoType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        e = type;
    }

    public k(CashbackStatusService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f143062a = service;
        this.f143063b = memoryCache;
        this.f143064c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new e6d.f(this, continuation, 10), new i(this, 0), new g75.i(this, 18), new g85.f(this, continuation, 5), new z0(this, continuation, 19));
    }
}
