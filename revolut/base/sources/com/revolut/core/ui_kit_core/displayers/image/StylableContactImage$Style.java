package com.revolut.core.ui_kit_core.displayers.image;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/core/ui_kit_core/displayers/image/StylableContactImage$Style", "Lcom/revolut/core/ui_kit_core/displayers/image/StylableContactImage$ContactStyle;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class StylableContactImage$Style implements StylableContactImage$ContactStyle {

    @NotNull
    public static final Parcelable.Creator<StylableContactImage$Style> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59806b;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StylableContactImage$Style(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StylableContactImage$Style[i];
        }
    }

    public StylableContactImage$Style(int i, int i2) {
        this.f59805a = i;
        this.f59806b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StylableContactImage$Style)) {
            return false;
        }
        StylableContactImage$Style stylableContactImage$Style = (StylableContactImage$Style) obj2;
        return this.f59805a == stylableContactImage$Style.f59805a && this.f59806b == stylableContactImage$Style.f59806b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59806b) + (Integer.hashCode(this.f59805a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f59805a);
        dest.writeInt(this.f59806b);
    }
}
