package com.revolut.feature.credit.application.plugins.impl.ui.address_v2.input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dx4.z2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/address_v2/input/CreditAddressInputScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditAddressInputScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditAddressInputScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66983c;
    public final z2 d;
    public final List e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            z2 z2Var = (z2) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(CreditAddressInputScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new CreditAddressInputScreenContract$InputData(string, string2, string3, z2Var, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditAddressInputScreenContract$InputData[i];
        }
    }

    public CreditAddressInputScreenContract$InputData(String title, String str, String buttonTitle, z2 z2Var, List previousAddresses, String applicationId) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(previousAddresses, "previousAddresses");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f66981a = title;
        this.f66982b = str;
        this.f66983c = buttonTitle;
        this.d = z2Var;
        this.e = previousAddresses;
        this.f = applicationId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditAddressInputScreenContract$InputData)) {
            return false;
        }
        CreditAddressInputScreenContract$InputData creditAddressInputScreenContract$InputData = (CreditAddressInputScreenContract$InputData) obj2;
        return Intrinsics.f(this.f66981a, creditAddressInputScreenContract$InputData.f66981a) && Intrinsics.f(this.f66982b, creditAddressInputScreenContract$InputData.f66982b) && Intrinsics.f(this.f66983c, creditAddressInputScreenContract$InputData.f66983c) && Intrinsics.f(this.d, creditAddressInputScreenContract$InputData.d) && Intrinsics.f(this.e, creditAddressInputScreenContract$InputData.e) && Intrinsics.f(this.f, creditAddressInputScreenContract$InputData.f);
    }

    public final int hashCode() {
        int iHashCode = this.f66981a.hashCode() * 31;
        String str = this.f66982b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f66983c);
        z2 z2Var = this.d;
        return this.f.hashCode() + p.a.d((iC + (z2Var != null ? z2Var.hashCode() : 0)) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66981a);
        dest.writeString(this.f66982b);
        dest.writeString(this.f66983c);
        dest.writeSerializable(this.d);
        Iterator itV = p.a.v(this.e, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.f);
    }
}
