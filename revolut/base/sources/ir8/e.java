package ir8;

import com.revolut.feature.junior_transfer.impl.ui.screen.JuniorTransferAmountScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorTransferAmountScreenContract$InputData f168015a;

    public e(JuniorTransferAmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f168015a = inputData;
    }

    @Override // yqi.f
    public final yqi.d validate(Object obj2) {
        j validationData = (j) obj2;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (validationData.f168018a < this.f168015a.f77457c) {
            return new yqi.d(validationData, f.f168016a);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }
}
