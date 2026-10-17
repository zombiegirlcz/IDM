package s56;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f260001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f260002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f260003c;

    public w(List items, v toolbar, u nextButton) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        this.f260001a = items;
        this.f260002b = toolbar;
        this.f260003c = nextButton;
    }

    @Override // cli.p
    public final List c() {
        return this.f260001a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f260001a, wVar.f260001a) && Intrinsics.f(this.f260002b, wVar.f260002b) && Intrinsics.f(this.f260003c, wVar.f260003c);
    }

    public final int hashCode() {
        return this.f260003c.hashCode() + ((this.f260002b.hashCode() + (this.f260001a.hashCode() * 31)) * 31);
    }
}
