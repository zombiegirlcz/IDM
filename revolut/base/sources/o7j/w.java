package o7j;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f222881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f222882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f222883c;

    public w(u toolbar, List items, s nextButton) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        this.f222881a = toolbar;
        this.f222882b = items;
        this.f222883c = nextButton;
    }

    @Override // cli.p
    public final List c() {
        return this.f222882b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f222881a, wVar.f222881a) && Intrinsics.f(this.f222882b, wVar.f222882b) && Intrinsics.f(this.f222883c, wVar.f222883c);
    }

    public final int hashCode() {
        return this.f222883c.hashCode() + p.a.d(this.f222881a.hashCode() * 31, 31, this.f222882b);
    }
}
