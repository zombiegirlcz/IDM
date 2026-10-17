package qx9;

import aqa.c;
import dl3.f;
import kotlin.jvm.internal.Intrinsics;
import lx1.i;
import m3j.n;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements ex9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f250054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f250055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f250056c;
    public final nq9.b d;
    public final io5.b e;
    public final fa6.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f250057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tn9.a f250058h;

    public b(c cardOwnersMapper, f contactsMapper, fa6.a charityItemsMapper, io5.b cryptoAddressItemsMapper, i apmRecipientMapper, n beneficiaryMapper, nq9.b groupsMapper, tn9.a paymentCounterpartyMapper) {
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        Intrinsics.checkNotNullParameter(beneficiaryMapper, "beneficiaryMapper");
        Intrinsics.checkNotNullParameter(cardOwnersMapper, "cardOwnersMapper");
        Intrinsics.checkNotNullParameter(groupsMapper, "groupsMapper");
        Intrinsics.checkNotNullParameter(cryptoAddressItemsMapper, "cryptoAddressItemsMapper");
        Intrinsics.checkNotNullParameter(charityItemsMapper, "charityItemsMapper");
        Intrinsics.checkNotNullParameter(apmRecipientMapper, "apmRecipientMapper");
        Intrinsics.checkNotNullParameter(paymentCounterpartyMapper, "paymentCounterpartyMapper");
        this.f250054a = contactsMapper;
        this.f250055b = beneficiaryMapper;
        this.f250056c = cardOwnersMapper;
        this.d = groupsMapper;
        this.e = cryptoAddressItemsMapper;
        this.f = charityItemsMapper;
        this.f250057g = apmRecipientMapper;
        this.f250058h = paymentCounterpartyMapper;
    }
}
