package wxd;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f300892a;

    public w(ArrayList sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f300892a = sections;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && this.f300892a.equals(((w) obj2).f300892a);
    }

    public final int hashCode() {
        return this.f300892a.hashCode();
    }
}
