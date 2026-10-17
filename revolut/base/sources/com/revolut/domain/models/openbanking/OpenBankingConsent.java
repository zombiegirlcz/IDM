package com.revolut.domain.models.openbanking;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/domain/models/openbanking/OpenBankingConsent;", "Landroid/os/Parcelable;", "<init>", "()V", "Default", "Australia", "Lcom/revolut/domain/models/openbanking/OpenBankingConsent$Australia;", "Lcom/revolut/domain/models/openbanking/OpenBankingConsent$Default;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OpenBankingConsent implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/domain/models/openbanking/OpenBankingConsent$Australia;", "Lcom/revolut/domain/models/openbanking/OpenBankingConsent;", "", "toString", "()Ljava/lang/String;", "ConsentState", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Australia extends OpenBankingConsent {

        @NotNull
        public static final Parcelable.Creator<Australia> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConsentType f60376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DateTime f60377c;
        public final ArrayList d;
        public final ThirdParty e;
        public final ConsentState f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final DateTime f60378g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final DateTime f60379h;
        public final List i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List f60380j;
        public final DateTime k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final List f60381l;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/domain/models/openbanking/OpenBankingConsent$Australia$ConsentState;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "REVOKED", "EXPIRED", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ConsentState {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ConsentState[] $VALUES;
            public static final ConsentState ACTIVE = new ConsentState("ACTIVE", 0);
            public static final ConsentState REVOKED = new ConsentState("REVOKED", 1);
            public static final ConsentState EXPIRED = new ConsentState("EXPIRED", 2);

            private static final /* synthetic */ ConsentState[] $values() {
                return new ConsentState[]{ACTIVE, REVOKED, EXPIRED};
            }

            static {
                ConsentState[] consentStateArr$values = $values();
                $VALUES = consentStateArr$values;
                $ENTRIES = s.n(consentStateArr$values);
            }

            private ConsentState(String str, int i) {
            }

            @NotNull
            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static ConsentState valueOf(String str) {
                return (ConsentState) Enum.valueOf(ConsentState.class, str);
            }

            public static ConsentState[] values() {
                return (ConsentState[]) $VALUES.clone();
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                ConsentType consentTypeValueOf = ConsentType.valueOf(parcel.readString());
                DateTime dateTime = (DateTime) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PermissionType.valueOf(parcel.readString()));
                }
                ThirdParty thirdPartyCreateFromParcel = ThirdParty.CREATOR.createFromParcel(parcel);
                ConsentState consentStateValueOf = ConsentState.valueOf(parcel.readString());
                DateTime dateTime2 = (DateTime) parcel.readSerializable();
                DateTime dateTime3 = (DateTime) parcel.readSerializable();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                DateTime dateTime4 = (DateTime) parcel.readSerializable();
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i5 = 0; i5 != i3; i5++) {
                    arrayList2.add(AmendmentType.valueOf(parcel.readString()));
                }
                return new Australia(string, consentTypeValueOf, dateTime, arrayList, thirdPartyCreateFromParcel, consentStateValueOf, dateTime2, dateTime3, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, dateTime4, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Australia[i];
            }
        }

        public Australia(String id10, ConsentType type, DateTime dateTime, ArrayList permissions, ThirdParty thirdParty, ConsentState state, DateTime dateTime2, DateTime dateTime3, List pockets, List loans, DateTime dateTime4, List amendedData) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            Intrinsics.checkNotNullParameter(thirdParty, "thirdParty");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(pockets, "pockets");
            Intrinsics.checkNotNullParameter(loans, "loans");
            Intrinsics.checkNotNullParameter(amendedData, "amendedData");
            this.f60375a = id10;
            this.f60376b = type;
            this.f60377c = dateTime;
            this.d = permissions;
            this.e = thirdParty;
            this.f = state;
            this.f60378g = dateTime2;
            this.f60379h = dateTime3;
            this.i = pockets;
            this.f60380j = loans;
            this.k = dateTime4;
            this.f60381l = amendedData;
        }

        @Override // com.revolut.domain.models.openbanking.OpenBankingConsent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ConsentType getF60383b() {
            return this.f60376b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Australia)) {
                return false;
            }
            Australia australia = (Australia) obj2;
            return Intrinsics.f(this.f60375a, australia.f60375a) && this.f60376b == australia.f60376b && Intrinsics.f(this.f60377c, australia.f60377c) && this.d.equals(australia.d) && Intrinsics.f(this.e, australia.e) && this.f == australia.f && Intrinsics.f(this.f60378g, australia.f60378g) && Intrinsics.f(this.f60379h, australia.f60379h) && Intrinsics.f(this.i, australia.i) && Intrinsics.f(this.f60380j, australia.f60380j) && Intrinsics.f(this.k, australia.k) && Intrinsics.f(this.f60381l, australia.f60381l);
        }

        @Override // com.revolut.domain.models.openbanking.OpenBankingConsent
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF60382a() {
            return this.f60375a;
        }

        public final int hashCode() {
            int iHashCode = (this.f60376b.hashCode() + (this.f60375a.hashCode() * 31)) * 31;
            DateTime dateTime = this.f60377c;
            int iHashCode2 = (this.f.hashCode() + ((this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31, 31)) * 31)) * 31;
            DateTime dateTime2 = this.f60378g;
            int iHashCode3 = (iHashCode2 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
            DateTime dateTime3 = this.f60379h;
            int iD = p.a.d(p.a.d((iHashCode3 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31, 31, this.i), 31, this.f60380j);
            DateTime dateTime4 = this.k;
            return this.f60381l.hashCode() + ((iD + (dateTime4 != null ? dateTime4.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60375a);
            dest.writeString(this.f60376b.name());
            dest.writeSerializable(this.f60377c);
            Iterator itY = j6.a.y(this.d, dest);
            while (itY.hasNext()) {
                dest.writeString(((PermissionType) itY.next()).name());
            }
            this.e.writeToParcel(dest, i);
            dest.writeString(this.f.name());
            dest.writeSerializable(this.f60378g);
            dest.writeSerializable(this.f60379h);
            dest.writeStringList(this.i);
            dest.writeStringList(this.f60380j);
            dest.writeSerializable(this.k);
            Iterator itV = p.a.v(this.f60381l, dest);
            while (itV.hasNext()) {
                dest.writeString(((AmendmentType) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/openbanking/OpenBankingConsent$Default;", "Lcom/revolut/domain/models/openbanking/OpenBankingConsent;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Default extends OpenBankingConsent {

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConsentType f60383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DateTime f60384c;
        public final List d;
        public final ThirdParty e;
        public final List f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                ConsentType consentTypeValueOf = ConsentType.valueOf(parcel.readString());
                DateTime dateTime = (DateTime) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PermissionType.valueOf(parcel.readString()));
                }
                ThirdParty thirdPartyCreateFromParcel = ThirdParty.CREATOR.createFromParcel(parcel);
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                while (iA != i3) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(ConsentAccount.CREATOR, parcel, arrayList2, iA, 1);
                }
                return new Default(string, consentTypeValueOf, dateTime, arrayList, thirdPartyCreateFromParcel, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        public Default(String id10, ConsentType type, DateTime dateTime, List permissions, ThirdParty thirdParty, List accounts) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            Intrinsics.checkNotNullParameter(thirdParty, "thirdParty");
            Intrinsics.checkNotNullParameter(accounts, "accounts");
            this.f60382a = id10;
            this.f60383b = type;
            this.f60384c = dateTime;
            this.d = permissions;
            this.e = thirdParty;
            this.f = accounts;
        }

        @Override // com.revolut.domain.models.openbanking.OpenBankingConsent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ConsentType getF60383b() {
            return this.f60383b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Default)) {
                return false;
            }
            Default r56 = (Default) obj2;
            return Intrinsics.f(this.f60382a, r56.f60382a) && this.f60383b == r56.f60383b && Intrinsics.f(this.f60384c, r56.f60384c) && Intrinsics.f(this.d, r56.d) && Intrinsics.f(this.e, r56.e) && Intrinsics.f(this.f, r56.f);
        }

        @Override // com.revolut.domain.models.openbanking.OpenBankingConsent
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF60382a() {
            return this.f60382a;
        }

        public final int hashCode() {
            int iHashCode = (this.f60383b.hashCode() + (this.f60382a.hashCode() * 31)) * 31;
            DateTime dateTime = this.f60384c;
            return this.f.hashCode() + ((this.e.hashCode() + p.a.d((iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31, 31, this.d)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60382a);
            dest.writeString(this.f60383b.name());
            dest.writeSerializable(this.f60384c);
            Iterator itV = p.a.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeString(((PermissionType) itV.next()).name());
            }
            this.e.writeToParcel(dest, i);
            Iterator itV2 = p.a.v(this.f, dest);
            while (itV2.hasNext()) {
                ((ConsentAccount) itV2.next()).writeToParcel(dest, i);
            }
        }
    }

    private OpenBankingConsent() {
    }

    /* JADX INFO: renamed from: a */
    public abstract ConsentType getF60383b();

    /* JADX INFO: renamed from: getId */
    public abstract String getF60382a();
}
