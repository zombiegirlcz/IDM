package jz8;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f179639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f179640b;

    public m(i course, ArrayList lessons) {
        Intrinsics.checkNotNullParameter(course, "course");
        Intrinsics.checkNotNullParameter(lessons, "lessons");
        this.f179639a = course;
        this.f179640b = lessons;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f179639a, mVar.f179639a) && Intrinsics.f(this.f179640b, mVar.f179640b);
    }

    public final int hashCode() {
        return this.f179640b.hashCode() + (this.f179639a.hashCode() * 31);
    }
}
