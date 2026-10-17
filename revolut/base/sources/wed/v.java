package wed;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends gim.h implements Function2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ List B;
    public Iterator u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f296757w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f296758x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f296759y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(List list, Continuation continuation) {
        super(2, continuation);
        this.B = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v vVar = new v(this.B, continuation);
        vVar.A = obj2;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((nkm.o) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0046 -> B:14:0x0051). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.A
            nkm.o r0 = (nkm.o) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r9.z
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L24
            if (r2 != r3) goto L1c
            int r2 = r9.f296759y
            int r5 = r9.f296758x
            int r6 = r9.f296757w
            java.util.Iterator r7 = r9.v
            java.util.Iterator r8 = r9.u
            yhm.o.b(r10)
            goto L51
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L24:
            yhm.o.b(r10)
            java.util.List r10 = r9.B
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r2 = r4
        L30:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L75
            java.lang.Object r5 = r10.next()
            mgd.c r5 = (mgd.c) r5
            com.revolut.data.model.Data r5 = r5.f205261b
            java.lang.Object r5 = r5.getContent()
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L30
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r8 = r10
            r6 = r2
            r2 = r4
            r7 = r5
            r5 = r2
        L51:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L72
            java.lang.Object r10 = r7.next()
            com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem r10 = (com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem) r10
            r9.A = r0
            r9.u = r8
            r9.v = r7
            r9.f296757w = r6
            r9.f296758x = r5
            r9.f296759y = r2
            r9.z = r3
            fim.a r10 = r0.b(r10, r9)
            if (r10 != r1) goto L51
            return r1
        L72:
            r2 = r6
            r10 = r8
            goto L30
        L75:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: wed.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
