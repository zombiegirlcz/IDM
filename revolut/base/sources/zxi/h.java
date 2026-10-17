package zxi;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f326343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f326344b;

    public h(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f326343a = items;
        this.f326344b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f326343a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f326343a.equals(hVar.f326343a) && this.f326344b == hVar.f326344b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f326344b) + (this.f326343a.hashCode() * 31);
    }
}
