package xu3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f308903c;
    public final String d;
    public final ArrayList e;

    public h(String title, String description, String buttonTitle, String disclaimer, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f308901a = title;
        this.f308902b = description;
        this.f308903c = buttonTitle;
        this.d = disclaimer;
        this.e = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f308901a, hVar.f308901a) && Intrinsics.f(this.f308902b, hVar.f308902b) && Intrinsics.f(this.f308903c, hVar.f308903c) && Intrinsics.f(this.d, hVar.d) && this.e.equals(hVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f308901a.hashCode() * 31, 31, this.f308902b), 31, this.f308903c), 31, this.d);
    }
}
