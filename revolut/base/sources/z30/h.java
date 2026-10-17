package z30;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f319115a;

    public h(ArrayList options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f319115a = options;
    }

    @Override // z30.j
    public final List a() {
        return this.f319115a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f319115a.equals(((h) obj2).f319115a);
    }

    public final int hashCode() {
        return this.f319115a.hashCode();
    }
}
