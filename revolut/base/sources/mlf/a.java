package mlf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transactions.impl.ui.kompot.edit_note.EditNoteScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditNoteScreenContract$InputData f206708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f206709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f206710c;
    public final e4m.e d;

    public a(d dVar, EditNoteScreenContract$InputData editNoteScreenContract$InputData) {
        this.f206708a = editNoteScreenContract$InputData;
        int i = 13;
        this.f206709b = e4m.b.b(new mjl.b(dVar, this, 1, i));
        this.f206710c = e4m.b.b(new mjl.b(dVar, this, 2, i));
        this.d = e4m.b.b(new mjl.b(dVar, this, 0, i));
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
