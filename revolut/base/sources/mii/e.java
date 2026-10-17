package mii;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import rp0.f1;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f205853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1 f205854c;

    public e(String id10, TextLocalisedClause message, f1 position, int i) {
        position = (i & 16) != 0 ? f1.BOTTOM : position;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f205852a = id10;
        this.f205853b = message;
        this.f205854c = position;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f205852a, eVar.f205852a) && Intrinsics.f(this.f205853b, eVar.f205853b) && this.f205854c == eVar.f205854c;
    }

    public final int hashCode() {
        return this.f205854c.hashCode() + t61.a.a(this.f205852a.hashCode() * 31, 29791, this.f205853b);
    }
}
