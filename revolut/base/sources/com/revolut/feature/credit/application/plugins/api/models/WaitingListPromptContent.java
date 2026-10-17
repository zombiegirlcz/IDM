package com.revolut.feature.credit.application.plugins.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/WaitingListPromptContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WaitingListPromptContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WaitingListPromptContent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66288c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WaitingListPromptContent(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WaitingListPromptContent[i];
        }
    }

    public WaitingListPromptContent(String illustrationUrl, String title, String subtitle, String buttonTitle) {
        Intrinsics.checkNotNullParameter(illustrationUrl, "illustrationUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f66286a = illustrationUrl;
        this.f66287b = title;
        this.f66288c = subtitle;
        this.d = buttonTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WaitingListPromptContent)) {
            return false;
        }
        WaitingListPromptContent waitingListPromptContent = (WaitingListPromptContent) obj2;
        return Intrinsics.f(this.f66286a, waitingListPromptContent.f66286a) && Intrinsics.f(this.f66287b, waitingListPromptContent.f66287b) && Intrinsics.f(this.f66288c, waitingListPromptContent.f66288c) && Intrinsics.f(this.d, waitingListPromptContent.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f66286a.hashCode() * 31, 31, this.f66287b), 31, this.f66288c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66286a);
        dest.writeString(this.f66287b);
        dest.writeString(this.f66288c);
        dest.writeString(this.d);
    }
}
