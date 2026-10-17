package sre;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.terms.impl.network.UserDocumentsService;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pti.s;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements i {

    @NotNull
    public static final j Companion = new j();
    public static final Type e = new TypeToken<List<? extends qre.h>>() { // from class: com.revolut.feature.terms.impl.repository.UserDocumentsRepositoryImpl$Companion$USER_DOCUMENTS_LIST_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserDocumentsService f265203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f265204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f265205c;
    public final x4l.c d;

    public k(UserDocumentsService service, ue0.c storage, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f265203a = service;
        this.f265204b = storage;
        this.f265205c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new s(this, continuation, 13), new sl5.a(this, 15), new scl.h(this, 24), new se4.c(this, continuation, 19), new ska.c(this, continuation, 3));
    }
}
