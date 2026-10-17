package c30;

import bwb.n;
import bzg.t;
import com.revolut.chat.data.network.TranscriptApi;
import com.revolut.chat.domain.model.TranscriptDateRange;
import com.revolut.chat.domain.model.TranscriptIdentifier;
import java.time.LocalDate;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import prk.o;
import v30.a1;
import vkm.q;
import zhm.d0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    @NotNull
    private static final b Companion = new b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TranscriptApi f20848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f20849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f20850c;
    public final ue0.c d;
    public final l80.e e;
    public final ConcurrentHashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f20851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f20852h;

    public h(TranscriptApi transcriptApi, CoroutineScope publicScope, j memoryCache, ue0.c storage, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(transcriptApi, "transcriptApi");
        Intrinsics.checkNotNullParameter(publicScope, "publicScope");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f20848a = transcriptApi;
        this.f20849b = publicScope;
        this.f20850c = memoryCache;
        this.d = storage;
        this.e = dateProvider;
        this.f = new ConcurrentHashMap();
        this.f20851g = new ConcurrentHashMap();
        Continuation continuation = null;
        this.f20852h = new x4l.c(new b6a.d(this, continuation, 16), new t(this, 12), new bwd.a(this, 13), new c1i.f(this, continuation, 4), new n(this, continuation, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(c30.h r5, java.util.UUID r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof c30.d
            if (r0 == 0) goto L13
            r0 = r7
            c30.d r0 = (c30.d) r0
            int r1 = r0.f20840w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20840w = r1
            goto L18
        L13:
            c30.d r0 = new c30.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f20840w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L61
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            ne0.j r7 = r5.f20850c
            java.lang.String r2 = b(r6)
            java.lang.Object r7 = r7.get(r2)
            c30.a r7 = (c30.a) r7
            if (r7 != 0) goto L4e
            ue0.c r7 = r5.d
            java.lang.String r2 = b(r6)
            java.lang.Class<c30.a> r4 = c30.a.class
            java.lang.Object r7 = j6.a.k(r4, r7, r2)
            c30.a r7 = (c30.a) r7
        L4e:
            c30.a r7 = r5.e(r7)
            if (r7 == 0) goto L55
            return r7
        L55:
            com.revolut.chat.data.network.TranscriptApi r7 = r5.f20848a
            r0.f20840w = r3
            r2 = 0
            java.lang.Object r7 = r7.getAvailableDates(r6, r2, r2, r0)
            if (r7 != r1) goto L61
            return r1
        L61:
            n20.b r7 = (n20.b) r7
            java.util.List r6 = r7.getDates()
            if (r6 != 0) goto L6b
            zhm.f0 r6 = zhm.f0.f322471a
        L6b:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = zhm.w.t(r6, r0)
            r7.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L7c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r0 = r6.next()
            n20.a r0 = (n20.a) r0
            com.revolut.chat.domain.model.TranscriptDateRange r0 = mif.a.C(r0)
            c20.a r0 = mif.a.z(r0)
            r7.add(r0)
            goto L7c
        L94:
            l80.e r5 = r5.e
            l80.f r5 = (l80.f) r5
            java.time.LocalDate r5 = r5.e()
            c30.a r6 = new c30.a
            r6.<init>(r5, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c30.h.a(c30.h, java.util.UUID, gim.c):java.lang.Object");
    }

    public static String b(UUID uuid) {
        return o.r(uuid, "available_dates_feed_id_");
    }

    public final MutableStateFlow c(TranscriptIdentifier transcriptIdentifier) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = this.f;
        Object objC = concurrentHashMap.get(transcriptIdentifier);
        if (objC == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(transcriptIdentifier, (objC = q.c(a1.f285758a)))) != null) {
            objC = objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getOrPut(...)");
        return (MutableStateFlow) objC;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.chat.domain.model.TranscriptIdentifier r18, com.revolut.chat.domain.model.TranscriptDateRange r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c30.h.d(com.revolut.chat.domain.model.TranscriptIdentifier, com.revolut.chat.domain.model.TranscriptDateRange, gim.c):java.lang.Object");
    }

    public final a e(a aVar) {
        c20.a aVar2;
        LocalDate localDateE = ((l80.f) this.e).e();
        if (aVar == null || !Intrinsics.f(aVar.getFetchedOn(), localDateE) || (aVar2 = (c20.a) d0.o0(aVar.getDates())) == null) {
            return null;
        }
        TranscriptDateRange transcriptDateRangeB = mif.a.B(aVar2);
        LocalDate f51076a = transcriptDateRangeB.getF51076a();
        if (localDateE.compareTo((Object) transcriptDateRangeB.getF51077b()) > 0 || localDateE.compareTo((Object) f51076a) < 0) {
            return null;
        }
        return aVar;
    }
}
