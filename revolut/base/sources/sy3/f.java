package sy3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f266615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f266616c;
    public final ArrayList d;

    public f(String title, String description, String buttonTitle, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f266614a = title;
        this.f266615b = description;
        this.f266616c = buttonTitle;
        this.d = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f266614a, fVar.f266614a) && Intrinsics.f(this.f266615b, fVar.f266615b) && Intrinsics.f(this.f266616c, fVar.f266616c) && this.d.equals(fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f266614a.hashCode() * 31, 31, this.f266615b), 31, this.f266616c);
    }
}
