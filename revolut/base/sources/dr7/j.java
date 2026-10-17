package dr7;

import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.data.model.RequestedDocument;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.list.UploadDocumentsListScreenContract$InputData;
import dr7.g;
import jki.p;
import kl7.b2;
import kl7.c2;
import kotlin.jvm.internal.Intrinsics;
import ll7.e0;
import ll7.v;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final UploadDocumentsListScreenContract$InputData f117099p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f117100q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f117101r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p stateMapper, UploadDocumentsListScreenContract$InputData inputData, v policyRepository) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(policyRepository, "policyRepository");
        this.f117099p = inputData;
        this.f117100q = policyRepository;
        this.f117101r = new e(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        String policyId = this.f117099p.f75691a;
        e0 e0Var = (e0) this.f117100q;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        yji.l.a1(this, rd0.e.b(e0Var.o.f(policyId, true)), null, null, new dob.c(this, null, 10), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f117101r;
    }

    public final void y2(Object obj2, String listId) {
        b2 b2Var;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        if (iHashCode != -1324288304) {
            if (iHashCode != -645656547) {
                if (iHashCode == 483217195 && listId.equals("PRIMARY_BUTTON_ID")) {
                    c2 c2Var = (c2) ((e) t2()).f117092a.getContent();
                    if (c2Var == null || (b2Var = c2Var.f185302c) == null || !b2Var.a()) {
                        v2(g.b.f117095a);
                    } else {
                        u2();
                    }
                }
            } else if (listId.equals("SECONDARY_BUTTON_ID")) {
                C1(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 15), true));
            }
        } else if (listId.equals("GET_HELP_ID")) {
            v2(g.a.f117094a);
        }
        if (obj2 instanceof RequestedDocument) {
            v2(new f((RequestedDocument) obj2));
        }
    }
}
