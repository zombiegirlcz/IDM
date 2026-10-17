package com.revolut.feature.security_hub.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qtc.b;
import qtc.c;
import qtc.d;
import qtc.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/DigitizedCard;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Merchant", "qtc/a", "qtc/b", "qtc/d", "qtc/c", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DigitizedCard implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DigitizedCard> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f85397c;
    public final long d;
    public final qtc.a e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f85398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Merchant f85399h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f85400j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f85401l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/DigitizedCard$Merchant;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Merchant implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Merchant> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f85403b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Merchant(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Merchant[i];
            }
        }

        public Merchant(String str, String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f85402a = str;
            this.f85403b = name;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Merchant)) {
                return false;
            }
            Merchant merchant = (Merchant) obj2;
            return Intrinsics.f(this.f85402a, merchant.f85402a) && Intrinsics.f(this.f85403b, merchant.f85403b);
        }

        public final int hashCode() {
            String str = this.f85402a;
            return this.f85403b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85402a);
            dest.writeString(this.f85403b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DigitizedCard(string, string2, boolValueOf, parcel.readLong(), qtc.a.valueOf(parcel.readString()), b.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Merchant.CREATOR.createFromParcel(parcel), d.valueOf(parcel.readString()), f.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0 ? c.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DigitizedCard[i];
        }
    }

    public DigitizedCard(String id10, String cardId, Boolean bool, long j2, qtc.a state, b deviceType, String str, Merchant merchant, d tokenType, f tokenRequestor, String tokenRequestorName, c cVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        Intrinsics.checkNotNullParameter(tokenRequestor, "tokenRequestor");
        Intrinsics.checkNotNullParameter(tokenRequestorName, "tokenRequestorName");
        this.f85395a = id10;
        this.f85396b = cardId;
        this.f85397c = bool;
        this.d = j2;
        this.e = state;
        this.f = deviceType;
        this.f85398g = str;
        this.f85399h = merchant;
        this.i = tokenType;
        this.f85400j = tokenRequestor;
        this.k = tokenRequestorName;
        this.f85401l = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DigitizedCard)) {
            return false;
        }
        DigitizedCard digitizedCard = (DigitizedCard) obj2;
        return Intrinsics.f(this.f85395a, digitizedCard.f85395a) && Intrinsics.f(this.f85396b, digitizedCard.f85396b) && Intrinsics.f(this.f85397c, digitizedCard.f85397c) && this.d == digitizedCard.d && this.e == digitizedCard.e && this.f == digitizedCard.f && Intrinsics.f(this.f85398g, digitizedCard.f85398g) && Intrinsics.f(this.f85399h, digitizedCard.f85399h) && this.i == digitizedCard.i && this.f85400j == digitizedCard.f85400j && Intrinsics.f(this.k, digitizedCard.k) && this.f85401l == digitizedCard.f85401l;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f85395a.hashCode() * 31, 31, this.f85396b);
        Boolean bool = this.f85397c;
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + a0.d.c((iC + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.d)) * 31)) * 31;
        String str = this.f85398g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Merchant merchant = this.f85399h;
        int iC2 = p.a.c((this.f85400j.hashCode() + ((this.i.hashCode() + ((iHashCode2 + (merchant == null ? 0 : merchant.hashCode())) * 31)) * 31)) * 31, 31, this.k);
        c cVar = this.f85401l;
        return iC2 + (cVar != null ? cVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85395a);
        dest.writeString(this.f85396b);
        Boolean bool = this.f85397c;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeLong(this.d);
        dest.writeString(this.e.name());
        dest.writeString(this.f.name());
        dest.writeString(this.f85398g);
        Merchant merchant = this.f85399h;
        if (merchant == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            merchant.writeToParcel(dest, i);
        }
        dest.writeString(this.i.name());
        dest.writeString(this.f85400j.name());
        dest.writeString(this.k);
        c cVar = this.f85401l;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
    }
}
