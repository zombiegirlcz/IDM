package com.revolut.feature.rewards.api.model.rewards;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/AttributedText;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AttributedText implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AttributedText> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f84806b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AttributedText(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttributedText[i];
        }
    }

    public AttributedText(String text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f84805a = text;
        this.f84806b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AttributedText)) {
            return false;
        }
        AttributedText attributedText = (AttributedText) obj2;
        return Intrinsics.f(this.f84805a, attributedText.f84805a) && this.f84806b == attributedText.f84806b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84806b) + (this.f84805a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84805a);
        dest.writeInt(this.f84806b ? 1 : 0);
    }
}
