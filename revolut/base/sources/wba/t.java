package wba;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f296089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f296090b;

    public t(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f296089a = items;
        this.f296090b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f296089a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f296089a.equals(tVar.f296089a) && this.f296090b == tVar.f296090b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f296090b) + (this.f296089a.hashCode() * 31);
    }
}
