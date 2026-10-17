package ez3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f130886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f130887c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f130888g;

    public b(String title, String secondDescription, String nameLabel, String emailLabel, String contactNameLabel, String phoneNumberLabel, String buttonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        Intrinsics.checkNotNullParameter(nameLabel, "nameLabel");
        Intrinsics.checkNotNullParameter(emailLabel, "emailLabel");
        Intrinsics.checkNotNullParameter(contactNameLabel, "contactNameLabel");
        Intrinsics.checkNotNullParameter(phoneNumberLabel, "phoneNumberLabel");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f130885a = title;
        this.f130886b = secondDescription;
        this.f130887c = nameLabel;
        this.d = emailLabel;
        this.e = contactNameLabel;
        this.f = phoneNumberLabel;
        this.f130888g = buttonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f130885a, bVar.f130885a) && Intrinsics.f(this.f130886b, bVar.f130886b) && Intrinsics.f(this.f130887c, bVar.f130887c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f130888g, bVar.f130888g);
    }

    public final int hashCode() {
        return this.f130888g.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f130885a.hashCode() * 31, 31, this.f130886b), 31, this.f130887c), 31, this.d), 31, this.e), 31, this.f);
    }
}
