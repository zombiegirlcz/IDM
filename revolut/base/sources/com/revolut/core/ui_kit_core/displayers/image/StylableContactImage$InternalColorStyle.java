package com.revolut.core.ui_kit_core.displayers.image;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/core/ui_kit_core/displayers/image/StylableContactImage$InternalColorStyle", "Lcom/revolut/core/ui_kit_core/displayers/image/StylableContactImage$ContactStyle;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StylableContactImage$InternalColorStyle implements StylableContactImage$ContactStyle {

    @NotNull
    public static final Parcelable.Creator<StylableContactImage$InternalColorStyle> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59804b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StylableContactImage$InternalColorStyle(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StylableContactImage$InternalColorStyle[i];
        }
    }

    public StylableContactImage$InternalColorStyle(int i, int i2) {
        this.f59803a = i;
        this.f59804b = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF59803a() {
        return this.f59803a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF59804b() {
        return this.f59804b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StylableContactImage$InternalColorStyle)) {
            return false;
        }
        StylableContactImage$InternalColorStyle stylableContactImage$InternalColorStyle = (StylableContactImage$InternalColorStyle) obj2;
        return this.f59803a == stylableContactImage$InternalColorStyle.f59803a && this.f59804b == stylableContactImage$InternalColorStyle.f59804b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59804b) + (Integer.hashCode(this.f59803a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f59803a);
        dest.writeInt(this.f59804b);
    }
}
