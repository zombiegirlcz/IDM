package pck;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f234931a;

    public j(List recipientErrors) {
        Intrinsics.checkNotNullParameter(recipientErrors, "recipientErrors");
        this.f234931a = recipientErrors;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f234931a, ((j) obj2).f234931a);
    }

    public final int hashCode() {
        return this.f234931a.hashCode();
    }
}
