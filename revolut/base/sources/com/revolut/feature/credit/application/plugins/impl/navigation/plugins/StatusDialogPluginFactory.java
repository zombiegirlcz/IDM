package com.revolut.feature.credit.application.plugins.impl.navigation.plugins;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.status_dialog.StatusDialogFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.status_dialog.StatusDialogRootFlow;
import efm.d0;
import grl.r2;
import hs3.v;
import hs3.y1;
import io3.h;
import it3.d;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import mx0.oc;
import mz3.s;
import org.jetbrains.annotations.NotNull;
import ufm.i;

/* JADX INFO: loaded from: classes22.dex */
public final class StatusDialogPluginFactory implements sv3.b, oz3.b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/navigation/plugins/StatusDialogPluginFactory$StatusDialogPluginLaunchInstructions;", "Lcom/revolut/feature/credit/application/models/initialization_contract/PluginLaunchInstructions;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatusDialogPluginLaunchInstructions implements PluginLaunchInstructions {

        @NotNull
        public static final Parcelable.Creator<StatusDialogPluginLaunchInstructions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y1 f66934a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StatusDialogPluginLaunchInstructions((y1) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StatusDialogPluginLaunchInstructions[i];
            }
        }

        public StatusDialogPluginLaunchInstructions(y1 metadata) {
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            this.f66934a = metadata;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StatusDialogPluginLaunchInstructions) && Intrinsics.f(this.f66934a, ((StatusDialogPluginLaunchInstructions) obj2).f66934a);
        }

        public final int hashCode() {
            return this.f66934a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f66934a);
        }
    }

    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        PluginLaunchInstructions pluginLaunchInstructions = pluginPayload.e;
        if (pluginLaunchInstructions instanceof StatusDialogPluginLaunchInstructions) {
            return new StatusDialogRootFlow(new StatusDialogFlowContract$InputData(((StatusDialogPluginLaunchInstructions) pluginLaunchInstructions).f66934a, h.R(pluginPayload, "")));
        }
        throw new IllegalStateException(m72.b.r("Can't find plugin configuration: ", o0.f186429a.b(StatusDialogPluginLaunchInstructions.class)));
    }

    @Override // oz3.b
    public final Object b(d dVar, CreditApplicationStatusNavigationConfig creditApplicationStatusNavigationConfig, r2 r2Var, wi0.b bVar, String str, Continuation continuation) {
        Object obj2;
        PluginPayload.Companion companion = PluginPayload.INSTANCE;
        Object obj3 = dVar.e;
        if (!(obj3 instanceof y1)) {
            List list = dVar.f;
            Object obj4 = null;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    if (next instanceof y1) {
                        obj4 = next;
                        break;
                    }
                }
                obj2 = (v) obj4;
            } else {
                obj2 = null;
            }
        } else {
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.StatusDialogMetadata");
            }
            obj2 = (y1) obj3;
        }
        if (obj2 == null) {
            throw new IllegalStateException(m72.b.r("Can't find metadata: ", o0.f186429a.b(y1.class)));
        }
        StatusDialogPluginLaunchInstructions statusDialogPluginLaunchInstructions = new StatusDialogPluginLaunchInstructions((y1) obj2);
        companion.getClass();
        return PluginPayload.Companion.a(dVar, r2Var, bVar, str, statusDialogPluginLaunchInstructions);
    }

    @Override // sv3.b
    public final d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        ufm.b bVarM = d0.m(payload);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        i iVar = new i(bVarM, new s(new oc(12), 24), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
