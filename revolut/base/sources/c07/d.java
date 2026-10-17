package c07;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f20189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f20190c;

    public d(List items, c primaryButton, c secondaryButton) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        this.f20188a = items;
        this.f20189b = primaryButton;
        this.f20190c = secondaryButton;
    }

    @Override // cli.p
    public final List c() {
        return this.f20188a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f20188a, dVar.f20188a) && Intrinsics.f(this.f20189b, dVar.f20189b) && Intrinsics.f(this.f20190c, dVar.f20190c);
    }

    public final int hashCode() {
        return this.f20190c.hashCode() + ((this.f20189b.hashCode() + (this.f20188a.hashCode() * 31)) * 31);
    }
}
