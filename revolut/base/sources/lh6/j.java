package lh6;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f195168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f195169b;

    public j(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f195168a = items;
        this.f195169b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f195168a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f195168a.equals(jVar.f195168a) && this.f195169b == jVar.f195169b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f195169b) + (this.f195168a.hashCode() * 31);
    }
}
