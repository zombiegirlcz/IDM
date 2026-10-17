package com.revolut.feature.referrals.common.data.api.domain.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/referrals/common/data/api/domain/model/common/Upsell;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Type", "Banner", "Modal", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Upsell implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Upsell> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f81780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f81781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f81782c;
    public final Banner d;
    public final Modal e;
    public final d f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/common/data/api/domain/model/common/Upsell$Banner;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Banner implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Banner> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81784b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Banner(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Banner[i];
            }
        }

        public Banner(String title, String description) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f81783a = title;
            this.f81784b = description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) obj2;
            return Intrinsics.f(this.f81783a, banner.f81783a) && Intrinsics.f(this.f81784b, banner.f81784b);
        }

        public final int hashCode() {
            return this.f81784b.hashCode() + (this.f81783a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81783a);
            dest.writeString(this.f81784b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/common/data/api/domain/model/common/Upsell$Modal;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Modal implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Modal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f81787c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Modal(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Modal[i];
            }
        }

        public Modal(String title, String stepsTitle, String str, String str2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(stepsTitle, "stepsTitle");
            this.f81785a = title;
            this.f81786b = stepsTitle;
            this.f81787c = str;
            this.d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Modal)) {
                return false;
            }
            Modal modal = (Modal) obj2;
            return Intrinsics.f(this.f81785a, modal.f81785a) && Intrinsics.f(this.f81786b, modal.f81786b) && Intrinsics.f(this.f81787c, modal.f81787c) && Intrinsics.f(this.d, modal.d);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f81785a.hashCode() * 31, 31, this.f81786b);
            String str = this.f81787c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81785a);
            dest.writeString(this.f81786b);
            dest.writeString(this.f81787c);
            dest.writeString(this.d);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/referrals/common/data/api/domain/model/common/Upsell$Type;", "Landroid/os/Parcelable;", "", "PRO", "CRYPTO", "INVEST", "CREDIT_CARD", "SAVINGS", "DEFAULT", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Type implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<Type> CREATOR;
        public static final Type CREDIT_CARD;
        public static final Type CRYPTO;
        public static final Type DEFAULT;
        public static final Type INVEST;
        public static final Type PRO;
        public static final Type SAVINGS;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Type.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Type[i];
            }
        }

        static {
            Type type = new Type("PRO", 0);
            PRO = type;
            Type type2 = new Type("CRYPTO", 1);
            CRYPTO = type2;
            Type type3 = new Type("INVEST", 2);
            INVEST = type3;
            Type type4 = new Type("CREDIT_CARD", 3);
            CREDIT_CARD = type4;
            Type type5 = new Type("SAVINGS", 4);
            SAVINGS = type5;
            Type type6 = new Type("DEFAULT", 5);
            DEFAULT = type6;
            Type[] typeArr = {type, type2, type3, type4, type5, type6};
            $VALUES = typeArr;
            $ENTRIES = s.n(typeArr);
            CREATOR = new a();
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Type typeCreateFromParcel = Type.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Step.CREATOR, parcel, arrayList, iA, 1);
            }
            return new Upsell(typeCreateFromParcel, numValueOf, arrayList, Banner.CREATOR.createFromParcel(parcel), Modal.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Upsell[i];
        }
    }

    public Upsell(Type type, Integer num, ArrayList steps, Banner banner, Modal modal, d reward) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(modal, "modal");
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f81780a = type;
        this.f81781b = num;
        this.f81782c = steps;
        this.d = banner;
        this.e = modal;
        this.f = reward;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Upsell)) {
            return false;
        }
        Upsell upsell = (Upsell) obj2;
        return this.f81780a == upsell.f81780a && Intrinsics.f(this.f81781b, upsell.f81781b) && this.f81782c.equals(upsell.f81782c) && Intrinsics.f(this.d, upsell.d) && Intrinsics.f(this.e, upsell.e) && Intrinsics.f(this.f, upsell.f);
    }

    public final int hashCode() {
        int iHashCode = this.f81780a.hashCode() * 31;
        Integer num = this.f81781b;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f81782c, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f81780a.writeToParcel(dest, i);
        Integer num = this.f81781b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Iterator itY = j6.a.y(this.f81782c, dest);
        while (itY.hasNext()) {
            ((Step) itY.next()).writeToParcel(dest, i);
        }
        this.d.writeToParcel(dest, i);
        this.e.writeToParcel(dest, i);
        dest.writeSerializable(this.f);
    }
}
