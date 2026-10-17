package mii;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import rp0.f1;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f205859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1 f205860c;

    public g(String id10, TextLocalisedClause message, f1 position, int i) {
        position = (i & 16) != 0 ? f1.BOTTOM : position;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f205858a = id10;
        this.f205859b = message;
        this.f205860c = position;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f205858a, gVar.f205858a) && Intrinsics.f(this.f205859b, gVar.f205859b) && this.f205860c == gVar.f205860c;
    }

    public final int hashCode() {
        return this.f205860c.hashCode() + t61.a.a(this.f205858a.hashCode() * 31, 29791, this.f205859b);
    }
}
