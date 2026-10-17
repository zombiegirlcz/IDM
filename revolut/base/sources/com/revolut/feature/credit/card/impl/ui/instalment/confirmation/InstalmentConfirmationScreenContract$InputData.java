package com.revolut.feature.credit.card.impl.ui.instalment.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import io3.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import ql4.s;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/confirmation/InstalmentConfirmationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstalmentConfirmationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InstalmentConfirmationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f69300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f69301c;
    public final l d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            while (iA != i) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new InstalmentConfirmationScreenContract$InputData(string, linkedHashSet, (s) parcel.readSerializable(), l.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InstalmentConfirmationScreenContract$InputData[i];
        }
    }

    public InstalmentConfirmationScreenContract$InputData(String facilityId, Set transactionIds, s quote, l pocketType) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.f69299a = facilityId;
        this.f69300b = transactionIds;
        this.f69301c = quote;
        this.d = pocketType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InstalmentConfirmationScreenContract$InputData)) {
            return false;
        }
        InstalmentConfirmationScreenContract$InputData instalmentConfirmationScreenContract$InputData = (InstalmentConfirmationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f69299a, instalmentConfirmationScreenContract$InputData.f69299a) && Intrinsics.f(this.f69300b, instalmentConfirmationScreenContract$InputData.f69300b) && Intrinsics.f(this.f69301c, instalmentConfirmationScreenContract$InputData.f69301c) && this.d == instalmentConfirmationScreenContract$InputData.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f69301c.hashCode() + p.a.f(this.f69299a.hashCode() * 31, 31, this.f69300b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69299a);
        Iterator itV = n.v(this.f69300b, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
        dest.writeSerializable(this.f69301c);
        dest.writeString(this.d.name());
    }
}
