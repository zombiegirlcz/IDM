package i5e;

import cli.j;
import com.revolut.data.model.Data;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_note_glossary.AboutNoteGlossaryScreenContract$Category;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AboutNoteGlossaryScreenContract$Category f158813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f158814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f158815c;

    public c(AboutNoteGlossaryScreenContract$Category category, Data data, Data data2) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.f158813a = category;
        this.f158814b = data;
        this.f158815c = data2;
    }

    public static c a(c cVar, Data data, Data data2, int i) {
        AboutNoteGlossaryScreenContract$Category category = cVar.f158813a;
        if ((i & 2) != 0) {
            data = cVar.f158814b;
        }
        if ((i & 4) != 0) {
            data2 = cVar.f158815c;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(category, "category");
        return new c(category, data, data2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f158813a == cVar.f158813a && Intrinsics.f(this.f158814b, cVar.f158814b) && Intrinsics.f(this.f158815c, cVar.f158815c);
    }

    public final int hashCode() {
        int iHashCode = this.f158813a.hashCode() * 31;
        Data data = this.f158814b;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f158815c;
        return iHashCode2 + (data2 != null ? data2.hashCode() : 0);
    }
}
