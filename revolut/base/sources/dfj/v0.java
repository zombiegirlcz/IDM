package dfj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class v0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f114126b;

    public v0(String formId, List requiredParams) {
        Intrinsics.checkNotNullParameter(formId, "formId");
        Intrinsics.checkNotNullParameter(requiredParams, "requiredParams");
        this.f114125a = formId;
        this.f114126b = requiredParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f114125a, v0Var.f114125a) && Intrinsics.f(this.f114126b, v0Var.f114126b);
    }

    public final int hashCode() {
        return this.f114126b.hashCode() + (this.f114125a.hashCode() * 31);
    }
}
