package com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.spinner;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.core.ui.progress.CreditProgressContract$AnalyticsConfig;
import com.revolut.feature.credit.core.ui.progress.CreditProgressContract$Configuration;
import it3.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/forbearance/application/impl/ui/forbearance/spinner/ForbearanceSpinnerContract$Configuration", "Lcom/revolut/feature/credit/core/ui/progress/CreditProgressContract$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_credit_forbearance_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ForbearanceSpinnerContract$Configuration extends CreditProgressContract$Configuration {

    @NotNull
    public static final Parcelable.Creator<ForbearanceSpinnerContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f69946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f69947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f69948c;
    public final Parcelable d;
    public final CreditProgressContract$AnalyticsConfig e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f69949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f69950h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f69951j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(ForbearanceSpinnerContract$Configuration.class, parcel, arrayList, iE, 1);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            int iE2 = 0;
            while (iE2 != i3) {
                iE2 = j6.a.e(ForbearanceSpinnerContract$Configuration.class, parcel, arrayList2, iE2, 1);
            }
            long j2 = parcel.readLong();
            Parcelable parcelable = parcel.readParcelable(ForbearanceSpinnerContract$Configuration.class.getClassLoader());
            CreditProgressContract$AnalyticsConfig creditProgressContract$AnalyticsConfig = (CreditProgressContract$AnalyticsConfig) parcel.readParcelable(ForbearanceSpinnerContract$Configuration.class.getClassLoader());
            String string = parcel.readString();
            int i5 = parcel.readInt();
            long j3 = parcel.readLong();
            int i6 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i6);
            while (true) {
                String string2 = parcel.readString();
                if (i2 == i6) {
                    return new ForbearanceSpinnerContract$Configuration(arrayList, arrayList2, j2, parcelable, creditProgressContract$AnalyticsConfig, string, i5, j3, arrayList3, string2);
                }
                arrayList3.add(f.valueOf(string2));
                i2++;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ForbearanceSpinnerContract$Configuration[i];
        }
    }

    public ForbearanceSpinnerContract$Configuration(List titles, List descriptions, long j2, Parcelable parcelable, CreditProgressContract$AnalyticsConfig creditProgressContract$AnalyticsConfig, String flowName, int i, long j3, List terminationCondition, String applicationId) {
        Intrinsics.checkNotNullParameter(titles, "titles");
        Intrinsics.checkNotNullParameter(descriptions, "descriptions");
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(terminationCondition, "terminationCondition");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f69946a = titles;
        this.f69947b = descriptions;
        this.f69948c = j2;
        this.d = parcelable;
        this.e = creditProgressContract$AnalyticsConfig;
        this.f = flowName;
        this.f69949g = i;
        this.f69950h = j3;
        this.i = terminationCondition;
        this.f69951j = applicationId;
    }

    @Override // com.revolut.feature.credit.core.ui.progress.CreditProgressContract$Configuration
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Override // com.revolut.feature.credit.core.ui.progress.CreditProgressContract$Configuration
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Parcelable getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ForbearanceSpinnerContract$Configuration)) {
            return false;
        }
        ForbearanceSpinnerContract$Configuration forbearanceSpinnerContract$Configuration = (ForbearanceSpinnerContract$Configuration) obj2;
        return Intrinsics.f(this.f69946a, forbearanceSpinnerContract$Configuration.f69946a) && Intrinsics.f(this.f69947b, forbearanceSpinnerContract$Configuration.f69947b) && this.f69948c == forbearanceSpinnerContract$Configuration.f69948c && Intrinsics.f(this.d, forbearanceSpinnerContract$Configuration.d) && Intrinsics.f(this.e, forbearanceSpinnerContract$Configuration.e) && Intrinsics.f(this.f, forbearanceSpinnerContract$Configuration.f) && this.f69949g == forbearanceSpinnerContract$Configuration.f69949g && this.f69950h == forbearanceSpinnerContract$Configuration.f69950h && Intrinsics.f(this.i, forbearanceSpinnerContract$Configuration.i) && Intrinsics.f(this.f69951j, forbearanceSpinnerContract$Configuration.f69951j);
    }

    public final int hashCode() {
        int iC = d.c(p.a.d(this.f69946a.hashCode() * 31, 31, this.f69947b), 31, this.f69948c);
        Parcelable parcelable = this.d;
        int iHashCode = (iC + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        CreditProgressContract$AnalyticsConfig creditProgressContract$AnalyticsConfig = this.e;
        return this.f69951j.hashCode() + p.a.d(d.c(j6.a.b(this.f69949g, p.a.c((iHashCode + (creditProgressContract$AnalyticsConfig != null ? creditProgressContract$AnalyticsConfig.hashCode() : 0)) * 31, 31, this.f), 31), 31, this.f69950h), 31, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f69946a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itV2 = p.a.v(this.f69947b, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
        dest.writeLong(this.f69948c);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f);
        dest.writeInt(this.f69949g);
        dest.writeLong(this.f69950h);
        Iterator itV3 = p.a.v(this.i, dest);
        while (itV3.hasNext()) {
            dest.writeString(((f) itV3.next()).name());
        }
        dest.writeString(this.f69951j);
    }
}
