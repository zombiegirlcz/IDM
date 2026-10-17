package mu8;

import cli.y;
import com.revolut.feature.kyc.impl.choosedocument.review.DocumentReviewScreenContract$InputData;
import e60.s;
import kotlin.jvm.internal.Intrinsics;
import mkk.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends oki.h implements h {

    @NotNull
    public static final i Companion = new i();
    public final DocumentReviewScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e60.a f209010p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r80.c f209011q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f80.a f209012r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f209013s;

    public l(n stateMapper, DocumentReviewScreenContract$InputData inputData, e60.a mediaPickerControllerExtension, r80.c imageCompressTransformer, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(imageCompressTransformer, "imageCompressTransformer");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.o = inputData;
        this.f209010p = mediaPickerControllerExtension;
        this.f209011q = imageCompressTransformer;
        this.f209012r = uriHelper;
        this.f209013s = mra.d.b(this, new d(null), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(mu8.l r4, java.io.File r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof mu8.k
            if (r0 == 0) goto L13
            r0 = r6
            mu8.k r0 = (mu8.k) r0
            int r1 = r0.f209009w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f209009w = r1
            goto L18
        L13:
            mu8.k r0 = new mu8.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f209009w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            r0.f209009w = r3
            java.lang.Object r6 = r4.J2(r5, r0)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            java.io.File r6 = (java.io.File) r6
            long r0 = r6.length()
            r2 = 10485760(0xa00000, double:5.180654E-317)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L50
            mu8.e$a r5 = mu8.e.a.f209004a
            r4.C2(r5)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L50:
            cli.y r5 = r4.f209013s
            b22.j r0 = new b22.j
            r1 = 4
            r0.<init>(r6, r1)
            r4.H2(r5, r0)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mu8.l.I2(mu8.l, java.io.File, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new mci.e(this, null, 21), new yi5.b(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(java.io.File r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mu8.j
            if (r0 == 0) goto L13
            r0 = r6
            mu8.j r0 = (mu8.j) r0
            int r1 = r0.f209008w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f209008w = r1
            goto L18
        L13:
            mu8.j r0 = new mu8.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f209008w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r80.c r6 = r4.f209011q
            r2 = 75
            ufm.n r5 = r80.c.a(r6, r5, r2)
            r0.f209008w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mu8.l.J2(java.io.File, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, rd0.e.b(((s) this.f209010p).f122868g), null, new q(this, null, 20), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f209013s;
    }
}
