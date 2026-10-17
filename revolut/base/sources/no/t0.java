package no;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.Process;
import android.os.storage.StorageManager;
import com.google.protobuf.f3;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.analytics.tracking.v3.f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(com.revolut.analytics.tracking.v3.f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t0(this.v, continuation, 0);
            default:
                return new t0(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object bVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return this.v.f50319j.a();
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.analytics.tracking.v3.f fVar = this.v;
                icm.m mVar = fVar.f50317g;
                Context context = (Context) mVar.f160343b;
                int i = mVar.f160342a;
                if (i < 26) {
                    bVar = new up.b(new NotImplementedError("Unavailable on <= 25 API. Please add some fallback implementation if there is need in statistics on lower APIs"));
                } else {
                    try {
                        StorageStats storageStatsQueryStatsForPackage = ((StorageStatsManager) context.getSystemService(StorageStatsManager.class)).queryStatsForPackage(StorageManager.UUID_DEFAULT, context.getPackageName(), Process.myUserHandle());
                        bVar = new up.a(storageStatsQueryStatsForPackage.getAppBytes(), storageStatsQueryStatsForPackage.getDataBytes(), storageStatsQueryStatsForPackage.getCacheBytes(), i >= 31 ? Long.valueOf(storageStatsQueryStatsForPackage.getExternalCacheBytes()) : null, i >= 35 ? Long.valueOf(storageStatsQueryStatsForPackage.getAppBytesByDataType(0)) : null, i >= 35 ? Long.valueOf(storageStatsQueryStatsForPackage.getAppBytesByDataType(1)) : null, i >= 35 ? Long.valueOf(storageStatsQueryStatsForPackage.getAppBytesByDataType(2)) : null, i >= 35 ? Long.valueOf(storageStatsQueryStatsForPackage.getAppBytesByDataType(3)) : null, i >= 35 ? Long.valueOf(storageStatsQueryStatsForPackage.getAppBytesByDataType(4)) : null, i >= 35 ? Long.valueOf(storageStatsQueryStatsForPackage.getAppBytesByDataType(5)) : null);
                    } catch (Throwable th10) {
                        bVar = new up.b(th10);
                    }
                }
                if (bVar instanceof up.b) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.WARNING, null, null, ((up.b) bVar).f281673a, h0Var);
                } else {
                    if (!(bVar instanceof up.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    up.a aVar3 = (up.a) bVar;
                    AnalyticsProduct.Shared.MobilePlatform mobilePlatform = AnalyticsProduct.Shared.MobilePlatform.f;
                    final long j2 = aVar3.f281667a;
                    final long j3 = aVar3.f281668b;
                    final long j5 = aVar3.f281669c;
                    final Long l2 = aVar3.d;
                    final Long l3 = aVar3.e;
                    final Long l4 = aVar3.f;
                    final Long l5 = aVar3.f281670g;
                    final Long l22 = aVar3.f281671h;
                    final Long l31 = aVar3.i;
                    final Long l37 = aVar3.f281672j;
                    com.revolut.analytics.tracking.v3.f.g(fVar, mobilePlatform, null, null, new Function0() { // from class: no.k0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            final long j16 = j2;
                            final long j22 = j3;
                            final long j42 = j5;
                            final Long l39 = l2;
                            final Long l51 = l3;
                            final Long l52 = l4;
                            final Long l60 = l5;
                            final Long l66 = l22;
                            final Long l69 = l31;
                            final Long l79 = l37;
                            return new AnalyticsContext(m72.b.h("appSize", com.bumptech.glide.c.g(new Function1() { // from class: no.c0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    f3 buildStruct = (f3) obj3;
                                    Intrinsics.checkNotNullParameter(buildStruct, "$this$buildStruct");
                                    com.bumptech.glide.c.w(buildStruct, "appBytes", Long.valueOf(j16));
                                    com.bumptech.glide.c.w(buildStruct, "dataBytes", Long.valueOf(j22));
                                    com.bumptech.glide.c.w(buildStruct, "cacheBytes", Long.valueOf(j42));
                                    com.bumptech.glide.c.w(buildStruct, "externalCacheBytes", l39);
                                    com.bumptech.glide.c.w(buildStruct, "dexoptBytes", l51);
                                    com.bumptech.glide.c.w(buildStruct, "referenceProfileBytes", l52);
                                    com.bumptech.glide.c.w(buildStruct, "currentProfileBytes", l60);
                                    com.bumptech.glide.c.w(buildStruct, "apkBytes", l66);
                                    com.bumptech.glide.c.w(buildStruct, "dmBytes", l69);
                                    com.bumptech.glide.c.w(buildStruct, "libBytes", l79);
                                    return Unit.f186387a;
                                }
                            }), AnalyticsContext.INSTANCE));
                        }
                    }, 14);
                }
                return Unit.f186387a;
        }
    }
}
