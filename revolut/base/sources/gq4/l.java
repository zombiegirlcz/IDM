package gq4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f145553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f145554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f145555c;

    public l(List items, g primaryButton, g secondaryButton) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        this.f145553a = items;
        this.f145554b = primaryButton;
        this.f145555c = secondaryButton;
    }

    @Override // cli.p
    public final List c() {
        return this.f145553a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f145553a, lVar.f145553a) && Intrinsics.f(this.f145554b, lVar.f145554b) && Intrinsics.f(this.f145555c, lVar.f145555c);
    }

    public final int hashCode() {
        return this.f145555c.hashCode() + ((this.f145554b.hashCode() + (this.f145553a.hashCode() * 31)) * 31);
    }
}
