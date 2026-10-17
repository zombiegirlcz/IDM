package com.revolut.feature.bank_account_switching.impl.ui.form.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/form/domain/FormData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FormData implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wn2.a f63911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63912c;
    public final String d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<FormData> CREATOR = new b();
    public static final FormData e = new FormData(null, null, null, null);

    /* JADX INFO: renamed from: com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormData$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FormData(parcel.readString(), parcel.readInt() == 0 ? null : wn2.a.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FormData[i];
        }
    }

    public FormData(String str, wn2.a aVar, String str2, String str3) {
        this.f63910a = str;
        this.f63911b = aVar;
        this.f63912c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FormData)) {
            return false;
        }
        FormData formData = (FormData) obj2;
        return Intrinsics.f(this.f63910a, formData.f63910a) && this.f63911b == formData.f63911b && Intrinsics.f(this.f63912c, formData.f63912c) && Intrinsics.f(this.d, formData.d);
    }

    public final int hashCode() {
        String str = this.f63910a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        wn2.a aVar = this.f63911b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.f63912c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63910a);
        wn2.a aVar = this.f63911b;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeString(this.f63912c);
        dest.writeString(this.d);
    }
}
