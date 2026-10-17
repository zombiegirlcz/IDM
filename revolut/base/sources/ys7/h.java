package ys7;

import com.revolut.feature.insurance_credit.impl.data.network.InsuranceCreditService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y5b.b0;
import yea.l;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceCreditService f316424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xx4.d f316425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f316426c;
    public final x4l.c d;

    public h(InsuranceCreditService service, xx4.d memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f316424a = service;
        this.f316425b = memoryCache;
        this.f316426c = storage;
        int i = 0;
        yki.d dVar = new yki.d(2, memoryCache, xx4.d.class, "set", "set(Lcom/revolut/feature/credit/core/storage/MemoryCacheKey;Ljava/lang/Object;)V", i, 2);
        Continuation continuation = null;
        this.d = new x4l.c(new b0(this, continuation, 7), new l(1, memoryCache, xx4.d.class, "get", "get(Lcom/revolut/feature/credit/core/storage/MemoryCacheKey;)Ljava/lang/Object;", i, 13), dVar, new g(this, continuation, 0), new y69.e(this, continuation, 3), new g(this, continuation, 1));
    }

    public static vkm.d a(h hVar, String policyId) {
        hVar.getClass();
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return hVar.d.b(new f(policyId), loadingStrategy);
    }

    public final Object b(String str, i iVar) {
        Object objD = this.d.d(new f(str), false, iVar);
        return objD == fim.a.COROUTINE_SUSPENDED ? objD : Unit.f186387a;
    }
}
