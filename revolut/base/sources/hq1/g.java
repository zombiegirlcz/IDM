package hq1;

import cli.y;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.all_forms.AllFormsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import zjh.j;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends oki.h implements dli.b {
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jq1.a f154587p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f154588q;

    public g(j interactor, jq1.a formExtension, h stateMapper, AllFormsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(formExtension, "formExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = interactor;
        this.f154587p = formExtension;
        this.f154588q = mra.d.b(this, new d(inputData.f61473a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f154588q;
    }
}
