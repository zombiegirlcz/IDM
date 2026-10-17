package kx7;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.insurance_pet.impl.network.service.PetService;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements g {

    @NotNull
    public static final j Companion = new j();
    public static final Type e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PetService f190471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f190472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f190473c;
    public final Lazy d;

    static {
        Type type = new TypeToken<List<? extends gx7.h>>() { // from class: com.revolut.feature.insurance_pet.impl.repository.PetDocumentRepositoryImpl$Companion$DOCUMENT_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        e = type;
    }

    public m(PetService service, ue0.c storage, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f190471a = service;
        this.f190472b = storage;
        this.f190473c = memoryCache;
        this.d = yhm.j.b(new kob.a(this, 12));
    }

    public static String a(k kVar) {
        return j6.a.q("CACHE_KEY_DOCUMENT_", j6.a.s("DocumentDelegateParam(policyId=", kVar.f190467a, ", documentType=", kVar.f190468b, ")"));
    }
}
