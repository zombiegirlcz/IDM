package o4e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.structured_note.details.impl.ui.screens.note_insights.NoteInsightsScreenContract$InputData;
import java.util.Set;
import nng.n;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NoteInsightsScreenContract$InputData f222241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f222242b;

    public f(l lVar, NoteInsightsScreenContract$InputData noteInsightsScreenContract$InputData) {
        this.f222241a = noteInsightsScreenContract$InputData;
        this.f222242b = e4m.b.b(new n(lVar, this, 16));
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
