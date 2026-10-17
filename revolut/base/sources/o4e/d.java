package o4e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.structured_note.details.impl.ui.note_details.NoteDetailsFlowControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements c5e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NoteDetailsFlowControllerContract$InputData f222213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f222214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f222215c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f222216g;

    public d(l lVar, NoteDetailsFlowControllerContract$InputData noteDetailsFlowControllerContract$InputData) {
        this.f222214b = lVar;
        this.f222213a = noteDetailsFlowControllerContract$InputData;
        this.d = e4m.b.b(new o41.b(lVar, this, 1, 2));
        this.e = e4m.b.b(new o41.b(lVar, this, 0, 2));
        this.f = e4m.b.b(new o41.b(lVar, this, 2, 2));
        this.f222216g = e4m.b.b(new o41.b(lVar, this, 3, 2));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.f.get());
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
