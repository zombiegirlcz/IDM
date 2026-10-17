package mek;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f204709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f204710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f204711c;

    public k(List items, i navBarState, f buttonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f204709a = items;
        this.f204710b = navBarState;
        this.f204711c = buttonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f204709a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f204709a, kVar.f204709a) && Intrinsics.f(this.f204710b, kVar.f204710b) && Intrinsics.f(this.f204711c, kVar.f204711c);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f204711c.f204699a) + ((this.f204710b.hashCode() + (this.f204709a.hashCode() * 31)) * 31);
    }
}
