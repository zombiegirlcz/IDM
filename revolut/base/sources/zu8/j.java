package zu8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc.impl.document_collection.document_selection.DocumentSelectionControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentSelectionControllerContract$InputData f325297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f325298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f325299c;

    public j(c0 c0Var, h hVar, DocumentSelectionControllerContract$InputData documentSelectionControllerContract$InputData) {
        this.f325297a = documentSelectionControllerContract$InputData;
        int i = 11;
        this.f325298b = e4m.b.b(new zpc.m(c0Var, this, 1, i));
        this.f325299c = e4m.b.b(new zpc.m(c0Var, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
