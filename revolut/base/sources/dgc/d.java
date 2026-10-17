package dgc;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f114621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114622b;

    public d(String note, ArrayList texts) {
        Intrinsics.checkNotNullParameter(texts, "texts");
        Intrinsics.checkNotNullParameter(note, "note");
        this.f114621a = texts;
        this.f114622b = note;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f114621a.equals(dVar.f114621a) && Intrinsics.f(this.f114622b, dVar.f114622b);
    }

    public final int hashCode() {
        return this.f114622b.hashCode() + (this.f114621a.hashCode() * 31);
    }
}
