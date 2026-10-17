package com.revolut.feature.extension_auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/extension_auth/api/model/AppChallengeOperation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Property", "feature_extension_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class AppChallengeOperation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AppChallengeOperation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f72172c;
    public final ArrayList d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/extension_auth/api/model/AppChallengeOperation$Property;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_extension_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @d
    public static final /* data */ class Property implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Property> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f72175c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Property(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Property[i];
            }
        }

        public Property(String name, String str, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f72173a = name;
            this.f72174b = str;
            this.f72175c = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Property)) {
                return false;
            }
            Property property = (Property) obj2;
            return Intrinsics.f(this.f72173a, property.f72173a) && Intrinsics.f(this.f72174b, property.f72174b) && Intrinsics.f(this.f72175c, property.f72175c);
        }

        public final int hashCode() {
            int iHashCode = this.f72173a.hashCode() * 31;
            String str = this.f72174b;
            return this.f72175c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72173a);
            dest.writeString(this.f72174b);
            dest.writeString(this.f72175c);
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
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Property.CREATOR, parcel, arrayList, iA, 1);
            }
            return new AppChallengeOperation(string, string2, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AppChallengeOperation[i];
        }
    }

    public AppChallengeOperation(String title, String subtitle, String str, ArrayList properties) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.f72170a = title;
        this.f72171b = subtitle;
        this.f72172c = str;
        this.d = properties;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AppChallengeOperation)) {
            return false;
        }
        AppChallengeOperation appChallengeOperation = (AppChallengeOperation) obj2;
        return Intrinsics.f(this.f72170a, appChallengeOperation.f72170a) && Intrinsics.f(this.f72171b, appChallengeOperation.f72171b) && Intrinsics.f(this.f72172c, appChallengeOperation.f72172c) && this.d.equals(appChallengeOperation.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f72170a.hashCode() * 31, 31, this.f72171b);
        String str = this.f72172c;
        return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72170a);
        dest.writeString(this.f72171b);
        dest.writeString(this.f72172c);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((Property) itY.next()).writeToParcel(dest, i);
        }
    }
}
