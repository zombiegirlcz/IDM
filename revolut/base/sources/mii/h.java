package mii;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import rp0.f1;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f205862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1 f205863c;

    public h(Clause message, String id10) {
        f1 position = f1.BOTTOM;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f205861a = id10;
        this.f205862b = message;
        this.f205863c = position;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f205861a, hVar.f205861a) && Intrinsics.f(this.f205862b, hVar.f205862b) && this.f205863c == hVar.f205863c;
    }

    public final int hashCode() {
        return this.f205863c.hashCode() + p.a.b(this.f205861a.hashCode() * 31, 961, this.f205862b);
    }
}
