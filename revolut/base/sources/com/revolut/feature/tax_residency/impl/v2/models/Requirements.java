package com.revolut.feature.tax_residency.impl.v2.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kpe.c;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/models/Requirements;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Step", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Requirements implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Requirements> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f90169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f90170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f90171c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/models/Requirements$Step;", "Landroid/os/Parcelable;", "Fatca", "Crs", "DirectTin", "Lcom/revolut/feature/tax_residency/impl/v2/models/Requirements$Step$Crs;", "Lcom/revolut/feature/tax_residency/impl/v2/models/Requirements$Step$DirectTin;", "Lcom/revolut/feature/tax_residency/impl/v2/models/Requirements$Step$Fatca;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Step extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/models/Requirements$Step$Crs;", "Lcom/revolut/feature/tax_residency/impl/v2/models/Requirements$Step;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Crs implements Step {

            @NotNull
            public static final Parcelable.Creator<Crs> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f90172a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f90173b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ArrayList f90174c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    b bVar = (b) parcel.readSerializable();
                    int iC = 0;
                    boolean z = parcel.readInt() != 0;
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    while (iC != i) {
                        iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                    }
                    return new Crs(bVar, z, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Crs[i];
                }
            }

            public Crs(b homeCountry, boolean z, ArrayList suggestedCountries) {
                Intrinsics.checkNotNullParameter(homeCountry, "homeCountry");
                Intrinsics.checkNotNullParameter(suggestedCountries, "suggestedCountries");
                this.f90172a = homeCountry;
                this.f90173b = z;
                this.f90174c = suggestedCountries;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Crs)) {
                    return false;
                }
                Crs crs = (Crs) obj2;
                return Intrinsics.f(this.f90172a, crs.f90172a) && this.f90173b == crs.f90173b && this.f90174c.equals(crs.f90174c);
            }

            public final int hashCode() {
                return this.f90174c.hashCode() + j6.a.c(this.f90172a.f297794a.hashCode() * 31, 31, this.f90173b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f90172a);
                dest.writeInt(this.f90173b ? 1 : 0);
                Iterator itY = j6.a.y(this.f90174c, dest);
                while (itY.hasNext()) {
                    dest.writeSerializable((Serializable) itY.next());
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/models/Requirements$Step$DirectTin;", "Lcom/revolut/feature/tax_residency/impl/v2/models/Requirements$Step;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DirectTin implements Step {

            @NotNull
            public static final Parcelable.Creator<DirectTin> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f90175a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final c f90176b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f90177c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DirectTin((b) parcel.readSerializable(), c.valueOf(parcel.readString()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DirectTin[i];
                }
            }

            public DirectTin(b country, c type, boolean z) {
                Intrinsics.checkNotNullParameter(country, "country");
                Intrinsics.checkNotNullParameter(type, "type");
                this.f90175a = country;
                this.f90176b = type;
                this.f90177c = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof DirectTin)) {
                    return false;
                }
                DirectTin directTin = (DirectTin) obj2;
                return Intrinsics.f(this.f90175a, directTin.f90175a) && this.f90176b == directTin.f90176b && this.f90177c == directTin.f90177c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f90177c) + ((this.f90176b.hashCode() + (this.f90175a.f297794a.hashCode() * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f90175a);
                dest.writeString(this.f90176b.name());
                dest.writeInt(this.f90177c ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/models/Requirements$Step$Fatca;", "Lcom/revolut/feature/tax_residency/impl/v2/models/Requirements$Step;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Fatca implements Step {

            @NotNull
            public static final Parcelable.Creator<Fatca> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f90178a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Fatca(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Fatca[i];
                }
            }

            public Fatca(boolean z) {
                this.f90178a = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Fatca) && this.f90178a == ((Fatca) obj2).f90178a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f90178a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f90178a ? 1 : 0);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(Requirements.class, parcel, arrayList, iE, 1);
            }
            int i2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                linkedHashMap.put(parcel.readSerializable(), CountryRule.CREATOR.createFromParcel(parcel));
            }
            int i5 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                linkedHashMap2.put(parcel.readSerializable(), UserSpecificRule.CREATOR.createFromParcel(parcel));
            }
            return new Requirements(linkedHashMap, linkedHashMap2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Requirements[i];
        }
    }

    public Requirements(Map countryRules, Map userSpecificRules, List steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(countryRules, "countryRules");
        Intrinsics.checkNotNullParameter(userSpecificRules, "userSpecificRules");
        this.f90169a = steps;
        this.f90170b = countryRules;
        this.f90171c = userSpecificRules;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Requirements)) {
            return false;
        }
        Requirements requirements = (Requirements) obj2;
        return Intrinsics.f(this.f90169a, requirements.f90169a) && Intrinsics.f(this.f90170b, requirements.f90170b) && Intrinsics.f(this.f90171c, requirements.f90171c);
    }

    public final int hashCode() {
        return this.f90171c.hashCode() + p.a.e(this.f90169a.hashCode() * 31, 31, this.f90170b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f90169a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itZ = j6.a.z(this.f90170b, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeSerializable((Serializable) entry.getKey());
            ((CountryRule) entry.getValue()).writeToParcel(dest, i);
        }
        Iterator itZ2 = j6.a.z(this.f90171c, dest);
        while (itZ2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itZ2.next();
            dest.writeSerializable((Serializable) entry2.getKey());
            ((UserSpecificRule) entry2.getValue()).writeToParcel(dest, i);
        }
    }
}
