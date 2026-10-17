package ttl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class x extends oki.h implements dli.b {
    public final o o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f274477p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f274478q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ybl.b f274479r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v60.g f274480s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vtl.a f274481t;
    public final Object u;

    public x(o inputData, a0 stateMapper, q saveStateDelegate, s dialogMapper, j60.a bottomExpandableDialogControllerExtension, ybl.b instrumentTickerInteractor, v60.g expiryDateTypesBuilder, vtl.a outputBuilder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(expiryDateTypesBuilder, "expiryDateTypesBuilder");
        Intrinsics.checkNotNullParameter(outputBuilder, "outputBuilder");
        this.o = inputData;
        this.f274477p = dialogMapper;
        this.f274478q = bottomExpandableDialogControllerExtension;
        this.f274479r = instrumentTickerInteractor;
        this.f274480s = expiryDateTypesBuilder;
        this.f274481t = outputBuilder;
        this.u = te0.w.y0(new qg7.k(this, 10, stateMapper, saveStateDelegate));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(ttl.x r24, java.time.LocalDate r25, gim.c r26) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttl.x.I2(ttl.x, java.time.LocalDate, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, c6d.b.i(((ael.k) this.f274479r).o(this.o.f274460a, w4l.i.f294643c), new tpl.o(this, 14)), null, null, new tna.p(this, null, 11), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.z
    public final cli.g getState() {
        return (cli.g) this.u.getValue();
    }
}
