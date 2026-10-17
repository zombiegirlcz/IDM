package jk5;

import cli.y;
import com.revolut.feature.crypto.remittance.impl.ui.commonfields.CommonRemittanceFieldDialogContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends oki.h implements c {
    public final CommonRemittanceFieldDialogContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f175096p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f175097q;

    public i(m stateMapper, CommonRemittanceFieldDialogContract$InputData inputData, l modelHelper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        this.o = inputData;
        this.f175096p = modelHelper;
        this.f175097q = mra.d.b(this, inputData.f70955a, stateMapper, null, false, 12);
    }

    public final pfm.h I2(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        pfm.h hVar = new pfm.h(new hc7.a(this, url2, 9), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f175097q;
    }
}
