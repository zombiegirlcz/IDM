package wol;

import bjl.p0;
import cli.y;
import com.revolut.sso.impl.ui.qr_challenge.displayer.QrDisplayerControllerContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wgb.v;
import wli.x;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends oki.h implements dli.b {

    @NotNull
    public static final r Companion = new r();
    public final tll.n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fkg.a f298977p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c70.a f298978q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f298979r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final QrDisplayerControllerContract$InputData f298980s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p0 f298981t;
    public final y u;

    public t(tll.n parentStateReceiver, fkg.a qrCodeGenerator, c70.a clipboard, x deeplinkHandler, QrDisplayerControllerContract$InputData inputData, p0 ssoDependenciesProvider, u stateMapper) {
        Intrinsics.checkNotNullParameter(parentStateReceiver, "parentStateReceiver");
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(ssoDependenciesProvider, "ssoDependenciesProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = parentStateReceiver;
        this.f298977p = qrCodeGenerator;
        this.f298978q = clipboard;
        this.f298979r = deeplinkHandler;
        this.f298980s = inputData;
        this.f298981t = ssoDependenciesProvider;
        this.u = mra.d.b(this, new m(k.f298968a, g.f298964a), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(wol.t r8, com.revolut.sso.impl.domain.models.Challenge r9, gim.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof wol.s
            if (r0 == 0) goto L13
            r0 = r10
            wol.s r0 = (wol.s) r0
            int r1 = r0.f298976y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f298976y = r1
            goto L18
        L13:
            wol.s r0 = new wol.s
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f298974w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f298976y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r9 = r0.v
            com.revolut.sso.impl.domain.models.Challenge r0 = r0.u
            yhm.o.b(r10)
            goto L55
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            yhm.o.b(r10)
            java.lang.String r10 = r9.d
            if (r10 == 0) goto L6b
            elm.g r2 = skm.p0.f264002b
            wka.e r4 = new wka.e
            r5 = 0
            r6 = 13
            r4.<init>(r8, r10, r5, r6)
            r0.u = r9
            r0.v = r10
            r0.f298976y = r3
            java.lang.Object r0 = skm.e0.J(r2, r4, r0)
            if (r0 != r1) goto L51
            return r1
        L51:
            r7 = r0
            r0 = r9
            r9 = r10
            r10 = r7
        L55:
            i80.a r10 = (i80.a) r10
            cli.y r1 = r8.u
            vx9.v r2 = new vx9.v
            r3 = 24
            r2.<init>(r10, r3, r9, r0)
            r8.H2(r1, r2)
            wol.n r9 = wol.n.f298971a
            r8.C2(r9)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L6b:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Cannot build QR-code. Challenge hint is null"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wol.t.I2(wol.t, com.revolut.sso.impl.domain.models.Challenge, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, this.o.f272117a, null, null, new v(this, continuation, 18), 3);
        l2(new w76.a(this, continuation, 26), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
