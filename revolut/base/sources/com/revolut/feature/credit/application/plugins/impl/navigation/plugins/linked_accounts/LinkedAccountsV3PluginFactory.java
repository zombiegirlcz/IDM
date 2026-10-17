package com.revolut.feature.credit.application.plugins.impl.navigation.plugins.linked_accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.CreditLinkedAccountsV3Controller;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.CreditLinkedAccountsV3FlowContract$InputData;
import efm.d0;
import gc0.c;
import grl.r2;
import hs3.f0;
import hs3.v;
import io3.h;
import it3.d;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;
import sv3.b;

/* JADX INFO: loaded from: classes22.dex */
public final class LinkedAccountsV3PluginFactory implements b, oz3.b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/navigation/plugins/linked_accounts/LinkedAccountsV3PluginFactory$LinkedAccountsLaunchInstructions;", "Lcom/revolut/feature/credit/application/models/initialization_contract/PluginLaunchInstructions;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedAccountsLaunchInstructions implements PluginLaunchInstructions {

        @NotNull
        public static final Parcelable.Creator<LinkedAccountsLaunchInstructions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f66942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f66943b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedAccountsLaunchInstructions(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedAccountsLaunchInstructions[i];
            }
        }

        public LinkedAccountsLaunchInstructions(boolean z, boolean z3) {
            this.f66942a = z;
            this.f66943b = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LinkedAccountsLaunchInstructions)) {
                return false;
            }
            LinkedAccountsLaunchInstructions linkedAccountsLaunchInstructions = (LinkedAccountsLaunchInstructions) obj2;
            return this.f66942a == linkedAccountsLaunchInstructions.f66942a && this.f66943b == linkedAccountsLaunchInstructions.f66943b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f66943b) + (Boolean.hashCode(this.f66942a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f66942a ? 1 : 0);
            dest.writeInt(this.f66943b ? 1 : 0);
        }
    }

    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$ConfigurationR = h.R(pluginPayload, "");
        PluginLaunchInstructions pluginLaunchInstructions = pluginPayload.e;
        if (!(pluginLaunchInstructions instanceof LinkedAccountsLaunchInstructions)) {
            throw new IllegalStateException(m72.b.r("Can't find plugin configuration: ", o0.f186429a.b(LinkedAccountsLaunchInstructions.class)));
        }
        LinkedAccountsLaunchInstructions linkedAccountsLaunchInstructions = (LinkedAccountsLaunchInstructions) pluginLaunchInstructions;
        return new CreditLinkedAccountsV3Controller(new CreditLinkedAccountsV3FlowContract$InputData(creditApplicationPluginFlowContract$ConfigurationR, linkedAccountsLaunchInstructions.f66942a, linkedAccountsLaunchInstructions.f66943b));
    }

    @Override // oz3.b
    public final Object b(d dVar, CreditApplicationStatusNavigationConfig creditApplicationStatusNavigationConfig, r2 r2Var, wi0.b bVar, String str, Continuation continuation) {
        Object obj2;
        Object next;
        List list = dVar.f;
        Object obj3 = dVar.e;
        Object obj4 = null;
        if (obj3 instanceof f0) {
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.LinkedAccountsMetadata");
            }
            obj2 = (f0) obj3;
        } else if (list != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (next instanceof f0) {
                    break;
                }
            }
            obj2 = (v) next;
        } else {
            obj2 = null;
        }
        f0 f0Var = (f0) obj2;
        boolean z = f0Var != null ? f0Var.f154887b : false;
        if (obj3 instanceof f0) {
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.LinkedAccountsMetadata");
            }
            obj4 = (f0) obj3;
        } else if (list != null) {
            Iterator it9 = list.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                Object next2 = it9.next();
                if (next2 instanceof f0) {
                    obj4 = next2;
                    break;
                }
            }
            obj4 = (v) obj4;
        }
        f0 f0Var2 = (f0) obj4;
        boolean z3 = f0Var2 != null ? f0Var2.f154886a : false;
        PluginPayload.Companion companion = PluginPayload.INSTANCE;
        LinkedAccountsLaunchInstructions linkedAccountsLaunchInstructions = new LinkedAccountsLaunchInstructions(z3, z);
        companion.getClass();
        return PluginPayload.Companion.a(dVar, r2Var, bVar, str, linkedAccountsLaunchInstructions);
    }

    @Override // sv3.b
    public final d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Object obj2;
        Object next;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$ConfigurationR = h.R(payload, "");
        d dVar = payload.f66247a;
        Object obj3 = dVar.e;
        Object obj4 = null;
        if (!(obj3 instanceof f0)) {
            List list = dVar.f;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (next instanceof f0) {
                        break;
                    }
                }
                obj2 = (v) next;
            } else {
                obj2 = null;
            }
        } else {
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.LinkedAccountsMetadata");
            }
            obj2 = (f0) obj3;
        }
        f0 f0Var = (f0) obj2;
        boolean z = f0Var != null ? f0Var.f154886a : false;
        v vVar = dVar.e;
        if (!(vVar instanceof f0)) {
            List list2 = dVar.f;
            if (list2 != null) {
                Iterator it9 = list2.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    Object next2 = it9.next();
                    if (next2 instanceof f0) {
                        obj4 = next2;
                        break;
                    }
                }
                obj4 = (v) obj4;
            }
        } else {
            if (vVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.LinkedAccountsMetadata");
            }
            obj4 = (f0) vVar;
        }
        f0 f0Var2 = (f0) obj4;
        ufm.b bVarM = d0.m(c.f(new CreditApplicationKompotFeatureConfig.LinkedAccountsV3(creditApplicationPluginFlowContract$ConfigurationR, z, f0Var2 != null ? f0Var2.f154887b : false)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
