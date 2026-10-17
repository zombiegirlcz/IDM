package com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "PreselectedInstitution", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CrossBorderLinkAccountFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CrossBorderLinkAccountFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PreselectedInstitution f72859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration f72861c;
    public final ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration d;
    public final NaviCommand e;
    public final AnalyticsProduct f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f72862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f72863h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$InputData$PreselectedInstitution;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PreselectedInstitution implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PreselectedInstitution> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f72866c;
        public final boolean d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z3 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z3 = false;
                }
                return new PreselectedInstitution(string, string2, parcel.readString(), z3, parcel.readInt() != 0 ? z : false);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PreselectedInstitution[i];
            }
        }

        public PreselectedInstitution(String institutionId, String str, String institutionName, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(institutionName, "institutionName");
            this.f72864a = institutionId;
            this.f72865b = str;
            this.f72866c = z;
            this.d = z3;
            this.e = institutionName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PreselectedInstitution)) {
                return false;
            }
            PreselectedInstitution preselectedInstitution = (PreselectedInstitution) obj2;
            return Intrinsics.f(this.f72864a, preselectedInstitution.f72864a) && Intrinsics.f(this.f72865b, preselectedInstitution.f72865b) && this.f72866c == preselectedInstitution.f72866c && this.d == preselectedInstitution.d && Intrinsics.f(this.e, preselectedInstitution.e);
        }

        public final int hashCode() {
            int iHashCode = this.f72864a.hashCode() * 31;
            String str = this.f72865b;
            return this.e.hashCode() + j6.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f72866c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72864a);
            dest.writeString(this.f72865b);
            dest.writeInt(this.f72866c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeString(this.e);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CrossBorderLinkAccountFlowContract$InputData(parcel.readInt() == 0 ? null : PreselectedInstitution.CREATOR.createFromParcel(parcel), parcel.readString(), (ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration) parcel.readParcelable(CrossBorderLinkAccountFlowContract$InputData.class.getClassLoader()), (ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration) parcel.readParcelable(CrossBorderLinkAccountFlowContract$InputData.class.getClassLoader()), (NaviCommand) parcel.readParcelable(CrossBorderLinkAccountFlowContract$InputData.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(CrossBorderLinkAccountFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CrossBorderLinkAccountFlowContract$InputData[i];
        }
    }

    public CrossBorderLinkAccountFlowContract$InputData(PreselectedInstitution preselectedInstitution, String str, ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration externalInstitutionsConfiguration, ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration externalConsentConfiguration, NaviCommand naviCommand, AnalyticsProduct analyticsProduct, boolean z, String str2) {
        Intrinsics.checkNotNullParameter(externalInstitutionsConfiguration, "externalInstitutionsConfiguration");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f72859a = preselectedInstitution;
        this.f72860b = str;
        this.f72861c = externalInstitutionsConfiguration;
        this.d = externalConsentConfiguration;
        this.e = naviCommand;
        this.f = analyticsProduct;
        this.f72862g = z;
        this.f72863h = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CrossBorderLinkAccountFlowContract$InputData)) {
            return false;
        }
        CrossBorderLinkAccountFlowContract$InputData crossBorderLinkAccountFlowContract$InputData = (CrossBorderLinkAccountFlowContract$InputData) obj2;
        return Intrinsics.f(this.f72859a, crossBorderLinkAccountFlowContract$InputData.f72859a) && Intrinsics.f(this.f72860b, crossBorderLinkAccountFlowContract$InputData.f72860b) && Intrinsics.f(this.f72861c, crossBorderLinkAccountFlowContract$InputData.f72861c) && Intrinsics.f(this.d, crossBorderLinkAccountFlowContract$InputData.d) && Intrinsics.f(this.e, crossBorderLinkAccountFlowContract$InputData.e) && Intrinsics.f(this.f, crossBorderLinkAccountFlowContract$InputData.f) && this.f72862g == crossBorderLinkAccountFlowContract$InputData.f72862g && Intrinsics.f(this.f72863h, crossBorderLinkAccountFlowContract$InputData.f72863h);
    }

    public final int hashCode() {
        PreselectedInstitution preselectedInstitution = this.f72859a;
        int iHashCode = (preselectedInstitution == null ? 0 : preselectedInstitution.hashCode()) * 31;
        String str = this.f72860b;
        int iHashCode2 = (this.f72861c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration externalConsentConfiguration = this.d;
        int iHashCode3 = (iHashCode2 + (externalConsentConfiguration == null ? 0 : externalConsentConfiguration.hashCode())) * 31;
        NaviCommand naviCommand = this.e;
        int iC = j6.a.c(l.a((iHashCode3 + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31, 31, this.f), 31, this.f72862g);
        String str2 = this.f72863h;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        PreselectedInstitution preselectedInstitution = this.f72859a;
        if (preselectedInstitution == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            preselectedInstitution.writeToParcel(dest, i);
        }
        dest.writeString(this.f72860b);
        dest.writeParcelable(this.f72861c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeInt(this.f72862g ? 1 : 0);
        dest.writeString(this.f72863h);
    }
}
