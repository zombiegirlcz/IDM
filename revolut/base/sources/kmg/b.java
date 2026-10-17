package kmg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.user.checklist.impl.ui.flow.ChecklistFlowContract$ChecklistFlowInputData;
import java.util.Set;
import jm4.c3;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChecklistFlowContract$ChecklistFlowInputData f185865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f185866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f185867c = this;
    public final e4m.e d;

    public b(d dVar, ChecklistFlowContract$ChecklistFlowInputData checklistFlowContract$ChecklistFlowInputData) {
        this.f185866b = dVar;
        this.f185865a = checklistFlowContract$ChecklistFlowInputData;
        this.d = e4m.b.b(new c3(dVar, this, 16));
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
