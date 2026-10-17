package dn6;

import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f116218a;

    public c(Parcelable item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f116218a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f116218a, ((c) obj2).f116218a);
    }

    public final int hashCode() {
        return this.f116218a.hashCode();
    }
}
