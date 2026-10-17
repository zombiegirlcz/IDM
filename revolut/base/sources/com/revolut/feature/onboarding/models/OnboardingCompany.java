package com.revolut.feature.onboarding.models;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import ip0.v7;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/models/OnboardingCompany;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnboardingCompany implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OnboardingCompany> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78600c;
    public final Set d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iD = 0;
            while (iD != i) {
                iD = v7.d(parcel, linkedHashSet, iD, 1);
            }
            return new OnboardingCompany(string, string2, linkedHashSet, string3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OnboardingCompany[i];
        }
    }

    public OnboardingCompany(String id10, String name, Set countries, String product) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(countries, "countries");
        this.f78598a = id10;
        this.f78599b = name;
        this.f78600c = product;
        this.d = countries;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OnboardingCompany)) {
            return false;
        }
        OnboardingCompany onboardingCompany = (OnboardingCompany) obj2;
        return Intrinsics.f(this.f78598a, onboardingCompany.f78598a) && Intrinsics.f(this.f78599b, onboardingCompany.f78599b) && Intrinsics.f(this.f78600c, onboardingCompany.f78600c) && Intrinsics.f(this.d, onboardingCompany.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f78598a.hashCode() * 31, 31, this.f78599b), 31, this.f78600c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78598a);
        dest.writeString(this.f78599b);
        dest.writeString(this.f78600c);
        Iterator itV = n.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
    }
}
