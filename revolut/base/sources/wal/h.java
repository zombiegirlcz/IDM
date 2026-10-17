package wal;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.agreement.RiskAgreementScreenContract$InputData;
import jki.p;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import vb2.r;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends jki.g implements d {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Lazy f295980q = yhm.j.b(new f(0));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f295981p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p stateMapper, RiskAgreementScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f295981p = new c(false, false, inputData.f105008a);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f295981p;
    }

    public final void y2(InputTextDelegate.TextData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String string = d0.F0(data.f52598b.toString()).toString();
        Companion.getClass();
        x2(new r(((Regex) f295980q.getValue()).replace(string, " "), 29));
    }
}
