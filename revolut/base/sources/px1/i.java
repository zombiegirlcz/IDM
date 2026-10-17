package px1;

import ahe.y0;
import com.google.common.collect.ImmutableMap;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.apm.core.contacts.data.network.ApmContactsDiscoveryService;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import fy1.l;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import vkm.q;
import vkm.v1;
import vkm.y;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements nx1.i {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmContactsDiscoveryService f240561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f240562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f240563c;
    public final ox1.i d;

    public i(ApmContactsDiscoveryService service, c cacheManager, ImmutableMap daoInteractors, ox1.i deviceContactMapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(cacheManager, "cacheManager");
        Intrinsics.checkNotNullParameter(daoInteractors, "daoInteractors");
        Intrinsics.checkNotNullParameter(deviceContactMapper, "deviceContactMapper");
        this.f240561a = service;
        this.f240562b = cacheManager;
        this.f240563c = daoInteractors;
        this.d = deviceContactMapper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0096, code lost:
    
        if (r3 == r7) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0195, code lost:
    
        if (r0 == r7) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0148 -> B:42:0x014e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0152 -> B:43:0x0150). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(px1.i r22, java.util.List r23, nx1.e r24, gim.c r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: px1.i.d(px1.i, java.util.List, nx1.e, gim.c):java.lang.Object");
    }

    @Override // nx1.i
    public final Object a(n02.b bVar, ApmDescriptor apmDescriptor, gim.c cVar) {
        Continuation continuation = null;
        return q.x(t1.E(new y(q.Q(new v1(new of6.d(this, bVar, apmDescriptor, continuation, 23)), new y0(continuation, this, continuation, 21)), new nx1.q(4, 1, null))), cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0127, code lost:
    
        if (vkm.q.x(com.google.crypto.tink.shaded.protobuf.t1.E(new vkm.y(vkm.q.Q(new vkm.v1(new of6.d(r18, r2, r0, r4, 24)), new ahe.y0(r4, r18, r0, 21)), new nx1.q(4, 1, null))), r6) == r7) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // nx1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r19, java.util.ArrayList r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: px1.i.b(java.util.List, java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // nx1.i
    public final Object c(String str, l lVar) {
        pnf.f fVar = new pnf.f(str, this, null, 24);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, fVar, lVar);
    }
}
