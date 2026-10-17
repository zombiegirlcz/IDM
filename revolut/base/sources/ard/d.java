package ard;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8647a;

    public d(ArrayList changes) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        this.f8647a = changes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f8647a.equals(((d) obj2).f8647a);
    }

    public final int hashCode() {
        return this.f8647a.hashCode();
    }
}
