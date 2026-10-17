package com.revolut.kompot.common.transition;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/kompot/common/transition/ZoomTarget;", "Landroid/os/Parcelable;", "ListId", "ViewId", "Lcom/revolut/kompot/common/transition/ZoomTarget$ListId;", "Lcom/revolut/kompot/common/transition/ZoomTarget$ViewId;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ZoomTarget extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/common/transition/ZoomTarget$ListId;", "Lcom/revolut/kompot/common/transition/ZoomTarget;", "", "toString", "()Ljava/lang/String;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ListId implements ZoomTarget {

        @NotNull
        public static final Parcelable.Creator<ListId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98364a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ListId(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ListId[i];
            }
        }

        public ListId(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f98364a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ListId) && Intrinsics.f(this.f98364a, ((ListId) obj2).f98364a);
        }

        public final int hashCode() {
            return this.f98364a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f98364a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/common/transition/ZoomTarget$ViewId;", "Lcom/revolut/kompot/common/transition/ZoomTarget;", "", "toString", "()Ljava/lang/String;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ViewId implements ZoomTarget {

        @NotNull
        public static final Parcelable.Creator<ViewId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f98365a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ViewId(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ViewId[i];
            }
        }

        public ViewId(int i) {
            this.f98365a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ViewId) && this.f98365a == ((ViewId) obj2).f98365a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f98365a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f98365a);
        }
    }
}
