package kc9;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.feature.onboarding.impl.qes.waiting_auth.WaitingAuthScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.concurrent.CopyOnWriteArrayList;
import k7c.l0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends oki.h implements b {

    @NotNull
    public static final i Companion = new i();
    public final o99.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final WaitingAuthScreenContract$InputData f182681p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d4m.a f182682q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f182683r;

    public m(o99.a eSignatureInteractor, WaitingAuthScreenContract$InputData inputData, d4m.a pushOtpHandlerProvider, n stateMapper) {
        Intrinsics.checkNotNullParameter(eSignatureInteractor, "eSignatureInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pushOtpHandlerProvider, "pushOtpHandlerProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = eSignatureInteractor;
        this.f182681p = inputData;
        this.f182682q = pushOtpHandlerProvider;
        d.Companion.getClass();
        this.f182683r = mra.d.b(this, d.f182670b, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new l0(this, null, 10), new k65.d(1, this, m.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 11));
    }

    public final void I2(Throwable th10) {
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
        yji.l.a1(this, X1(new y0("DIALOG_ID", new z(new TextLocalisedClause(R$string.qes_error_dialog_title, null, null, 14), null, new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32502), false, 4)), new jl6.b(2, this, m.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 4, 12), null, new k0g.b(this, th10, (Continuation) null, 20), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        if (K2(r0, r2) != r3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e3, code lost:
    
        if (K2(r9, r2) == r3) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(gim.c r20) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kc9.m.J2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00be -> B:17:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(com.revolut.feature.onboarding.api.esignature.models.ESignatureProcess r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kc9.m.K2(com.revolut.feature.onboarding.api.esignature.models.ESignatureProcess, gim.c):java.lang.Object");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f182683r;
    }
}
