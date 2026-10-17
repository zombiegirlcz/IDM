package xk1;

import aw0.i0;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f306597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f306598b;

    public h(TextLocalisedClause prompt, i0 avatars) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        this.f306597a = prompt;
        this.f306598b = avatars;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f306597a.equals(hVar.f306597a) && Intrinsics.f(this.f306598b, hVar.f306598b);
    }

    public final int hashCode() {
        return this.f306598b.hashCode() + (this.f306597a.hashCode() * 31);
    }
}
