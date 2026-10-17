package com.revolut.feature.apm.wero.impl.ui.pay.create;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/ui/pay/create/CreateRequestLinkData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreateRequestLinkData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreateRequestLinkData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f63099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f63100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63101c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreateRequestLinkData(parcel.readLong(), parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreateRequestLinkData[i];
        }
    }

    public CreateRequestLinkData(long j2, String note, b targetCurrency) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(note, "note");
        this.f63099a = j2;
        this.f63100b = targetCurrency;
        this.f63101c = note;
    }

    public static CreateRequestLinkData a(CreateRequestLinkData createRequestLinkData, long j2, String note, int i) {
        if ((i & 1) != 0) {
            j2 = createRequestLinkData.f63099a;
        }
        b targetCurrency = createRequestLinkData.f63100b;
        if ((i & 4) != 0) {
            note = createRequestLinkData.f63101c;
        }
        createRequestLinkData.getClass();
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(note, "note");
        return new CreateRequestLinkData(j2, note, targetCurrency);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreateRequestLinkData)) {
            return false;
        }
        CreateRequestLinkData createRequestLinkData = (CreateRequestLinkData) obj2;
        return this.f63099a == createRequestLinkData.f63099a && Intrinsics.f(this.f63100b, createRequestLinkData.f63100b) && Intrinsics.f(this.f63101c, createRequestLinkData.f63101c);
    }

    public final int hashCode() {
        return this.f63101c.hashCode() + l.j(this.f63100b, Long.hashCode(this.f63099a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f63099a);
        dest.writeSerializable(this.f63100b);
        dest.writeString(this.f63101c);
    }
}
