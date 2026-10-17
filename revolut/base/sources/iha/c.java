package iha;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f161316a;

    public c(ArrayList availableDowngradeReasons) {
        Intrinsics.checkNotNullParameter(availableDowngradeReasons, "availableDowngradeReasons");
        this.f161316a = availableDowngradeReasons;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f161316a.equals(((c) obj2).f161316a);
    }

    public final int hashCode() {
        return this.f161316a.hashCode();
    }
}
