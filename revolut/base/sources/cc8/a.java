package cc8;

import com.revolut.feature.junior_allowance.impl.ui.flow.allowance.JuniorAllowanceFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import l80.e;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f22965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JuniorAllowanceFlowContract$InputData f22966b;

    public a(e dateProvider, JuniorAllowanceFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f22965a = dateProvider;
        this.f22966b = inputData;
    }
}
