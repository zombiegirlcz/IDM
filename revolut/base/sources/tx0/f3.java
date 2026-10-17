package tx0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f275122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f275123b;

    public f3(Clause text, Integer num) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f275122a = num;
        this.f275123b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj2;
        return this.f275122a.equals(f3Var.f275122a) && this.f275123b.equals(f3Var.f275123b);
    }

    public final int hashCode() {
        return this.f275123b.hashCode() + (this.f275122a.hashCode() * 31);
    }
}
