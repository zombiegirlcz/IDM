package z19;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f318772c;
    public final d d;
    public final i e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f318773g;

    public f(String header, String title, String str, d dVar, i iVar, ArrayList questions, String revealText) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(revealText, "revealText");
        this.f318770a = header;
        this.f318771b = title;
        this.f318772c = str;
        this.d = dVar;
        this.e = iVar;
        this.f = questions;
        this.f318773g = revealText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f318770a, fVar.f318770a) && Intrinsics.f(this.f318771b, fVar.f318771b) && Intrinsics.f(this.f318772c, fVar.f318772c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && this.f.equals(fVar.f) && Intrinsics.f(this.f318773g, fVar.f318773g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f318770a.hashCode() * 31, 31, this.f318771b);
        String str = this.f318772c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        d dVar = this.d;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        i iVar = this.e;
        return this.f318773g.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, (iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31, 31);
    }
}
