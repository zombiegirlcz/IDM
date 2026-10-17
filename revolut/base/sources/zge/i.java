package zge;

import com.revolut.feature.tab.accounts.models.ProductId;
import g48.r0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mif.e0;
import nya.i0;
import org.jetbrains.annotations.NotNull;
import vdl.c1;
import vge.z2;
import vkm.j2;
import vkm.q;
import vkm.s1;
import vkm.v1;
import wf0.f0;
import wkm.s;
import ya6.y;
import z0f.k;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kge.d f322117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z2 f322118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f322119c;
    public final com.revolut.domain.interactors.transactions.a d;
    public final ang.f e;
    public final ue0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j2 f322120g;

    public i(kge.d accountNotificationRepository, z2 productAccountsInteractor, r0 jointAccountsInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, ang.f userInteractor, l80.e dateProvider, ue0.c storage) {
        Intrinsics.checkNotNullParameter(accountNotificationRepository, "accountNotificationRepository");
        Intrinsics.checkNotNullParameter(productAccountsInteractor, "productAccountsInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f322117a = accountNotificationRepository;
        this.f322118b = productAccountsInteractor;
        this.f322119c = jointAccountsInteractor;
        this.d = transactionsInteractor;
        this.e = userInteractor;
        this.f = storage;
        this.f322120g = q.c(sfe.a.CACHE_ONLY);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable e(zge.i r12, java.util.Map r13, java.util.List r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zge.i.e(zge.i, java.util.Map, java.util.List, gim.c):java.io.Serializable");
    }

    @Override // zge.a
    public final Flow a(oge.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ProductId productId = descriptor.f225125a;
        return this.f322117a.t(descriptor.f225126b, productId);
    }

    @Override // zge.a
    public final Flow b() {
        return new k(this.f322117a.o(), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (r2 == r4) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        if (r2 == r4) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e4, code lost:
    
        if (r1 == r4) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // zge.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(oge.a r24, kotlin.coroutines.Continuation r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zge.i.c(oge.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // zge.a
    public final Object d(oge.a aVar, i0 i0Var) {
        Continuation continuation = null;
        Object objG = e0.g(i0Var, s1.f290118a, new c1((Function3) new y(3, 6, null), continuation, 15), s.f298328a, new Flow[]{q.Q(this.f322120g, new z6e.g(continuation, this, 11)), q.Q(new v1(new z9m.a(this, continuation, 4)), new f0(continuation, this, aVar, 17))});
        if (objG != fim.a.COROUTINE_SUSPENDED) {
            objG = Unit.f186387a;
        }
        if (objG != fim.a.COROUTINE_SUSPENDED) {
            objG = Unit.f186387a;
        }
        return objG == fim.a.COROUTINE_SUSPENDED ? objG : Unit.f186387a;
    }
}
