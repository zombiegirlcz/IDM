package tp7;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f273300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f273301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f273302c;
    public final Map d;

    public d(int i, Integer num, List questions, Map answers) {
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.f273300a = i;
        this.f273301b = num;
        this.f273302c = questions;
        this.d = answers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f273300a == dVar.f273300a && Intrinsics.f(this.f273301b, dVar.f273301b) && Intrinsics.f(this.f273302c, dVar.f273302c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f273300a) * 31;
        Integer num = this.f273301b;
        return this.d.hashCode() + p.a.d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f273302c);
    }
}
