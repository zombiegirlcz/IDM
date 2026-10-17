package fc7;

import kotlin.jvm.internal.Intrinsics;
import mii.k;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f133654a;

    public f(k dialogModel) {
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        this.f133654a = dialogModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f133654a.equals(((f) obj2).f133654a);
    }

    public final int hashCode() {
        return this.f133654a.hashCode();
    }
}
