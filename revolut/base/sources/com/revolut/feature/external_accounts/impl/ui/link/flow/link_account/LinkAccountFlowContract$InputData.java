package com.revolut.feature.external_accounts.impl.ui.link.flow.link_account;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.retail.core.navigation.NaviCommand;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "PreselectedInstitution", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LinkAccountFlowContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LinkAccountFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PreselectedInstitution f72990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f72992c;
    public final boolean d;
    public final ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration e;
    public final ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NaviCommand f72993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnalyticsProduct f72994h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f72995j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$InputData$PreselectedInstitution;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PreselectedInstitution implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PreselectedInstitution> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f72998c;
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
            this.f72996a = institutionId;
            this.f72997b = str;
            this.f72998c = z;
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
            return Intrinsics.f(this.f72996a, preselectedInstitution.f72996a) && Intrinsics.f(this.f72997b, preselectedInstitution.f72997b) && this.f72998c == preselectedInstitution.f72998c && this.d == preselectedInstitution.d && Intrinsics.f(this.e, preselectedInstitution.e);
        }

        public final int hashCode() {
            int iHashCode = this.f72996a.hashCode() * 31;
            String str = this.f72997b;
            return this.e.hashCode() + j6.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f72998c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72996a);
            dest.writeString(this.f72997b);
            dest.writeInt(this.f72998c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeString(this.e);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            PreselectedInstitution preselectedInstitutionCreateFromParcel = parcel.readInt() == 0 ? null : PreselectedInstitution.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            boolean z4 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z6 = z;
            }
            ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration externalInstitutionsConfiguration = (ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration) parcel.readParcelable(LinkAccountFlowContract$InputData.class.getClassLoader());
            ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration externalConsentConfiguration = (ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration) parcel.readParcelable(LinkAccountFlowContract$InputData.class.getClassLoader());
            NaviCommand naviCommand = (NaviCommand) parcel.readParcelable(LinkAccountFlowContract$InputData.class.getClassLoader());
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(LinkAccountFlowContract$InputData.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z = z3;
            }
            return new LinkAccountFlowContract$InputData(preselectedInstitutionCreateFromParcel, string, z4, z6, externalInstitutionsConfiguration, externalConsentConfiguration, naviCommand, analyticsProduct, z, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LinkAccountFlowContract$InputData[i];
        }
    }

    public LinkAccountFlowContract$InputData(PreselectedInstitution preselectedInstitution, String str, boolean z, boolean z3, ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration externalInstitutionsConfiguration, ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration externalConsentConfiguration, NaviCommand naviCommand, AnalyticsProduct analyticsProduct, boolean z4, String str2) {
        Intrinsics.checkNotNullParameter(externalInstitutionsConfiguration, "externalInstitutionsConfiguration");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f72990a = preselectedInstitution;
        this.f72991b = str;
        this.f72992c = z;
        this.d = z3;
        this.e = externalInstitutionsConfiguration;
        this.f = externalConsentConfiguration;
        this.f72993g = naviCommand;
        this.f72994h = analyticsProduct;
        this.i = z4;
        this.f72995j = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LinkAccountFlowContract$InputData)) {
            return false;
        }
        LinkAccountFlowContract$InputData linkAccountFlowContract$InputData = (LinkAccountFlowContract$InputData) obj2;
        return Intrinsics.f(this.f72990a, linkAccountFlowContract$InputData.f72990a) && Intrinsics.f(this.f72991b, linkAccountFlowContract$InputData.f72991b) && this.f72992c == linkAccountFlowContract$InputData.f72992c && this.d == linkAccountFlowContract$InputData.d && Intrinsics.f(this.e, linkAccountFlowContract$InputData.e) && Intrinsics.f(this.f, linkAccountFlowContract$InputData.f) && Intrinsics.f(this.f72993g, linkAccountFlowContract$InputData.f72993g) && Intrinsics.f(this.f72994h, linkAccountFlowContract$InputData.f72994h) && this.i == linkAccountFlowContract$InputData.i && Intrinsics.f(this.f72995j, linkAccountFlowContract$InputData.f72995j);
    }

    public final int hashCode() {
        PreselectedInstitution preselectedInstitution = this.f72990a;
        int iHashCode = (preselectedInstitution == null ? 0 : preselectedInstitution.hashCode()) * 31;
        String str = this.f72991b;
        int iHashCode2 = (this.e.hashCode() + j6.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f72992c), 31, this.d)) * 31;
        ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration externalConsentConfiguration = this.f;
        int iHashCode3 = (iHashCode2 + (externalConsentConfiguration == null ? 0 : externalConsentConfiguration.hashCode())) * 31;
        NaviCommand naviCommand = this.f72993g;
        int iC = j6.a.c(l.a((iHashCode3 + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31, 31, this.f72994h), 31, this.i);
        String str2 = this.f72995j;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        PreselectedInstitution preselectedInstitution = this.f72990a;
        if (preselectedInstitution == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            preselectedInstitution.writeToParcel(dest, i);
        }
        dest.writeString(this.f72991b);
        dest.writeInt(this.f72992c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f72993g, i);
        dest.writeParcelable(this.f72994h, i);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeString(this.f72995j);
    }
}
