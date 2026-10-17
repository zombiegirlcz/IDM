package com.revolut.feature.wealth.account_closure.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeedbackDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountClosureFeedbackDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccountClosureFeedbackDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountClosureCompetitorCompanyChoice f94868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f94869b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            AccountClosureCompetitorCompanyChoice accountClosureCompetitorCompanyChoice = (AccountClosureCompetitorCompanyChoice) j6.a.f(parcel, "parcel", AccountClosureFeedbackDetails.class);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap2.put(AccountClosureFeedbackFeature.CREATOR.createFromParcel(parcel), AccountClosureFeatureRating.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new AccountClosureFeedbackDetails(accountClosureCompetitorCompanyChoice, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountClosureFeedbackDetails[i];
        }
    }

    public AccountClosureFeedbackDetails(AccountClosureCompetitorCompanyChoice accountClosureCompetitorCompanyChoice, Map map) {
        this.f94868a = accountClosureCompetitorCompanyChoice;
        this.f94869b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountClosureFeedbackDetails)) {
            return false;
        }
        AccountClosureFeedbackDetails accountClosureFeedbackDetails = (AccountClosureFeedbackDetails) obj2;
        return Intrinsics.f(this.f94868a, accountClosureFeedbackDetails.f94868a) && Intrinsics.f(this.f94869b, accountClosureFeedbackDetails.f94869b);
    }

    public final int hashCode() {
        AccountClosureCompetitorCompanyChoice accountClosureCompetitorCompanyChoice = this.f94868a;
        int iHashCode = (accountClosureCompetitorCompanyChoice == null ? 0 : accountClosureCompetitorCompanyChoice.hashCode()) * 31;
        Map map = this.f94869b;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94868a, i);
        Map map = this.f94869b;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itV = l.v(dest, 1, map);
        while (itV.hasNext()) {
            Map.Entry entry = (Map.Entry) itV.next();
            ((AccountClosureFeedbackFeature) entry.getKey()).writeToParcel(dest, i);
            ((AccountClosureFeatureRating) entry.getValue()).writeToParcel(dest, i);
        }
    }
}
