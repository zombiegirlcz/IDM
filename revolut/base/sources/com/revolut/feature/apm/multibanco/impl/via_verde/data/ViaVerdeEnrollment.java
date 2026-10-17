package com.revolut.feature.apm.multibanco.impl.via_verde.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/via_verde/data/ViaVerdeEnrollment;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ViaVerdeEnrollment implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ViaVerdeEnrollment> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f62643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f62644c;
    public final String d;
    public final String e;
    public final LocalDateTime f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ViaVerdeEnrollment(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (LocalDateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ViaVerdeEnrollment[i];
        }
    }

    public ViaVerdeEnrollment(String id10, String cardId, String contractNumber, String paymentReference, String label, LocalDateTime creationDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(contractNumber, "contractNumber");
        Intrinsics.checkNotNullParameter(paymentReference, "paymentReference");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(creationDate, "creationDate");
        this.f62642a = id10;
        this.f62643b = cardId;
        this.f62644c = contractNumber;
        this.d = paymentReference;
        this.e = label;
        this.f = creationDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ViaVerdeEnrollment)) {
            return false;
        }
        ViaVerdeEnrollment viaVerdeEnrollment = (ViaVerdeEnrollment) obj2;
        return Intrinsics.f(this.f62642a, viaVerdeEnrollment.f62642a) && Intrinsics.f(this.f62643b, viaVerdeEnrollment.f62643b) && Intrinsics.f(this.f62644c, viaVerdeEnrollment.f62644c) && Intrinsics.f(this.d, viaVerdeEnrollment.d) && Intrinsics.f(this.e, viaVerdeEnrollment.e) && Intrinsics.f(this.f, viaVerdeEnrollment.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f62642a.hashCode() * 31, 31, this.f62643b), 31, this.f62644c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62642a);
        dest.writeString(this.f62643b);
        dest.writeString(this.f62644c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
    }
}
