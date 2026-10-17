package j96;

import ch.qos.logback.core.CoreConstants;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.direct_deposit.impl.model.DepositAmount;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import vkm.q;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends oki.h implements c {

    @NotNull
    public static final k Companion = new k();
    public final b96.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qd0.b f172304p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f172305q;

    public l(n stateMapper, b96.h pdfInteractor, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pdfInteractor, "pdfInteractor");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.o = pdfInteractor;
        this.f172304p = languageProvider;
        m70.a.c(t0.f186434a);
        this.f172305q = mra.d.b(this, new a(DepositAmount.EntirePaycheck.f71945a, "", null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(t1.d(q.q(this.f172305q.B(new j7b.l(8))), 300L), new iw6.l(continuation, this, 9)), null, null, new j82.q(this, continuation, 5), 3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void I2(InputTextDelegate.TextData textData) {
        Intrinsics.checkNotNullParameter(textData, "textData");
        String str = textData.f52597a;
        CharSequence charSequence = textData.f52598b;
        int iHashCode = str.hashCode();
        y yVar = this.f172305q;
        switch (iHashCode) {
            case -441543518:
                if (str.equals("COMPANY_NAME_INPUT_ID")) {
                    H2(yVar, new ik3.a(charSequence.toString(), 27));
                    return;
                }
                return;
            case -68289615:
                if (str.equals("FIXED_AMOUNT_FIELD_INPUT_ID")) {
                    H2(yVar, new j4h.m(charSequence.toString(), this, 18));
                    return;
                }
                return;
            case 131898492:
                if (!str.equals("ENTIRE_SALARY_FIELD_INPUT_ID")) {
                    return;
                }
                break;
            case 1577816695:
                if (!str.equals("PERCENTAGE_AMOUNT_FIELD_INPUT_ID")) {
                    return;
                }
                break;
            default:
                return;
        }
        Double dK = kotlin.text.y.k(d0.I0(charSequence.toString(), CoreConstants.PERCENT_CHAR));
        H2(yVar, new j(dK != null ? dK.doubleValue() : 0.0d, 0));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f172305q;
    }
}
