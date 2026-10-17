package ny1;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import hrf.f;

/* JADX INFO: loaded from: classes20.dex */
public interface b extends ly1.a {
    KompotDestination a(dx1.a aVar);

    KompotDestination f(dx1.a aVar);

    KompotDestination l(dx1.a aVar);

    KompotDestination m(ApmContact apmContact, f fVar, TransferMoneyPocket transferMoneyPocket);

    KompotDestination n(dx1.a aVar);
}
