package com.revolut.core.ui_kit.utils;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/utils/ListIdTarget;", "Lcom/revolut/core/ui_kit/utils/ParcelableViewTarget;", "id", "", "ui_kit_foundation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ListIdTarget implements ParcelableViewTarget {

    @NotNull
    public static final Parcelable.Creator<ListIdTarget> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58286a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new ListIdTarget(v7.t(parcel, "parcel", "id"));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ListIdTarget[i];
        }
    }

    public /* synthetic */ ListIdTarget(String str) {
        this.f58286a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof ListIdTarget) {
            return Intrinsics.f(this.f58286a, ((ListIdTarget) obj2).f58286a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f58286a.hashCode();
    }

    @Override // ix0.b2
    public final String j() {
        return p.a.p("ListIdTarget(id=", this.f58286a, ")");
    }

    public final String toString() {
        return p.a.p("ListIdTarget(id=", this.f58286a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f58286a);
    }
}
