package j54;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c f171514w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PluginPayload f171515x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c cVar, PluginPayload pluginPayload, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f171514w = cVar;
        this.f171515x = pluginPayload;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f171514w, this.f171515x, continuation, 0);
            default:
                return new h(this.f171514w, this.f171515x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.u
            switch(r0) {
                case 0: goto L8e;
                default: goto L5;
            }
        L5:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r11.v
            com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c r2 = r11.f171514w
            r8 = 3
            r9 = 2
            com.revolut.feature.credit.application.models.plugins.PluginPayload r10 = r11.f171515x
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 == r3) goto L2b
            if (r1 == r9) goto L26
            if (r1 != r8) goto L1e
            yhm.o.b(r12)
            r6 = r11
            goto L8b
        L1e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L26:
            yhm.o.b(r12)
            r6 = r11
            goto L66
        L2b:
            yhm.o.b(r12)
            r6 = r11
            goto L4c
        L30:
            yhm.o.b(r12)
            iuf.y r4 = new iuf.y
            r12 = 1
            r4.<init>(r10, r12)
            j54.h r5 = new j54.h
            r12 = 0
            r1 = 0
            r5.<init>(r2, r10, r1, r12)
            r11.v = r3
            r3 = 0
            r7 = 3
            r6 = r11
            java.lang.Object r12 = n14.k.R(r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L4c
            goto L8d
        L4c:
            nii.e r12 = (nii.e) r12
            boolean r12 = r12 instanceof nii.d
            if (r12 == 0) goto L8b
            dq3.a r12 = r2.f67108p
            java.lang.String r1 = ""
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r1 = io3.h.R(r10, r1)
            r6.v = r9
            ow3.c r12 = (ow3.c) r12
            r3 = 0
            java.lang.Object r12 = r12.a(r1, r3, r11)
            if (r12 != r0) goto L66
            goto L8d
        L66:
            com.revolut.retail.core.navigation.NaviCommand r12 = (com.revolut.retail.core.navigation.NaviCommand) r12
            j54.v r1 = r2.f67109q
            it3.d r2 = r10.f66247a
            java.lang.String r2 = r2.f168323a
            r6.v = r8
            j54.y r1 = (j54.y) r1
            mri.w r3 = r1.f171584l
            mri.w.r0(r3, r2)
            pw5.a.w(r3)
            aii.o r1 = r1.r2()
            j54.t$a r3 = new j54.t$a
            r3.<init>(r12, r2)
            r1.M0(r3)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            if (r12 != r0) goto L8b
            goto L8d
        L8b:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L8d:
            return r0
        L8e:
            r6 = r11
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.v
            r2 = 1
            if (r1 == 0) goto La4
            if (r1 != r2) goto L9c
            yhm.o.b(r12)
            goto Lba
        L9c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        La4:
            yhm.o.b(r12)
            com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c r12 = r6.f171514w
            ow3.e r12 = r12.f67105l
            com.revolut.feature.credit.application.models.plugins.PluginPayload r1 = r6.f171515x
            it3.d r1 = r1.f66247a
            java.lang.String r1 = r1.f168323a
            r6.v = r2
            java.lang.Object r12 = r12.b(r1, r11)
            if (r12 != r0) goto Lba
            goto Lbc
        Lba:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        Lbc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j54.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
