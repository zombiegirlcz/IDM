package qmg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f247830w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = lVar;
        this.f247830w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, this.f247830w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r11 == r0) goto L23;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.u
            java.lang.String r3 = r10.f247830w
            r8 = 2
            r2 = 1
            qmg.l r9 = r10.v
            if (r1 == 0) goto L22
            if (r1 == r2) goto L1d
            if (r1 != r8) goto L15
            yhm.o.b(r11)
            r6 = r10
            goto L5e
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            yhm.o.b(r11)
            r6 = r10
            goto L35
        L22:
            yhm.o.b(r11)
            r11 = r2
            wli.x r2 = r9.f247834s
            r10.u = r11
            r4 = 0
            r5 = 0
            r7 = 6
            r6 = r10
            java.lang.Object r11 = lg0.b.x1(r2, r3, r4, r5, r6, r7)
            if (r11 != r0) goto L35
            goto L5d
        L35:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L63
            r6.u = r8
            com.revolut.feature.user.checklist.impl.ui.screen.UserChecklistContract$InputData r11 = r9.f247835t
            com.revolut.feature.user.checklist.api.UserChecklistContentType r11 = r11.f94613b
            com.revolut.feature.user.checklist.api.UserChecklistContentType$AdoptionJourney r1 = com.revolut.feature.user.checklist.api.UserChecklistContentType.AdoptionJourney.f94595a
            boolean r11 = kotlin.jvm.internal.Intrinsics.f(r11, r1)
            if (r11 != 0) goto L4e
            kotlin.Unit r11 = kotlin.Unit.f186387a
            goto L5b
        L4e:
            emg.a r11 = r9.I2()
            java.lang.Object r11 = r11.a(r3, r10)
            if (r11 != r0) goto L59
            goto L5b
        L59:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L5b:
            if (r11 != r0) goto L5e
        L5d:
            return r0
        L5e:
            qmg.d$a r11 = qmg.d.a.f247827a
            r9.C2(r11)
        L63:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: qmg.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
