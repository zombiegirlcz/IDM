package jwb;

import a31.w;
import btk.j;
import bwb.p;
import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.v1;
import w4l.i;
import w4l.k;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bwb.e f178951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk0.b f178952b;

    public e(bwb.e revPointsGiftcardsRepository, zk0.b fileSystemRepository) {
        Intrinsics.checkNotNullParameter(revPointsGiftcardsRepository, "revPointsGiftcardsRepository");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        this.f178951a = revPointsGiftcardsRepository;
        this.f178952b = fileSystemRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof jwb.d
            if (r0 == 0) goto L13
            r0 = r5
            jwb.d r0 = (jwb.d) r0
            int r1 = r0.f178950w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f178950w = r1
            goto L18
        L13:
            jwb.d r0 = new jwb.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f178950w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f178950w = r3
            bwb.e r5 = r4.f178951a
            bwb.p r5 = (bwb.p) r5
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.io.InputStream r5 = (java.io.InputStream) r5
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "statement_"
            java.lang.String r3 = ".pdf"
            java.lang.String r0 = p.a.n(r0, r2, r3)
            zk0.b r1 = r4.f178952b     // Catch: java.lang.Throwable -> L66
            zk0.a r2 = zk0.a.INTERNAL_CACHE     // Catch: java.lang.Throwable -> L66
            a80.h r1 = (a80.h) r1     // Catch: java.lang.Throwable -> L66
            java.io.File r0 = r1.n(r2, r5, r0)     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L5e
            r1 = 0
            com.bumptech.glide.d.e(r5, r1)
            return r0
        L5e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = "Could not create file"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L66
            throw r0     // Catch: java.lang.Throwable -> L66
        L66:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L68
        L68:
            r1 = move-exception
            com.bumptech.glide.d.e(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jwb.e.a(gim.c):java.lang.Object");
    }

    public final vkm.d b(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        bwb.a params = new bwb.a(id10);
        p pVar = (p) this.f178951a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return pVar.f19308h.b(params, loadingStrategy);
    }

    public final vkm.d c(String str, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        bwb.b params = new bwb.b(str);
        p pVar = (p) this.f178951a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return pVar.f19307g.b(params, loadingStrategy);
    }

    public final vkm.d d(String groupId, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        bwb.c params = new bwb.c(groupId);
        p pVar = (p) this.f178951a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return pVar.f.b(params, loadingStrategy);
    }

    public final vkm.d e(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        p pVar = (p) this.f178951a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return pVar.e.b(Unit.f186387a, loadingStrategy);
    }

    public final Object f(String str, nwb.c cVar) {
        bwb.a aVar = new bwb.a(str);
        p pVar = (p) this.f178951a;
        pVar.getClass();
        Continuation continuation = null;
        return q.x(t1.E(q.L(q.Q(new v1(new w(pVar, aVar, continuation, 10)), new bwb.k(3, 0, continuation)), 3L, new j(2, continuation))), cVar);
    }

    public final Object g(String str, gim.i iVar) {
        Object objD = ((p) this.f178951a).f19307g.d(new bwb.b(str), false, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = Unit.f186387a;
        }
        return objD == aVar ? objD : Unit.f186387a;
    }
}
