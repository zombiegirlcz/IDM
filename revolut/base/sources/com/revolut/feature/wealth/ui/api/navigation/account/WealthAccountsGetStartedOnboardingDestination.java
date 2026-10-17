package com.revolut.feature.wealth.ui.api.navigation.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/account/WealthAccountsGetStartedOnboardingDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthAccountsGetStartedOnboardingDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<WealthAccountsGetStartedOnboardingDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f95917a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(WealthAccountsGetStartedOnboardingDestination.class, parcel, arrayList2, iE, 1);
                }
                arrayList = arrayList2;
            }
            return new WealthAccountsGetStartedOnboardingDestination(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthAccountsGetStartedOnboardingDestination[i];
        }
    }

    public WealthAccountsGetStartedOnboardingDestination(List list) {
        this.f95917a = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getF95917a() {
        return this.f95917a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof WealthAccountsGetStartedOnboardingDestination) && Intrinsics.f(this.f95917a, ((WealthAccountsGetStartedOnboardingDestination) obj2).f95917a);
    }

    public final int hashCode() {
        List list = this.f95917a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List list = this.f95917a;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            dest.writeParcelable((Parcelable) itQ.next(), i);
        }
    }

    public WealthAccountsGetStartedOnboardingDestination() {
        this(null);
    }
}
