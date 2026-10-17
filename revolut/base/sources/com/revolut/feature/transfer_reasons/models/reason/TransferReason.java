package com.revolut.feature.transfer_reasons.models.reason;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ttf.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/models/reason/TransferReason;", "Lcom/revolut/feature/transfer_reasons/models/reason/TransferReasonNode;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferReason implements TransferReasonNode {

    @NotNull
    public static final Parcelable.Creator<TransferReason> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f92433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92434c;
    public final d d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferReason(parcel.readString(), c.valueOf(parcel.readString()), parcel.readString(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferReason[i];
        }
    }

    public TransferReason(String id10, c type, String str, d dVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f92432a = id10;
        this.f92433b = type;
        this.f92434c = str;
        this.d = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferReason)) {
            return false;
        }
        TransferReason transferReason = (TransferReason) obj2;
        return Intrinsics.f(this.f92432a, transferReason.f92432a) && this.f92433b == transferReason.f92433b && Intrinsics.f(this.f92434c, transferReason.f92434c) && Intrinsics.f(this.d, transferReason.d);
    }

    @Override // com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF92432a() {
        return this.f92432a;
    }

    @Override // com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode
    /* JADX INFO: renamed from: getLabel, reason: from getter */
    public final String getF92434c() {
        return this.f92434c;
    }

    @Override // com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode
    /* JADX INFO: renamed from: getType, reason: from getter */
    public final c getF92433b() {
        return this.f92433b;
    }

    public final int hashCode() {
        int iHashCode = (this.f92433b.hashCode() + (this.f92432a.hashCode() * 31)) * 31;
        String str = this.f92434c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        d dVar = this.d;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92432a);
        dest.writeString(this.f92433b.name());
        dest.writeString(this.f92434c);
        dest.writeSerializable(this.d);
    }

    public /* synthetic */ TransferReason(d dVar, String str, String str2) {
        this(str, c.REASON, str2, dVar);
    }
}
