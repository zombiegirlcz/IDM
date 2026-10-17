package c6b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements q5b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f21757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final if0.a f21758b;

    public e(fk3.a configurationInteractor, if0.a dataManager) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        this.f21757a = configurationInteractor;
        this.f21758b = dataManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (skm.e0.J(r2, r6, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.data.model.Data r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof c6b.d
            if (r0 == 0) goto L13
            r0 = r7
            c6b.d r0 = (c6b.d) r0
            int r1 = r0.f21756x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21756x = r1
            goto L18
        L13:
            c6b.d r0 = new c6b.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f21756x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L75
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.revolut.data.model.Data r6 = r0.u
            yhm.o.b(r7)
            goto L5a
        L38:
            yhm.o.b(r7)
            java.lang.Throwable r7 = r6.getError()
            boolean r2 = r7 instanceof retrofit2.HttpException
            if (r2 == 0) goto L78
            retrofit2.HttpException r7 = (retrofit2.HttpException) r7
            int r7 = r7.code()
            r2 = 404(0x194, float:5.66E-43)
            if (r7 != r2) goto L78
            r0.u = r6
            r0.f21756x = r4
            fk3.a r7 = r5.f21757a
            java.lang.Object r7 = fk3.a.a(r7, r0)
            if (r7 != r1) goto L5a
            goto L74
        L5a:
            java.lang.Object r6 = r6.getContent()
            if (r6 == 0) goto L78
            c65.i r6 = new c65.i
            r7 = 0
            r6.<init>(r5, r7, r3)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            r0.u = r7
            r0.f21756x = r3
            java.lang.Object r6 = skm.e0.J(r2, r6, r0)
            if (r6 != r1) goto L75
        L74:
            return r1
        L75:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L78:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c6b.e.a(com.revolut.data.model.Data, gim.c):java.lang.Object");
    }
}
