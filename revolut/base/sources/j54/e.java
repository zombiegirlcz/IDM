package j54;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.CreditApplicationCancellationModelExtension$CancellationVariant;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditApplicationCancellationModelExtension$CancellationVariant f171504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PluginPayload f171505c;
    public final com.google.protobuf.w0 d;

    public e(CreditApplicationCancellationModelExtension$CancellationVariant cancellationVariant, PluginPayload pluginPayload, com.google.protobuf.w0 w0Var) {
        Intrinsics.checkNotNullParameter(cancellationVariant, "cancellationVariant");
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        ModalDestination.Style.BOTTOM_DIALOG style = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        Intrinsics.checkNotNullParameter(style, "style");
        this.f171504b = cancellationVariant;
        this.f171505c = pluginPayload;
        this.d = w0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        if (!this.f171504b.equals(eVar.f171504b) || !Intrinsics.f(this.f171505c, eVar.f171505c) || !Intrinsics.f(this.d, eVar.d)) {
            return false;
        }
        Object obj3 = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return ModalDestination.Style.BOTTOM_DIALOG.f98301a.hashCode() + ((AnalyticsContext.a(this.d) + ((this.f171505c.hashCode() + (this.f171504b.hashCode() * 31)) * 31)) * 31);
    }
}
