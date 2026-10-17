package com.revolut.feature.credit.application.plugins.impl.navigation.plugins;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.workflow.CreditWorkflowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.workflow.CreditWorkflowFlow;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import grl.r2;
import hs3.a2;
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

/* JADX INFO: loaded from: classes22.dex */
public final class WorkflowPluginFactory implements sv3.b, oz3.b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/navigation/plugins/WorkflowPluginFactory$WorkflowPluginLaunchInstructions;", "Lcom/revolut/feature/credit/application/models/initialization_contract/PluginLaunchInstructions;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WorkflowPluginLaunchInstructions implements PluginLaunchInstructions {

        @NotNull
        public static final Parcelable.Creator<WorkflowPluginLaunchInstructions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66935a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WorkflowPluginLaunchInstructions(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WorkflowPluginLaunchInstructions[i];
            }
        }

        public WorkflowPluginLaunchInstructions(String str) {
            this.f66935a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WorkflowPluginLaunchInstructions) && Intrinsics.f(this.f66935a, ((WorkflowPluginLaunchInstructions) obj2).f66935a);
        }

        public final int hashCode() {
            String str = this.f66935a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66935a);
        }
    }

    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        PluginLaunchInstructions pluginLaunchInstructions = pluginPayload.e;
        if (pluginLaunchInstructions instanceof WorkflowPluginLaunchInstructions) {
            return new CreditWorkflowFlow(new CreditWorkflowContract$InputData(h.R(pluginPayload, ""), ((WorkflowPluginLaunchInstructions) pluginLaunchInstructions).f66935a));
        }
        throw new IllegalStateException(m72.b.r("Can't find plugin configuration: ", o0.f186429a.b(WorkflowPluginLaunchInstructions.class)));
    }

    @Override // oz3.b
    public final Object b(d dVar, CreditApplicationStatusNavigationConfig creditApplicationStatusNavigationConfig, r2 r2Var, wi0.b bVar, String str, Continuation continuation) {
        Object obj2;
        Object next;
        PluginPayload.Companion companion = PluginPayload.INSTANCE;
        Object obj3 = dVar.e;
        if (!(obj3 instanceof a2)) {
            List list = dVar.f;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (next instanceof a2) {
                        break;
                    }
                }
                obj2 = (v) next;
            } else {
                obj2 = null;
            }
        } else {
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.WorkflowMetadata");
            }
            obj2 = (a2) obj3;
        }
        a2 a2Var = (a2) obj2;
        WorkflowPluginLaunchInstructions workflowPluginLaunchInstructions = new WorkflowPluginLaunchInstructions(a2Var != null ? a2Var.f154864a : null);
        companion.getClass();
        return PluginPayload.Companion.a(dVar, r2Var, bVar, str, workflowPluginLaunchInstructions);
    }

    @Override // sv3.b
    public final d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Object obj2;
        Object next;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        d dVar = payload.f66247a;
        Object obj3 = dVar.e;
        if (!(obj3 instanceof a2)) {
            List list = dVar.f;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (next instanceof a2) {
                        break;
                    }
                }
                obj2 = (v) next;
            } else {
                obj2 = null;
            }
        } else {
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.WorkflowMetadata");
            }
            obj2 = (a2) obj3;
        }
        a2 a2Var = (a2) obj2;
        ufm.b bVarM = d0.m(new FeatureCommand(new CreditApplicationKompotFeatureConfig.Workflow(a2Var != null ? a2Var.f154864a : null, h.R(payload, ""), null)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
