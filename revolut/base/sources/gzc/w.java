package gzc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f148042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f148043c;
    public final boolean d;

    public w(String type, v state, List restrictions, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(restrictions, "restrictions");
        this.f148041a = type;
        this.f148042b = state;
        this.f148043c = restrictions;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f148041a, wVar.f148041a) && this.f148042b == wVar.f148042b && Intrinsics.f(this.f148043c, wVar.f148043c) && this.d == wVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.d((this.f148042b.hashCode() + (this.f148041a.hashCode() * 31)) * 31, 31, this.f148043c);
    }
}
