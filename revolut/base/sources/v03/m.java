package v03;

import cli.y;
import com.revolut.feature.card_management.impl.ui.limit.transaction_limit.TransactionLimitControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.g1;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends oki.h implements d {

    @NotNull
    public static final i Companion = new i();
    public final w80.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g1 f284728p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l93.f f284729q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f284730r;

    public m(cli.n stateMapper, TransactionLimitControllerContract$InputData inputData, w80.b amountFormatter, g1 shotDialogDisplayer, l93.f cardsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        this.o = amountFormatter;
        this.f284728p = shotDialogDisplayer;
        this.f284729q = cardsInteractor;
        wy2.c cVar = inputData.f64917a;
        String str = inputData.f64918b;
        i93.e eVar = inputData.f64919c;
        i93.l lVar = inputData.d;
        this.f284730r = mra.d.b(this, new e(cVar, str, lVar.f159569b, eVar, lVar), stateMapper, null, false, 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cb, code lost:
    
        if (((rv6.e) r1).collect(r2, r3) == r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(v03.m r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v03.m.I2(v03.m, gim.c):java.lang.Object");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f284730r;
    }
}
