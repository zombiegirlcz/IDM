package com.revolut.feature.lifestyle.core.api.model.savings;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y19.i;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/lifestyle/core/api/model/savings/LifestyleSavingsSummary$SavingsHighlight", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Cta", "feature_lifestyle_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LifestyleSavingsSummary$SavingsHighlight implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LifestyleSavingsSummary$SavingsHighlight> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78056c;
    public final boolean d;
    public final i e;
    public final Cta f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f78057g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/lifestyle/core/api/model/savings/LifestyleSavingsSummary$SavingsHighlight$Cta;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_lifestyle_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cta implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Cta> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f78059b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cta(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cta[i];
            }
        }

        public Cta(String title, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f78058a = title;
            this.f78059b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Cta)) {
                return false;
            }
            Cta cta2 = (Cta) obj2;
            return Intrinsics.f(this.f78058a, cta2.f78058a) && Intrinsics.f(this.f78059b, cta2.f78059b);
        }

        public final int hashCode() {
            int iHashCode = this.f78058a.hashCode() * 31;
            String str = this.f78059b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78058a);
            dest.writeString(this.f78059b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LifestyleSavingsSummary$SavingsHighlight(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, i.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Cta.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LifestyleSavingsSummary$SavingsHighlight[i];
        }
    }

    public LifestyleSavingsSummary$SavingsHighlight(String title, String subtitle, String backgroundImage, boolean z, i type, Cta cta2, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f78054a = title;
        this.f78055b = subtitle;
        this.f78056c = backgroundImage;
        this.d = z;
        this.e = type;
        this.f = cta2;
        this.f78057g = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LifestyleSavingsSummary$SavingsHighlight)) {
            return false;
        }
        LifestyleSavingsSummary$SavingsHighlight lifestyleSavingsSummary$SavingsHighlight = (LifestyleSavingsSummary$SavingsHighlight) obj2;
        return Intrinsics.f(this.f78054a, lifestyleSavingsSummary$SavingsHighlight.f78054a) && Intrinsics.f(this.f78055b, lifestyleSavingsSummary$SavingsHighlight.f78055b) && Intrinsics.f(this.f78056c, lifestyleSavingsSummary$SavingsHighlight.f78056c) && this.d == lifestyleSavingsSummary$SavingsHighlight.d && this.e == lifestyleSavingsSummary$SavingsHighlight.e && Intrinsics.f(this.f, lifestyleSavingsSummary$SavingsHighlight.f) && Intrinsics.f(this.f78057g, lifestyleSavingsSummary$SavingsHighlight.f78057g);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + j6.a.c(p.a.c(p.a.c(this.f78054a.hashCode() * 31, 31, this.f78055b), 31, this.f78056c), 31, this.d)) * 31;
        Cta cta2 = this.f;
        int iHashCode2 = (iHashCode + (cta2 == null ? 0 : cta2.hashCode())) * 31;
        String str = this.f78057g;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78054a);
        dest.writeString(this.f78055b);
        dest.writeString(this.f78056c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeString(this.e.name());
        Cta cta2 = this.f;
        if (cta2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cta2.writeToParcel(dest, i);
        }
        dest.writeString(this.f78057g);
    }
}
