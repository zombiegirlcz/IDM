package fb7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f133487a;

    public k(ArrayList accountSpaces) {
        Intrinsics.checkNotNullParameter(accountSpaces, "accountSpaces");
        this.f133487a = accountSpaces;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f133487a.equals(((k) obj2).f133487a);
    }

    public final int hashCode() {
        return this.f133487a.hashCode();
    }
}
