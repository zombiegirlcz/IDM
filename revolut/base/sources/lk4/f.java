package lk4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f196211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f196212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f196213c;

    public f(TextLocalisedClause button, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f196211a = items;
        this.f196212b = z;
        this.f196213c = button;
    }

    @Override // jki.n
    public final List c() {
        return this.f196211a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f196211a.equals(fVar.f196211a) && this.f196212b == fVar.f196212b && this.f196213c.equals(fVar.f196213c);
    }

    public final int hashCode() {
        return this.f196213c.hashCode() + j6.a.c(this.f196211a.hashCode() * 31, 31, this.f196212b);
    }
}
