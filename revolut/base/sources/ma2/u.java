package ma2;

import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class u extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Alias f203939w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Alias alias, com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f203939w = alias;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u(this.f203939w, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (((uy1.j) r2).j(true, r19) == r3) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.a r1 = r0.v
            vw1.b r2 = r1.o
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r0.u
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L23
            if (r4 == r7) goto L1f
            if (r4 != r6) goto L17
            yhm.o.b(r20)
            goto L4a
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1f:
            yhm.o.b(r20)
            goto L3f
        L23:
            yhm.o.b(r20)
            zz1.i r4 = new zz1.i
            com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias r8 = new com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias
            com.revolut.feature.apm.core.models.alias.Alias r9 = r0.f203939w
            com.revolut.feature.apm.core.models.alias.AliasType r10 = r9.f61878a
            java.lang.String r9 = r9.f61879b
            r8.<init>(r10, r9)
            r4.<init>(r8, r5)
            r0.u = r7
            java.lang.Object r4 = vw1.b.a(r2, r4, r0)
            if (r4 != r3) goto L3f
            goto L49
        L3f:
            r0.u = r6
            uy1.j r2 = (uy1.j) r2
            java.lang.Object r2 = r2.j(r7, r0)
            if (r2 != r3) goto L4a
        L49:
            return r3
        L4a:
            nii.y0 r2 = new nii.y0
            nii.j0 r6 = new nii.j0
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.apm.payid.api.R$string.alias_creation_success_title
            r4 = 14
            r7.<init>(r3, r5, r5, r4)
            r17 = 0
            r18 = 4094(0xffe, float:5.737E-42)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3 = 0
            r4 = 5
            r2.<init>(r5, r6, r3, r4)
            r1.X1(r2)
            ma2.f$a r2 = ma2.f.a.f203924a
            r1.C2(r2)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ma2.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
