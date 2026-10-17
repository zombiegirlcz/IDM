package com.revolut.feature.insurance_credit.impl.data.model.action;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ps7.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/action/Button;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ps7/a", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Button implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Button> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ps7.a f75753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f75754c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Button(parcel.readString(), parcel.readInt() == 0 ? null : ps7.a.valueOf(parcel.readString()), parcel.readInt() != 0 ? b.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Button[i];
        }
    }

    public Button(String text, ps7.a aVar, b bVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f75752a = text;
        this.f75753b = aVar;
        this.f75754c = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Button)) {
            return false;
        }
        Button button = (Button) obj2;
        return Intrinsics.f(this.f75752a, button.f75752a) && this.f75753b == button.f75753b && this.f75754c == button.f75754c;
    }

    public final int hashCode() {
        int iHashCode = this.f75752a.hashCode() * 31;
        ps7.a aVar = this.f75753b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.f75754c;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75752a);
        ps7.a aVar = this.f75753b;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        b bVar = this.f75754c;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
    }
}
