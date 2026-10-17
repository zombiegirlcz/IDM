package com.revolut.feature_retail_user_declarations.identity_declarations;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepNavigation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IdentityDeclarationsFlowInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<IdentityDeclarationsFlowInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f97671c;
    public final List d;
    public final boolean e;
    public final WorkflowStepNavigation f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (true) {
                if (iE == i) {
                    break;
                }
                iE = j6.a.e(IdentityDeclarationsFlowInputData.class, parcel, arrayList, iE, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iE2 = 0;
            while (iE2 != i2) {
                iE2 = j6.a.e(IdentityDeclarationsFlowInputData.class, parcel, arrayList2, iE2, 1);
            }
            return new IdentityDeclarationsFlowInputData(string, string2, arrayList, arrayList2, parcel.readInt() != 0, (WorkflowStepNavigation) parcel.readParcelable(IdentityDeclarationsFlowInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IdentityDeclarationsFlowInputData[i];
        }
    }

    public IdentityDeclarationsFlowInputData(String str, String str2, List steps, List dataPoints, boolean z, WorkflowStepNavigation navigation) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(dataPoints, "dataPoints");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        this.f97669a = str;
        this.f97670b = str2;
        this.f97671c = steps;
        this.d = dataPoints;
        this.e = z;
        this.f = navigation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IdentityDeclarationsFlowInputData)) {
            return false;
        }
        IdentityDeclarationsFlowInputData identityDeclarationsFlowInputData = (IdentityDeclarationsFlowInputData) obj2;
        return Intrinsics.f(this.f97669a, identityDeclarationsFlowInputData.f97669a) && Intrinsics.f(this.f97670b, identityDeclarationsFlowInputData.f97670b) && Intrinsics.f(this.f97671c, identityDeclarationsFlowInputData.f97671c) && Intrinsics.f(this.d, identityDeclarationsFlowInputData.d) && this.e == identityDeclarationsFlowInputData.e && Intrinsics.f(this.f, identityDeclarationsFlowInputData.f);
    }

    public final int hashCode() {
        String str = this.f97669a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f97670b;
        return this.f.hashCode() + j6.a.c(p.a.d(p.a.d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f97671c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97669a);
        dest.writeString(this.f97670b);
        Iterator itV = p.a.v(this.f97671c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itV2 = p.a.v(this.d, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
        dest.writeInt(this.e ? 1 : 0);
        dest.writeParcelable(this.f, i);
    }
}
