package com.revolut.feature.apm.core.models.bizum;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/bizum/BizumTransferInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BizumTransferInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BizumTransferInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BizumContact f61923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f61924c;
    public final String d;
    public final String e;
    public final d f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BizumTransferInfo(parcel.readString(), BizumContact.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable(), parcel.readString(), parcel.readString(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BizumTransferInfo[i];
        }
    }

    public BizumTransferInfo(String operationId, BizumContact bizumContact, d amount, String comment, String edt, d fee2) {
        Intrinsics.checkNotNullParameter(operationId, "operationId");
        Intrinsics.checkNotNullParameter(bizumContact, "bizumContact");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(edt, "edt");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f61922a = operationId;
        this.f61923b = bizumContact;
        this.f61924c = amount;
        this.d = comment;
        this.e = edt;
        this.f = fee2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BizumTransferInfo)) {
            return false;
        }
        BizumTransferInfo bizumTransferInfo = (BizumTransferInfo) obj2;
        return Intrinsics.f(this.f61922a, bizumTransferInfo.f61922a) && Intrinsics.f(this.f61923b, bizumTransferInfo.f61923b) && Intrinsics.f(this.f61924c, bizumTransferInfo.f61924c) && Intrinsics.f(this.d, bizumTransferInfo.d) && Intrinsics.f(this.e, bizumTransferInfo.e) && Intrinsics.f(this.f, bizumTransferInfo.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(v7.c((this.f61923b.hashCode() + (this.f61922a.hashCode() * 31)) * 31, 31, this.f61924c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61922a);
        this.f61923b.writeToParcel(dest, i);
        dest.writeSerializable(this.f61924c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
    }
}
