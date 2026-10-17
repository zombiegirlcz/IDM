package com.revolut.feature.insurance.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance/api/navigation/InsuranceDestination$SuitabilityStatement", "", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsuranceDestination$SuitabilityStatement implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<InsuranceDestination$SuitabilityStatement> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f75032a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InsuranceDestination$SuitabilityStatement(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InsuranceDestination$SuitabilityStatement[i];
        }
    }

    public InsuranceDestination$SuitabilityStatement(List statementArticles) {
        Intrinsics.checkNotNullParameter(statementArticles, "statementArticles");
        this.f75032a = statementArticles;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof InsuranceDestination$SuitabilityStatement) && Intrinsics.f(this.f75032a, ((InsuranceDestination$SuitabilityStatement) obj2).f75032a);
    }

    public final int hashCode() {
        return this.f75032a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.f75032a);
    }
}
