package jol;

import com.revolut.sso.api.models.Evidence;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends com.revolut.sso.impl.ui.password_flow.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Evidence f177167a;

    public e(Evidence evidence) {
        Intrinsics.checkNotNullParameter(evidence, "evidence");
        this.f177167a = evidence;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f177167a, ((e) obj2).f177167a);
    }

    public final int hashCode() {
        return this.f177167a.hashCode();
    }
}
