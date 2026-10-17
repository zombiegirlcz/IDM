package com.revolut.feature.shared.savings.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ncd.g;
import ncd.h;
import ncd.k;
import ncd.l;
import ncd.m;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u000f\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Schedules", "InterestRate", "Provider", "Protection", "Deduction", "Limit", "ncd/m", "ncd/l", "Campaign", "Disclaimer", "Explanation", "ProductRestriction", "DepositLimits", "Disclaimers", "Term", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingsProduct implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SavingsProduct> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f86618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f86619c;
    public final m d;
    public final Provider e;
    public final Protection f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Schedules f86620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterestRate f86621h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f86622j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f86623l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f86624m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LocalDateTime f86625n;
    public final Campaign o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f86626p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f86627q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f86628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f86629s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DepositLimits f86630t;
    public final Disclaimers u;
    public final Term v;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Campaign;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "com/revolut/feature/shared/savings/models/product/b", "a", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Campaign implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDateTime f86632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDateTime f86633c;
        public final Map d;
        public final com.revolut.feature.shared.savings.models.product.b e;
        public final String f;

        @NotNull
        public static final Parcelable.Creator<Campaign> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                LocalDateTime localDateTime = (LocalDateTime) parcel.readSerializable();
                LocalDateTime localDateTime2 = (LocalDateTime) parcel.readSerializable();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new Campaign(string, localDateTime, localDateTime2, linkedHashMap, com.revolut.feature.shared.savings.models.product.b.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Campaign[i];
            }
        }

        public Campaign(String id10, LocalDateTime localDateTime, LocalDateTime localDateTime2, Map descriptions, com.revolut.feature.shared.savings.models.product.b type, String deeplink) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(descriptions, "descriptions");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f86631a = id10;
            this.f86632b = localDateTime;
            this.f86633c = localDateTime2;
            this.d = descriptions;
            this.e = type;
            this.f = deeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Campaign)) {
                return false;
            }
            Campaign campaign = (Campaign) obj2;
            return Intrinsics.f(this.f86631a, campaign.f86631a) && Intrinsics.f(this.f86632b, campaign.f86632b) && Intrinsics.f(this.f86633c, campaign.f86633c) && Intrinsics.f(this.d, campaign.d) && this.e == campaign.e && Intrinsics.f(this.f, campaign.f);
        }

        public final int hashCode() {
            int iHashCode = this.f86631a.hashCode() * 31;
            LocalDateTime localDateTime = this.f86632b;
            int iHashCode2 = (iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
            LocalDateTime localDateTime2 = this.f86633c;
            return this.f.hashCode() + ((this.e.hashCode() + p.a.e((iHashCode2 + (localDateTime2 != null ? localDateTime2.hashCode() : 0)) * 31, 31, this.d)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86631a);
            dest.writeSerializable(this.f86632b);
            dest.writeSerializable(this.f86633c);
            Iterator itZ = j6.a.z(this.d, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
            dest.writeString(this.e.name());
            dest.writeString(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Deduction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Deduction implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f86635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f86636c;
        public final double d;
        public final String e;

        @NotNull
        public static final Parcelable.Creator<Deduction> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                return new Deduction(parcel.readDouble(), parcel.readDouble(), string, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Deduction[i];
            }
        }

        public Deduction(double d, double d5, String code, String displayName, String str) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            this.f86634a = code;
            this.f86635b = d;
            this.f86636c = displayName;
            this.d = d5;
            this.e = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Deduction)) {
                return false;
            }
            Deduction deduction = (Deduction) obj2;
            return Intrinsics.f(this.f86634a, deduction.f86634a) && Double.compare(this.f86635b, deduction.f86635b) == 0 && Intrinsics.f(this.f86636c, deduction.f86636c) && Double.compare(this.d, deduction.d) == 0 && Intrinsics.f(this.e, deduction.e);
        }

        public final int hashCode() {
            int iC = m72.b.c(p.a.c(m72.b.c(this.f86634a.hashCode() * 31, this.f86635b, 31), 31, this.f86636c), this.d, 31);
            String str = this.e;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86634a);
            dest.writeDouble(this.f86635b);
            dest.writeString(this.f86636c);
            dest.writeDouble(this.d);
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$DepositLimits;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DepositLimits implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DepositLimits> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86638b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DepositLimits(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DepositLimits[i];
            }
        }

        public DepositLimits(String title, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f86637a = title;
            this.f86638b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DepositLimits)) {
                return false;
            }
            DepositLimits depositLimits = (DepositLimits) obj2;
            return Intrinsics.f(this.f86637a, depositLimits.f86637a) && Intrinsics.f(this.f86638b, depositLimits.f86638b);
        }

        public final int hashCode() {
            int iHashCode = this.f86637a.hashCode() * 31;
            String str = this.f86638b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86637a);
            dest.writeString(this.f86638b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Disclaimer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Disclaimer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Disclaimer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86640b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Disclaimer(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Disclaimer[i];
            }
        }

        public Disclaimer(String title, String description) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f86639a = title;
            this.f86640b = description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Disclaimer)) {
                return false;
            }
            Disclaimer disclaimer = (Disclaimer) obj2;
            return Intrinsics.f(this.f86639a, disclaimer.f86639a) && Intrinsics.f(this.f86640b, disclaimer.f86640b);
        }

        public final int hashCode() {
            return this.f86640b.hashCode() + (this.f86639a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86639a);
            dest.writeString(this.f86640b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Disclaimers;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Disclaimers implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Disclaimers> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86641a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Disclaimers(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Disclaimers[i];
            }
        }

        public Disclaimers(String str) {
            this.f86641a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Disclaimers) && Intrinsics.f(this.f86641a, ((Disclaimers) obj2).f86641a);
        }

        public final int hashCode() {
            String str = this.f86641a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86641a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Explanation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Explanation implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Explanation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86643b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Explanation(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Explanation[i];
            }
        }

        public Explanation(String title, String description) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f86642a = title;
            this.f86643b = description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Explanation)) {
                return false;
            }
            Explanation explanation = (Explanation) obj2;
            return Intrinsics.f(this.f86642a, explanation.f86642a) && Intrinsics.f(this.f86643b, explanation.f86643b);
        }

        public final int hashCode() {
            return this.f86643b.hashCode() + (this.f86642a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86642a);
            dest.writeString(this.f86643b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$InterestRate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "RateTier", "RatePercentages", "DisplayProperties", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InterestRate implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InterestRate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f86644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DisplayProperties f86645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DisplayProperties f86646c;
        public final Disclaimer d;
        public final Explanation e;
        public final String f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$InterestRate$DisplayProperties;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DisplayProperties implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<DisplayProperties> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final k f86647a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f86648b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DisplayProperties(k.valueOf(parcel.readString()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DisplayProperties[i];
                }
            }

            public DisplayProperties(k type, String name) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(name, "name");
                this.f86647a = type;
                this.f86648b = name;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof DisplayProperties)) {
                    return false;
                }
                DisplayProperties displayProperties = (DisplayProperties) obj2;
                return this.f86647a == displayProperties.f86647a && Intrinsics.f(this.f86648b, displayProperties.f86648b);
            }

            public final int hashCode() {
                return this.f86648b.hashCode() + (this.f86647a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86647a.name());
                dest.writeString(this.f86648b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$InterestRate$RatePercentages;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RatePercentages implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<RatePercentages> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final double f86649a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final double f86650b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final double f86651c;
            public final Double d;
            public final Double e;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RatePercentages(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new RatePercentages[i];
                }
            }

            public RatePercentages(double d, double d5, double d6, Double d10, Double d15) {
                this.f86649a = d;
                this.f86650b = d5;
                this.f86651c = d6;
                this.d = d10;
                this.e = d15;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof RatePercentages)) {
                    return false;
                }
                RatePercentages ratePercentages = (RatePercentages) obj2;
                return Double.compare(this.f86649a, ratePercentages.f86649a) == 0 && Double.compare(this.f86650b, ratePercentages.f86650b) == 0 && Double.compare(this.f86651c, ratePercentages.f86651c) == 0 && Intrinsics.f(this.d, ratePercentages.d) && Intrinsics.f(this.e, ratePercentages.e);
            }

            public final int hashCode() {
                int iC = m72.b.c(m72.b.c(Double.hashCode(this.f86649a) * 31, this.f86650b, 31), this.f86651c, 31);
                Double d = this.d;
                int iHashCode = (iC + (d == null ? 0 : d.hashCode())) * 31;
                Double d5 = this.e;
                return iHashCode + (d5 != null ? d5.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeDouble(this.f86649a);
                dest.writeDouble(this.f86650b);
                dest.writeDouble(this.f86651c);
                Double d = this.d;
                if (d == null) {
                    dest.writeInt(0);
                } else {
                    org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
                }
                Double d5 = this.e;
                if (d5 == null) {
                    dest.writeInt(0);
                } else {
                    org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d5);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$InterestRate$RateTier;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RateTier implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<RateTier> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f86652a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Long f86653b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final RatePercentages f86654c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RateTier(parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), RatePercentages.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new RateTier[i];
                }
            }

            public RateTier(long j2, Long l2, RatePercentages percentages) {
                Intrinsics.checkNotNullParameter(percentages, "percentages");
                this.f86652a = j2;
                this.f86653b = l2;
                this.f86654c = percentages;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof RateTier)) {
                    return false;
                }
                RateTier rateTier = (RateTier) obj2;
                return this.f86652a == rateTier.f86652a && Intrinsics.f(this.f86653b, rateTier.f86653b) && Intrinsics.f(this.f86654c, rateTier.f86654c);
            }

            public final int hashCode() {
                int iHashCode = Long.hashCode(this.f86652a) * 31;
                Long l2 = this.f86653b;
                return this.f86654c.hashCode() + ((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeLong(this.f86652a);
                Long l2 = this.f86653b;
                if (l2 == null) {
                    dest.writeInt(0);
                } else {
                    m72.b.A(dest, 1, l2);
                }
                this.f86654c.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(RateTier.CREATOR, parcel, arrayList, iA, 1);
                }
                Parcelable.Creator<DisplayProperties> creator = DisplayProperties.CREATOR;
                return new InterestRate(arrayList, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? Disclaimer.CREATOR.createFromParcel(parcel) : null, Explanation.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InterestRate[i];
            }
        }

        public InterestRate(ArrayList rates, DisplayProperties primary, DisplayProperties displayProperties, Disclaimer disclaimer, Explanation explanation, String str) {
            Intrinsics.checkNotNullParameter(rates, "rates");
            Intrinsics.checkNotNullParameter(primary, "primary");
            Intrinsics.checkNotNullParameter(explanation, "explanation");
            this.f86644a = rates;
            this.f86645b = primary;
            this.f86646c = displayProperties;
            this.d = disclaimer;
            this.e = explanation;
            this.f = str;
        }

        public final RatePercentages a() {
            RatePercentages ratePercentages;
            RateTier rateTier = (RateTier) d0.d0(this.f86644a);
            if (rateTier != null && (ratePercentages = rateTier.f86654c) != null) {
                return ratePercentages;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Savings Product Rates should always have at least one rate tier");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            throw illegalStateException;
        }

        public final k b() {
            DisplayProperties displayProperties = this.f86646c;
            if (displayProperties != null) {
                return displayProperties.f86647a;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InterestRate)) {
                return false;
            }
            InterestRate interestRate = (InterestRate) obj2;
            return this.f86644a.equals(interestRate.f86644a) && Intrinsics.f(this.f86645b, interestRate.f86645b) && Intrinsics.f(this.f86646c, interestRate.f86646c) && Intrinsics.f(this.d, interestRate.d) && Intrinsics.f(this.e, interestRate.e) && Intrinsics.f(this.f, interestRate.f);
        }

        public final int hashCode() {
            int iHashCode = (this.f86645b.hashCode() + (this.f86644a.hashCode() * 31)) * 31;
            DisplayProperties displayProperties = this.f86646c;
            int iHashCode2 = (iHashCode + (displayProperties == null ? 0 : displayProperties.hashCode())) * 31;
            Disclaimer disclaimer = this.d;
            int iHashCode3 = (this.e.hashCode() + ((iHashCode2 + (disclaimer == null ? 0 : disclaimer.hashCode())) * 31)) * 31;
            String str = this.f;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f86644a, dest);
            while (itY.hasNext()) {
                ((RateTier) itY.next()).writeToParcel(dest, i);
            }
            this.f86645b.writeToParcel(dest, i);
            DisplayProperties displayProperties = this.f86646c;
            if (displayProperties == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                displayProperties.writeToParcel(dest, i);
            }
            Disclaimer disclaimer = this.d;
            if (disclaimer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                disclaimer.writeToParcel(dest, i);
            }
            this.e.writeToParcel(dest, i);
            dest.writeString(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Limit;", "Landroid/os/Parcelable;", "MaxCurrentUsagesLimit", "MaxCurrentBalanceLimit", "MinCurrentBalanceLimit", "MaxTopUpsLimit", "Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Limit$MaxCurrentBalanceLimit;", "Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Limit$MaxCurrentUsagesLimit;", "Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Limit$MaxTopUpsLimit;", "Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Limit$MinCurrentBalanceLimit;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Limit extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Limit$MaxCurrentBalanceLimit;", "Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Limit;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MaxCurrentBalanceLimit implements Limit {

            @NotNull
            public static final Parcelable.Creator<MaxCurrentBalanceLimit> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final dj0.d f86655a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new MaxCurrentBalanceLimit((dj0.d) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MaxCurrentBalanceLimit[i];
                }
            }

            public MaxCurrentBalanceLimit(dj0.d balance) {
                Intrinsics.checkNotNullParameter(balance, "balance");
                this.f86655a = balance;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof MaxCurrentBalanceLimit) && Intrinsics.f(this.f86655a, ((MaxCurrentBalanceLimit) obj2).f86655a);
            }

            public final int hashCode() {
                return this.f86655a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f86655a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Limit$MaxCurrentUsagesLimit;", "Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Limit;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MaxCurrentUsagesLimit implements Limit {

            @NotNull
            public static final Parcelable.Creator<MaxCurrentUsagesLimit> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f86656a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new MaxCurrentUsagesLimit(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MaxCurrentUsagesLimit[i];
                }
            }

            public MaxCurrentUsagesLimit(int i) {
                this.f86656a = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof MaxCurrentUsagesLimit) && this.f86656a == ((MaxCurrentUsagesLimit) obj2).f86656a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f86656a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f86656a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Limit$MaxTopUpsLimit;", "Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Limit;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MaxTopUpsLimit implements Limit {

            @NotNull
            public static final Parcelable.Creator<MaxTopUpsLimit> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f86657a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new MaxTopUpsLimit(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MaxTopUpsLimit[i];
                }
            }

            public MaxTopUpsLimit(int i) {
                this.f86657a = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof MaxTopUpsLimit) && this.f86657a == ((MaxTopUpsLimit) obj2).f86657a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f86657a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f86657a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Limit$MinCurrentBalanceLimit;", "Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Limit;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MinCurrentBalanceLimit implements Limit {

            @NotNull
            public static final Parcelable.Creator<MinCurrentBalanceLimit> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final dj0.d f86658a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new MinCurrentBalanceLimit((dj0.d) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MinCurrentBalanceLimit[i];
                }
            }

            public MinCurrentBalanceLimit(dj0.d balance) {
                Intrinsics.checkNotNullParameter(balance, "balance");
                this.f86658a = balance;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof MinCurrentBalanceLimit) && Intrinsics.f(this.f86658a, ((MinCurrentBalanceLimit) obj2).f86658a);
            }

            public final int hashCode() {
                return this.f86658a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f86658a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$ProductRestriction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/shared/savings/models/product/c", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductRestriction implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ProductRestriction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f86659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f86660b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductRestriction(c.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductRestriction[i];
            }
        }

        public ProductRestriction(c type, boolean z) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f86659a = type;
            this.f86660b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProductRestriction)) {
                return false;
            }
            ProductRestriction productRestriction = (ProductRestriction) obj2;
            return this.f86659a == productRestriction.f86659a && this.f86660b == productRestriction.f86660b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f86660b) + (this.f86659a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86659a.name());
            dest.writeInt(this.f86660b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Protection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Details", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Protection implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Protection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f86663c;
        public final String d;
        public final SavingsDocument e;
        public final Details f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Protection$Details;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Details implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Details> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86664a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f86665b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Details(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Details[i];
                }
            }

            public Details(String title, String deeplink) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.f86664a = title;
                this.f86665b = deeplink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Details)) {
                    return false;
                }
                Details details = (Details) obj2;
                return Intrinsics.f(this.f86664a, details.f86664a) && Intrinsics.f(this.f86665b, details.f86665b);
            }

            public final int hashCode() {
                return this.f86665b.hashCode() + (this.f86664a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86664a);
                dest.writeString(this.f86665b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Protection(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (SavingsDocument) parcel.readParcelable(Protection.class.getClassLoader()), parcel.readInt() == 0 ? null : Details.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Protection[i];
            }
        }

        public Protection(String title, String description, String str, String str2, SavingsDocument savingsDocument, Details details) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f86661a = title;
            this.f86662b = description;
            this.f86663c = str;
            this.d = str2;
            this.e = savingsDocument;
            this.f = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Protection)) {
                return false;
            }
            Protection protection = (Protection) obj2;
            return Intrinsics.f(this.f86661a, protection.f86661a) && Intrinsics.f(this.f86662b, protection.f86662b) && Intrinsics.f(this.f86663c, protection.f86663c) && Intrinsics.f(this.d, protection.d) && Intrinsics.f(this.e, protection.e) && Intrinsics.f(this.f, protection.f);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f86661a.hashCode() * 31, 31, this.f86662b);
            String str = this.f86663c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            SavingsDocument savingsDocument = this.e;
            int iHashCode3 = (iHashCode2 + (savingsDocument == null ? 0 : savingsDocument.hashCode())) * 31;
            Details details = this.f;
            return iHashCode3 + (details != null ? details.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86661a);
            dest.writeString(this.f86662b);
            dest.writeString(this.f86663c);
            dest.writeString(this.d);
            dest.writeParcelable(this.e, i);
            Details details = this.f;
            if (details == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                details.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Provider;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/shared/savings/models/product/d", "LegalInfo", "TradingEntity", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Provider implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Provider> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f86667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f86668c;
        public final String d;
        public final String e;
        public final Explanation f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final LegalInfo f86669g;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Provider$LegalInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LegalInfo implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<LegalInfo> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86670a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TradingEntity f86671b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new LegalInfo(parcel.readString(), parcel.readInt() == 0 ? null : TradingEntity.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new LegalInfo[i];
                }
            }

            public LegalInfo(String str, TradingEntity tradingEntity) {
                this.f86670a = str;
                this.f86671b = tradingEntity;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof LegalInfo)) {
                    return false;
                }
                LegalInfo legalInfo = (LegalInfo) obj2;
                return Intrinsics.f(this.f86670a, legalInfo.f86670a) && Intrinsics.f(this.f86671b, legalInfo.f86671b);
            }

            public final int hashCode() {
                String str = this.f86670a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                TradingEntity tradingEntity = this.f86671b;
                return iHashCode + (tradingEntity != null ? tradingEntity.f86672a.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86670a);
                TradingEntity tradingEntity = this.f86671b;
                if (tradingEntity == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    tradingEntity.writeToParcel(dest, i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Provider$TradingEntity;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TradingEntity implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<TradingEntity> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86672a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new TradingEntity(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TradingEntity[i];
                }
            }

            public TradingEntity(String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                this.f86672a = name;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof TradingEntity) && Intrinsics.f(this.f86672a, ((TradingEntity) obj2).f86672a);
            }

            public final int hashCode() {
                return this.f86672a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86672a);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Provider(parcel.readString(), l.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Explanation.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LegalInfo.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Provider[i];
            }
        }

        public Provider(String id10, l type, String str, String name, String str2, Explanation explanation, LegalInfo legalInfo) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(name, "name");
            this.f86666a = id10;
            this.f86667b = type;
            this.f86668c = str;
            this.d = name;
            this.e = str2;
            this.f = explanation;
            this.f86669g = legalInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Provider)) {
                return false;
            }
            Provider provider = (Provider) obj2;
            return Intrinsics.f(this.f86666a, provider.f86666a) && this.f86667b == provider.f86667b && Intrinsics.f(this.f86668c, provider.f86668c) && Intrinsics.f(this.d, provider.d) && Intrinsics.f(this.e, provider.e) && Intrinsics.f(this.f, provider.f) && Intrinsics.f(this.f86669g, provider.f86669g);
        }

        public final int hashCode() {
            int iHashCode = (this.f86667b.hashCode() + (this.f86666a.hashCode() * 31)) * 31;
            String str = this.f86668c;
            int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            String str2 = this.e;
            int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            Explanation explanation = this.f;
            int iHashCode3 = (iHashCode2 + (explanation == null ? 0 : explanation.hashCode())) * 31;
            LegalInfo legalInfo = this.f86669g;
            return iHashCode3 + (legalInfo != null ? legalInfo.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86666a);
            dest.writeString(this.f86667b.name());
            dest.writeString(this.f86668c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            Explanation explanation = this.f;
            if (explanation == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                explanation.writeToParcel(dest, i);
            }
            LegalInfo legalInfo = this.f86669g;
            if (legalInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                legalInfo.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Schedules;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Interest", "com/revolut/feature/shared/savings/models/product/e", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Schedules implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Schedules> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Interest f86673a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Schedules$Interest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Interest implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Interest> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86674a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final e f86675b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final e f86676c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Interest(parcel.readString(), e.valueOf(parcel.readString()), e.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Interest[i];
                }
            }

            public Interest(String str, e accrual, e payout) {
                Intrinsics.checkNotNullParameter(accrual, "accrual");
                Intrinsics.checkNotNullParameter(payout, "payout");
                this.f86674a = str;
                this.f86675b = accrual;
                this.f86676c = payout;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Interest)) {
                    return false;
                }
                Interest interest = (Interest) obj2;
                return Intrinsics.f(this.f86674a, interest.f86674a) && this.f86675b == interest.f86675b && this.f86676c == interest.f86676c;
            }

            public final int hashCode() {
                String str = this.f86674a;
                return this.f86676c.hashCode() + ((this.f86675b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86674a);
                dest.writeString(this.f86675b.name());
                dest.writeString(this.f86676c.name());
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Schedules(Interest.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Schedules[i];
            }
        }

        public Schedules(Interest interest) {
            Intrinsics.checkNotNullParameter(interest, "interest");
            this.f86673a = interest;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Schedules) && Intrinsics.f(this.f86673a, ((Schedules) obj2).f86673a);
        }

        public final int hashCode() {
            return this.f86673a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f86673a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Term;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Maturity", "Funding", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Term implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Term> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Maturity f86678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Funding f86679c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Term$Funding;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Funding implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Funding> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86680a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Funding(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Funding[i];
                }
            }

            public Funding(String str) {
                this.f86680a = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Funding) && Intrinsics.f(this.f86680a, ((Funding) obj2).f86680a);
            }

            public final int hashCode() {
                String str = this.f86680a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86680a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProduct$Term$Maturity;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Maturity implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Maturity> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86681a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f86682b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Maturity(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Maturity[i];
                }
            }

            public Maturity(String period, String explanationDeeplink) {
                Intrinsics.checkNotNullParameter(period, "period");
                Intrinsics.checkNotNullParameter(explanationDeeplink, "explanationDeeplink");
                this.f86681a = period;
                this.f86682b = explanationDeeplink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Maturity)) {
                    return false;
                }
                Maturity maturity = (Maturity) obj2;
                return Intrinsics.f(this.f86681a, maturity.f86681a) && Intrinsics.f(this.f86682b, maturity.f86682b);
            }

            public final int hashCode() {
                return this.f86682b.hashCode() + (this.f86681a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86681a);
                dest.writeString(this.f86682b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Term(parcel.readString(), Maturity.CREATOR.createFromParcel(parcel), Funding.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Term[i];
            }
        }

        public Term(String title, Maturity maturity, Funding funding) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(maturity, "maturity");
            Intrinsics.checkNotNullParameter(funding, "funding");
            this.f86677a = title;
            this.f86678b = maturity;
            this.f86679c = funding;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Term)) {
                return false;
            }
            Term term = (Term) obj2;
            return Intrinsics.f(this.f86677a, term.f86677a) && Intrinsics.f(this.f86678b, term.f86678b) && Intrinsics.f(this.f86679c, term.f86679c);
        }

        public final int hashCode() {
            return this.f86679c.hashCode() + ((this.f86678b.hashCode() + (this.f86677a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86677a);
            this.f86678b.writeToParcel(dest, i);
            this.f86679c.writeToParcel(dest, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            String str;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            xi0.b bVar = (xi0.b) parcel.readSerializable();
            g gVarValueOf = g.valueOf(parcel.readString());
            m mVarValueOf = m.valueOf(parcel.readString());
            Provider providerCreateFromParcel = parcel.readInt() == 0 ? null : Provider.CREATOR.createFromParcel(parcel);
            Protection protectionCreateFromParcel = parcel.readInt() == 0 ? null : Protection.CREATOR.createFromParcel(parcel);
            Schedules schedulesCreateFromParcel = Schedules.CREATOR.createFromParcel(parcel);
            InterestRate interestRateCreateFromParcel = InterestRate.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Deduction.CREATOR, parcel, arrayList, iA, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iA2 = 0;
            while (iA2 != i2) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(Deduction.CREATOR, parcel, arrayList2, iA2, 1);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            int iE = 0;
            while (iE != i3) {
                iE = j6.a.e(SavingsProduct.class, parcel, arrayList3, iE, 1);
            }
            int i5 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i5);
            int iE2 = 0;
            while (iE2 != i5) {
                iE2 = j6.a.e(SavingsProduct.class, parcel, arrayList4, iE2, 1);
            }
            LocalDateTime localDateTime = (LocalDateTime) parcel.readSerializable();
            Campaign campaignCreateFromParcel = parcel.readInt() == 0 ? null : Campaign.CREATOR.createFromParcel(parcel);
            String str2 = string;
            String string3 = parcel.readString();
            xi0.b bVar2 = bVar;
            String string4 = parcel.readString();
            h hVarValueOf = h.valueOf(parcel.readString());
            int i6 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i6);
            int iA3 = 0;
            while (true) {
                str = str2;
                if (iA3 == i6) {
                    break;
                }
                iA3 = org.bouncycastle.jcajce.provider.digest.a.a(ProductRestriction.CREATOR, parcel, arrayList5, iA3, 1);
                str2 = str;
                bVar2 = bVar2;
            }
            return new SavingsProduct(str, bVar2, gVarValueOf, mVarValueOf, providerCreateFromParcel, protectionCreateFromParcel, schedulesCreateFromParcel, interestRateCreateFromParcel, string2, arrayList, arrayList2, arrayList3, arrayList4, localDateTime, campaignCreateFromParcel, string3, string4, hVarValueOf, arrayList5, parcel.readInt() == 0 ? null : DepositLimits.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Disclaimers.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Term.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SavingsProduct[i];
        }
    }

    public SavingsProduct(String id10, xi0.b currency, g groupType, m state, Provider provider, Protection protection, Schedules schedules, InterestRate interestRate, String str, ArrayList fees, ArrayList taxes, ArrayList limits, ArrayList documents, LocalDateTime localDateTime, Campaign campaign, String str2, String displayName, h accountType, List restrictions, DepositLimits depositLimits, Disclaimers disclaimers, Term term) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(schedules, "schedules");
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(restrictions, "restrictions");
        this.f86617a = id10;
        this.f86618b = currency;
        this.f86619c = groupType;
        this.d = state;
        this.e = provider;
        this.f = protection;
        this.f86620g = schedules;
        this.f86621h = interestRate;
        this.i = str;
        this.f86622j = fees;
        this.k = taxes;
        this.f86623l = limits;
        this.f86624m = documents;
        this.f86625n = localDateTime;
        this.o = campaign;
        this.f86626p = str2;
        this.f86627q = displayName;
        this.f86628r = accountType;
        this.f86629s = restrictions;
        this.f86630t = depositLimits;
        this.u = disclaimers;
        this.v = term;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SavingsProduct)) {
            return false;
        }
        SavingsProduct savingsProduct = (SavingsProduct) obj2;
        return Intrinsics.f(this.f86617a, savingsProduct.f86617a) && Intrinsics.f(this.f86618b, savingsProduct.f86618b) && this.f86619c == savingsProduct.f86619c && this.d == savingsProduct.d && Intrinsics.f(this.e, savingsProduct.e) && Intrinsics.f(this.f, savingsProduct.f) && Intrinsics.f(this.f86620g, savingsProduct.f86620g) && Intrinsics.f(this.f86621h, savingsProduct.f86621h) && Intrinsics.f(this.i, savingsProduct.i) && this.f86622j.equals(savingsProduct.f86622j) && this.k.equals(savingsProduct.k) && this.f86623l.equals(savingsProduct.f86623l) && this.f86624m.equals(savingsProduct.f86624m) && Intrinsics.f(this.f86625n, savingsProduct.f86625n) && Intrinsics.f(this.o, savingsProduct.o) && Intrinsics.f(this.f86626p, savingsProduct.f86626p) && Intrinsics.f(this.f86627q, savingsProduct.f86627q) && this.f86628r == savingsProduct.f86628r && Intrinsics.f(this.f86629s, savingsProduct.f86629s) && Intrinsics.f(this.f86630t, savingsProduct.f86630t) && Intrinsics.f(this.u, savingsProduct.u) && Intrinsics.f(this.v, savingsProduct.v);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f86619c.hashCode() + h30.l.j(this.f86618b, this.f86617a.hashCode() * 31, 31)) * 31)) * 31;
        Provider provider = this.e;
        int iHashCode2 = (iHashCode + (provider == null ? 0 : provider.hashCode())) * 31;
        Protection protection = this.f;
        int iHashCode3 = (this.f86621h.hashCode() + ((this.f86620g.f86673a.hashCode() + ((iHashCode2 + (protection == null ? 0 : protection.hashCode())) * 31)) * 31)) * 31;
        String str = this.i;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f86624m, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f86623l, com.google.android.gms.internal.mlkit_vision_face.a.b(this.k, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f86622j, (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31);
        LocalDateTime localDateTime = this.f86625n;
        int iHashCode4 = (iB + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        Campaign campaign = this.o;
        int iHashCode5 = (iHashCode4 + (campaign == null ? 0 : campaign.hashCode())) * 31;
        String str2 = this.f86626p;
        int iD = p.a.d((this.f86628r.hashCode() + p.a.c((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f86627q)) * 31, 31, this.f86629s);
        DepositLimits depositLimits = this.f86630t;
        int iHashCode6 = (iD + (depositLimits == null ? 0 : depositLimits.hashCode())) * 31;
        Disclaimers disclaimers = this.u;
        int iHashCode7 = (iHashCode6 + (disclaimers == null ? 0 : disclaimers.hashCode())) * 31;
        Term term = this.v;
        return iHashCode7 + (term != null ? term.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86617a);
        dest.writeSerializable(this.f86618b);
        dest.writeString(this.f86619c.name());
        dest.writeString(this.d.name());
        Provider provider = this.e;
        if (provider == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            provider.writeToParcel(dest, i);
        }
        Protection protection = this.f;
        if (protection == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            protection.writeToParcel(dest, i);
        }
        this.f86620g.writeToParcel(dest, i);
        this.f86621h.writeToParcel(dest, i);
        dest.writeString(this.i);
        Iterator itY = j6.a.y(this.f86622j, dest);
        while (itY.hasNext()) {
            ((Deduction) itY.next()).writeToParcel(dest, i);
        }
        Iterator itY2 = j6.a.y(this.k, dest);
        while (itY2.hasNext()) {
            ((Deduction) itY2.next()).writeToParcel(dest, i);
        }
        Iterator itY3 = j6.a.y(this.f86623l, dest);
        while (itY3.hasNext()) {
            dest.writeParcelable((Parcelable) itY3.next(), i);
        }
        Iterator itY4 = j6.a.y(this.f86624m, dest);
        while (itY4.hasNext()) {
            dest.writeParcelable((Parcelable) itY4.next(), i);
        }
        dest.writeSerializable(this.f86625n);
        Campaign campaign = this.o;
        if (campaign == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            campaign.writeToParcel(dest, i);
        }
        dest.writeString(this.f86626p);
        dest.writeString(this.f86627q);
        dest.writeString(this.f86628r.name());
        Iterator itV = p.a.v(this.f86629s, dest);
        while (itV.hasNext()) {
            ((ProductRestriction) itV.next()).writeToParcel(dest, i);
        }
        DepositLimits depositLimits = this.f86630t;
        if (depositLimits == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            depositLimits.writeToParcel(dest, i);
        }
        Disclaimers disclaimers = this.u;
        if (disclaimers == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            disclaimers.writeToParcel(dest, i);
        }
        Term term = this.v;
        if (term == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            term.writeToParcel(dest, i);
        }
    }
}
