package com.revolut.feature.insurance_credit.impl.data.model.coverages;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_credit.impl.data.model.BottomSheet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/coverages/CoverageDetailsLayout;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "RestrictionsSection", "Restriction", "Exclusions", "Disclaimer", "FooterButton", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CoverageDetailsLayout implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CoverageDetailsLayout> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75790c;
    public final List d;
    public final Exclusions e;
    public final Disclaimer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FooterButton f75791g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/coverages/CoverageDetailsLayout$Disclaimer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Disclaimer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Disclaimer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75792a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Disclaimer(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Disclaimer[i];
            }
        }

        public Disclaimer(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f75792a = text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Disclaimer) && Intrinsics.f(this.f75792a, ((Disclaimer) obj2).f75792a);
        }

        public final int hashCode() {
            return this.f75792a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75792a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/coverages/CoverageDetailsLayout$Exclusions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Exclusions implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Exclusions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f75794b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Exclusions(parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Exclusions[i];
            }
        }

        public Exclusions(String str, List items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f75793a = str;
            this.f75794b = items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Exclusions)) {
                return false;
            }
            Exclusions exclusions = (Exclusions) obj2;
            return Intrinsics.f(this.f75793a, exclusions.f75793a) && Intrinsics.f(this.f75794b, exclusions.f75794b);
        }

        public final int hashCode() {
            String str = this.f75793a;
            return this.f75794b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75793a);
            dest.writeStringList(this.f75794b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/coverages/CoverageDetailsLayout$FooterButton;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Action", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FooterButton implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FooterButton> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Action f75796b;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/coverages/CoverageDetailsLayout$FooterButton$Action;", "Landroid/os/Parcelable;", "<init>", "()V", "MakeClaim", "Lcom/revolut/feature/insurance_credit/impl/data/model/coverages/CoverageDetailsLayout$FooterButton$Action$MakeClaim;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class Action implements Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/coverages/CoverageDetailsLayout$FooterButton$Action$MakeClaim;", "Lcom/revolut/feature/insurance_credit/impl/data/model/coverages/CoverageDetailsLayout$FooterButton$Action;", "<init>", "()V", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class MakeClaim extends Action {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final MakeClaim f75797a = new MakeClaim();

                @NotNull
                public static final Parcelable.Creator<MakeClaim> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return MakeClaim.f75797a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new MakeClaim[i];
                    }
                }

                private MakeClaim() {
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }
            }

            private Action() {
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FooterButton(parcel.readString(), (Action) parcel.readParcelable(FooterButton.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FooterButton[i];
            }
        }

        public FooterButton(String text, Action action) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f75795a = text;
            this.f75796b = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FooterButton)) {
                return false;
            }
            FooterButton footerButton = (FooterButton) obj2;
            return Intrinsics.f(this.f75795a, footerButton.f75795a) && Intrinsics.f(this.f75796b, footerButton.f75796b);
        }

        public final int hashCode() {
            return this.f75796b.hashCode() + (this.f75795a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75795a);
            dest.writeParcelable(this.f75796b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/coverages/CoverageDetailsLayout$Restriction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Restriction implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Restriction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f75799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BottomSheet f75800c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Restriction(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BottomSheet.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Restriction[i];
            }
        }

        public Restriction(String title, String value, BottomSheet bottomSheet) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f75798a = title;
            this.f75799b = value;
            this.f75800c = bottomSheet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Restriction)) {
                return false;
            }
            Restriction restriction = (Restriction) obj2;
            return Intrinsics.f(this.f75798a, restriction.f75798a) && Intrinsics.f(this.f75799b, restriction.f75799b) && Intrinsics.f(this.f75800c, restriction.f75800c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f75798a.hashCode() * 31, 31, this.f75799b);
            BottomSheet bottomSheet = this.f75800c;
            return iC + (bottomSheet == null ? 0 : bottomSheet.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75798a);
            dest.writeString(this.f75799b);
            BottomSheet bottomSheet = this.f75800c;
            if (bottomSheet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                bottomSheet.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/coverages/CoverageDetailsLayout$RestrictionsSection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RestrictionsSection implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RestrictionsSection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f75802b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Restriction.CREATOR, parcel, arrayList, iA, 1);
                }
                return new RestrictionsSection(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RestrictionsSection[i];
            }
        }

        public RestrictionsSection(String str, ArrayList items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f75801a = str;
            this.f75802b = items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RestrictionsSection)) {
                return false;
            }
            RestrictionsSection restrictionsSection = (RestrictionsSection) obj2;
            return Intrinsics.f(this.f75801a, restrictionsSection.f75801a) && this.f75802b.equals(restrictionsSection.f75802b);
        }

        public final int hashCode() {
            String str = this.f75801a;
            return this.f75802b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75801a);
            Iterator itY = j6.a.y(this.f75802b, dest);
            while (itY.hasNext()) {
                ((Restriction) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(RestrictionsSection.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CoverageDetailsLayout(string, string2, string3, arrayList, parcel.readInt() == 0 ? null : Exclusions.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Disclaimer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FooterButton.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CoverageDetailsLayout[i];
        }
    }

    public CoverageDetailsLayout(String id10, String title, String str, List restrictions, Exclusions exclusions, Disclaimer disclaimer, FooterButton footerButton) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(restrictions, "restrictions");
        this.f75788a = id10;
        this.f75789b = title;
        this.f75790c = str;
        this.d = restrictions;
        this.e = exclusions;
        this.f = disclaimer;
        this.f75791g = footerButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CoverageDetailsLayout)) {
            return false;
        }
        CoverageDetailsLayout coverageDetailsLayout = (CoverageDetailsLayout) obj2;
        return Intrinsics.f(this.f75788a, coverageDetailsLayout.f75788a) && Intrinsics.f(this.f75789b, coverageDetailsLayout.f75789b) && Intrinsics.f(this.f75790c, coverageDetailsLayout.f75790c) && Intrinsics.f(this.d, coverageDetailsLayout.d) && Intrinsics.f(this.e, coverageDetailsLayout.e) && Intrinsics.f(this.f, coverageDetailsLayout.f) && Intrinsics.f(this.f75791g, coverageDetailsLayout.f75791g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f75788a.hashCode() * 31, 31, this.f75789b);
        String str = this.f75790c;
        int iD = p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        Exclusions exclusions = this.e;
        int iHashCode = (iD + (exclusions == null ? 0 : exclusions.hashCode())) * 31;
        Disclaimer disclaimer = this.f;
        int iHashCode2 = (iHashCode + (disclaimer == null ? 0 : disclaimer.f75792a.hashCode())) * 31;
        FooterButton footerButton = this.f75791g;
        return iHashCode2 + (footerButton != null ? footerButton.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75788a);
        dest.writeString(this.f75789b);
        dest.writeString(this.f75790c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            ((RestrictionsSection) itV.next()).writeToParcel(dest, i);
        }
        Exclusions exclusions = this.e;
        if (exclusions == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            exclusions.writeToParcel(dest, i);
        }
        Disclaimer disclaimer = this.f;
        if (disclaimer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            disclaimer.writeToParcel(dest, i);
        }
        FooterButton footerButton = this.f75791g;
        if (footerButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            footerButton.writeToParcel(dest, i);
        }
    }
}
