package tr4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f273742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f273743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f273744c;

    public q(p toolbarModel, List items, o buttonModel) {
        Intrinsics.checkNotNullParameter(toolbarModel, "toolbarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonModel, "buttonModel");
        this.f273742a = toolbarModel;
        this.f273743b = items;
        this.f273744c = buttonModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f273743b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f273742a, qVar.f273742a) && Intrinsics.f(this.f273743b, qVar.f273743b) && Intrinsics.f(this.f273744c, qVar.f273744c);
    }

    public final int hashCode() {
        return this.f273744c.hashCode() + p.a.d(this.f273742a.hashCode() * 31, 31, this.f273743b);
    }
}
