package vg3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.ChecklistCollectionScreenContract$InputData;
import java.util.Set;
import us6.r2;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChecklistCollectionScreenContract$InputData f288740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f288741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f288742c;
    public final e4m.e d;

    public h(g gVar, ChecklistCollectionScreenContract$InputData checklistCollectionScreenContract$InputData) {
        this.f288741b = gVar;
        this.f288740a = checklistCollectionScreenContract$InputData;
        int i = 16;
        this.f288742c = e4m.b.b(new r2(gVar, this, 1, i));
        this.d = e4m.b.b(new r2(gVar, this, 0, i));
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
