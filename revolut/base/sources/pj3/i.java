package pj3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw0.k f236638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fj3.f f236639b;

    public i(yw0.k storyModel, fj3.f targetTheme) {
        Intrinsics.checkNotNullParameter(storyModel, "storyModel");
        Intrinsics.checkNotNullParameter(targetTheme, "targetTheme");
        this.f236638a = storyModel;
        this.f236639b = targetTheme;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f236638a, iVar.f236638a) && this.f236639b == iVar.f236639b;
    }

    public final int hashCode() {
        return this.f236639b.hashCode() + (this.f236638a.hashCode() * 31);
    }
}
