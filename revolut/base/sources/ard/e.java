package ard;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8648a;

    public e(ArrayList changes) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        this.f8648a = changes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f8648a.equals(((e) obj2).f8648a);
    }

    public final int hashCode() {
        return this.f8648a.hashCode();
    }
}
