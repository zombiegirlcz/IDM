package s69;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f260159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f260160c;
    public final f d;
    public final h e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f260161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f260162h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f260163j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f260164l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f260165m;

    public d(String id10, g type, DateTime createdDate, f state, h hVar, String title, String subtitle, String str, String iconUrl, String str2, String str3, ArrayList buttons, Integer num) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f260158a = id10;
        this.f260159b = type;
        this.f260160c = createdDate;
        this.d = state;
        this.e = hVar;
        this.f = title;
        this.f260161g = subtitle;
        this.f260162h = str;
        this.i = iconUrl;
        this.f260163j = str2;
        this.k = str3;
        this.f260164l = buttons;
        this.f260165m = num;
    }

    public static d a(d dVar, f state) {
        String id10 = dVar.f260158a;
        g type = dVar.f260159b;
        DateTime createdDate = dVar.f260160c;
        h hVar = dVar.e;
        String title = dVar.f;
        String subtitle = dVar.f260161g;
        String str = dVar.f260162h;
        String iconUrl = dVar.i;
        String str2 = dVar.f260163j;
        String str3 = dVar.k;
        ArrayList buttons = dVar.f260164l;
        Integer num = dVar.f260165m;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new d(id10, type, createdDate, state, hVar, title, subtitle, str, iconUrl, str2, str3, buttons, num);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f260158a, dVar.f260158a) && this.f260159b == dVar.f260159b && Intrinsics.f(this.f260160c, dVar.f260160c) && this.d == dVar.d && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f260161g, dVar.f260161g) && Intrinsics.f(this.f260162h, dVar.f260162h) && Intrinsics.f(this.i, dVar.i) && Intrinsics.f(this.f260163j, dVar.f260163j) && Intrinsics.f(this.k, dVar.k) && this.f260164l.equals(dVar.f260164l) && Intrinsics.f(this.f260165m, dVar.f260165m);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + m72.b.f(this.f260160c, (this.f260159b.hashCode() + (this.f260158a.hashCode() * 31)) * 31, 31)) * 31;
        h hVar = this.e;
        int iC = p.a.c(p.a.c((iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31, 31, this.f), 31, this.f260161g);
        String str = this.f260162h;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.i);
        String str2 = this.f260163j;
        int iHashCode2 = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f260164l, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        Integer num = this.f260165m;
        return iB + (num != null ? num.hashCode() : 0);
    }
}
