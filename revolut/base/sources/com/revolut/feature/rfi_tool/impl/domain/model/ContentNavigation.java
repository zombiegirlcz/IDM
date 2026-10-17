package com.revolut.feature.rfi_tool.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rfi_tool/impl/domain/model/ContentNavigation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rfi_tool_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContentNavigation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ContentNavigation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f85002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f85003b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContentNavigation(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ContentNavigation[i];
        }
    }

    public ContentNavigation(boolean z, boolean z3) {
        this.f85002a = z;
        this.f85003b = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ContentNavigation)) {
            return false;
        }
        ContentNavigation contentNavigation = (ContentNavigation) obj2;
        return this.f85002a == contentNavigation.f85002a && this.f85003b == contentNavigation.f85003b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f85003b) + (Boolean.hashCode(this.f85002a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f85002a ? 1 : 0);
        dest.writeInt(this.f85003b ? 1 : 0);
    }
}
