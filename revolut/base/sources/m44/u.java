package m44;

import com.revolut.feature.credit.application.plugins.impl.ui.address.screen.main.CreditAddressScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends jki.g implements jki.h {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hw3.c f202665p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CreditAddressScreenContract$InputData f202666q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f202667r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(hw3.c creditApplicationAddressInteractor, jki.p stateMapper, CreditAddressScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(creditApplicationAddressInteractor, "creditApplicationAddressInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f202665p = creditApplicationAddressInteractor;
        this.f202666q = inputData;
        this.f202667r = new e(inputData.d, inputData.f66958b, inputData.f66959c, false);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f202667r;
    }
}
