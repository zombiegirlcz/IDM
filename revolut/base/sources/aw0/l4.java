package aw0;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l4 extends k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f10403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10404c;
    public final List d;

    public l4(String groupId, Clause name, long j2, List segments) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.f10402a = groupId;
        this.f10403b = name;
        this.f10404c = j2;
        this.d = segments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj2;
        return Intrinsics.f(this.f10402a, l4Var.f10402a) && Intrinsics.f(this.f10403b, l4Var.f10403b) && this.f10404c == l4Var.f10404c && Intrinsics.f(this.d, l4Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a0.d.c(p.a.a(this.f10402a.hashCode() * 31, 31, this.f10403b), 31, this.f10404c);
    }
}
