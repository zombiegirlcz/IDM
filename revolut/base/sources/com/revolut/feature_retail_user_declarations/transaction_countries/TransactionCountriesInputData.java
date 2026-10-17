package com.revolut.feature_retail_user_declarations.transaction_countries;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/transaction_countries/TransactionCountriesInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionCountriesInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransactionCountriesInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f97752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f97753c;
    public final String d;
    public final String e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f97754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f97755h;
    public final boolean i;

    public static final class a implements Parcelable.Creator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            boolean z3 = parcel.readInt() != 0 ? i : 0;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iC = 0;
            while (iC != i2) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, i);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            int iC2 = 0;
            while (iC2 != i3) {
                iC2 = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC2, i);
            }
            return new TransactionCountriesInputData(string, z, z3, string2, string3, arrayList, arrayList2, (b) parcel.readSerializable(), parcel.readInt() != 0 ? i : 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionCountriesInputData[i];
        }
    }

    public TransactionCountriesInputData(String stepId, boolean z, boolean z3, String title, String subtitle, ArrayList suggestedCountries, ArrayList allCountries, b currentCountry, boolean z4) {
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(suggestedCountries, "suggestedCountries");
        Intrinsics.checkNotNullParameter(allCountries, "allCountries");
        Intrinsics.checkNotNullParameter(currentCountry, "currentCountry");
        this.f97751a = stepId;
        this.f97752b = z;
        this.f97753c = z3;
        this.d = title;
        this.e = subtitle;
        this.f = suggestedCountries;
        this.f97754g = allCountries;
        this.f97755h = currentCountry;
        this.i = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionCountriesInputData)) {
            return false;
        }
        TransactionCountriesInputData transactionCountriesInputData = (TransactionCountriesInputData) obj2;
        return Intrinsics.f(this.f97751a, transactionCountriesInputData.f97751a) && this.f97752b == transactionCountriesInputData.f97752b && this.f97753c == transactionCountriesInputData.f97753c && Intrinsics.f(this.d, transactionCountriesInputData.d) && Intrinsics.f(this.e, transactionCountriesInputData.e) && this.f.equals(transactionCountriesInputData.f) && this.f97754g.equals(transactionCountriesInputData.f97754g) && Intrinsics.f(this.f97755h, transactionCountriesInputData.f97755h) && this.i == transactionCountriesInputData.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f97754g, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, p.a.c(p.a.c(j6.a.c(j6.a.c(this.f97751a.hashCode() * 31, 31, this.f97752b), 31, this.f97753c), 31, this.d), 31, this.e), 31), 31), 31, this.f97755h.f297794a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97751a);
        dest.writeInt(this.f97752b ? 1 : 0);
        dest.writeInt(this.f97753c ? 1 : 0);
        dest.writeString(this.d);
        dest.writeString(this.e);
        Iterator itY = j6.a.y(this.f, dest);
        while (itY.hasNext()) {
            dest.writeSerializable((Serializable) itY.next());
        }
        Iterator itY2 = j6.a.y(this.f97754g, dest);
        while (itY2.hasNext()) {
            dest.writeSerializable((Serializable) itY2.next());
        }
        dest.writeSerializable(this.f97755h);
        dest.writeInt(this.i ? 1 : 0);
    }
}
