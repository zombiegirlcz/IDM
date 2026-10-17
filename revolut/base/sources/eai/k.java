package eai;

import cli.y;
import com.revolut.feature_retail_user_declarations.citizenship.citizenship_prompt.NationalityPromptScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends oki.h implements dli.b {
    public final NationalityPromptScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fk3.a f124264p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f124265q;

    public k(m stateMapper, NationalityPromptScreenContract$InputData inputData, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.o = inputData;
        this.f124264p = configurationInteractor;
        this.f124265q = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I2(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof eai.j
            if (r0 == 0) goto L13
            r0 = r5
            eai.j r0 = (eai.j) r0
            int r1 = r0.f124263w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f124263w = r1
            goto L1a
        L13:
            eai.j r0 = new eai.j
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f124263w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            fk3.a r5 = r4.f124264p
            ik3.c r5 = (ik3.c) r5
            efm.d0 r5 = r5.f()
            r0.f124263w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.util.List r5 = (java.util.List) r5
            com.revolut.feature_retail_user_declarations.citizenship.citizenship_prompt.NationalityPromptScreenContract$InputData r0 = r4.o
            wi0.b r0 = r0.f97509a
            boolean r5 = r5.contains(r0)
            r5 = r5 ^ r3
            eai.g r0 = new eai.g
            r0.<init>(r5)
            r4.C2(r0)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: eai.k.I2(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f124265q;
    }
}
