package xy3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import xy3.a;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f309572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f309573c;
    public final ArrayList d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f309574g;

    public g(String id10, String title, String str, ArrayList loans, String str2, boolean z, String buttonText) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(loans, "loans");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f309571a = id10;
        this.f309572b = title;
        this.f309573c = str;
        this.d = loans;
        this.e = str2;
        this.f = z;
        this.f309574g = buttonText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f309571a, gVar.f309571a) && Intrinsics.f(this.f309572b, gVar.f309572b) && Intrinsics.f(this.f309573c, gVar.f309573c) && this.d.equals(gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f && Intrinsics.f(this.f309574g, gVar.f309574g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f309571a.hashCode() * 31, 31, this.f309572b);
        String str = this.f309573c;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.e;
        return this.f309574g.hashCode() + j6.a.c((iB + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f);
    }
}
