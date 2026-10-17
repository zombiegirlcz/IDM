package com.revolut.feature.insurance_credit.impl.data.model.action;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/action/ScreenContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScreenContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ScreenContent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f75769c;
    public final LinkAction d;
    public final Button e;
    public final Button f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f75770g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScreenContent(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(ScreenContent.class.getClassLoader()), parcel.readInt() == 0 ? null : LinkAction.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Button.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScreenContent[i];
        }
    }

    public ScreenContent(String title, String description, Image image, LinkAction linkAction, Button button, Button button2, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f75767a = title;
        this.f75768b = description;
        this.f75769c = image;
        this.d = linkAction;
        this.e = button;
        this.f = button2;
        this.f75770g = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScreenContent)) {
            return false;
        }
        ScreenContent screenContent = (ScreenContent) obj2;
        return Intrinsics.f(this.f75767a, screenContent.f75767a) && Intrinsics.f(this.f75768b, screenContent.f75768b) && Intrinsics.f(this.f75769c, screenContent.f75769c) && Intrinsics.f(this.d, screenContent.d) && Intrinsics.f(this.e, screenContent.e) && Intrinsics.f(this.f, screenContent.f) && Intrinsics.f(this.f75770g, screenContent.f75770g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f75767a.hashCode() * 31, 31, this.f75768b);
        Image image = this.f75769c;
        int iHashCode = (iC + (image == null ? 0 : image.hashCode())) * 31;
        LinkAction linkAction = this.d;
        int iHashCode2 = (iHashCode + (linkAction == null ? 0 : linkAction.hashCode())) * 31;
        Button button = this.e;
        int iHashCode3 = (iHashCode2 + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.f;
        int iHashCode4 = (iHashCode3 + (button2 == null ? 0 : button2.hashCode())) * 31;
        String str = this.f75770g;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75767a);
        dest.writeString(this.f75768b);
        dest.writeParcelable(this.f75769c, i);
        LinkAction linkAction = this.d;
        if (linkAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            linkAction.writeToParcel(dest, i);
        }
        Button button = this.e;
        if (button == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            button.writeToParcel(dest, i);
        }
        Button button2 = this.f;
        if (button2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            button2.writeToParcel(dest, i);
        }
        dest.writeString(this.f75770g);
    }
}
