package com.revolut.feature.transfer_reasons.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/api/navigation/LegalConfirmationInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LegalConfirmationInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LegalConfirmationInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f92313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f92314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f92315c;
    public final Clause d;
    public final Clause e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", LegalConfirmationInputData.class);
            Clause clause2 = (Clause) parcel.readParcelable(LegalConfirmationInputData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(LegalConfirmationInputData.class, parcel, arrayList, iE, 1);
            }
            return new LegalConfirmationInputData(clause, clause2, arrayList, (Clause) parcel.readParcelable(LegalConfirmationInputData.class.getClassLoader()), (Clause) parcel.readParcelable(LegalConfirmationInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LegalConfirmationInputData[i];
        }
    }

    public LegalConfirmationInputData(Clause title, Clause description, List confirmationPoints, Clause confirmButtonText, Clause cancelButtonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(confirmationPoints, "confirmationPoints");
        Intrinsics.checkNotNullParameter(confirmButtonText, "confirmButtonText");
        Intrinsics.checkNotNullParameter(cancelButtonText, "cancelButtonText");
        this.f92313a = title;
        this.f92314b = description;
        this.f92315c = confirmationPoints;
        this.d = confirmButtonText;
        this.e = cancelButtonText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LegalConfirmationInputData)) {
            return false;
        }
        LegalConfirmationInputData legalConfirmationInputData = (LegalConfirmationInputData) obj2;
        return Intrinsics.f(this.f92313a, legalConfirmationInputData.f92313a) && Intrinsics.f(this.f92314b, legalConfirmationInputData.f92314b) && Intrinsics.f(this.f92315c, legalConfirmationInputData.f92315c) && Intrinsics.f(this.d, legalConfirmationInputData.d) && Intrinsics.f(this.e, legalConfirmationInputData.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.a(p.a.d(p.a.a(this.f92313a.hashCode() * 31, 31, this.f92314b), 31, this.f92315c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f92313a, i);
        dest.writeParcelable(this.f92314b, i);
        Iterator itV = p.a.v(this.f92315c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }
}
