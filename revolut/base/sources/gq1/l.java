package gq1;

import cli.y;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.FormsListScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends oki.h implements i {
    public final zjh.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jq1.a f145515p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f145516q;

    public l(zjh.j interactor, jq1.a formExtension, n stateMapper, FormsListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(formExtension, "formExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = interactor;
        this.f145515p = formExtension;
        this.f145516q = mra.d.b(this, new h(inputData.f61472a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f145516q;
    }
}
