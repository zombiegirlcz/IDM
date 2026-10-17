package d30;

import com.revolut.chat.data.network.TicketsInfoApi;
import com.youTransactor.uCube.rpc.Constants;
import cul.n0;
import efm.d0;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m20.s;
import ne0.j;
import te0.w;
import ufm.i;
import w4l.f;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketsInfoApi f110893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f110894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f110895c;

    public c(TicketsInfoApi ticketInfoApi, j memoryCache) {
        Intrinsics.checkNotNullParameter(ticketInfoApi, "ticketInfoApi");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f110893a = ticketInfoApi;
        this.f110894b = memoryCache;
        final int i = 0;
        final int i2 = 1;
        this.f110895c = new f(new Function2(this) { // from class: d30.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f110891b;

            {
                this.f110891b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        UUID uploadId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(uploadId, "uploadId");
                        TicketsInfoApi ticketsInfoApi = this.f110891b.f110893a;
                        String string = uploadId.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        d0<s> fileUrl = ticketsInfoApi.getFileUrl(string);
                        d2i.a aVar = new d2i.a(new d27.d0(12), 8);
                        fileUrl.getClass();
                        i iVar = new i(fileUrl, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return w.i0(iVar);
                    default:
                        UUID uploadId2 = (UUID) obj2;
                        String url2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(uploadId2, "uploadId");
                        Intrinsics.checkNotNullParameter(url2, "url");
                        this.f110891b.f110894b.f("file_url_" + uploadId2, url2);
                        return Unit.f186387a;
                }
            }
        }, new n0(this, 29), new Function2(this) { // from class: d30.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f110891b;

            {
                this.f110891b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        UUID uploadId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(uploadId, "uploadId");
                        TicketsInfoApi ticketsInfoApi = this.f110891b.f110893a;
                        String string = uploadId.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        d0<s> fileUrl = ticketsInfoApi.getFileUrl(string);
                        d2i.a aVar = new d2i.a(new d27.d0(12), 8);
                        fileUrl.getClass();
                        i iVar = new i(fileUrl, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return w.i0(iVar);
                    default:
                        UUID uploadId2 = (UUID) obj2;
                        String url2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(uploadId2, "uploadId");
                        Intrinsics.checkNotNullParameter(url2, "url");
                        this.f110891b.f110894b.f("file_url_" + uploadId2, url2);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.UUID r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof d30.b
            if (r0 == 0) goto L13
            r0 = r6
            d30.b r0 = (d30.b) r0
            int r1 = r0.f110892w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f110892w = r1
            goto L18
        L13:
            d30.b r0 = new d30.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f110892w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L58
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            w4l.f r6 = r4.f110895c
            w4l.h r2 = w4l.h.f294642c
            efm.r r5 = r6.e(r5, r2)
            czh.a r6 = new czh.a
            r2 = 11
            r6.<init>(r2)
            r2 = 0
            efm.r r5 = m70.a.g(r5, r2, r6, r3)
            efm.d0 r5 = r5.firstOrError()
            java.lang.String r6 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r0.f110892w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L58
            return r1
        L58:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d30.c.a(java.util.UUID, gim.c):java.lang.Object");
    }
}
