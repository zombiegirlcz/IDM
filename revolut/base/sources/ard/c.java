package ard;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8643a;

    public c(ArrayList changes) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        this.f8643a = changes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f8643a.equals(((c) obj2).f8643a);
    }

    public final int hashCode() {
        return this.f8643a.hashCode();
    }
}
