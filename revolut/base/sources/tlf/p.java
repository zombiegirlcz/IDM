package tlf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.i implements oim.p {
    public /* synthetic */ cmf.g u;
    public /* synthetic */ a3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ do3.n f272085w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ na7.a f272086x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Boolean f272087y;
    public final /* synthetic */ q z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, Continuation continuation) {
        super(6, continuation);
        this.z = qVar;
    }

    @Override // oim.p
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        p pVar = new p(this.z, (Continuation) obj7);
        pVar.u = (cmf.g) obj2;
        pVar.v = (a3) obj3;
        pVar.f272085w = (do3.n) obj4;
        pVar.f272086x = (na7.a) obj5;
        pVar.f272087y = (Boolean) obj6;
        return pVar.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa A[PHI: r5
      0x00fa: PHI (r5v3 boolean) = (r5v4 boolean), (r5v5 boolean) binds: [B:38:0x00f8, B:34:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tlf.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
