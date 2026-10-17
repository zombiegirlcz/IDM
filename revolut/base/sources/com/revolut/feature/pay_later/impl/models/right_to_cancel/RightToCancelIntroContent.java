package com.revolut.feature.pay_later.impl.models.right_to_cancel;

import android.os.Parcel;
import android.os.Parcelable;
import dx4.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/impl/models/right_to_cancel/RightToCancelIntroContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RightToCancelIntroContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RightToCancelIntroContent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f78852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78854c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RightToCancelIntroContent(a1.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RightToCancelIntroContent[i];
        }
    }

    public RightToCancelIntroContent(a1 icon, String title, String description, String primaryButtonText, String secondaryButtonText) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        this.f78852a = icon;
        this.f78853b = title;
        this.f78854c = description;
        this.d = primaryButtonText;
        this.e = secondaryButtonText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RightToCancelIntroContent)) {
            return false;
        }
        RightToCancelIntroContent rightToCancelIntroContent = (RightToCancelIntroContent) obj2;
        return this.f78852a == rightToCancelIntroContent.f78852a && Intrinsics.f(this.f78853b, rightToCancelIntroContent.f78853b) && Intrinsics.f(this.f78854c, rightToCancelIntroContent.f78854c) && Intrinsics.f(this.d, rightToCancelIntroContent.d) && Intrinsics.f(this.e, rightToCancelIntroContent.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f78852a.hashCode() * 31, 31, this.f78853b), 31, this.f78854c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78852a.name());
        dest.writeString(this.f78853b);
        dest.writeString(this.f78854c);
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
