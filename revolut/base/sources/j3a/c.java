package j3a;

import kotlin.jvm.internal.Intrinsics;
import lx1.i;
import m3j.n;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f170993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aqa.c f170994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dl3.f f170995c;
    public final nq9.b d;
    public final i e;
    public final tn9.a f;

    public c(n beneficiaryMapper, aqa.c cardOwnersMapper, dl3.f contactsMapper, nq9.b groupsMapper, i apmRecipientMapper, tn9.a paymentCounterpartyMapper) {
        Intrinsics.checkNotNullParameter(beneficiaryMapper, "beneficiaryMapper");
        Intrinsics.checkNotNullParameter(cardOwnersMapper, "cardOwnersMapper");
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        Intrinsics.checkNotNullParameter(groupsMapper, "groupsMapper");
        Intrinsics.checkNotNullParameter(apmRecipientMapper, "apmRecipientMapper");
        Intrinsics.checkNotNullParameter(paymentCounterpartyMapper, "paymentCounterpartyMapper");
        this.f170993a = beneficiaryMapper;
        this.f170994b = cardOwnersMapper;
        this.f170995c = contactsMapper;
        this.d = groupsMapper;
        this.e = apmRecipientMapper;
        this.f = paymentCounterpartyMapper;
    }
}
