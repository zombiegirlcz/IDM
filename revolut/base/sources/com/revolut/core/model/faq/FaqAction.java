package com.revolut.core.model.faq;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/model/faq/FaqAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FaqAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FaqAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51418c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FaqAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FaqAction[i];
        }
    }

    public FaqAction(String title, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f51416a = title;
        this.f51417b = str;
        this.f51418c = str2;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FaqAction)) {
            return false;
        }
        FaqAction faqAction = (FaqAction) obj2;
        return Intrinsics.f(this.f51416a, faqAction.f51416a) && Intrinsics.f(this.f51417b, faqAction.f51417b) && Intrinsics.f(this.f51418c, faqAction.f51418c) && this.d == faqAction.d;
    }

    public final int hashCode() {
        int iHashCode = this.f51416a.hashCode() * 31;
        String str = this.f51417b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f51418c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f51416a);
        dest.writeString(this.f51417b);
        dest.writeString(this.f51418c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
