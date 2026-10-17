package gq0;

import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpannableStringBuilder f145497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bib.b f145498b;

    public h(SpannableStringBuilder label, bib.b action) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f145497a = label;
        this.f145498b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f145497a.equals(hVar.f145497a) && this.f145498b.equals(hVar.f145498b);
    }

    public final int hashCode() {
        return this.f145498b.hashCode() + (this.f145497a.hashCode() * 31);
    }
}
