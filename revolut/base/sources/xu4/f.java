package xu4;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f308958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f308959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f308960c;

    public f(TextLocalisedClause buttonLabel, List items, lw0.a header) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f308958a = header;
        this.f308959b = buttonLabel;
        this.f308960c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f308960c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f308958a.equals(fVar.f308958a) && this.f308959b.equals(fVar.f308959b) && Intrinsics.f(this.f308960c, fVar.f308960c);
    }

    public final int hashCode() {
        return this.f308960c.hashCode() + t61.a.a(this.f308958a.hashCode() * 31, 31, this.f308959b);
    }
}
