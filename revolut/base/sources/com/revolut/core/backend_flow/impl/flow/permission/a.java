package com.revolut.core.backend_flow.impl.flow.permission;

import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends i implements Function1 {
    public LocationDomain u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f51239w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f51239w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f51239w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            com.revolut.core.backend_flow.impl.flow.permission.b r0 = r9.f51239w
            w39.b r1 = r0.o
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r9.v
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L22
            if (r3 == r5) goto L1e
            if (r3 != r4) goto L16
            com.revolut.feature.location.api.domain.models.location.LocationDomain r1 = r9.u
            yhm.o.b(r10)
            goto L5a
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            yhm.o.b(r10)
            goto L37
        L22:
            yhm.o.b(r10)
            r10 = r1
            z39.b r10 = (z39.b) r10
            c49.d r10 = r10.f319221b
            ufm.n r10 = r10.e()
            r9.v = r5
            java.lang.Object r10 = nim.a.b(r10, r9)
            if (r10 != r2) goto L37
            goto L56
        L37:
            com.revolut.feature.location.api.domain.models.location.LocationDomain r10 = (com.revolut.feature.location.api.domain.models.location.LocationDomain) r10
            kotlin.jvm.internal.Intrinsics.h(r10)
            z39.b r1 = (z39.b) r1
            r1.getClass()
            java.lang.String r3 = "location"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r3)
            c49.d r1 = r1.f319221b
            rfm.w r1 = r1.a(r10)
            r9.u = r10
            r9.v = r4
            java.lang.Object r1 = nim.a.i(r1, r9)
            if (r1 != r2) goto L57
        L56:
            return r2
        L57:
            r8 = r1
            r1 = r10
            r10 = r8
        L5a:
            x39.a r10 = (x39.a) r10
            com.revolut.core.backend_flow.impl.flow.permission.FormPermissionFlowContract$OutputData$Success r2 = new com.revolut.core.backend_flow.impl.flow.permission.FormPermissionFlowContract$OutputData$Success
            double r3 = r1.f78066a
            r5 = r3
            java.lang.Double r4 = new java.lang.Double
            r4.<init>(r5)
            double r5 = r1.f78067b
            r6 = r5
            java.lang.Double r5 = new java.lang.Double
            r5.<init>(r6)
            r1 = 0
            if (r10 == 0) goto L74
            java.lang.String r3 = r10.f302714c
            goto L75
        L74:
            r3 = r1
        L75:
            if (r10 == 0) goto L7a
            java.lang.String r6 = r10.f302713b
            goto L7b
        L7a:
            r6 = r1
        L7b:
            if (r10 == 0) goto L7f
            java.lang.String r1 = r10.f302712a
        L7f:
            r7 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            r0.C2(r2)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.backend_flow.impl.flow.permission.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
