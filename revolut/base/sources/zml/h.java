package zml;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f323625a;

    public h(Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f323625a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f323625a, ((h) obj2).f323625a);
    }

    public final int hashCode() {
        return this.f323625a.hashCode();
    }
}
