package ep7;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f128093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f128094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f128095c;
    public final Map d;

    public e(boolean z, boolean z3, List questions, Map answers) {
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.f128093a = z;
        this.f128094b = z3;
        this.f128095c = questions;
        this.d = answers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f128093a == eVar.f128093a && this.f128094b == eVar.f128094b && Intrinsics.f(this.f128095c, eVar.f128095c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(j6.a.c(Boolean.hashCode(this.f128093a) * 31, 31, this.f128094b), 31, this.f128095c);
    }
}
