package com.revolut.feature.credit.application.plugins.impl.ui.backendflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p54.c;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/backendflow/CreditBackendFlowContract$Configuration", "Lcom/revolut/feature/credit/application/plugins/api/navigation/plugins/CreditApplicationPluginFlowContract$PluginConfigurationContract;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditBackendFlowContract$Configuration implements CreditApplicationPluginFlowContract$PluginConfigurationContract {

    @NotNull
    public static final Parcelable.Creator<CreditBackendFlowContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f67153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f67154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BackendFlowContract$Configuration f67155c;
    public final Parcelable d;
    public final CreditApplicationPluginFlowContract$Configuration e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            BackendFlowContract$Configuration backendFlowContract$Configuration;
            CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration;
            Parcelable parcelable;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            c cVarValueOf = c.valueOf(parcel.readString());
            boolean z4 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            BackendFlowContract$Configuration backendFlowContract$Configuration2 = (BackendFlowContract$Configuration) parcel.readParcelable(CreditBackendFlowContract$Configuration.class.getClassLoader());
            Parcelable parcelable2 = parcel.readParcelable(CreditBackendFlowContract$Configuration.class.getClassLoader());
            CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration2 = (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(CreditBackendFlowContract$Configuration.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z3 = true;
                backendFlowContract$Configuration = backendFlowContract$Configuration2;
                creditApplicationPluginFlowContract$Configuration = creditApplicationPluginFlowContract$Configuration2;
                parcelable = parcelable2;
            } else {
                backendFlowContract$Configuration = backendFlowContract$Configuration2;
                creditApplicationPluginFlowContract$Configuration = creditApplicationPluginFlowContract$Configuration2;
                parcelable = parcelable2;
                z3 = z;
            }
            return new CreditBackendFlowContract$Configuration(cVarValueOf, z4, backendFlowContract$Configuration, parcelable, creditApplicationPluginFlowContract$Configuration, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditBackendFlowContract$Configuration[i];
        }
    }

    public CreditBackendFlowContract$Configuration(c finishAction, boolean z, BackendFlowContract$Configuration backendFlowConfiguration, Parcelable parcelable, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, boolean z3) {
        Intrinsics.checkNotNullParameter(finishAction, "finishAction");
        Intrinsics.checkNotNullParameter(backendFlowConfiguration, "backendFlowConfiguration");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f67153a = finishAction;
        this.f67154b = z;
        this.f67155c = backendFlowConfiguration;
        this.d = parcelable;
        this.e = pluginConfiguration;
        this.f = z3;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getF68330b() {
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
        if (!(obj2 instanceof CreditBackendFlowContract$Configuration)) {
            return false;
        }
        CreditBackendFlowContract$Configuration creditBackendFlowContract$Configuration = (CreditBackendFlowContract$Configuration) obj2;
        return this.f67153a == creditBackendFlowContract$Configuration.f67153a && this.f67154b == creditBackendFlowContract$Configuration.f67154b && Intrinsics.f(this.f67155c, creditBackendFlowContract$Configuration.f67155c) && Intrinsics.f(this.d, creditBackendFlowContract$Configuration.d) && Intrinsics.f(this.e, creditBackendFlowContract$Configuration.e) && this.f == creditBackendFlowContract$Configuration.f;
    }

    public final int hashCode() {
        int iHashCode = (this.f67155c.hashCode() + j6.a.c(this.f67153a.hashCode() * 31, 31, this.f67154b)) * 31;
        Parcelable parcelable = this.d;
        return Boolean.hashCode(this.f) + org.bouncycastle.jcajce.provider.digest.a.c(this.e, (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67153a.name());
        dest.writeInt(this.f67154b ? 1 : 0);
        dest.writeParcelable(this.f67155c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CreditBackendFlowContract$Configuration(p54.c r8, com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration r9, com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.manage_details.ManageCoBorrowerDetailsParcel r10, com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r11, boolean r12, int r13) {
        /*
            r7 = this;
            r0 = r13 & 1
            if (r0 == 0) goto L6
            p54.c r8 = p54.c.MOVE_NEXT
        L6:
            r1 = r8
            r8 = r13 & 2
            r0 = 1
            if (r8 == 0) goto Lf
            r8 = 0
            r2 = r8
            goto L10
        Lf:
            r2 = r0
        L10:
            r8 = r13 & 8
            if (r8 == 0) goto L15
            r10 = 0
        L15:
            r4 = r10
            r8 = r13 & 32
            if (r8 == 0) goto L1f
            r6 = r0
            r3 = r9
            r5 = r11
            r0 = r7
            goto L23
        L1f:
            r6 = r12
            r0 = r7
            r3 = r9
            r5 = r11
        L23:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.backendflow.CreditBackendFlowContract$Configuration.<init>(p54.c, com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration, com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.manage_details.ManageCoBorrowerDetailsParcel, com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration, boolean, int):void");
    }
}
