package ss4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f265293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f265294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f265295c;

    public q(p toolbarState, List items, o buttonState) {
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f265293a = toolbarState;
        this.f265294b = items;
        this.f265295c = buttonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f265294b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f265293a, qVar.f265293a) && Intrinsics.f(this.f265294b, qVar.f265294b) && Intrinsics.f(this.f265295c, qVar.f265295c);
    }

    public final int hashCode() {
        return this.f265295c.hashCode() + p.a.d(this.f265293a.hashCode() * 31, 31, this.f265294b);
    }
}
