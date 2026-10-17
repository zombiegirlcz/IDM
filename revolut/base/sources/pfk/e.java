package pfk;

import com.google.gson.reflect.TypeToken;
import com.revolut.retail.feature.pricing_plans.impl.network.CreditPlansService;
import java.lang.reflect.Type;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nfj.l1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements dha.a {

    @NotNull
    public static final a Companion = new a();
    public static final Type e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPlansService f235627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f235628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xe0.e f235629c;
    public final x4l.c d;

    static {
        Intrinsics.checkNotNullExpressionValue(new TypeToken<kfk.a>() { // from class: com.revolut.retail.feature.pricing_plans.impl.repository.CreditPlansRepositoryImpl$Companion$CARD_ACTIVATION_INFO_DTO_TYPE$1
        }.getType(), "getType(...)");
        Type type = new TypeToken<kfk.b>() { // from class: com.revolut.retail.feature.pricing_plans.impl.repository.CreditPlansRepositoryImpl$Companion$PLAN_ACTIVATION_INFO_DTO_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        e = type;
    }

    public e(CreditPlansService service, ne0.j memoryCache, xe0.e storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f235627a = service;
        this.f235628b = memoryCache;
        this.f235629c = storage;
        Continuation continuation = null;
        new x4l.c(new c(this, null, 0), new pd4.u(this, 27), new pch.f(this, 13), new d(this, null, 0), new c(this, null, 1));
        this.d = new x4l.c(new o29.l(this, continuation, 16), new pb2.v(this, 11), new p5f.c(this, 17), new d(this, null, 1), new l1(this, continuation, 27));
    }

    public static String a(b bVar) {
        return a0.d.s("PLAN_ACTIVATION_INFO_", bVar.f235622b, "_", bVar.f235621a);
    }
}
