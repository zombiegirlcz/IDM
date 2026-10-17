package com.revolut.domain.models.topup.methods;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.externalcards.CardholderVerificationStatus;
import io3.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yte.p;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod;", "Landroid/os/Parcelable;", "<init>", "()V", "StoredMethod", "AutoTopUpState", "OtherMethod", "SuggestedMethod", "Lcom/revolut/domain/models/topup/methods/TopupMethod$OtherMethod;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$SuggestedMethod;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TopupMethod implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$AutoTopUpState;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "State", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoTopUpState implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AutoTopUpState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final State f60439a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$AutoTopUpState$State;", "", "<init>", "(Ljava/lang/String;I)V", "AVAILABLE", "UNAVAILABLE", "ENABLED", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class State {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ State[] $VALUES;
            public static final State AVAILABLE = new State("AVAILABLE", 0);
            public static final State UNAVAILABLE = new State("UNAVAILABLE", 1);
            public static final State ENABLED = new State("ENABLED", 2);

            private static final /* synthetic */ State[] $values() {
                return new State[]{AVAILABLE, UNAVAILABLE, ENABLED};
            }

            static {
                State[] stateArr$values = $values();
                $VALUES = stateArr$values;
                $ENTRIES = s.n(stateArr$values);
            }

            private State(String str, int i) {
            }

            @NotNull
            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) $VALUES.clone();
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoTopUpState(State.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoTopUpState[i];
            }
        }

        public AutoTopUpState(State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.f60439a = state;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AutoTopUpState) && this.f60439a == ((AutoTopUpState) obj2).f60439a;
        }

        public final int hashCode() {
            return this.f60439a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60439a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$OtherMethod;", "Lcom/revolut/domain/models/topup/methods/TopupMethod;", "", "toString", "()Ljava/lang/String;", "AdditionalData", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OtherMethod extends TopupMethod {

        @NotNull
        public static final Parcelable.Creator<OtherMethod> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopupMethodType f60440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f60441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f60442c;
        public final io3.b d;
        public final List e;
        public final List f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f60443g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AdditionalData f60444h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$OtherMethod$AdditionalData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "SupportedInstitutions", "SupportedInstitution", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AdditionalData implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<AdditionalData> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SupportedInstitutions f60445a;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$OtherMethod$AdditionalData$SupportedInstitution;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class SupportedInstitution implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<SupportedInstitution> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final io3.b f60446a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new SupportedInstitution((io3.b) parcel.readSerializable());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new SupportedInstitution[i];
                    }
                }

                public SupportedInstitution(io3.b bVar) {
                    this.f60446a = bVar;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof SupportedInstitution) && Intrinsics.f(this.f60446a, ((SupportedInstitution) obj2).f60446a);
                }

                public final int hashCode() {
                    io3.b bVar = this.f60446a;
                    if (bVar == null) {
                        return 0;
                    }
                    return bVar.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f60446a);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$OtherMethod$AdditionalData$SupportedInstitutions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class SupportedInstitutions implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<SupportedInstitutions> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f60447a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ArrayList f60448b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        int i = parcel.readInt();
                        int i2 = parcel.readInt();
                        ArrayList arrayList = new ArrayList(i2);
                        int iA = 0;
                        while (iA != i2) {
                            iA = org.bouncycastle.jcajce.provider.digest.a.a(SupportedInstitution.CREATOR, parcel, arrayList, iA, 1);
                        }
                        return new SupportedInstitutions(i, arrayList);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new SupportedInstitutions[i];
                    }
                }

                public SupportedInstitutions(int i, ArrayList institutions) {
                    Intrinsics.checkNotNullParameter(institutions, "institutions");
                    this.f60447a = i;
                    this.f60448b = institutions;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof SupportedInstitutions)) {
                        return false;
                    }
                    SupportedInstitutions supportedInstitutions = (SupportedInstitutions) obj2;
                    return this.f60447a == supportedInstitutions.f60447a && this.f60448b.equals(supportedInstitutions.f60448b);
                }

                public final int hashCode() {
                    return this.f60448b.hashCode() + (Integer.hashCode(this.f60447a) * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(this.f60447a);
                    Iterator itY = j6.a.y(this.f60448b, dest);
                    while (itY.hasNext()) {
                        ((SupportedInstitution) itY.next()).writeToParcel(dest, i);
                    }
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AdditionalData(parcel.readInt() == 0 ? null : SupportedInstitutions.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AdditionalData[i];
                }
            }

            public AdditionalData(SupportedInstitutions supportedInstitutions) {
                this.f60445a = supportedInstitutions;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof AdditionalData) && Intrinsics.f(this.f60445a, ((AdditionalData) obj2).f60445a);
            }

            public final int hashCode() {
                SupportedInstitutions supportedInstitutions = this.f60445a;
                if (supportedInstitutions == null) {
                    return 0;
                }
                return supportedInstitutions.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                SupportedInstitutions supportedInstitutions = this.f60445a;
                if (supportedInstitutions == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    supportedInstitutions.writeToParcel(dest, i);
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                String string;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                TopupMethodType topupMethodTypeValueOf = TopupMethodType.valueOf(parcel.readString());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                io3.b bVar = (io3.b) parcel.readSerializable();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int i2 = 0;
                while (true) {
                    string = parcel.readString();
                    if (i2 == i) {
                        break;
                    }
                    arrayList.add(p.valueOf(string));
                    i2++;
                }
                return new OtherMethod(topupMethodTypeValueOf, string2, string3, bVar, arrayListCreateStringArrayList, arrayList, string, parcel.readInt() == 0 ? null : AdditionalData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OtherMethod[i];
            }
        }

        public OtherMethod(TopupMethodType type, String title, String str, io3.b bVar, List supportedCurrencyCodes, List tags, String str2, AdditionalData additionalData) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(supportedCurrencyCodes, "supportedCurrencyCodes");
            Intrinsics.checkNotNullParameter(tags, "tags");
            this.f60440a = type;
            this.f60441b = title;
            this.f60442c = str;
            this.d = bVar;
            this.e = supportedCurrencyCodes;
            this.f = tags;
            this.f60443g = str2;
            this.f60444h = additionalData;
        }

        @Override // com.revolut.domain.models.topup.methods.TopupMethod
        /* JADX INFO: renamed from: F, reason: from getter */
        public final io3.b getE() {
            return this.d;
        }

        @Override // com.revolut.domain.models.topup.methods.TopupMethod
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF60523g() {
            return this.f60443g;
        }

        @Override // com.revolut.domain.models.topup.methods.TopupMethod
        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getF() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OtherMethod)) {
                return false;
            }
            OtherMethod otherMethod = (OtherMethod) obj2;
            return this.f60440a == otherMethod.f60440a && Intrinsics.f(this.f60441b, otherMethod.f60441b) && Intrinsics.f(this.f60442c, otherMethod.f60442c) && Intrinsics.f(this.d, otherMethod.d) && Intrinsics.f(this.e, otherMethod.e) && Intrinsics.f(this.f, otherMethod.f) && Intrinsics.f(this.f60443g, otherMethod.f60443g) && Intrinsics.f(this.f60444h, otherMethod.f60444h);
        }

        @Override // com.revolut.domain.models.topup.methods.TopupMethod
        /* JADX INFO: renamed from: getDescription, reason: from getter */
        public final String getD() {
            return this.f60442c;
        }

        @Override // com.revolut.domain.models.topup.methods.TopupMethod
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF60522c() {
            return this.f60441b;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f60440a.hashCode() * 31, 31, this.f60441b);
            String str = this.f60442c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            io3.b bVar = this.d;
            int iD = p.a.d(p.a.d((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.e), 31, this.f);
            String str2 = this.f60443g;
            int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
            AdditionalData additionalData = this.f60444h;
            return iHashCode2 + (additionalData != null ? additionalData.hashCode() : 0);
        }

        @Override // com.revolut.domain.models.topup.methods.TopupMethod
        /* JADX INFO: renamed from: p, reason: from getter */
        public final List getF60508a() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60440a.name());
            dest.writeString(this.f60441b);
            dest.writeString(this.f60442c);
            dest.writeSerializable(this.d);
            dest.writeStringList(this.e);
            Iterator itV = p.a.v(this.f, dest);
            while (itV.hasNext()) {
                dest.writeString(((p) itV.next()).name());
            }
            dest.writeString(this.f60443g);
            AdditionalData additionalData = this.f60444h;
            if (additionalData == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                additionalData.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod;", "Lcom/revolut/domain/models/topup/methods/TopupMethod;", "<init>", "()V", "LogoBadge", "Outage", "Card", "Openbanking", "PayTo", "UpiApp", "NetBanking", "PixSmartTransfer", "Akahu", "GmoPgBankDirect", "Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod$Akahu;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod$Card;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod$GmoPgBankDirect;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod$NetBanking;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod$Openbanking;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod$PayTo;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod$PixSmartTransfer;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod$UpiApp;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class StoredMethod extends TopupMethod {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod$Akahu;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Akahu extends StoredMethod {

            @NotNull
            public static final Parcelable.Creator<Akahu> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f60449a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f60450b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f60451c;
            public final io3.b d;
            public final LogoBadge e;
            public final List f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Outage f60452g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final List f60453h;
            public final String i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final OpenbankingMethodState f60454j;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    io3.b bVar = (io3.b) parcel.readSerializable();
                    LogoBadge logoBadgeCreateFromParcel = parcel.readInt() == 0 ? null : LogoBadge.CREATOR.createFromParcel(parcel);
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    Outage outageCreateFromParcel = parcel.readInt() != 0 ? Outage.CREATOR.createFromParcel(parcel) : null;
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int i2 = 0;
                    while (true) {
                        String string4 = parcel.readString();
                        if (i2 == i) {
                            return new Akahu(string, string2, string3, bVar, logoBadgeCreateFromParcel, arrayListCreateStringArrayList, outageCreateFromParcel, arrayList, string4, OpenbankingMethodState.valueOf(parcel.readString()));
                        }
                        arrayList.add(p.valueOf(string4));
                        i2++;
                    }
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Akahu[i];
                }
            }

            public Akahu(String id10, String title, String str, io3.b bVar, LogoBadge logoBadge, List supportedCurrencyCodes, Outage outage, List tags, String str2, OpenbankingMethodState state) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(supportedCurrencyCodes, "supportedCurrencyCodes");
                Intrinsics.checkNotNullParameter(tags, "tags");
                Intrinsics.checkNotNullParameter(state, "state");
                this.f60449a = id10;
                this.f60450b = title;
                this.f60451c = str;
                this.d = bVar;
                this.e = logoBadge;
                this.f = supportedCurrencyCodes;
                this.f60452g = outage;
                this.f60453h = tags;
                this.i = str2;
                this.f60454j = state;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: F, reason: from getter */
            public final io3.b getE() {
                return this.d;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF60523g() {
                return this.i;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: b, reason: from getter */
            public final List getF() {
                return this.f;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: c, reason: from getter */
            public final LogoBadge getE() {
                return this.e;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: d, reason: from getter */
            public final Outage getF60505g() {
                return this.f60452g;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Akahu)) {
                    return false;
                }
                Akahu akahu = (Akahu) obj2;
                return Intrinsics.f(this.f60449a, akahu.f60449a) && Intrinsics.f(this.f60450b, akahu.f60450b) && Intrinsics.f(this.f60451c, akahu.f60451c) && Intrinsics.f(this.d, akahu.d) && Intrinsics.f(this.e, akahu.e) && Intrinsics.f(this.f, akahu.f) && Intrinsics.f(this.f60452g, akahu.f60452g) && Intrinsics.f(this.f60453h, akahu.f60453h) && Intrinsics.f(this.i, akahu.i) && this.f60454j == akahu.f60454j;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getDescription, reason: from getter */
            public final String getD() {
                return this.f60451c;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF60502a() {
                return this.f60449a;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF60522c() {
                return this.f60450b;
            }

            public final int hashCode() {
                int iC = p.a.c(this.f60449a.hashCode() * 31, 31, this.f60450b);
                String str = this.f60451c;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                io3.b bVar = this.d;
                int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
                LogoBadge logoBadge = this.e;
                int iD = p.a.d((iHashCode2 + (logoBadge == null ? 0 : logoBadge.hashCode())) * 31, 31, this.f);
                Outage outage = this.f60452g;
                int iD2 = p.a.d((iD + (outage == null ? 0 : outage.hashCode())) * 31, 31, this.f60453h);
                String str2 = this.i;
                return this.f60454j.hashCode() + ((iD2 + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: p, reason: from getter */
            public final List getF60508a() {
                return this.f60453h;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f60449a);
                dest.writeString(this.f60450b);
                dest.writeString(this.f60451c);
                dest.writeSerializable(this.d);
                LogoBadge logoBadge = this.e;
                if (logoBadge == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    logoBadge.writeToParcel(dest, i);
                }
                dest.writeStringList(this.f);
                Outage outage = this.f60452g;
                if (outage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    outage.writeToParcel(dest, i);
                }
                Iterator itV = p.a.v(this.f60453h, dest);
                while (itV.hasNext()) {
                    dest.writeString(((p) itV.next()).name());
                }
                dest.writeString(this.i);
                dest.writeString(this.f60454j.name());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod$Card;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod;", "", "toString", "()Ljava/lang/String;", "Restrictions", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Card extends StoredMethod {

            @NotNull
            public static final Parcelable.Creator<Card> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f60455a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f60456b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f60457c;
            public final io3.b d;
            public final LogoBadge e;
            public final List f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Outage f60458g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final List f60459h;
            public final String i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final Restrictions f60460j;
            public final CardMethodState k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final String f60461l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final CardholderVerificationStatus f60462m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final Map f60463n;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod$Card$Restrictions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Restrictions implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<Restrictions> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f60464a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f60465b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f60466c;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Restrictions(parcel.readString(), parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Restrictions[i];
                    }
                }

                public Restrictions(String title, String errorSummary, String errorMessage) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(errorSummary, "errorSummary");
                    Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                    this.f60464a = title;
                    this.f60465b = errorSummary;
                    this.f60466c = errorMessage;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Restrictions)) {
                        return false;
                    }
                    Restrictions restrictions = (Restrictions) obj2;
                    return Intrinsics.f(this.f60464a, restrictions.f60464a) && Intrinsics.f(this.f60465b, restrictions.f60465b) && Intrinsics.f(this.f60466c, restrictions.f60466c);
                }

                public final int hashCode() {
                    return this.f60466c.hashCode() + p.a.c(this.f60464a.hashCode() * 31, 31, this.f60465b);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f60464a);
                    dest.writeString(this.f60465b);
                    dest.writeString(this.f60466c);
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    String str;
                    LinkedHashMap linkedHashMap;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    io3.b bVar = (io3.b) parcel.readSerializable();
                    LogoBadge logoBadgeCreateFromParcel = parcel.readInt() == 0 ? null : LogoBadge.CREATOR.createFromParcel(parcel);
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    Outage outageCreateFromParcel = parcel.readInt() == 0 ? null : Outage.CREATOR.createFromParcel(parcel);
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(p.valueOf(parcel.readString()));
                    }
                    String string4 = parcel.readString();
                    Restrictions restrictionsCreateFromParcel = parcel.readInt() == 0 ? null : Restrictions.CREATOR.createFromParcel(parcel);
                    CardMethodState cardMethodStateValueOf = CardMethodState.valueOf(parcel.readString());
                    String string5 = parcel.readString();
                    CardholderVerificationStatus cardholderVerificationStatusValueOf = parcel.readInt() == 0 ? null : CardholderVerificationStatus.valueOf(parcel.readString());
                    if (parcel.readInt() == 0) {
                        str = string4;
                        linkedHashMap = null;
                    } else {
                        int i3 = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
                        str = string4;
                        int i5 = 0;
                        while (i5 != i3) {
                            linkedHashMap2.put(l.valueOf(parcel.readString()), AutoTopUpState.CREATOR.createFromParcel(parcel));
                            i5++;
                            i3 = i3;
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new Card(string, string2, string3, bVar, logoBadgeCreateFromParcel, arrayListCreateStringArrayList, outageCreateFromParcel, arrayList, str, restrictionsCreateFromParcel, cardMethodStateValueOf, string5, cardholderVerificationStatusValueOf, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Card[i];
                }
            }

            public Card(String id10, String title, String str, io3.b bVar, LogoBadge logoBadge, List supportedCurrencyCodes, Outage outage, List tags, String str2, Restrictions restrictions, CardMethodState state, String str3, CardholderVerificationStatus cardholderVerificationStatus, Map map) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(supportedCurrencyCodes, "supportedCurrencyCodes");
                Intrinsics.checkNotNullParameter(tags, "tags");
                Intrinsics.checkNotNullParameter(state, "state");
                this.f60455a = id10;
                this.f60456b = title;
                this.f60457c = str;
                this.d = bVar;
                this.e = logoBadge;
                this.f = supportedCurrencyCodes;
                this.f60458g = outage;
                this.f60459h = tags;
                this.i = str2;
                this.f60460j = restrictions;
                this.k = state;
                this.f60461l = str3;
                this.f60462m = cardholderVerificationStatus;
                this.f60463n = map;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: F, reason: from getter */
            public final io3.b getE() {
                return this.d;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF60523g() {
                return this.i;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: b, reason: from getter */
            public final List getF() {
                return this.f;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: c, reason: from getter */
            public final LogoBadge getE() {
                return this.e;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: d, reason: from getter */
            public final Outage getF60505g() {
                return this.f60458g;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Card)) {
                    return false;
                }
                Card card = (Card) obj2;
                return Intrinsics.f(this.f60455a, card.f60455a) && Intrinsics.f(this.f60456b, card.f60456b) && Intrinsics.f(this.f60457c, card.f60457c) && Intrinsics.f(this.d, card.d) && Intrinsics.f(this.e, card.e) && Intrinsics.f(this.f, card.f) && Intrinsics.f(this.f60458g, card.f60458g) && Intrinsics.f(this.f60459h, card.f60459h) && Intrinsics.f(this.i, card.i) && Intrinsics.f(this.f60460j, card.f60460j) && this.k == card.k && Intrinsics.f(this.f60461l, card.f60461l) && this.f60462m == card.f60462m && Intrinsics.f(this.f60463n, card.f60463n);
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getDescription, reason: from getter */
            public final String getD() {
                return this.f60457c;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF60502a() {
                return this.f60455a;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF60522c() {
                return this.f60456b;
            }

            public final int hashCode() {
                int iC = p.a.c(this.f60455a.hashCode() * 31, 31, this.f60456b);
                String str = this.f60457c;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                io3.b bVar = this.d;
                int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
                LogoBadge logoBadge = this.e;
                int iD = p.a.d((iHashCode2 + (logoBadge == null ? 0 : logoBadge.hashCode())) * 31, 31, this.f);
                Outage outage = this.f60458g;
                int iD2 = p.a.d((iD + (outage == null ? 0 : outage.hashCode())) * 31, 31, this.f60459h);
                String str2 = this.i;
                int iHashCode3 = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Restrictions restrictions = this.f60460j;
                int iHashCode4 = (this.k.hashCode() + ((iHashCode3 + (restrictions == null ? 0 : restrictions.hashCode())) * 31)) * 31;
                String str3 = this.f60461l;
                int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                CardholderVerificationStatus cardholderVerificationStatus = this.f60462m;
                int iHashCode6 = (iHashCode5 + (cardholderVerificationStatus == null ? 0 : cardholderVerificationStatus.hashCode())) * 31;
                Map map = this.f60463n;
                return iHashCode6 + (map != null ? map.hashCode() : 0);
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: p, reason: from getter */
            public final List getF60508a() {
                return this.f60459h;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f60455a);
                dest.writeString(this.f60456b);
                dest.writeString(this.f60457c);
                dest.writeSerializable(this.d);
                LogoBadge logoBadge = this.e;
                if (logoBadge == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    logoBadge.writeToParcel(dest, i);
                }
                dest.writeStringList(this.f);
                Outage outage = this.f60458g;
                if (outage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    outage.writeToParcel(dest, i);
                }
                Iterator itV = p.a.v(this.f60459h, dest);
                while (itV.hasNext()) {
                    dest.writeString(((p) itV.next()).name());
                }
                dest.writeString(this.i);
                Restrictions restrictions = this.f60460j;
                if (restrictions == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    restrictions.writeToParcel(dest, i);
                }
                dest.writeString(this.k.name());
                dest.writeString(this.f60461l);
                CardholderVerificationStatus cardholderVerificationStatus = this.f60462m;
                if (cardholderVerificationStatus == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(cardholderVerificationStatus.name());
                }
                Map map = this.f60463n;
                if (map == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator itV2 = h30.l.v(dest, 1, map);
                while (itV2.hasNext()) {
                    Map.Entry entry = (Map.Entry) itV2.next();
                    dest.writeString(((l) entry.getKey()).name());
                    ((AutoTopUpState) entry.getValue()).writeToParcel(dest, i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod$GmoPgBankDirect;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class GmoPgBankDirect extends StoredMethod {

            @NotNull
            public static final Parcelable.Creator<GmoPgBankDirect> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f60467a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f60468b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f60469c;
            public final io3.b d;
            public final LogoBadge e;
            public final List f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Outage f60470g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final List f60471h;
            public final String i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final OpenbankingMethodState f60472j;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    io3.b bVar = (io3.b) parcel.readSerializable();
                    LogoBadge logoBadgeCreateFromParcel = parcel.readInt() == 0 ? null : LogoBadge.CREATOR.createFromParcel(parcel);
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    Outage outageCreateFromParcel = parcel.readInt() != 0 ? Outage.CREATOR.createFromParcel(parcel) : null;
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int i2 = 0;
                    while (true) {
                        String string4 = parcel.readString();
                        if (i2 == i) {
                            return new GmoPgBankDirect(string, string2, string3, bVar, logoBadgeCreateFromParcel, arrayListCreateStringArrayList, outageCreateFromParcel, arrayList, string4, OpenbankingMethodState.valueOf(parcel.readString()));
                        }
                        arrayList.add(p.valueOf(string4));
                        i2++;
                    }
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new GmoPgBankDirect[i];
                }
            }

            public GmoPgBankDirect(String id10, String title, String str, io3.b bVar, LogoBadge logoBadge, List supportedCurrencyCodes, Outage outage, List tags, String str2, OpenbankingMethodState state) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(supportedCurrencyCodes, "supportedCurrencyCodes");
                Intrinsics.checkNotNullParameter(tags, "tags");
                Intrinsics.checkNotNullParameter(state, "state");
                this.f60467a = id10;
                this.f60468b = title;
                this.f60469c = str;
                this.d = bVar;
                this.e = logoBadge;
                this.f = supportedCurrencyCodes;
                this.f60470g = outage;
                this.f60471h = tags;
                this.i = str2;
                this.f60472j = state;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: F, reason: from getter */
            public final io3.b getE() {
                return this.d;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF60523g() {
                return this.i;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: b, reason: from getter */
            public final List getF() {
                return this.f;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: c, reason: from getter */
            public final LogoBadge getE() {
                return this.e;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: d, reason: from getter */
            public final Outage getF60505g() {
                return this.f60470g;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof GmoPgBankDirect)) {
                    return false;
                }
                GmoPgBankDirect gmoPgBankDirect = (GmoPgBankDirect) obj2;
                return Intrinsics.f(this.f60467a, gmoPgBankDirect.f60467a) && Intrinsics.f(this.f60468b, gmoPgBankDirect.f60468b) && Intrinsics.f(this.f60469c, gmoPgBankDirect.f60469c) && Intrinsics.f(this.d, gmoPgBankDirect.d) && Intrinsics.f(this.e, gmoPgBankDirect.e) && Intrinsics.f(this.f, gmoPgBankDirect.f) && Intrinsics.f(this.f60470g, gmoPgBankDirect.f60470g) && Intrinsics.f(this.f60471h, gmoPgBankDirect.f60471h) && Intrinsics.f(this.i, gmoPgBankDirect.i) && this.f60472j == gmoPgBankDirect.f60472j;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getDescription, reason: from getter */
            public final String getD() {
                return this.f60469c;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF60502a() {
                return this.f60467a;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF60522c() {
                return this.f60468b;
            }

            public final int hashCode() {
                int iC = p.a.c(this.f60467a.hashCode() * 31, 31, this.f60468b);
                String str = this.f60469c;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                io3.b bVar = this.d;
                int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
                LogoBadge logoBadge = this.e;
                int iD = p.a.d((iHashCode2 + (logoBadge == null ? 0 : logoBadge.hashCode())) * 31, 31, this.f);
                Outage outage = this.f60470g;
                int iD2 = p.a.d((iD + (outage == null ? 0 : outage.hashCode())) * 31, 31, this.f60471h);
                String str2 = this.i;
                return this.f60472j.hashCode() + ((iD2 + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: p, reason: from getter */
            public final List getF60508a() {
                return this.f60471h;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f60467a);
                dest.writeString(this.f60468b);
                dest.writeString(this.f60469c);
                dest.writeSerializable(this.d);
                LogoBadge logoBadge = this.e;
                if (logoBadge == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    logoBadge.writeToParcel(dest, i);
                }
                dest.writeStringList(this.f);
                Outage outage = this.f60470g;
                if (outage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    outage.writeToParcel(dest, i);
                }
                Iterator itV = p.a.v(this.f60471h, dest);
                while (itV.hasNext()) {
                    dest.writeString(((p) itV.next()).name());
                }
                dest.writeString(this.i);
                dest.writeString(this.f60472j.name());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod$LogoBadge;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Icon", "Style", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LogoBadge implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<LogoBadge> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Icon f60473a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Style f60474b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod$LogoBadge$Icon;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "SUSPICIOUS", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Icon {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ Icon[] $VALUES;
                public static final Icon PENDING = new Icon("PENDING", 0);
                public static final Icon SUSPICIOUS = new Icon("SUSPICIOUS", 1);

                private static final /* synthetic */ Icon[] $values() {
                    return new Icon[]{PENDING, SUSPICIOUS};
                }

                static {
                    Icon[] iconArr$values = $values();
                    $VALUES = iconArr$values;
                    $ENTRIES = s.n(iconArr$values);
                }

                private Icon(String str, int i) {
                }

                @NotNull
                public static EnumEntries getEntries() {
                    return $ENTRIES;
                }

                public static Icon valueOf(String str) {
                    return (Icon) Enum.valueOf(Icon.class, str);
                }

                public static Icon[] values() {
                    return (Icon[]) $VALUES.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod$LogoBadge$Style;", "", "<init>", "(Ljava/lang/String;I)V", "ACCENT_NEUTRAL", "WARNING", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Style {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ Style[] $VALUES;
                public static final Style ACCENT_NEUTRAL = new Style("ACCENT_NEUTRAL", 0);
                public static final Style WARNING = new Style("WARNING", 1);

                private static final /* synthetic */ Style[] $values() {
                    return new Style[]{ACCENT_NEUTRAL, WARNING};
                }

                static {
                    Style[] styleArr$values = $values();
                    $VALUES = styleArr$values;
                    $ENTRIES = s.n(styleArr$values);
                }

                private Style(String str, int i) {
                }

                @NotNull
                public static EnumEntries getEntries() {
                    return $ENTRIES;
                }

                public static Style valueOf(String str) {
                    return (Style) Enum.valueOf(Style.class, str);
                }

                public static Style[] values() {
                    return (Style[]) $VALUES.clone();
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new LogoBadge(Icon.valueOf(parcel.readString()), Style.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new LogoBadge[i];
                }
            }

            public LogoBadge(Icon icon, Style style) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(style, "style");
                this.f60473a = icon;
                this.f60474b = style;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof LogoBadge)) {
                    return false;
                }
                LogoBadge logoBadge = (LogoBadge) obj2;
                return this.f60473a == logoBadge.f60473a && this.f60474b == logoBadge.f60474b;
            }

            public final int hashCode() {
                return this.f60474b.hashCode() + (this.f60473a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f60473a.name());
                dest.writeString(this.f60474b.name());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod$NetBanking;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NetBanking extends StoredMethod {

            @NotNull
            public static final Parcelable.Creator<NetBanking> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f60475a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f60476b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f60477c;
            public final io3.b d;
            public final LogoBadge e;
            public final List f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Outage f60478g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final List f60479h;
            public final String i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final boolean f60480j;
            public final NetBankingMethodState k;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    io3.b bVar = (io3.b) parcel.readSerializable();
                    LogoBadge logoBadgeCreateFromParcel = parcel.readInt() == 0 ? null : LogoBadge.CREATOR.createFromParcel(parcel);
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    Outage outageCreateFromParcel = parcel.readInt() != 0 ? Outage.CREATOR.createFromParcel(parcel) : null;
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(p.valueOf(parcel.readString()));
                    }
                    return new NetBanking(string, string2, string3, bVar, logoBadgeCreateFromParcel, arrayListCreateStringArrayList, outageCreateFromParcel, arrayList, parcel.readString(), parcel.readInt() != 0, NetBankingMethodState.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NetBanking[i];
                }
            }

            public NetBanking(String id10, String title, String str, io3.b bVar, LogoBadge logoBadge, List supportedCurrencyCodes, Outage outage, List tags, String str2, boolean z, NetBankingMethodState state) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(supportedCurrencyCodes, "supportedCurrencyCodes");
                Intrinsics.checkNotNullParameter(tags, "tags");
                Intrinsics.checkNotNullParameter(state, "state");
                this.f60475a = id10;
                this.f60476b = title;
                this.f60477c = str;
                this.d = bVar;
                this.e = logoBadge;
                this.f = supportedCurrencyCodes;
                this.f60478g = outage;
                this.f60479h = tags;
                this.i = str2;
                this.f60480j = z;
                this.k = state;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: F, reason: from getter */
            public final io3.b getE() {
                return this.d;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF60523g() {
                return this.i;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: b, reason: from getter */
            public final List getF() {
                return this.f;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: c, reason: from getter */
            public final LogoBadge getE() {
                return this.e;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: d, reason: from getter */
            public final Outage getF60505g() {
                return this.f60478g;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NetBanking)) {
                    return false;
                }
                NetBanking netBanking = (NetBanking) obj2;
                return Intrinsics.f(this.f60475a, netBanking.f60475a) && Intrinsics.f(this.f60476b, netBanking.f60476b) && Intrinsics.f(this.f60477c, netBanking.f60477c) && Intrinsics.f(this.d, netBanking.d) && Intrinsics.f(this.e, netBanking.e) && Intrinsics.f(this.f, netBanking.f) && Intrinsics.f(this.f60478g, netBanking.f60478g) && Intrinsics.f(this.f60479h, netBanking.f60479h) && Intrinsics.f(this.i, netBanking.i) && this.f60480j == netBanking.f60480j && this.k == netBanking.k;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getDescription, reason: from getter */
            public final String getD() {
                return this.f60477c;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF60502a() {
                return this.f60475a;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF60522c() {
                return this.f60476b;
            }

            public final int hashCode() {
                int iC = p.a.c(this.f60475a.hashCode() * 31, 31, this.f60476b);
                String str = this.f60477c;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                io3.b bVar = this.d;
                int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
                LogoBadge logoBadge = this.e;
                int iD = p.a.d((iHashCode2 + (logoBadge == null ? 0 : logoBadge.hashCode())) * 31, 31, this.f);
                Outage outage = this.f60478g;
                int iD2 = p.a.d((iD + (outage == null ? 0 : outage.hashCode())) * 31, 31, this.f60479h);
                String str2 = this.i;
                return this.k.hashCode() + j6.a.c((iD2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f60480j);
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: p, reason: from getter */
            public final List getF60508a() {
                return this.f60479h;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f60475a);
                dest.writeString(this.f60476b);
                dest.writeString(this.f60477c);
                dest.writeSerializable(this.d);
                LogoBadge logoBadge = this.e;
                if (logoBadge == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    logoBadge.writeToParcel(dest, i);
                }
                dest.writeStringList(this.f);
                Outage outage = this.f60478g;
                if (outage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    outage.writeToParcel(dest, i);
                }
                Iterator itV = p.a.v(this.f60479h, dest);
                while (itV.hasNext()) {
                    dest.writeString(((p) itV.next()).name());
                }
                dest.writeString(this.i);
                dest.writeInt(this.f60480j ? 1 : 0);
                dest.writeString(this.k.name());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod$Openbanking;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Openbanking extends StoredMethod {

            @NotNull
            public static final Parcelable.Creator<Openbanking> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f60481a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f60482b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f60483c;
            public final io3.b d;
            public final LogoBadge e;
            public final List f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Outage f60484g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final List f60485h;
            public final String i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final OpenbankingMethodState f60486j;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    io3.b bVar = (io3.b) parcel.readSerializable();
                    LogoBadge logoBadgeCreateFromParcel = parcel.readInt() == 0 ? null : LogoBadge.CREATOR.createFromParcel(parcel);
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    Outage outageCreateFromParcel = parcel.readInt() != 0 ? Outage.CREATOR.createFromParcel(parcel) : null;
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int i2 = 0;
                    while (true) {
                        String string4 = parcel.readString();
                        if (i2 == i) {
                            return new Openbanking(string, string2, string3, bVar, logoBadgeCreateFromParcel, arrayListCreateStringArrayList, outageCreateFromParcel, arrayList, string4, OpenbankingMethodState.valueOf(parcel.readString()));
                        }
                        arrayList.add(p.valueOf(string4));
                        i2++;
                    }
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Openbanking[i];
                }
            }

            public Openbanking(String id10, String title, String str, io3.b bVar, LogoBadge logoBadge, List supportedCurrencyCodes, Outage outage, List tags, String str2, OpenbankingMethodState state) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(supportedCurrencyCodes, "supportedCurrencyCodes");
                Intrinsics.checkNotNullParameter(tags, "tags");
                Intrinsics.checkNotNullParameter(state, "state");
                this.f60481a = id10;
                this.f60482b = title;
                this.f60483c = str;
                this.d = bVar;
                this.e = logoBadge;
                this.f = supportedCurrencyCodes;
                this.f60484g = outage;
                this.f60485h = tags;
                this.i = str2;
                this.f60486j = state;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: F, reason: from getter */
            public final io3.b getE() {
                return this.d;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF60523g() {
                return this.i;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: b, reason: from getter */
            public final List getF() {
                return this.f;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: c, reason: from getter */
            public final LogoBadge getE() {
                return this.e;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: d, reason: from getter */
            public final Outage getF60505g() {
                return this.f60484g;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Openbanking)) {
                    return false;
                }
                Openbanking openbanking = (Openbanking) obj2;
                return Intrinsics.f(this.f60481a, openbanking.f60481a) && Intrinsics.f(this.f60482b, openbanking.f60482b) && Intrinsics.f(this.f60483c, openbanking.f60483c) && Intrinsics.f(this.d, openbanking.d) && Intrinsics.f(this.e, openbanking.e) && Intrinsics.f(this.f, openbanking.f) && Intrinsics.f(this.f60484g, openbanking.f60484g) && Intrinsics.f(this.f60485h, openbanking.f60485h) && Intrinsics.f(this.i, openbanking.i) && this.f60486j == openbanking.f60486j;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getDescription, reason: from getter */
            public final String getD() {
                return this.f60483c;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF60502a() {
                return this.f60481a;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF60522c() {
                return this.f60482b;
            }

            public final int hashCode() {
                int iC = p.a.c(this.f60481a.hashCode() * 31, 31, this.f60482b);
                String str = this.f60483c;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                io3.b bVar = this.d;
                int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
                LogoBadge logoBadge = this.e;
                int iD = p.a.d((iHashCode2 + (logoBadge == null ? 0 : logoBadge.hashCode())) * 31, 31, this.f);
                Outage outage = this.f60484g;
                int iD2 = p.a.d((iD + (outage == null ? 0 : outage.hashCode())) * 31, 31, this.f60485h);
                String str2 = this.i;
                return this.f60486j.hashCode() + ((iD2 + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: p, reason: from getter */
            public final List getF60508a() {
                return this.f60485h;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f60481a);
                dest.writeString(this.f60482b);
                dest.writeString(this.f60483c);
                dest.writeSerializable(this.d);
                LogoBadge logoBadge = this.e;
                if (logoBadge == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    logoBadge.writeToParcel(dest, i);
                }
                dest.writeStringList(this.f);
                Outage outage = this.f60484g;
                if (outage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    outage.writeToParcel(dest, i);
                }
                Iterator itV = p.a.v(this.f60485h, dest);
                while (itV.hasNext()) {
                    dest.writeString(((p) itV.next()).name());
                }
                dest.writeString(this.i);
                dest.writeString(this.f60486j.name());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod$Outage;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Outage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Outage> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f60487a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f60488b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f60489c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Outage(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Outage[i];
                }
            }

            public Outage(String title, String message, String summary) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(summary, "summary");
                this.f60487a = title;
                this.f60488b = message;
                this.f60489c = summary;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Outage)) {
                    return false;
                }
                Outage outage = (Outage) obj2;
                return Intrinsics.f(this.f60487a, outage.f60487a) && Intrinsics.f(this.f60488b, outage.f60488b) && Intrinsics.f(this.f60489c, outage.f60489c);
            }

            public final int hashCode() {
                return this.f60489c.hashCode() + p.a.c(this.f60487a.hashCode() * 31, 31, this.f60488b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f60487a);
                dest.writeString(this.f60488b);
                dest.writeString(this.f60489c);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod$PayTo;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PayTo extends StoredMethod {

            @NotNull
            public static final Parcelable.Creator<PayTo> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f60490a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f60491b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f60492c;
            public final io3.b d;
            public final LogoBadge e;
            public final List f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Outage f60493g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final List f60494h;
            public final String i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final PayToMethodState f60495j;
            public final Map k;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    io3.b bVar = (io3.b) parcel.readSerializable();
                    LogoBadge logoBadgeCreateFromParcel = parcel.readInt() == 0 ? null : LogoBadge.CREATOR.createFromParcel(parcel);
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    Outage outageCreateFromParcel = parcel.readInt() == 0 ? null : Outage.CREATOR.createFromParcel(parcel);
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(p.valueOf(parcel.readString()));
                    }
                    String string4 = parcel.readString();
                    PayToMethodState payToMethodStateValueOf = PayToMethodState.valueOf(parcel.readString());
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int i3 = parcel.readInt();
                        linkedHashMap = new LinkedHashMap(i3);
                        for (int i5 = 0; i5 != i3; i5++) {
                            linkedHashMap.put(l.valueOf(parcel.readString()), AutoTopUpState.CREATOR.createFromParcel(parcel));
                        }
                    }
                    return new PayTo(string, string2, string3, bVar, logoBadgeCreateFromParcel, arrayListCreateStringArrayList, outageCreateFromParcel, arrayList, string4, payToMethodStateValueOf, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PayTo[i];
                }
            }

            public PayTo(String id10, String title, String str, io3.b bVar, LogoBadge logoBadge, List supportedCurrencyCodes, Outage outage, List tags, String str2, PayToMethodState state, Map map) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(supportedCurrencyCodes, "supportedCurrencyCodes");
                Intrinsics.checkNotNullParameter(tags, "tags");
                Intrinsics.checkNotNullParameter(state, "state");
                this.f60490a = id10;
                this.f60491b = title;
                this.f60492c = str;
                this.d = bVar;
                this.e = logoBadge;
                this.f = supportedCurrencyCodes;
                this.f60493g = outage;
                this.f60494h = tags;
                this.i = str2;
                this.f60495j = state;
                this.k = map;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: F, reason: from getter */
            public final io3.b getE() {
                return this.d;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF60523g() {
                return this.i;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: b, reason: from getter */
            public final List getF() {
                return this.f;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: c, reason: from getter */
            public final LogoBadge getE() {
                return this.e;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: d, reason: from getter */
            public final Outage getF60505g() {
                return this.f60493g;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof PayTo)) {
                    return false;
                }
                PayTo payTo = (PayTo) obj2;
                return Intrinsics.f(this.f60490a, payTo.f60490a) && Intrinsics.f(this.f60491b, payTo.f60491b) && Intrinsics.f(this.f60492c, payTo.f60492c) && Intrinsics.f(this.d, payTo.d) && Intrinsics.f(this.e, payTo.e) && Intrinsics.f(this.f, payTo.f) && Intrinsics.f(this.f60493g, payTo.f60493g) && Intrinsics.f(this.f60494h, payTo.f60494h) && Intrinsics.f(this.i, payTo.i) && this.f60495j == payTo.f60495j && Intrinsics.f(this.k, payTo.k);
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getDescription, reason: from getter */
            public final String getD() {
                return this.f60492c;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF60502a() {
                return this.f60490a;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF60522c() {
                return this.f60491b;
            }

            public final int hashCode() {
                int iC = p.a.c(this.f60490a.hashCode() * 31, 31, this.f60491b);
                String str = this.f60492c;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                io3.b bVar = this.d;
                int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
                LogoBadge logoBadge = this.e;
                int iD = p.a.d((iHashCode2 + (logoBadge == null ? 0 : logoBadge.hashCode())) * 31, 31, this.f);
                Outage outage = this.f60493g;
                int iD2 = p.a.d((iD + (outage == null ? 0 : outage.hashCode())) * 31, 31, this.f60494h);
                String str2 = this.i;
                int iHashCode3 = (this.f60495j.hashCode() + ((iD2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
                Map map = this.k;
                return iHashCode3 + (map != null ? map.hashCode() : 0);
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: p, reason: from getter */
            public final List getF60508a() {
                return this.f60494h;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f60490a);
                dest.writeString(this.f60491b);
                dest.writeString(this.f60492c);
                dest.writeSerializable(this.d);
                LogoBadge logoBadge = this.e;
                if (logoBadge == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    logoBadge.writeToParcel(dest, i);
                }
                dest.writeStringList(this.f);
                Outage outage = this.f60493g;
                if (outage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    outage.writeToParcel(dest, i);
                }
                Iterator itV = p.a.v(this.f60494h, dest);
                while (itV.hasNext()) {
                    dest.writeString(((p) itV.next()).name());
                }
                dest.writeString(this.i);
                dest.writeString(this.f60495j.name());
                Map map = this.k;
                if (map == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator itV2 = h30.l.v(dest, 1, map);
                while (itV2.hasNext()) {
                    Map.Entry entry = (Map.Entry) itV2.next();
                    dest.writeString(((l) entry.getKey()).name());
                    ((AutoTopUpState) entry.getValue()).writeToParcel(dest, i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod$PixSmartTransfer;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PixSmartTransfer extends StoredMethod {

            @NotNull
            public static final Parcelable.Creator<PixSmartTransfer> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f60496a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f60497b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f60498c;
            public final io3.b d;
            public final LogoBadge e;
            public final List f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Outage f60499g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final List f60500h;
            public final String i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final OpenbankingMethodState f60501j;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    io3.b bVar = (io3.b) parcel.readSerializable();
                    LogoBadge logoBadgeCreateFromParcel = parcel.readInt() == 0 ? null : LogoBadge.CREATOR.createFromParcel(parcel);
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    Outage outageCreateFromParcel = parcel.readInt() != 0 ? Outage.CREATOR.createFromParcel(parcel) : null;
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int i2 = 0;
                    while (true) {
                        String string4 = parcel.readString();
                        if (i2 == i) {
                            return new PixSmartTransfer(string, string2, string3, bVar, logoBadgeCreateFromParcel, arrayListCreateStringArrayList, outageCreateFromParcel, arrayList, string4, OpenbankingMethodState.valueOf(parcel.readString()));
                        }
                        arrayList.add(p.valueOf(string4));
                        i2++;
                    }
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PixSmartTransfer[i];
                }
            }

            public PixSmartTransfer(String id10, String title, String str, io3.b bVar, LogoBadge logoBadge, List supportedCurrencyCodes, Outage outage, List tags, String str2, OpenbankingMethodState state) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(supportedCurrencyCodes, "supportedCurrencyCodes");
                Intrinsics.checkNotNullParameter(tags, "tags");
                Intrinsics.checkNotNullParameter(state, "state");
                this.f60496a = id10;
                this.f60497b = title;
                this.f60498c = str;
                this.d = bVar;
                this.e = logoBadge;
                this.f = supportedCurrencyCodes;
                this.f60499g = outage;
                this.f60500h = tags;
                this.i = str2;
                this.f60501j = state;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: F, reason: from getter */
            public final io3.b getE() {
                return this.d;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF60523g() {
                return this.i;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: b, reason: from getter */
            public final List getF() {
                return this.f;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: c, reason: from getter */
            public final LogoBadge getE() {
                return this.e;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: d, reason: from getter */
            public final Outage getF60505g() {
                return this.f60499g;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof PixSmartTransfer)) {
                    return false;
                }
                PixSmartTransfer pixSmartTransfer = (PixSmartTransfer) obj2;
                return Intrinsics.f(this.f60496a, pixSmartTransfer.f60496a) && Intrinsics.f(this.f60497b, pixSmartTransfer.f60497b) && Intrinsics.f(this.f60498c, pixSmartTransfer.f60498c) && Intrinsics.f(this.d, pixSmartTransfer.d) && Intrinsics.f(this.e, pixSmartTransfer.e) && Intrinsics.f(this.f, pixSmartTransfer.f) && Intrinsics.f(this.f60499g, pixSmartTransfer.f60499g) && Intrinsics.f(this.f60500h, pixSmartTransfer.f60500h) && Intrinsics.f(this.i, pixSmartTransfer.i) && this.f60501j == pixSmartTransfer.f60501j;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getDescription, reason: from getter */
            public final String getD() {
                return this.f60498c;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF60502a() {
                return this.f60496a;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF60522c() {
                return this.f60497b;
            }

            public final int hashCode() {
                int iC = p.a.c(this.f60496a.hashCode() * 31, 31, this.f60497b);
                String str = this.f60498c;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                io3.b bVar = this.d;
                int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
                LogoBadge logoBadge = this.e;
                int iD = p.a.d((iHashCode2 + (logoBadge == null ? 0 : logoBadge.hashCode())) * 31, 31, this.f);
                Outage outage = this.f60499g;
                int iD2 = p.a.d((iD + (outage == null ? 0 : outage.hashCode())) * 31, 31, this.f60500h);
                String str2 = this.i;
                return this.f60501j.hashCode() + ((iD2 + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: p, reason: from getter */
            public final List getF60508a() {
                return this.f60500h;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f60496a);
                dest.writeString(this.f60497b);
                dest.writeString(this.f60498c);
                dest.writeSerializable(this.d);
                LogoBadge logoBadge = this.e;
                if (logoBadge == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    logoBadge.writeToParcel(dest, i);
                }
                dest.writeStringList(this.f);
                Outage outage = this.f60499g;
                if (outage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    outage.writeToParcel(dest, i);
                }
                Iterator itV = p.a.v(this.f60500h, dest);
                while (itV.hasNext()) {
                    dest.writeString(((p) itV.next()).name());
                }
                dest.writeString(this.i);
                dest.writeString(this.f60501j.name());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod$UpiApp;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UpiApp extends StoredMethod {

            @NotNull
            public static final Parcelable.Creator<UpiApp> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f60502a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f60503b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f60504c;
            public final io3.b d;
            public final LogoBadge e;
            public final List f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Outage f60505g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final List f60506h;
            public final String i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final boolean f60507j;
            public final UpiMethodState k;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    io3.b bVar = (io3.b) parcel.readSerializable();
                    LogoBadge logoBadgeCreateFromParcel = parcel.readInt() == 0 ? null : LogoBadge.CREATOR.createFromParcel(parcel);
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    Outage outageCreateFromParcel = parcel.readInt() != 0 ? Outage.CREATOR.createFromParcel(parcel) : null;
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(p.valueOf(parcel.readString()));
                    }
                    return new UpiApp(string, string2, string3, bVar, logoBadgeCreateFromParcel, arrayListCreateStringArrayList, outageCreateFromParcel, arrayList, parcel.readString(), parcel.readInt() != 0, UpiMethodState.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new UpiApp[i];
                }
            }

            public UpiApp(String id10, String title, String str, io3.b bVar, LogoBadge logoBadge, List supportedCurrencyCodes, Outage outage, List tags, String str2, boolean z, UpiMethodState state) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(supportedCurrencyCodes, "supportedCurrencyCodes");
                Intrinsics.checkNotNullParameter(tags, "tags");
                Intrinsics.checkNotNullParameter(state, "state");
                this.f60502a = id10;
                this.f60503b = title;
                this.f60504c = str;
                this.d = bVar;
                this.e = logoBadge;
                this.f = supportedCurrencyCodes;
                this.f60505g = outage;
                this.f60506h = tags;
                this.i = str2;
                this.f60507j = z;
                this.k = state;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: F, reason: from getter */
            public final io3.b getE() {
                return this.d;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF60523g() {
                return this.i;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: b, reason: from getter */
            public final List getF() {
                return this.f;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: c, reason: from getter */
            public final LogoBadge getE() {
                return this.e;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: d, reason: from getter */
            public final Outage getF60505g() {
                return this.f60505g;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof UpiApp)) {
                    return false;
                }
                UpiApp upiApp = (UpiApp) obj2;
                return Intrinsics.f(this.f60502a, upiApp.f60502a) && Intrinsics.f(this.f60503b, upiApp.f60503b) && Intrinsics.f(this.f60504c, upiApp.f60504c) && Intrinsics.f(this.d, upiApp.d) && Intrinsics.f(this.e, upiApp.e) && Intrinsics.f(this.f, upiApp.f) && Intrinsics.f(this.f60505g, upiApp.f60505g) && Intrinsics.f(this.f60506h, upiApp.f60506h) && Intrinsics.f(this.i, upiApp.i) && this.f60507j == upiApp.f60507j && this.k == upiApp.k;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getDescription, reason: from getter */
            public final String getD() {
                return this.f60504c;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF60502a() {
                return this.f60502a;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF60522c() {
                return this.f60503b;
            }

            public final int hashCode() {
                int iC = p.a.c(this.f60502a.hashCode() * 31, 31, this.f60503b);
                String str = this.f60504c;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                io3.b bVar = this.d;
                int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
                LogoBadge logoBadge = this.e;
                int iD = p.a.d((iHashCode2 + (logoBadge == null ? 0 : logoBadge.hashCode())) * 31, 31, this.f);
                Outage outage = this.f60505g;
                int iD2 = p.a.d((iD + (outage == null ? 0 : outage.hashCode())) * 31, 31, this.f60506h);
                String str2 = this.i;
                return this.k.hashCode() + j6.a.c((iD2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f60507j);
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: p, reason: from getter */
            public final List getF60508a() {
                return this.f60506h;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f60502a);
                dest.writeString(this.f60503b);
                dest.writeString(this.f60504c);
                dest.writeSerializable(this.d);
                LogoBadge logoBadge = this.e;
                if (logoBadge == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    logoBadge.writeToParcel(dest, i);
                }
                dest.writeStringList(this.f);
                Outage outage = this.f60505g;
                if (outage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    outage.writeToParcel(dest, i);
                }
                Iterator itV = p.a.v(this.f60506h, dest);
                while (itV.hasNext()) {
                    dest.writeString(((p) itV.next()).name());
                }
                dest.writeString(this.i);
                dest.writeInt(this.f60507j ? 1 : 0);
                dest.writeString(this.k.name());
            }
        }

        private StoredMethod() {
        }

        /* JADX INFO: renamed from: c */
        public abstract LogoBadge getE();

        /* JADX INFO: renamed from: d */
        public abstract Outage getF60505g();

        /* JADX INFO: renamed from: getId */
        public abstract String getF60502a();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$SuggestedMethod;", "Lcom/revolut/domain/models/topup/methods/TopupMethod;", "OpenbankingStoredMethod", "OpenBankingInstitution", "PixSmartTransferInstitution", "OtherMethod", "Lcom/revolut/domain/models/topup/methods/TopupMethod$SuggestedMethod$OpenBankingInstitution;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$SuggestedMethod$OpenbankingStoredMethod;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$SuggestedMethod$OtherMethod;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$SuggestedMethod$PixSmartTransferInstitution;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class SuggestedMethod extends TopupMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f60508a = f0.f322471a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$SuggestedMethod$OpenBankingInstitution;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$SuggestedMethod;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenBankingInstitution extends SuggestedMethod {

            @NotNull
            public static final Parcelable.Creator<OpenBankingInstitution> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f60509b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f60510c;
            public final String d;
            public final io3.b e;
            public final List f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final String f60511g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final boolean f60512h;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OpenBankingInstitution(parcel.readString(), parcel.readString(), parcel.readString(), (io3.b) parcel.readSerializable(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenBankingInstitution[i];
                }
            }

            public OpenBankingInstitution(String institutionId, String title, String str, io3.b bVar, List supportedCurrencyCodes, String str2, boolean z) {
                Intrinsics.checkNotNullParameter(institutionId, "institutionId");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(supportedCurrencyCodes, "supportedCurrencyCodes");
                this.f60509b = institutionId;
                this.f60510c = title;
                this.d = str;
                this.e = bVar;
                this.f = supportedCurrencyCodes;
                this.f60511g = str2;
                this.f60512h = z;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: F, reason: from getter */
            public final io3.b getE() {
                return this.e;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF60523g() {
                return this.f60511g;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: b, reason: from getter */
            public final List getF() {
                return this.f;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.SuggestedMethod
            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getF60524h() {
                return this.f60512h;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof OpenBankingInstitution)) {
                    return false;
                }
                OpenBankingInstitution openBankingInstitution = (OpenBankingInstitution) obj2;
                return Intrinsics.f(this.f60509b, openBankingInstitution.f60509b) && Intrinsics.f(this.f60510c, openBankingInstitution.f60510c) && Intrinsics.f(this.d, openBankingInstitution.d) && Intrinsics.f(this.e, openBankingInstitution.e) && Intrinsics.f(this.f, openBankingInstitution.f) && Intrinsics.f(this.f60511g, openBankingInstitution.f60511g) && this.f60512h == openBankingInstitution.f60512h;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getDescription, reason: from getter */
            public final String getD() {
                return this.d;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF60522c() {
                return this.f60510c;
            }

            public final int hashCode() {
                int iC = p.a.c(this.f60509b.hashCode() * 31, 31, this.f60510c);
                String str = this.d;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                io3.b bVar = this.e;
                int iD = p.a.d((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f);
                String str2 = this.f60511g;
                return Boolean.hashCode(this.f60512h) + ((iD + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f60509b);
                dest.writeString(this.f60510c);
                dest.writeString(this.d);
                dest.writeSerializable(this.e);
                dest.writeStringList(this.f);
                dest.writeString(this.f60511g);
                dest.writeInt(this.f60512h ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$SuggestedMethod$OpenbankingStoredMethod;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$SuggestedMethod;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenbankingStoredMethod extends SuggestedMethod {

            @NotNull
            public static final Parcelable.Creator<OpenbankingStoredMethod> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f60513b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f60514c;
            public final String d;
            public final io3.b e;
            public final List f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final String f60515g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final boolean f60516h;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OpenbankingStoredMethod(parcel.readString(), parcel.readString(), parcel.readString(), (io3.b) parcel.readSerializable(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenbankingStoredMethod[i];
                }
            }

            public OpenbankingStoredMethod(String accountDetailsId, String title, String str, io3.b bVar, List supportedCurrencyCodes, String str2, boolean z) {
                Intrinsics.checkNotNullParameter(accountDetailsId, "accountDetailsId");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(supportedCurrencyCodes, "supportedCurrencyCodes");
                this.f60513b = accountDetailsId;
                this.f60514c = title;
                this.d = str;
                this.e = bVar;
                this.f = supportedCurrencyCodes;
                this.f60515g = str2;
                this.f60516h = z;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: F, reason: from getter */
            public final io3.b getE() {
                return this.e;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF60523g() {
                return this.f60515g;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: b, reason: from getter */
            public final List getF() {
                return this.f;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.SuggestedMethod
            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getF60524h() {
                return this.f60516h;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof OpenbankingStoredMethod)) {
                    return false;
                }
                OpenbankingStoredMethod openbankingStoredMethod = (OpenbankingStoredMethod) obj2;
                return Intrinsics.f(this.f60513b, openbankingStoredMethod.f60513b) && Intrinsics.f(this.f60514c, openbankingStoredMethod.f60514c) && Intrinsics.f(this.d, openbankingStoredMethod.d) && Intrinsics.f(this.e, openbankingStoredMethod.e) && Intrinsics.f(this.f, openbankingStoredMethod.f) && Intrinsics.f(this.f60515g, openbankingStoredMethod.f60515g) && this.f60516h == openbankingStoredMethod.f60516h;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getDescription, reason: from getter */
            public final String getD() {
                return this.d;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF60522c() {
                return this.f60514c;
            }

            public final int hashCode() {
                int iC = p.a.c(this.f60513b.hashCode() * 31, 31, this.f60514c);
                String str = this.d;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                io3.b bVar = this.e;
                int iD = p.a.d((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f);
                String str2 = this.f60515g;
                return Boolean.hashCode(this.f60516h) + ((iD + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f60513b);
                dest.writeString(this.f60514c);
                dest.writeString(this.d);
                dest.writeSerializable(this.e);
                dest.writeStringList(this.f);
                dest.writeString(this.f60515g);
                dest.writeInt(this.f60516h ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$SuggestedMethod$OtherMethod;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$SuggestedMethod;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OtherMethod extends SuggestedMethod {

            @NotNull
            public static final Parcelable.Creator<OtherMethod> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TopupMethodType f60517b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f60518c;
            public final String d;
            public final io3.b e;
            public final List f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final String f60519g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final boolean f60520h;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OtherMethod(TopupMethodType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (io3.b) parcel.readSerializable(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OtherMethod[i];
                }
            }

            public OtherMethod(TopupMethodType type, String title, String str, io3.b bVar, List supportedCurrencyCodes, String str2, boolean z) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(supportedCurrencyCodes, "supportedCurrencyCodes");
                this.f60517b = type;
                this.f60518c = title;
                this.d = str;
                this.e = bVar;
                this.f = supportedCurrencyCodes;
                this.f60519g = str2;
                this.f60520h = z;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: F, reason: from getter */
            public final io3.b getE() {
                return this.e;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF60523g() {
                return this.f60519g;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: b, reason: from getter */
            public final List getF() {
                return this.f;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.SuggestedMethod
            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getF60524h() {
                return this.f60520h;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof OtherMethod)) {
                    return false;
                }
                OtherMethod otherMethod = (OtherMethod) obj2;
                return this.f60517b == otherMethod.f60517b && Intrinsics.f(this.f60518c, otherMethod.f60518c) && Intrinsics.f(this.d, otherMethod.d) && Intrinsics.f(this.e, otherMethod.e) && Intrinsics.f(this.f, otherMethod.f) && Intrinsics.f(this.f60519g, otherMethod.f60519g) && this.f60520h == otherMethod.f60520h;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getDescription, reason: from getter */
            public final String getD() {
                return this.d;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF60522c() {
                return this.f60518c;
            }

            public final int hashCode() {
                int iC = p.a.c(this.f60517b.hashCode() * 31, 31, this.f60518c);
                String str = this.d;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                io3.b bVar = this.e;
                int iD = p.a.d((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f);
                String str2 = this.f60519g;
                return Boolean.hashCode(this.f60520h) + ((iD + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f60517b.name());
                dest.writeString(this.f60518c);
                dest.writeString(this.d);
                dest.writeSerializable(this.e);
                dest.writeStringList(this.f);
                dest.writeString(this.f60519g);
                dest.writeInt(this.f60520h ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethod$SuggestedMethod$PixSmartTransferInstitution;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$SuggestedMethod;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PixSmartTransferInstitution extends SuggestedMethod {

            @NotNull
            public static final Parcelable.Creator<PixSmartTransferInstitution> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f60521b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f60522c;
            public final String d;
            public final io3.b e;
            public final List f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final String f60523g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final boolean f60524h;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PixSmartTransferInstitution(parcel.readString(), parcel.readString(), parcel.readString(), (io3.b) parcel.readSerializable(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PixSmartTransferInstitution[i];
                }
            }

            public PixSmartTransferInstitution(String institutionId, String title, String str, io3.b bVar, List supportedCurrencyCodes, String str2, boolean z) {
                Intrinsics.checkNotNullParameter(institutionId, "institutionId");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(supportedCurrencyCodes, "supportedCurrencyCodes");
                this.f60521b = institutionId;
                this.f60522c = title;
                this.d = str;
                this.e = bVar;
                this.f = supportedCurrencyCodes;
                this.f60523g = str2;
                this.f60524h = z;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: F, reason: from getter */
            public final io3.b getE() {
                return this.e;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF60523g() {
                return this.f60523g;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: b, reason: from getter */
            public final List getF() {
                return this.f;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod.SuggestedMethod
            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getF60524h() {
                return this.f60524h;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof PixSmartTransferInstitution)) {
                    return false;
                }
                PixSmartTransferInstitution pixSmartTransferInstitution = (PixSmartTransferInstitution) obj2;
                return Intrinsics.f(this.f60521b, pixSmartTransferInstitution.f60521b) && Intrinsics.f(this.f60522c, pixSmartTransferInstitution.f60522c) && Intrinsics.f(this.d, pixSmartTransferInstitution.d) && Intrinsics.f(this.e, pixSmartTransferInstitution.e) && Intrinsics.f(this.f, pixSmartTransferInstitution.f) && Intrinsics.f(this.f60523g, pixSmartTransferInstitution.f60523g) && this.f60524h == pixSmartTransferInstitution.f60524h;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getDescription, reason: from getter */
            public final String getD() {
                return this.d;
            }

            @Override // com.revolut.domain.models.topup.methods.TopupMethod
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF60522c() {
                return this.f60522c;
            }

            public final int hashCode() {
                int iC = p.a.c(this.f60521b.hashCode() * 31, 31, this.f60522c);
                String str = this.d;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                io3.b bVar = this.e;
                int iD = p.a.d((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f);
                String str2 = this.f60523g;
                return Boolean.hashCode(this.f60524h) + ((iD + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f60521b);
                dest.writeString(this.f60522c);
                dest.writeString(this.d);
                dest.writeSerializable(this.e);
                dest.writeStringList(this.f);
                dest.writeString(this.f60523g);
                dest.writeInt(this.f60524h ? 1 : 0);
            }
        }

        /* JADX INFO: renamed from: c */
        public abstract boolean getF60524h();

        @Override // com.revolut.domain.models.topup.methods.TopupMethod
        /* JADX INFO: renamed from: p, reason: from getter */
        public final List getF60508a() {
            return this.f60508a;
        }
    }

    private TopupMethod() {
    }

    /* JADX INFO: renamed from: F */
    public abstract io3.b getE();

    /* JADX INFO: renamed from: a */
    public abstract String getF60523g();

    /* JADX INFO: renamed from: b */
    public abstract List getF();

    /* JADX INFO: renamed from: getDescription */
    public abstract String getD();

    /* JADX INFO: renamed from: getTitle */
    public abstract String getF60522c();

    /* JADX INFO: renamed from: p */
    public abstract List getF60508a();
}
