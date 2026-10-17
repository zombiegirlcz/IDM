package jpe;

import com.revolut.feature.tax_residency.impl.v2.models.TaxResidencyFlowContext;
import gim.i;
import joe.o;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final joe.b f177266a;

    public d(joe.b taxResidencyRepository) {
        Intrinsics.checkNotNullParameter(taxResidencyRepository, "taxResidencyRepository");
        this.f177266a = taxResidencyRepository;
    }

    public final Object a(TaxResidencyFlowContext taxResidencyFlowContext, i iVar) {
        Object objD = ((o) this.f177266a).i.d(taxResidencyFlowContext, false, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = Unit.f186387a;
        }
        return objD == aVar ? objD : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r5, java.lang.String r6, wi0.b r7) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof jpe.c
            if (r0 == 0) goto L13
            r0 = r5
            jpe.c r0 = (jpe.c) r0
            int r1 = r0.f177265w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f177265w = r1
            goto L18
        L13:
            jpe.c r0 = new jpe.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f177265w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L57
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r5)
            zme.m r5 = new zme.m
            java.lang.String r2 = "genericTin"
            r5.<init>(r2, r6, r7)
            joe.b r6 = r4.f177266a
            joe.o r6 = (joe.o) r6
            efm.d0 r5 = r6.b(r5)
            jn2.a r6 = new jn2.a
            r7 = 26
            r6.<init>(r7)
            zhm.h0 r7 = zhm.h0.f322473a
            pfm.z r5 = ue0.e.I(r5, r7, r6)
            r0.f177265w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L57
            return r1
        L57:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jpe.d.b(gim.c, java.lang.String, wi0.b):java.lang.Object");
    }
}
