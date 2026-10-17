package jm6;

import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f176480a;

    public f(Parcelable item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f176480a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f176480a, ((f) obj2).f176480a);
    }

    public final int hashCode() {
        return this.f176480a.hashCode();
    }
}
