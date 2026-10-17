package xy3;

import kotlin.jvm.internal.Intrinsics;
import xy3.a;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f309576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f309577c;
    public final String d;
    public final xi0.b e;
    public final String f;

    public h(String id10, String title, String secondDescription, String inputLabel, xi0.b currency, String buttonText) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        Intrinsics.checkNotNullParameter(inputLabel, "inputLabel");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f309575a = id10;
        this.f309576b = title;
        this.f309577c = secondDescription;
        this.d = inputLabel;
        this.e = currency;
        this.f = buttonText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f309575a, hVar.f309575a) && Intrinsics.f(this.f309576b, hVar.f309576b) && Intrinsics.f(this.f309577c, hVar.f309577c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + h30.l.j(this.e, p.a.c(p.a.c(p.a.c(this.f309575a.hashCode() * 31, 31, this.f309576b), 31, this.f309577c), 31, this.d), 31);
    }
}
