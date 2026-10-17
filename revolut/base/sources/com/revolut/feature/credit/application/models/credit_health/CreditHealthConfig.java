package com.revolut.feature.credit.application.models.credit_health;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/credit/application/models/credit_health/CreditHealthConfig;", "Landroid/os/Parcelable;", "<init>", "()V", "Simple", "Detailed", "Lcom/revolut/feature/credit/application/models/credit_health/CreditHealthConfig$Detailed;", "Lcom/revolut/feature/credit/application/models/credit_health/CreditHealthConfig$Simple;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditHealthConfig implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/models/credit_health/CreditHealthConfig$Detailed;", "Lcom/revolut/feature/credit/application/models/credit_health/CreditHealthConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Detailed extends CreditHealthConfig {

        @NotNull
        public static final Parcelable.Creator<Detailed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f66230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CreditHealthButton f66231c;
        public final CreditHealthButton d;
        public final List e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                Parcelable.Creator<CreditHealthButton> creator = CreditHealthButton.CREATOR;
                CreditHealthButton creditHealthButtonCreateFromParcel = creator.createFromParcel(parcel);
                CreditHealthButton creditHealthButtonCreateFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new Detailed(string, string2, creditHealthButtonCreateFromParcel, creditHealthButtonCreateFromParcel2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Detailed[i];
            }
        }

        public Detailed(String title, String description, CreditHealthButton primaryButton, CreditHealthButton creditHealthButton, ArrayList items) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
            Intrinsics.checkNotNullParameter(items, "items");
            this.f66229a = title;
            this.f66230b = description;
            this.f66231c = primaryButton;
            this.d = creditHealthButton;
            this.e = items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Detailed)) {
                return false;
            }
            Detailed detailed = (Detailed) obj2;
            return Intrinsics.f(this.f66229a, detailed.f66229a) && Intrinsics.f(this.f66230b, detailed.f66230b) && Intrinsics.f(this.f66231c, detailed.f66231c) && Intrinsics.f(this.d, detailed.d) && Intrinsics.f(this.e, detailed.e);
        }

        public final int hashCode() {
            int iHashCode = (this.f66231c.hashCode() + p.a.c(this.f66229a.hashCode() * 31, 31, this.f66230b)) * 31;
            CreditHealthButton creditHealthButton = this.d;
            return this.e.hashCode() + ((iHashCode + (creditHealthButton == null ? 0 : creditHealthButton.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66229a);
            dest.writeString(this.f66230b);
            this.f66231c.writeToParcel(dest, i);
            CreditHealthButton creditHealthButton = this.d;
            if (creditHealthButton == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                creditHealthButton.writeToParcel(dest, i);
            }
            Iterator itV = p.a.v(this.e, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/models/credit_health/CreditHealthConfig$Simple;", "Lcom/revolut/feature/credit/application/models/credit_health/CreditHealthConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Simple extends CreditHealthConfig {

        @NotNull
        public static final Parcelable.Creator<Simple> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f66233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CreditHealthButton f66234c;
        public final CreditHealthButton d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                Parcelable.Creator<CreditHealthButton> creator = CreditHealthButton.CREATOR;
                return new Simple(string, string2, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Simple[i];
            }
        }

        public Simple(String title, String description, CreditHealthButton primaryButton, CreditHealthButton creditHealthButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
            this.f66232a = title;
            this.f66233b = description;
            this.f66234c = primaryButton;
            this.d = creditHealthButton;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Simple)) {
                return false;
            }
            Simple simple = (Simple) obj2;
            return Intrinsics.f(this.f66232a, simple.f66232a) && Intrinsics.f(this.f66233b, simple.f66233b) && Intrinsics.f(this.f66234c, simple.f66234c) && Intrinsics.f(this.d, simple.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f66234c.hashCode() + p.a.c(this.f66232a.hashCode() * 31, 31, this.f66233b)) * 31;
            CreditHealthButton creditHealthButton = this.d;
            return iHashCode + (creditHealthButton == null ? 0 : creditHealthButton.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66232a);
            dest.writeString(this.f66233b);
            this.f66234c.writeToParcel(dest, i);
            CreditHealthButton creditHealthButton = this.d;
            if (creditHealthButton == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                creditHealthButton.writeToParcel(dest, i);
            }
        }
    }

    private CreditHealthConfig() {
    }
}
