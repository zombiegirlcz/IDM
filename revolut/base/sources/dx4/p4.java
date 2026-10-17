package dx4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q4 f120718c;
    public final String d;
    public final ArrayList e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f120719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f120720h;

    public p4(String id10, String str, q4 q4Var, String title, ArrayList items, List itemsDetails, String buttonTitle, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemsDetails, "itemsDetails");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f120716a = id10;
        this.f120717b = str;
        this.f120718c = q4Var;
        this.d = title;
        this.e = items;
        this.f = itemsDetails;
        this.f120719g = buttonTitle;
        this.f120720h = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p4)) {
            return false;
        }
        p4 p4Var = (p4) obj2;
        return Intrinsics.f(this.f120716a, p4Var.f120716a) && Intrinsics.f(this.f120717b, p4Var.f120717b) && Intrinsics.f(this.f120718c, p4Var.f120718c) && Intrinsics.f(this.d, p4Var.d) && this.e.equals(p4Var.e) && Intrinsics.f(this.f, p4Var.f) && Intrinsics.f(this.f120719g, p4Var.f120719g) && this.f120720h == p4Var.f120720h;
    }

    public final int hashCode() {
        int iHashCode = this.f120716a.hashCode() * 31;
        String str = this.f120717b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        q4 q4Var = this.f120718c;
        return Boolean.hashCode(this.f120720h) + p.a.c(p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, p.a.c((iHashCode2 + (q4Var != null ? q4Var.hashCode() : 0)) * 31, 31, this.d), 31), 31, this.f), 31, this.f120719g);
    }
}
