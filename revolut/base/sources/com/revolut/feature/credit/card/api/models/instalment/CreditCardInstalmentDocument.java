package com.revolut.feature.credit.card.api.models.instalment;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ql4.g;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/instalment/CreditCardInstalmentDocument;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ql4/g", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardInstalmentDocument implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardInstalmentDocument> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f68799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f68800b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardInstalmentDocument(g.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardInstalmentDocument[i];
        }
    }

    public CreditCardInstalmentDocument(g type, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f68799a = type;
        this.f68800b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardInstalmentDocument)) {
            return false;
        }
        CreditCardInstalmentDocument creditCardInstalmentDocument = (CreditCardInstalmentDocument) obj2;
        return this.f68799a == creditCardInstalmentDocument.f68799a && this.f68800b == creditCardInstalmentDocument.f68800b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f68800b) + (this.f68799a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68799a.name());
        dest.writeInt(this.f68800b ? 1 : 0);
    }
}
