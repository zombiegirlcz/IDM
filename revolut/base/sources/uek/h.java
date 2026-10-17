package uek;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f279473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f279474b;

    public h(ArrayList items, d buttonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f279473a = items;
        this.f279474b = buttonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f279473a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f279473a.equals(hVar.f279473a) && Intrinsics.f(this.f279474b, hVar.f279474b);
    }

    public final int hashCode() {
        return this.f279474b.hashCode() + (this.f279473a.hashCode() * 31);
    }
}
