package com.revolut.retail.retail_snackbar.mediator;

import android.os.Parcelable;
import com.revolut.retail.retail_snackbar.mediator.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f104441a;

    public c(Parcelable parcelable) {
        this.f104441a = parcelable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f104441a, ((c) obj2).f104441a);
    }

    public final int hashCode() {
        Parcelable parcelable = this.f104441a;
        if (parcelable == null) {
            return 0;
        }
        return parcelable.hashCode();
    }
}
