package sa2;

import a82.s;
import cli.y;
import com.revolut.feature.apm.core.models.alias.Alias;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r10.w;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class r extends oki.h implements g {

    @NotNull
    public static final o Companion = new o();
    public final oz1.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vw1.b f261284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w f261285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f261286r;

    public r(e inputData, oz1.a aliasVerificationStateInteractor, vw1.b aliasRepository, w payIdSettingInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(aliasVerificationStateInteractor, "aliasVerificationStateInteractor");
        Intrinsics.checkNotNullParameter(aliasRepository, "aliasRepository");
        Intrinsics.checkNotNullParameter(payIdSettingInteractor, "payIdSettingInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = aliasVerificationStateInteractor;
        this.f261284p = aliasRepository;
        this.f261285q = payIdSettingInteractor;
        Alias alias = inputData.f261271a;
        String str = inputData.f261272b;
        this.f261286r = mra.d.b(this, new d(alias, 0L, str == null ? "" : str, null), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(sa2.r r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof sa2.q
            if (r0 == 0) goto L13
            r0 = r10
            sa2.q r0 = (sa2.q) r0
            int r1 = r0.f261283w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261283w = r1
            goto L18
        L13:
            sa2.q r0 = new sa2.q
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261283w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)
            goto L3f
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            yhm.o.b(r10)
            vw1.b r10 = r9.f261284p
            r0.f261283w = r3
            uy1.j r10 = (uy1.j) r10
            java.lang.Object r10 = r10.j(r3, r0)
            if (r10 != r1) goto L3f
            return r1
        L3f:
            mii.k r2 = new mii.k
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r10 = com.revolut.feature.apm.payid.api.R$string.alias_creation_success_title
            r0 = 14
            r1 = 0
            r4.<init>(r10, r1, r1, r0)
            r7 = 0
            r8 = 28
            java.lang.String r3 = "SHOT_DIALOG_ID"
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9.X1(r2)
            sa2.f$a r10 = sa2.f.a.f261273a
            r9.C2(r10)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: sa2.r.I2(sa2.r, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        od0.a aVar = od0.a.f224253a;
        Continuation continuation = null;
        if (od0.a.e()) {
            n2(new p(this, continuation, 0), new whi.b(6));
        }
        yji.l.a1(this, ta6.a.H(60L, 1L, TimeUnit.SECONDS), null, null, new s(this, continuation, 11), 3);
        Alias alias = ((d) ((j2) this.f261286r.f22677a).getValue()).f261268a;
        oz1.a aVar2 = this.o;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(alias, "alias");
        aVar2.f231100a.set(alias);
        K2();
    }

    public final void J2(k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof h;
        y yVar = this.f261286r;
        if (z) {
            String str = ((h) event).f261274a;
            if (!Intrinsics.f(str, ((d) ((j2) yVar.f22677a).getValue()).f261270c)) {
                H2(yVar, new rvc.k(str, 16));
                K2();
            }
        } else {
            if (!(event instanceof i)) {
                if (!(event instanceof j)) {
                    throw new NoWhenBranchMatchedException();
                }
                B2();
                return;
            }
            String str2 = ((i) event).f261275a;
            if (Intrinsics.f(str2, "APPLY_CODE_DEBUG_ID")) {
                String str3 = ((d) ((j2) yVar.f22677a).getValue()).d;
                if (str3 != null && !Intrinsics.f(str3, ((d) ((j2) yVar.f22677a).getValue()).f261270c)) {
                    H2(yVar, new rvc.k(str3, 16));
                    K2();
                }
            } else if (Intrinsics.f(str2, "LIST_ID_RESEND")) {
                Continuation continuation = null;
                yji.l.a1(this, ta6.a.H(60L, 1L, TimeUnit.SECONDS), null, null, new s(this, continuation, 11), 3);
                n2(new p(this, continuation, 1), new whi.b(6));
            }
        }
    }

    @Override // yji.l
    public final void K1() {
        this.o.f231100a.set(null);
    }

    public final void K2() {
        String str = ((d) ((j2) this.f261286r.f22677a).getValue()).f261270c;
        if (str.length() == 6) {
            l2(new s09.c(this, str, null, 23), new s78.d(this, 11));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f261286r;
    }
}
