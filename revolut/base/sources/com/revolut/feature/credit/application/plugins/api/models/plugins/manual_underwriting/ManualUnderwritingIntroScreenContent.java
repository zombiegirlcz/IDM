package com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/plugins/manual_underwriting/ManualUnderwritingIntroScreenContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ManualUnderwritingIntroScreenContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ManualUnderwritingIntroScreenContent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66474b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ManualUnderwritingIntroScreenContent(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ManualUnderwritingIntroScreenContent[i];
        }
    }

    public ManualUnderwritingIntroScreenContent(String title, String subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f66473a = title;
        this.f66474b = subtitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ManualUnderwritingIntroScreenContent)) {
            return false;
        }
        ManualUnderwritingIntroScreenContent manualUnderwritingIntroScreenContent = (ManualUnderwritingIntroScreenContent) obj2;
        return Intrinsics.f(this.f66473a, manualUnderwritingIntroScreenContent.f66473a) && Intrinsics.f(this.f66474b, manualUnderwritingIntroScreenContent.f66474b);
    }

    public final int hashCode() {
        return this.f66474b.hashCode() + (this.f66473a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66473a);
        dest.writeString(this.f66474b);
    }
}
