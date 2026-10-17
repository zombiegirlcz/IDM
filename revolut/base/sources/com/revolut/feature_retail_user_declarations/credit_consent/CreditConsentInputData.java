package com.revolut.feature_retail_user_declarations.credit_consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.CreditConsentExpiryCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/credit_consent/CreditConsentInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditConsentInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditConsentInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f97538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97539c;
    public final List d;
    public final CreditConsentExpiryCollection e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int iE = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(CreditConsentInputData.class, parcel, arrayList2, iE, i);
                }
                arrayList = arrayList2;
            }
            return new CreditConsentInputData(string, z, string2, arrayList, (CreditConsentExpiryCollection) parcel.readParcelable(CreditConsentInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditConsentInputData[i];
        }
    }

    public CreditConsentInputData(String stepId, boolean z, String str, List list, CreditConsentExpiryCollection creditConsentExpiryCollection) {
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        this.f97537a = stepId;
        this.f97538b = z;
        this.f97539c = str;
        this.d = list;
        this.e = creditConsentExpiryCollection;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditConsentInputData)) {
            return false;
        }
        CreditConsentInputData creditConsentInputData = (CreditConsentInputData) obj2;
        return Intrinsics.f(this.f97537a, creditConsentInputData.f97537a) && this.f97538b == creditConsentInputData.f97538b && Intrinsics.f(this.f97539c, creditConsentInputData.f97539c) && Intrinsics.f(this.d, creditConsentInputData.d) && Intrinsics.f(this.e, creditConsentInputData.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f97537a.hashCode() * 31, 31, this.f97538b);
        String str = this.f97539c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        CreditConsentExpiryCollection creditConsentExpiryCollection = this.e;
        return iHashCode2 + (creditConsentExpiryCollection != null ? creditConsentExpiryCollection.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97537a);
        dest.writeInt(this.f97538b ? 1 : 0);
        dest.writeString(this.f97539c);
        List list = this.d;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
        dest.writeParcelable(this.e, i);
    }
}
