package b94;

import com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$State;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ it3.d f13660b;

    public /* synthetic */ r(it3.d dVar, int i) {
        this.f13659a = i;
        this.f13660b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f13659a) {
            case 0:
                return h.a((h) obj2, null, null, this.f13660b, CertificateBody.profileType);
            case 1:
                return CreditApplicationFlowContract$State.a((CreditApplicationFlowContract$State) obj2, null, null, null, null, null, this.f13660b, 63);
            default:
                NaviCommand applicationScreenCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(applicationScreenCommand, "applicationScreenCommand");
                return this.f13660b.d == ks3.a.IN_PROGRESS ? applicationScreenCommand : r6.b.g(null, null, null, 7, applicationScreenCommand);
        }
    }
}
