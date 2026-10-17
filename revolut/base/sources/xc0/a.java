package xc0;

import com.revolut.feature.backend_flow.domain.models.FormScreen;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import qc0.f;
import qc0.h;
import qc0.j;
import vm.e;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f304089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f304090b;

    public a(j router, h presentationModel) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        this.f304089a = router;
        this.f304090b = presentationModel;
    }

    @Override // vm.d
    public final d0 d(um.a errorData) {
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        if (errorData.f281172a instanceof f) {
            FormScreen formScreenE0 = this.f304090b.e0();
            return (formScreenE0 == null || !uc0.b.r(formScreenE0)) ? d0.m(Boolean.FALSE) : this.f304089a.goBack().D(Boolean.FALSE);
        }
        ufm.b bVarM = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
