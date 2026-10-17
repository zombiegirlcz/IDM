package zb7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f320838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f320839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f320840c;
    public final String d;
    public final ArrayList e;
    public final String f;

    public g(String id10, f screen, c cVar, String question, ArrayList categories, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f320838a = id10;
        this.f320839b = screen;
        this.f320840c = cVar;
        this.d = question;
        this.e = categories;
        this.f = str;
    }

    public static g a(g gVar, c cVar) {
        String id10 = gVar.f320838a;
        f screen = gVar.f320839b;
        String question = gVar.d;
        ArrayList categories = gVar.e;
        String str = gVar.f;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(categories, "categories");
        return new g(id10, screen, cVar, question, categories, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f320838a, gVar.f320838a) && this.f320839b == gVar.f320839b && this.f320840c == gVar.f320840c && Intrinsics.f(this.d, gVar.d) && this.e.equals(gVar.e) && Intrinsics.f(this.f, gVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f320839b.hashCode() + (this.f320838a.hashCode() * 31)) * 31;
        c cVar = this.f320840c;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, p.a.c((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.d), 31);
        String str = this.f;
        return iB + (str != null ? str.hashCode() : 0);
    }
}
