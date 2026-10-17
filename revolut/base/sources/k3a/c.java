package k3a;

import dl3.f;
import kotlin.jvm.internal.Intrinsics;
import lx1.i;
import m3j.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f180653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aqa.c f180654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f180655c;
    public final nq9.b d;
    public final io5.b e;
    public final fa6.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f180656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tn9.a f180657h;

    public c(aqa.c cardOwnersMapper, f contactsMapper, fa6.a charityMapper, io5.b cryptoMapper, i apmRecipientMapper, n beneficiaryItemViewMapper, nq9.b groupsMapper, tn9.a paymentCounterpartyMapper) {
        Intrinsics.checkNotNullParameter(beneficiaryItemViewMapper, "beneficiaryItemViewMapper");
        Intrinsics.checkNotNullParameter(cardOwnersMapper, "cardOwnersMapper");
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        Intrinsics.checkNotNullParameter(groupsMapper, "groupsMapper");
        Intrinsics.checkNotNullParameter(cryptoMapper, "cryptoMapper");
        Intrinsics.checkNotNullParameter(charityMapper, "charityMapper");
        Intrinsics.checkNotNullParameter(apmRecipientMapper, "apmRecipientMapper");
        Intrinsics.checkNotNullParameter(paymentCounterpartyMapper, "paymentCounterpartyMapper");
        this.f180653a = beneficiaryItemViewMapper;
        this.f180654b = cardOwnersMapper;
        this.f180655c = contactsMapper;
        this.d = groupsMapper;
        this.e = cryptoMapper;
        this.f = charityMapper;
        this.f180656g = apmRecipientMapper;
        this.f180657h = paymentCounterpartyMapper;
    }
}
