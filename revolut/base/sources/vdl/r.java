package vdl;

import com.revolut.shared.feature.wealth.domain.impl.data.network.InstrumentStatsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentStatsService f288035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dcl.k0 f288036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dcl.i f288037c;
    public final dcl.c d;
    public final ne0.j e;
    public final x4l.c f;

    public r(InstrumentStatsService service, dcl.k0 instrumentsStatsDao, dcl.i etfStatsDao, dcl.c bondStatsDao, ne0.j memoryCache, b80.c connectivityRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(instrumentsStatsDao, "instrumentsStatsDao");
        Intrinsics.checkNotNullParameter(etfStatsDao, "etfStatsDao");
        Intrinsics.checkNotNullParameter(bondStatsDao, "bondStatsDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        this.f288035a = service;
        this.f288036b = instrumentsStatsDao;
        this.f288037c = etfStatsDao;
        this.d = bondStatsDao;
        this.e = memoryCache;
        Continuation continuation = null;
        this.f = new x4l.c(new uec.d(connectivityRepository, this, continuation, 26), new a(this, 4), new v48.d(this, 18), new v44.e(this, continuation, 22), new ska.c(this, continuation, 24));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(vdl.r r27, java.util.Set r28, gim.c r29) {
        /*
            Method dump skipped, instruction units count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vdl.r.a(vdl.r, java.util.Set, gim.c):java.io.Serializable");
    }

    public static String b(nel.n nVar) {
        return com.google.android.gms.internal.mlkit_vision_face.a.o(nVar.f214597c.name(), "_", nVar.f214596b);
    }
}
