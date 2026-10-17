package com.revolut.feature.kyc.impl.introduction;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/introduction/IntroductionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IntroductionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<IntroductionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f77824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f77825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f77826c;
    public final Clause d;
    public final AnalyticsProduct e;
    public final lx8.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f77827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f77828h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(IntroductionScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new IntroductionScreenContract$InputData(arrayList, (Clause) parcel.readParcelable(IntroductionScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(IntroductionScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(IntroductionScreenContract$InputData.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(IntroductionScreenContract$InputData.class.getClassLoader()), lx8.a.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IntroductionScreenContract$InputData[i];
        }
    }

    public IntroductionScreenContract$InputData(List items, Clause navBarTitle, Clause clause, Clause clause2, AnalyticsProduct automaticEventProduct, lx8.a backNavigationType, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        this.f77824a = items;
        this.f77825b = navBarTitle;
        this.f77826c = clause;
        this.d = clause2;
        this.e = automaticEventProduct;
        this.f = backNavigationType;
        this.f77827g = z;
        this.f77828h = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IntroductionScreenContract$InputData)) {
            return false;
        }
        IntroductionScreenContract$InputData introductionScreenContract$InputData = (IntroductionScreenContract$InputData) obj2;
        return Intrinsics.f(this.f77824a, introductionScreenContract$InputData.f77824a) && Intrinsics.f(this.f77825b, introductionScreenContract$InputData.f77825b) && Intrinsics.f(this.f77826c, introductionScreenContract$InputData.f77826c) && Intrinsics.f(this.d, introductionScreenContract$InputData.d) && Intrinsics.f(this.e, introductionScreenContract$InputData.e) && this.f == introductionScreenContract$InputData.f && this.f77827g == introductionScreenContract$InputData.f77827g && Intrinsics.f(this.f77828h, introductionScreenContract$InputData.f77828h);
    }

    public final int hashCode() {
        int iA = p.a.a(this.f77824a.hashCode() * 31, 31, this.f77825b);
        Clause clause = this.f77826c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        int iC = j6.a.c((this.f.hashCode() + l.a((iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.e)) * 31, 31, this.f77827g);
        Integer num = this.f77828h;
        return iC + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f77824a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f77825b, i);
        dest.writeParcelable(this.f77826c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f.name());
        dest.writeInt(this.f77827g ? 1 : 0);
        Integer num = this.f77828h;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }

    public /* synthetic */ IntroductionScreenContract$InputData(List list, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, AnalyticsProduct analyticsProduct, lx8.a aVar, int i) {
        this(list, textLocalisedClause, (i & 4) != 0 ? null : textLocalisedClause2, textLocalisedClause3, analyticsProduct, aVar, (i & 64) == 0, null);
    }
}
