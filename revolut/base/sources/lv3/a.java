package lv3;

import dx4.a3;
import dx4.q4;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q4 f200279c;
    public final ArrayList d;
    public final List e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a3 f200280g;

    public a(String title, String subtitle, q4 q4Var, ArrayList items, List screenDetailsItems, String buttonTitle, a3 a3Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(screenDetailsItems, "screenDetailsItems");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f200277a = title;
        this.f200278b = subtitle;
        this.f200279c = q4Var;
        this.d = items;
        this.e = screenDetailsItems;
        this.f = buttonTitle;
        this.f200280g = a3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f200277a, aVar.f200277a) && Intrinsics.f(this.f200278b, aVar.f200278b) && Intrinsics.f(this.f200279c, aVar.f200279c) && this.d.equals(aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f200280g, aVar.f200280g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f200277a.hashCode() * 31, 31, this.f200278b);
        q4 q4Var = this.f200279c;
        int iC2 = p.a.c(p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iC + (q4Var == null ? 0 : q4Var.hashCode())) * 31, 31), 31, this.e), 31, this.f);
        a3 a3Var = this.f200280g;
        return iC2 + (a3Var != null ? a3Var.hashCode() : 0);
    }
}
