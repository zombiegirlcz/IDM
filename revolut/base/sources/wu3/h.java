package wu3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f300062c;
    public final List d;
    public final List e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f300063g;

    public h(String title, String subtitle, List terms, List list, List checkboxes, String str, c button) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(checkboxes, "checkboxes");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f300060a = title;
        this.f300061b = subtitle;
        this.f300062c = terms;
        this.d = list;
        this.e = checkboxes;
        this.f = str;
        this.f300063g = button;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f300060a, hVar.f300060a) && Intrinsics.f(this.f300061b, hVar.f300061b) && Intrinsics.f(this.f300062c, hVar.f300062c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f300063g, hVar.f300063g);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.f300060a.hashCode() * 31, 31, this.f300061b), 31, this.f300062c);
        List list = this.d;
        int iD2 = p.a.d((iD + (list == null ? 0 : list.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return this.f300063g.hashCode() + ((iD2 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
