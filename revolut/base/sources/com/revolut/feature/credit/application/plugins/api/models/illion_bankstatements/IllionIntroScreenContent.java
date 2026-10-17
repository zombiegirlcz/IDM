package com.revolut.feature.credit.application.plugins.api.models.illion_bankstatements;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/illion_bankstatements/IllionIntroScreenContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "zu3/a", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IllionIntroScreenContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IllionIntroScreenContent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66463c;
    public final zu3.a d;
    public final String e;
    public final zu3.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IllionInfoPopup f66464g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IllionIntroScreenContent(parcel.readString(), parcel.readString(), parcel.readString(), zu3.a.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : zu3.a.valueOf(parcel.readString()), parcel.readInt() != 0 ? IllionInfoPopup.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IllionIntroScreenContent[i];
        }
    }

    public IllionIntroScreenContent(String title, String description, String buttonTitle, zu3.a buttonAction, String str, zu3.a aVar, IllionInfoPopup illionInfoPopup) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(buttonAction, "buttonAction");
        this.f66461a = title;
        this.f66462b = description;
        this.f66463c = buttonTitle;
        this.d = buttonAction;
        this.e = str;
        this.f = aVar;
        this.f66464g = illionInfoPopup;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IllionIntroScreenContent)) {
            return false;
        }
        IllionIntroScreenContent illionIntroScreenContent = (IllionIntroScreenContent) obj2;
        return Intrinsics.f(this.f66461a, illionIntroScreenContent.f66461a) && Intrinsics.f(this.f66462b, illionIntroScreenContent.f66462b) && Intrinsics.f(this.f66463c, illionIntroScreenContent.f66463c) && this.d == illionIntroScreenContent.d && Intrinsics.f(this.e, illionIntroScreenContent.e) && this.f == illionIntroScreenContent.f && Intrinsics.f(this.f66464g, illionIntroScreenContent.f66464g);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f66461a.hashCode() * 31, 31, this.f66462b), 31, this.f66463c)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        zu3.a aVar = this.f;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        IllionInfoPopup illionInfoPopup = this.f66464g;
        return iHashCode3 + (illionInfoPopup != null ? illionInfoPopup.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66461a);
        dest.writeString(this.f66462b);
        dest.writeString(this.f66463c);
        dest.writeString(this.d.name());
        dest.writeString(this.e);
        zu3.a aVar = this.f;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        IllionInfoPopup illionInfoPopup = this.f66464g;
        if (illionInfoPopup == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            illionInfoPopup.writeToParcel(dest, i);
        }
    }
}
