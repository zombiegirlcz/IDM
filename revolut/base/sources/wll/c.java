package wll;

import com.revolut.sso.api.models.SimBindingEvidence;
import com.revolut.sso.impl.domain.models.Claim;
import gim.i;
import kotlin.coroutines.Continuation;
import kql.g;
import kql.h;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends hd.e {
    @Override // hd.e
    public final Object h(h hVar, String str, SimBindingEvidence simBindingEvidence, g gVar) {
        return a(str, simBindingEvidence, gVar);
    }

    public final Object k(oki.h hVar, String str, Claim claim, i iVar) {
        return hVar.p2(iVar, new wc2.b(this, str, claim, (Continuation) null, 2));
    }
}
