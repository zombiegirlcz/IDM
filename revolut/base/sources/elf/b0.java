package elf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.api.models.StatementUrlState;
import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.feature_pdf_view.Source;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f127298l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zxd.c f127299m;

    public b0(klf.h0 commonDataSource, zxd.c statementsInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        this.f127298l = commonDataSource;
        this.f127299m = statementsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof elf.z
            if (r0 == 0) goto L13
            r0 = r6
            elf.z r0 = (elf.z) r0
            int r1 = r0.f127441w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127441w = r1
            goto L18
        L13:
            elf.z r0 = new elf.z
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127441w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L5d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            klf.h0 r6 = r5.f127298l
            tof.a3 r6 = r6.b()
            if (r6 == 0) goto L65
            java.lang.String r6 = r6.f272581b
            zxd.c r2 = r5.f127299m
            ryd.w r2 = (ryd.w) r2
            efm.r r6 = r2.j(r6)
            vkm.d r6 = rd0.e.b(r6)
            ej9.t r2 = new ej9.t
            r4 = 21
            r2.<init>(r4)
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r2, r3)
            r0.f127441w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L5d
            return r1
        L5d:
            com.revolut.feature.statements.api.models.StatementUrlState r6 = (com.revolut.feature.statements.api.models.StatementUrlState) r6
            r5.b3(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L65:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "transaction is null"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.b0.Z2(gim.c):java.lang.Object");
    }

    public final void b3(StatementUrlState statementUrlState) {
        if (statementUrlState instanceof StatementUrlState.InPreparation) {
            L2(new nii.y0(null, new nii.g0(new TextLocalisedClause(R$string.account_statement_in_preparation_title, null, null, 14), new TextLocalisedClause(R$string.account_statement_in_preparation_subtitle, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380), false, 5));
        } else {
            if (!(statementUrlState instanceof StatementUrlState.Ready)) {
                throw new NoWhenBranchMatchedException();
            }
            A2(zh9.u0.c(new PdfViewFeatureConfiguration(new Source.Remote(((StatementUrlState.Ready) statementUrlState).getUrl()), null, true, false, null, null, false, 504)));
        }
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        return Intrinsics.f(str, "ID_EXTRAS_STATEMENT") ? c3((gim.c) continuation) : Intrinsics.f(str, "ID_EXTRAS_CONFIRMATION") ? Z2((gim.c) continuation) : Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof elf.a0
            if (r0 == 0) goto L13
            r0 = r6
            elf.a0 r0 = (elf.a0) r0
            int r1 = r0.f127291w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127291w = r1
            goto L18
        L13:
            elf.a0 r0 = new elf.a0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127291w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L5f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            klf.h0 r6 = r5.f127298l
            tof.a3 r6 = r6.b()
            if (r6 == 0) goto L67
            java.lang.String r2 = r6.f272581b
            tof.w5 r6 = r6.f272624y
            java.lang.String r6 = r6.f273143a
            zxd.c r4 = r5.f127299m
            efm.r r6 = zxd.c.a(r4, r2, r6)
            vkm.d r6 = rd0.e.b(r6)
            ej9.t r2 = new ej9.t
            r4 = 20
            r2.<init>(r4)
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r2, r3)
            r0.f127291w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            com.revolut.feature.statements.api.models.StatementUrlState r6 = (com.revolut.feature.statements.api.models.StatementUrlState) r6
            r5.b3(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L67:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "transaction is null"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.b0.c3(gim.c):java.lang.Object");
    }
}
