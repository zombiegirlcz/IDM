package tt7;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f274253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f274254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatedBackgroundType f274255c;

    public o(List items, k header, AnimatedBackgroundType backgroundType) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        this.f274253a = items;
        this.f274254b = header;
        this.f274255c = backgroundType;
    }

    @Override // cli.p
    public final List c() {
        return this.f274253a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f274253a, oVar.f274253a) && Intrinsics.f(this.f274254b, oVar.f274254b) && Intrinsics.f(this.f274255c, oVar.f274255c);
    }

    public final int hashCode() {
        return this.f274255c.hashCode() + ((this.f274254b.hashCode() + (this.f274253a.hashCode() * 31)) * 31);
    }
}
