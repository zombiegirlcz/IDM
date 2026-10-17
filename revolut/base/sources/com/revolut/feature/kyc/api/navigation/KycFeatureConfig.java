package com.revolut.feature.kyc.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.kyc.api.KycContract$Requirement;
import com.revolut.feature.kyc.api.model.KycFinalCommand;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import ehe.n;
import h30.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.k;
import my8.r;
import org.jetbrains.annotations.NotNull;
import wi0.b;
import yhm.d;
import yt8.e;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/kyc/api/navigation/KycFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "InitKyc", "StartKyc", "AddressVerificationKyc", "TaxMissingProofKyc", "StartKycMyNumber", "KycDocumentReview", "Lcom/revolut/feature/kyc/api/navigation/KycFeatureConfig$AddressVerificationKyc;", "Lcom/revolut/feature/kyc/api/navigation/KycFeatureConfig$InitKyc;", "Lcom/revolut/feature/kyc/api/navigation/KycFeatureConfig$StartKyc;", "Lcom/revolut/feature/kyc/api/navigation/KycFeatureConfig$StartKycMyNumber;", "Lcom/revolut/feature/kyc/api/navigation/KycFeatureConfig$TaxMissingProofKyc;", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class KycFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/api/navigation/KycFeatureConfig$AddressVerificationKyc;", "Lcom/revolut/feature/kyc/api/navigation/KycFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddressVerificationKyc extends KycFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<AddressVerificationKyc> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f77482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f77483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final KycContract$Requirement f77484c;
        public final String d;
        public final boolean e;
        public final gt8.a f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f77485g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                gt8.a aVar;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                b bVar = (b) parcel.readSerializable();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                KycContract$Requirement kycContract$RequirementCreateFromParcel = KycContract$Requirement.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                boolean z4 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                gt8.a aVarValueOf = gt8.a.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    z3 = true;
                    aVar = aVarValueOf;
                } else {
                    aVar = aVarValueOf;
                    z3 = z;
                }
                return new AddressVerificationKyc(bVar, numValueOf, kycContract$RequirementCreateFromParcel, string, z4, aVar, z3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressVerificationKyc[i];
            }
        }

        public AddressVerificationKyc(b bVar, Integer num, KycContract$Requirement requirement, String flowName, boolean z, gt8.a completionDialog, boolean z3) {
            Intrinsics.checkNotNullParameter(requirement, "requirement");
            Intrinsics.checkNotNullParameter(flowName, "flowName");
            Intrinsics.checkNotNullParameter(completionDialog, "completionDialog");
            this.f77482a = bVar;
            this.f77483b = num;
            this.f77484c = requirement;
            this.d = flowName;
            this.e = z;
            this.f = completionDialog;
            this.f77485g = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddressVerificationKyc)) {
                return false;
            }
            AddressVerificationKyc addressVerificationKyc = (AddressVerificationKyc) obj2;
            return Intrinsics.f(this.f77482a, addressVerificationKyc.f77482a) && Intrinsics.f(this.f77483b, addressVerificationKyc.f77483b) && Intrinsics.f(this.f77484c, addressVerificationKyc.f77484c) && Intrinsics.f(this.d, addressVerificationKyc.d) && this.e == addressVerificationKyc.e && this.f == addressVerificationKyc.f && this.f77485g == addressVerificationKyc.f77485g;
        }

        public final int hashCode() {
            b bVar = this.f77482a;
            int iHashCode = (bVar == null ? 0 : bVar.f297794a.hashCode()) * 31;
            Integer num = this.f77483b;
            return Boolean.hashCode(this.f77485g) + ((this.f.hashCode() + j6.a.c(p.a.c((this.f77484c.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31)) * 31, 31, this.d), 31, this.e)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f77482a);
            Integer num = this.f77483b;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            this.f77484c.writeToParcel(dest, i);
            dest.writeString(this.d);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeString(this.f.name());
            dest.writeInt(this.f77485g ? 1 : 0);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/api/navigation/KycFeatureConfig$InitKyc;", "Lcom/revolut/feature/kyc/api/navigation/KycFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @d
    public static final /* data */ class InitKyc extends KycFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<InitKyc> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f77486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NaviCommand f77487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f77488c;
        public final boolean d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                NaviCommand naviCommand;
                b bVar;
                boolean z4;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z6 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                NaviCommand naviCommand2 = (NaviCommand) parcel.readParcelable(InitKyc.class.getClassLoader());
                b bVar2 = (b) parcel.readSerializable();
                if (parcel.readInt() != 0) {
                    z3 = true;
                    naviCommand = naviCommand2;
                    bVar = bVar2;
                    z4 = true;
                } else {
                    z3 = true;
                    naviCommand = naviCommand2;
                    bVar = bVar2;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new InitKyc(z6, naviCommand, bVar, z4, z3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InitKyc[i];
            }
        }

        public InitKyc() {
            this(null, false, 31);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InitKyc)) {
                return false;
            }
            InitKyc initKyc = (InitKyc) obj2;
            return this.f77486a == initKyc.f77486a && Intrinsics.f(this.f77487b, initKyc.f77487b) && Intrinsics.f(this.f77488c, initKyc.f77488c) && this.d == initKyc.d && this.e == initKyc.e;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f77486a) * 31;
            NaviCommand naviCommand = this.f77487b;
            int iHashCode2 = (iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
            b bVar = this.f77488c;
            return Boolean.hashCode(this.e) + j6.a.c((iHashCode2 + (bVar != null ? bVar.f297794a.hashCode() : 0)) * 31, 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f77486a ? 1 : 0);
            dest.writeParcelable(this.f77487b, i);
            dest.writeSerializable(this.f77488c);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
        }

        public InitKyc(boolean z, NaviCommand naviCommand, b bVar, boolean z3, boolean z4) {
            this.f77486a = z;
            this.f77487b = naviCommand;
            this.f77488c = bVar;
            this.d = z3;
            this.e = z4;
        }

        public /* synthetic */ InitKyc(NaviCommand naviCommand, boolean z, int i) {
            this(true, (i & 2) != 0 ? null : naviCommand, null, true, (i & 16) != 0 ? false : z);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/api/navigation/KycFeatureConfig$KycDocumentReview;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class KycDocumentReview extends KompotBridgeFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<KycDocumentReview> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f77489g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ReviewDocumentDestination f77490h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new KycDocumentReview(parcel.readInt(), ReviewDocumentDestination.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new KycDocumentReview[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KycDocumentReview(int i, ReviewDocumentDestination reviewDocumentDestination) {
            super((ActivityAnimation) null, (ParcelableDestination) reviewDocumentDestination, false, Integer.valueOf(i), 0, 53);
            Intrinsics.checkNotNullParameter(reviewDocumentDestination, "reviewDocumentDestination");
            this.f77489g = i;
            this.f77490h = reviewDocumentDestination;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: c */
        public final Integer getF66060h() {
            return Integer.valueOf(this.f77489g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof KycDocumentReview)) {
                return false;
            }
            KycDocumentReview kycDocumentReview = (KycDocumentReview) obj2;
            return this.f77489g == kycDocumentReview.f77489g && Intrinsics.f(this.f77490h, kycDocumentReview.f77490h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f77490h.hashCode() + (Integer.hashCode(this.f77489g) * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f77489g);
            this.f77490h.writeToParcel(dest, i);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/api/navigation/KycFeatureConfig$StartKycMyNumber;", "Lcom/revolut/feature/kyc/api/navigation/KycFeatureConfig;", "<init>", "()V", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StartKycMyNumber extends KycFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StartKycMyNumber f77502a = new StartKycMyNumber();

        @NotNull
        public static final Parcelable.Creator<StartKycMyNumber> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StartKycMyNumber.f77502a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StartKycMyNumber[i];
            }
        }

        private StartKycMyNumber() {
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

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/api/navigation/KycFeatureConfig$TaxMissingProofKyc;", "Lcom/revolut/feature/kyc/api/navigation/KycFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxMissingProofKyc extends KycFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<TaxMissingProofKyc> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f77503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f77504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f77505c;
        public final String d;
        public final gt8.a e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxMissingProofKyc(r.valueOf(parcel.readString()), (b) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), gt8.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxMissingProofKyc[i];
            }
        }

        public TaxMissingProofKyc(r scope, b bVar, Integer num, String flowName, gt8.a completionDialog) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(flowName, "flowName");
            Intrinsics.checkNotNullParameter(completionDialog, "completionDialog");
            this.f77503a = scope;
            this.f77504b = bVar;
            this.f77505c = num;
            this.d = flowName;
            this.e = completionDialog;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TaxMissingProofKyc)) {
                return false;
            }
            TaxMissingProofKyc taxMissingProofKyc = (TaxMissingProofKyc) obj2;
            return this.f77503a == taxMissingProofKyc.f77503a && Intrinsics.f(this.f77504b, taxMissingProofKyc.f77504b) && Intrinsics.f(this.f77505c, taxMissingProofKyc.f77505c) && Intrinsics.f(this.d, taxMissingProofKyc.d) && this.e == taxMissingProofKyc.e;
        }

        public final int hashCode() {
            int iHashCode = this.f77503a.hashCode() * 31;
            b bVar = this.f77504b;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
            Integer num = this.f77505c;
            return this.e.hashCode() + p.a.c((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77503a.name());
            dest.writeSerializable(this.f77504b);
            Integer num = this.f77505c;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            dest.writeString(this.d);
            dest.writeString(this.e.name());
        }
    }

    private KycFeatureConfig() {
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/api/navigation/KycFeatureConfig$StartKyc;", "Lcom/revolut/feature/kyc/api/navigation/KycFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StartKyc extends KycFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<StartKyc> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final KycFinalCommand f77492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f77493c;
        public final boolean d;
        public final Integer e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final KycContract$Requirement f77494g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f77495h;
        public final AnalyticsProduct i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final r f77496j;
        public final gt8.a k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f77497l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final e f77498m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f77499n;
        public final String o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f77500p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Set f77501q;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                Integer num;
                boolean z4;
                boolean z6;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                KycFinalCommand kycFinalCommand = (KycFinalCommand) parcel.readParcelable(StartKyc.class.getClassLoader());
                b bVar = (b) parcel.readSerializable();
                boolean z11 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z11 = true;
                } else {
                    z = false;
                }
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() != 0) {
                    z3 = true;
                    num = numValueOf;
                    z4 = true;
                } else {
                    z3 = true;
                    num = numValueOf;
                    z4 = z;
                }
                KycContract$Requirement kycContract$RequirementCreateFromParcel = KycContract$Requirement.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z6 = z3;
                } else {
                    z6 = z3;
                    z3 = z;
                }
                AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(StartKyc.class.getClassLoader());
                r rVarValueOf = r.valueOf(parcel.readString());
                gt8.a aVarValueOf = gt8.a.valueOf(parcel.readString());
                boolean z12 = z6;
                String string2 = parcel.readString();
                e eVarValueOf = parcel.readInt() != 0 ? e.valueOf(parcel.readString()) : null;
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z29 = parcel.readInt() != 0 ? z12 : z;
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(k.valueOf(parcel.readString()));
                }
                return new StartKyc(string, kycFinalCommand, bVar, z11, num, z4, kycContract$RequirementCreateFromParcel, z3, analyticsProduct, rVarValueOf, aVarValueOf, string2, eVarValueOf, string3, string4, z29, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StartKyc[i];
            }
        }

        public StartKyc(String flowName, KycFinalCommand kycFinalCommand, b bVar, boolean z, Integer num, boolean z3, KycContract$Requirement requirement, boolean z4, AnalyticsProduct automaticEventProduct, r kycScope, gt8.a completionDialog, String str, e eVar, String str2, String str3, boolean z6, Set acceptedConsents) {
            Intrinsics.checkNotNullParameter(flowName, "flowName");
            Intrinsics.checkNotNullParameter(requirement, "requirement");
            Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
            Intrinsics.checkNotNullParameter(kycScope, "kycScope");
            Intrinsics.checkNotNullParameter(completionDialog, "completionDialog");
            Intrinsics.checkNotNullParameter(acceptedConsents, "acceptedConsents");
            this.f77491a = flowName;
            this.f77492b = kycFinalCommand;
            this.f77493c = bVar;
            this.d = z;
            this.e = num;
            this.f = z3;
            this.f77494g = requirement;
            this.f77495h = z4;
            this.i = automaticEventProduct;
            this.f77496j = kycScope;
            this.k = completionDialog;
            this.f77497l = str;
            this.f77498m = eVar;
            this.f77499n = str2;
            this.o = str3;
            this.f77500p = z6;
            this.f77501q = acceptedConsents;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StartKyc)) {
                return false;
            }
            StartKyc startKyc = (StartKyc) obj2;
            return Intrinsics.f(this.f77491a, startKyc.f77491a) && Intrinsics.f(this.f77492b, startKyc.f77492b) && Intrinsics.f(this.f77493c, startKyc.f77493c) && this.d == startKyc.d && Intrinsics.f(this.e, startKyc.e) && this.f == startKyc.f && Intrinsics.f(this.f77494g, startKyc.f77494g) && this.f77495h == startKyc.f77495h && Intrinsics.f(this.i, startKyc.i) && this.f77496j == startKyc.f77496j && this.k == startKyc.k && Intrinsics.f(this.f77497l, startKyc.f77497l) && this.f77498m == startKyc.f77498m && Intrinsics.f(this.f77499n, startKyc.f77499n) && Intrinsics.f(this.o, startKyc.o) && this.f77500p == startKyc.f77500p && Intrinsics.f(this.f77501q, startKyc.f77501q);
        }

        public final int hashCode() {
            int iHashCode = this.f77491a.hashCode() * 31;
            KycFinalCommand kycFinalCommand = this.f77492b;
            int iHashCode2 = (iHashCode + (kycFinalCommand == null ? 0 : kycFinalCommand.hashCode())) * 31;
            b bVar = this.f77493c;
            int iC = j6.a.c((iHashCode2 + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31, 31, this.d);
            Integer num = this.e;
            int iHashCode3 = (this.k.hashCode() + ((this.f77496j.hashCode() + l.a(j6.a.c((this.f77494g.hashCode() + j6.a.c((iC + (num == null ? 0 : num.hashCode())) * 31, 31, this.f)) * 31, 31, this.f77495h), 31, this.i)) * 31)) * 31;
            String str = this.f77497l;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            e eVar = this.f77498m;
            int iHashCode5 = (iHashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            String str2 = this.f77499n;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.o;
            return this.f77501q.hashCode() + j6.a.c((iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f77500p);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77491a);
            dest.writeParcelable(this.f77492b, i);
            dest.writeSerializable(this.f77493c);
            dest.writeInt(this.d ? 1 : 0);
            Integer num = this.e;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            dest.writeInt(this.f ? 1 : 0);
            this.f77494g.writeToParcel(dest, i);
            dest.writeInt(this.f77495h ? 1 : 0);
            dest.writeParcelable(this.i, i);
            dest.writeString(this.f77496j.name());
            dest.writeString(this.k.name());
            dest.writeString(this.f77497l);
            e eVar = this.f77498m;
            if (eVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(eVar.name());
            }
            dest.writeString(this.f77499n);
            dest.writeString(this.o);
            dest.writeInt(this.f77500p ? 1 : 0);
            Iterator itV = n.v(this.f77501q, dest);
            while (itV.hasNext()) {
                dest.writeString(((k) itV.next()).name());
            }
        }

        public StartKyc(KycFinalCommand kycFinalCommand, b bVar, boolean z, Integer num, KycContract$Requirement kycContract$Requirement, boolean z3, AnalyticsProduct.Retail retail, r rVar, gt8.a aVar, String str, e eVar, String str2, String str3, boolean z4, Set set, int i) {
            this("KYC_FLOW", (i & 2) != 0 ? null : kycFinalCommand, (i & 4) != 0 ? null : bVar, z, (i & 16) != 0 ? null : num, false, (i & 64) != 0 ? new KycContract$Requirement(true) : kycContract$Requirement, z3, retail, rVar, aVar, (i & 2048) != 0 ? null : str, (i & 4096) != 0 ? null : eVar, (i & 8192) != 0 ? null : str2, (i & 16384) != 0 ? null : str3, (32768 & i) != 0 ? false : z4, (i & 65536) != 0 ? h0.f322473a : set);
        }
    }
}
