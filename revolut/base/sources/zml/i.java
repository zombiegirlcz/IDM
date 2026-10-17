package zml;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f323626a;

    public i(Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f323626a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f323626a, ((i) obj2).f323626a);
    }

    public final int hashCode() {
        return this.f323626a.hashCode();
    }
}
