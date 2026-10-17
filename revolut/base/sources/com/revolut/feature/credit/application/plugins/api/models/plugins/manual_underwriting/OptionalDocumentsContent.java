package com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/plugins/manual_underwriting/OptionalDocumentsContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OptionalDocumentsContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OptionalDocumentsContent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66484c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionalDocumentsContent(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OptionalDocumentsContent[i];
        }
    }

    public OptionalDocumentsContent(String title, String description, String buttonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f66482a = title;
        this.f66483b = description;
        this.f66484c = buttonTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OptionalDocumentsContent)) {
            return false;
        }
        OptionalDocumentsContent optionalDocumentsContent = (OptionalDocumentsContent) obj2;
        return Intrinsics.f(this.f66482a, optionalDocumentsContent.f66482a) && Intrinsics.f(this.f66483b, optionalDocumentsContent.f66483b) && Intrinsics.f(this.f66484c, optionalDocumentsContent.f66484c);
    }

    public final int hashCode() {
        return this.f66484c.hashCode() + p.a.c(this.f66482a.hashCode() * 31, 31, this.f66483b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66482a);
        dest.writeString(this.f66483b);
        dest.writeString(this.f66484c);
    }
}
