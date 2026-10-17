package ouj;

import com.google.gson.reflect.TypeToken;
import com.revolut.retail.feature.impl.travel.network.TravelService;
import java.lang.reflect.Type;
import k3c.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nuj.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements a {

    @NotNull
    public static final b Companion = new b();
    public static final Type e = new TypeToken<i>() { // from class: com.revolut.retail.feature.impl.travel.repository.TravelRepositoryImpl$Companion$travelDestinationDtoType$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelService f229882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f229883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f229884c;
    public final x4l.c d;

    public d(TravelService service, ne0.d memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f229882a = service;
        this.f229883b = memoryCache;
        this.f229884c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new k(this, continuation, 21), new oqk.c(this, 19), new or4.i(this, 5), new ocb.d(this, continuation, 23), new l05.b(this, continuation, 26));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ouj.d r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof ouj.c
            if (r0 == 0) goto L13
            r0 = r5
            ouj.c r0 = (ouj.c) r0
            int r1 = r0.f229881w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f229881w = r1
            goto L18
        L13:
            ouj.c r0 = new ouj.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f229881w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            com.revolut.retail.feature.impl.travel.network.TravelService r5 = r4.f229882a
            r0.f229881w = r3
            java.lang.Object r5 = r5.getTravel(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            retrofit2.Response r5 = (retrofit2.Response) r5
            boolean r0 = r5.isSuccessful()
            if (r0 == 0) goto L63
            java.lang.Object r4 = r5.body()
            if (r4 == 0) goto L5b
            nuj.i r4 = (nuj.i) r4
            g0j.a r4 = zh9.u0.O(r4)
            od0.h r5 = od0.i.Companion
            r5.getClass()
            od0.i r4 = od0.h.a(r4)
            return r4
        L5b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Required value was null."
            r4.<init>(r5)
            throw r4
        L63:
            int r0 = r5.code()
            r1 = 404(0x194, float:5.66E-43)
            if (r0 != r1) goto L76
            r4.clear()
            od0.h r4 = od0.i.Companion
            r4.getClass()
            od0.i r4 = od0.i.f224256b
            return r4
        L76:
            retrofit2.HttpException r4 = new retrofit2.HttpException
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ouj.d.a(ouj.d, gim.c):java.lang.Object");
    }

    @Override // od0.e
    public final void clear() {
        this.f229884c.clear();
        this.f229883b.clear();
    }
}
