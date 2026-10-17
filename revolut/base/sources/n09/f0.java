package n09;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f210937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f210938b;

    public f0(z kind, Data categories) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f210937a = kind;
        this.f210938b = categories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f210937a, f0Var.f210937a) && Intrinsics.f(this.f210938b, f0Var.f210938b);
    }

    public final int hashCode() {
        return this.f210938b.hashCode() + (this.f210937a.hashCode() * 31);
    }
}
