package l4e;

import aii.e;
import com.revolut.feature.structured_note.details.api.ui.note_details.NoteDetailsContract$NoteDetailsScreenConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NoteDetailsContract$NoteDetailsScreenConfig f192105a;

    public a(NoteDetailsContract$NoteDetailsScreenConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f192105a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f192105a, ((a) obj2).f192105a);
    }

    public final int hashCode() {
        return this.f192105a.hashCode();
    }
}
