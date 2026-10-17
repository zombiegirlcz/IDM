package mlk;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class z implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f207035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f207036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f207037c;
    public final Clause d;
    public final Clause e;
    public final AnimatedBackgroundType f;

    public z(List items, Clause primaryButtonText, Clause secondaryButtonText, Clause navBarTitle, Clause navBarSubtitle, AnimatedBackgroundType background) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarSubtitle, "navBarSubtitle");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f207035a = items;
        this.f207036b = primaryButtonText;
        this.f207037c = secondaryButtonText;
        this.d = navBarTitle;
        this.e = navBarSubtitle;
        this.f = background;
    }

    @Override // cli.p
    public final List c() {
        return this.f207035a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f207035a, zVar.f207035a) && Intrinsics.f(this.f207036b, zVar.f207036b) && Intrinsics.f(this.f207037c, zVar.f207037c) && Intrinsics.f(this.d, zVar.d) && Intrinsics.f(this.e, zVar.e) && Intrinsics.f(this.f, zVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.a(p.a.a(p.a.a(p.a.a(this.f207035a.hashCode() * 31, 31, this.f207036b), 31, this.f207037c), 31, this.d), 31, this.e);
    }
}
