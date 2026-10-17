package gzc;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148016c;
    public final boolean d;
    public final l e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f148017g;

    public n(String title, String type, String description, boolean z, l frequencies, ArrayList documentGroups, ArrayList questions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(frequencies, "frequencies");
        Intrinsics.checkNotNullParameter(documentGroups, "documentGroups");
        Intrinsics.checkNotNullParameter(questions, "questions");
        this.f148014a = title;
        this.f148015b = type;
        this.f148016c = description;
        this.d = z;
        this.e = frequencies;
        this.f = documentGroups;
        this.f148017g = questions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f148014a, nVar.f148014a) && Intrinsics.f(this.f148015b, nVar.f148015b) && Intrinsics.f(this.f148016c, nVar.f148016c) && this.d == nVar.d && this.e.equals(nVar.e) && this.f.equals(nVar.f) && this.f148017g.equals(nVar.f148017g);
    }

    public final int hashCode() {
        return this.f148017g.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, (this.e.hashCode() + j6.a.c(p.a.c(p.a.c(this.f148014a.hashCode() * 31, 31, this.f148015b), 31, this.f148016c), 31, this.d)) * 31, 31);
    }
}
