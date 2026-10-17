package gzc;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148020c;
    public final s d;
    public final ArrayList e;
    public final a f;

    public o(String type, String title, String description, s reviewState, ArrayList pages, a aVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(reviewState, "reviewState");
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f148018a = type;
        this.f148019b = title;
        this.f148020c = description;
        this.d = reviewState;
        this.e = pages;
        this.f = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f148018a, oVar.f148018a) && Intrinsics.f(this.f148019b, oVar.f148019b) && Intrinsics.f(this.f148020c, oVar.f148020c) && this.d.equals(oVar.d) && this.e.equals(oVar.e) && Intrinsics.f(this.f, oVar.f);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (this.d.hashCode() + p.a.c(p.a.c(this.f148018a.hashCode() * 31, 31, this.f148019b), 31, this.f148020c)) * 31, 31);
        a aVar = this.f;
        return iB + (aVar == null ? 0 : aVar.hashCode());
    }
}
