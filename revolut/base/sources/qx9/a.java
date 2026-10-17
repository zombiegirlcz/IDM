package qx9;

import aqa.c;
import dl3.f;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import lx1.i;
import m3j.n;
import qu1.d;
import yhm.j;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ex9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f250046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f250047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f250048c;
    public final nq9.b d;
    public final io5.b e;
    public final fa6.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f250049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tn9.a f250050h;
    public final Lazy i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f250051j;
    public final Lazy k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f250052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f250053m;

    public a(c cardOwnersMapper, f contactsMapper, fa6.a charityItemsMapper, io5.b cryptoAddressItemsMapper, i apmRecipientMapper, n beneficiaryMapper, nq9.b groupsMapper, tn9.a paymentCounterpartyMapper) {
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        Intrinsics.checkNotNullParameter(beneficiaryMapper, "beneficiaryMapper");
        Intrinsics.checkNotNullParameter(cardOwnersMapper, "cardOwnersMapper");
        Intrinsics.checkNotNullParameter(groupsMapper, "groupsMapper");
        Intrinsics.checkNotNullParameter(cryptoAddressItemsMapper, "cryptoAddressItemsMapper");
        Intrinsics.checkNotNullParameter(charityItemsMapper, "charityItemsMapper");
        Intrinsics.checkNotNullParameter(apmRecipientMapper, "apmRecipientMapper");
        Intrinsics.checkNotNullParameter(paymentCounterpartyMapper, "paymentCounterpartyMapper");
        this.f250046a = contactsMapper;
        this.f250047b = beneficiaryMapper;
        this.f250048c = cardOwnersMapper;
        this.d = groupsMapper;
        this.e = cryptoAddressItemsMapper;
        this.f = charityItemsMapper;
        this.f250049g = apmRecipientMapper;
        this.f250050h = paymentCounterpartyMapper;
        this.i = j.b(new d(18));
        this.f250051j = j.b(new d(19));
        this.k = j.b(new d(20));
        this.f250052l = j.b(new d(21));
        this.f250053m = j.b(new d(22));
    }
}
