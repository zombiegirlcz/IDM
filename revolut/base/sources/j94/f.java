package j94;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f172280a;

    public f(ArrayList fields) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.f172280a = fields;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f172280a.equals(((f) obj2).f172280a);
    }

    public final int hashCode() {
        return this.f172280a.hashCode();
    }
}
