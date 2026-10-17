package u83;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, Continuation continuation) {
        super(1, continuation);
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (nim.a.a(r9, r8) == r2) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            u83.g r0 = r8.v
            l93.f r1 = r0.o
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L20
            if (r3 == r5) goto L1c
            if (r3 != r4) goto L14
            yhm.o.b(r9)
            goto L68
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            yhm.o.b(r9)
            goto L41
        L20:
            yhm.o.b(r9)
            cli.y r9 = r0.f278102q
            java.lang.Object r9 = r9.f22677a
            vkm.j2 r9 = (vkm.j2) r9
            java.lang.Object r9 = r9.getValue()
            u83.i r9 = (u83.i) r9
            java.lang.String r9 = r9.f278103a
            r3 = r1
            ha3.x r3 = (ha3.x) r3
            ufm.b r9 = r3.n(r9)
            r8.u = r5
            java.lang.Object r9 = nim.a.b(r9, r8)
            if (r9 != r2) goto L41
            goto L67
        L41:
            h93.f0 r9 = (h93.f0) r9
            java.util.List r9 = zhm.u.c(r9)
            ha3.x r1 = (ha3.x) r1
            r1.getClass()
            java.lang.String r3 = "cards"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r3)
            kotlinx.coroutines.d r3 = skm.p0.f264003c
            h54.o r5 = new h54.o
            r6 = 13
            r7 = 0
            r5.<init>(r1, r9, r7, r6)
            pfm.h r9 = pd.b.n(r3, r5)
            r8.u = r4
            java.lang.Object r9 = nim.a.a(r9, r8)
            if (r9 != r2) goto L68
        L67:
            return r2
        L68:
            u83.j$b r9 = u83.j.b.f278105a
            r0.C2(r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u83.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
