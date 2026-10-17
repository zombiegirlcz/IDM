package zq7;

import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.documents_hint.DocumentsHintScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f324415p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p stateMapper, DocumentsHintScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f324415p = new c(inputData.f75682a);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f324415p;
    }
}
