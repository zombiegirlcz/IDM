package v0f;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f284833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f284834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f284835c;

    public w(ArrayList items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f284833a = items;
        this.f284834b = z;
        this.f284835c = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f284833a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f284833a.equals(wVar.f284833a) && this.f284834b == wVar.f284834b && this.f284835c == wVar.f284835c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f284835c) + j6.a.c(this.f284833a.hashCode() * 31, 31, this.f284834b);
    }
}
