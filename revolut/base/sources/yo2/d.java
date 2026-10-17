package yo2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f315540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f315541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f315542c;
    public final String d;
    public final String e;
    public final String f;

    public d(String actionName, String title, String description, String positiveCta, String negativeCta, String confirmationMessage) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(positiveCta, "positiveCta");
        Intrinsics.checkNotNullParameter(negativeCta, "negativeCta");
        Intrinsics.checkNotNullParameter(confirmationMessage, "confirmationMessage");
        this.f315540a = actionName;
        this.f315541b = title;
        this.f315542c = description;
        this.d = positiveCta;
        this.e = negativeCta;
        this.f = confirmationMessage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f315540a, dVar.f315540a) && Intrinsics.f(this.f315541b, dVar.f315541b) && Intrinsics.f(this.f315542c, dVar.f315542c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f315540a.hashCode() * 31, 31, this.f315541b), 31, this.f315542c), 31, this.d), 31, this.e);
    }
}
