package hog;

import cli.g;
import cli.y;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.document_type_selector.DocumentTypeSelectorControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends h implements dli.b {
    public final DocumentTypeSelectorControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f154290p;

    public f(DocumentTypeSelectorControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f154290p = mra.d.b(this, new b(inputData.f94647b), new d(this, 0), null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f154290p;
    }
}
