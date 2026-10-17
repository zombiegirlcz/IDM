package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/StudentHubScreenConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StudentHubScreenConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StudentHubScreenConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanHubScreenHeader f102858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f102859b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            PlanHubScreenHeader planHubScreenHeader = (PlanHubScreenHeader) j6.a.f(parcel, "parcel", StudentHubScreenConfig.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(StudentHubScreenConfig.class, parcel, arrayList, iE, 1);
            }
            return new StudentHubScreenConfig(planHubScreenHeader, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StudentHubScreenConfig[i];
        }
    }

    public StudentHubScreenConfig(PlanHubScreenHeader header, ArrayList content) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f102858a = header;
        this.f102859b = content;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StudentHubScreenConfig)) {
            return false;
        }
        StudentHubScreenConfig studentHubScreenConfig = (StudentHubScreenConfig) obj2;
        return Intrinsics.f(this.f102858a, studentHubScreenConfig.f102858a) && this.f102859b.equals(studentHubScreenConfig.f102859b);
    }

    public final int hashCode() {
        return this.f102859b.hashCode() + (this.f102858a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f102858a, i);
        Iterator itY = j6.a.y(this.f102859b, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
    }
}
