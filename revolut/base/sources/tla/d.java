package tla;

import cjl.o;
import com.revolut.sso.api.email.change.RevolutSsoChangeEmailFlowDestination;
import com.revolut.sso.api.models.SsoChangeClaimMode;
import jma.i;

/* JADX INFO: loaded from: classes5.dex */
public interface d {
    static RevolutSsoChangeEmailFlowDestination a(d dVar) {
        ((i) dVar).getClass();
        return new RevolutSsoChangeEmailFlowDestination(new RevolutSsoChangeEmailFlowDestination.InputData((SsoChangeClaimMode.Multiple) null, o.SHOT, 3));
    }
}
