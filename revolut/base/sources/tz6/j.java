package tz6;

import aw0.u4;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f275878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u4 f275879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f275880c;
    public final boolean d;

    public j(List items, u4 header, g buttonData, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(buttonData, "buttonData");
        this.f275878a = items;
        this.f275879b = header;
        this.f275880c = buttonData;
        this.d = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f275878a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f275878a, jVar.f275878a) && Intrinsics.f(this.f275879b, jVar.f275879b) && Intrinsics.f(this.f275880c, jVar.f275880c) && this.d == jVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f275880c.hashCode() + ((this.f275879b.hashCode() + (this.f275878a.hashCode() * 31)) * 31)) * 31);
    }
}
