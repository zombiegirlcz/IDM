package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.categorisation.api.model.PeriodPreferenceType;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import ehe.n;
import h30.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lzi.h;
import lzi.i;
import org.jetbrains.annotations.NotNull;
import prk.o;
import yld.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/details/AnalyticsDetailsContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Configuration", "Deeplink", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AnalyticsDetailsContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AnalyticsDetailsContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccountsSelection f87546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f87547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Configuration f87548c;
    public final Deeplink d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/details/AnalyticsDetailsContract$InputData$Configuration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Configuration implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Configuration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f87549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f87550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xi0.b f87551c;
        public final String d;
        public final Set e;
        public final AnalyticsSpendingPeriod$Interval f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final h f87552g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final i f87553h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iA = 0;
                int iE = 0;
                while (iE != i) {
                    iE = com.revolut.data.database.models.openbanking.d.e(Configuration.class, parcel, linkedHashSet, iE, 1);
                }
                int i2 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i2);
                int iA2 = 0;
                while (iA2 != i2) {
                    iA2 = o.a(parcel, linkedHashSet2, iA2, 1);
                }
                xi0.b bVar = (xi0.b) parcel.readSerializable();
                String string = parcel.readString();
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i3);
                while (iA != i3) {
                    iA = o.a(parcel, linkedHashSet3, iA, 1);
                }
                return new Configuration(linkedHashSet, linkedHashSet2, bVar, string, linkedHashSet3, (AnalyticsSpendingPeriod$Interval) parcel.readParcelable(Configuration.class.getClassLoader()), (h) parcel.readSerializable(), parcel.readInt() == 0 ? null : i.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Configuration[i];
            }
        }

        public Configuration(Set walletsIds, Set pocketIds, xi0.b analyticsCurrency, String currentUserId, Set selectedAccountsOwnerIds, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, h hVar, i iVar) {
            Intrinsics.checkNotNullParameter(walletsIds, "walletsIds");
            Intrinsics.checkNotNullParameter(pocketIds, "pocketIds");
            Intrinsics.checkNotNullParameter(analyticsCurrency, "analyticsCurrency");
            Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
            Intrinsics.checkNotNullParameter(selectedAccountsOwnerIds, "selectedAccountsOwnerIds");
            this.f87549a = walletsIds;
            this.f87550b = pocketIds;
            this.f87551c = analyticsCurrency;
            this.d = currentUserId;
            this.e = selectedAccountsOwnerIds;
            this.f = analyticsSpendingPeriod$Interval;
            this.f87552g = hVar;
            this.f87553h = iVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj2;
            return Intrinsics.f(this.f87549a, configuration.f87549a) && Intrinsics.f(this.f87550b, configuration.f87550b) && Intrinsics.f(this.f87551c, configuration.f87551c) && Intrinsics.f(this.d, configuration.d) && Intrinsics.f(this.e, configuration.e) && Intrinsics.f(this.f, configuration.f) && Intrinsics.f(this.f87552g, configuration.f87552g) && this.f87553h == configuration.f87553h;
        }

        public final int hashCode() {
            int iF = p.a.f(p.a.c(l.j(this.f87551c, p.a.f(this.f87549a.hashCode() * 31, 31, this.f87550b), 31), 31, this.d), 31, this.e);
            AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = this.f;
            int iHashCode = (iF + (analyticsSpendingPeriod$Interval == null ? 0 : analyticsSpendingPeriod$Interval.hashCode())) * 31;
            h hVar = this.f87552g;
            int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
            i iVar = this.f87553h;
            return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f87549a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            Iterator itV2 = n.v(this.f87550b, dest);
            while (itV2.hasNext()) {
                dest.writeString((String) itV2.next());
            }
            dest.writeSerializable(this.f87551c);
            dest.writeString(this.d);
            Iterator itV3 = n.v(this.e, dest);
            while (itV3.hasNext()) {
                dest.writeString((String) itV3.next());
            }
            dest.writeParcelable(this.f, i);
            dest.writeSerializable(this.f87552g);
            i iVar = this.f87553h;
            if (iVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(iVar.name());
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AnalyticsDetailsContract$InputData((AnalyticsAccountsSelection) parcel.readParcelable(AnalyticsDetailsContract$InputData.class.getClassLoader()), d.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Configuration.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Deeplink.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnalyticsDetailsContract$InputData[i];
        }
    }

    public AnalyticsDetailsContract$InputData(AnalyticsAccountsSelection analyticsAccountsSelection, d screenType, Configuration configuration, Deeplink deeplink) {
        Intrinsics.checkNotNullParameter(analyticsAccountsSelection, "analyticsAccountsSelection");
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        this.f87546a = analyticsAccountsSelection;
        this.f87547b = screenType;
        this.f87548c = configuration;
        this.d = deeplink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AnalyticsDetailsContract$InputData)) {
            return false;
        }
        AnalyticsDetailsContract$InputData analyticsDetailsContract$InputData = (AnalyticsDetailsContract$InputData) obj2;
        return Intrinsics.f(this.f87546a, analyticsDetailsContract$InputData.f87546a) && this.f87547b == analyticsDetailsContract$InputData.f87547b && Intrinsics.f(this.f87548c, analyticsDetailsContract$InputData.f87548c) && Intrinsics.f(this.d, analyticsDetailsContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f87547b.hashCode() + (this.f87546a.hashCode() * 31)) * 31;
        Configuration configuration = this.f87548c;
        int iHashCode2 = (iHashCode + (configuration == null ? 0 : configuration.hashCode())) * 31;
        Deeplink deeplink = this.d;
        return iHashCode2 + (deeplink != null ? deeplink.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f87546a, i);
        dest.writeString(this.f87547b.name());
        Configuration configuration = this.f87548c;
        if (configuration == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            configuration.writeToParcel(dest, i);
        }
        Deeplink deeplink = this.d;
        if (deeplink == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            deeplink.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/details/AnalyticsDetailsContract$InputData$Deeplink;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Deeplink implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Deeplink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PeriodPreferenceType f87555b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Deeplink(parcel.readString(), (PeriodPreferenceType) parcel.readParcelable(Deeplink.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Deeplink[i];
            }
        }

        public Deeplink(String str, PeriodPreferenceType periodPreferenceType) {
            this.f87554a = str;
            this.f87555b = periodPreferenceType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Deeplink)) {
                return false;
            }
            Deeplink deeplink = (Deeplink) obj2;
            return Intrinsics.f(this.f87554a, deeplink.f87554a) && this.f87555b == deeplink.f87555b;
        }

        public final int hashCode() {
            String str = this.f87554a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            PeriodPreferenceType periodPreferenceType = this.f87555b;
            return iHashCode + (periodPreferenceType != null ? periodPreferenceType.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87554a);
            dest.writeParcelable(this.f87555b, i);
        }

        public Deeplink() {
            this(null, null);
        }
    }
}
