package mv3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f209111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f209112c;
    public final List d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f209113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f209114h;

    public a(String title, String subtitle, ArrayList items, List bottomItems, String primaryButtonTitle, String str, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(bottomItems, "bottomItems");
        Intrinsics.checkNotNullParameter(primaryButtonTitle, "primaryButtonTitle");
        this.f209110a = title;
        this.f209111b = subtitle;
        this.f209112c = items;
        this.d = bottomItems;
        this.e = primaryButtonTitle;
        this.f = str;
        this.f209113g = str2;
        this.f209114h = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f209110a, aVar.f209110a) && Intrinsics.f(this.f209111b, aVar.f209111b) && this.f209112c.equals(aVar.f209112c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f209113g, aVar.f209113g) && Intrinsics.f(this.f209114h, aVar.f209114h);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f209112c, p.a.c(this.f209110a.hashCode() * 31, 31, this.f209111b), 31), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f209113g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f209114h;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }
}
