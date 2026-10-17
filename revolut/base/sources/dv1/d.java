package dv1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String p0 = (String) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((f) this.receiver).getClass();
        return new ApmDescriptor.ExternalId(p0, "CO_MERCHANT_CODE");
    }
}
