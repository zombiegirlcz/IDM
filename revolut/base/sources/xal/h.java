package xal;

import com.revolut.shared.feature.suspicious_transaction.impl.ui.cancel.CancelScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends jki.g implements d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fal.b f303911p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f303912q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f303913r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p stateMapper, CancelScreenContract$InputData inputData, fal.b interactor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f303911p = interactor;
        this.f303912q = new c(inputData.f105010b, null);
        this.f303913r = inputData.f105009a;
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f303912q;
    }
}
