package yal;

import com.revolut.shared.feature.suspicious_transaction.impl.ui.confirmation.SimpleConfirmationScreenContract$InputData;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends jki.g implements c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f80.a f312074p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f312075q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p stateMapper, SimpleConfirmationScreenContract$InputData inputData, f80.a uriHelper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f312074p = uriHelper;
        this.f312075q = new b(inputData.f105011a);
    }

    @Override // jki.g
    public final i r2() {
        return this.f312075q;
    }
}
