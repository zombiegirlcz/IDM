package fki;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f135842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135843b;

    public b(List steps, String selectedStepId) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(selectedStepId, "selectedStepId");
        this.f135842a = steps;
        this.f135843b = selectedStepId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f135842a, bVar.f135842a) && Intrinsics.f(this.f135843b, bVar.f135843b);
    }

    public final int hashCode() {
        return this.f135843b.hashCode() + (this.f135842a.hashCode() * 31);
    }
}
