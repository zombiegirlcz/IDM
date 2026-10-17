package p0a;

import kgm.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f231489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aqa.c f231490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lx1.i f231491c;
    public final tn9.a d;

    public d(fa6.a charityItemsMapper, i beneficiaryNavBarMapperFactory, aqa.c cardOwnersMapper, io5.b cryptoAddressItemMapper, lx1.i apmContactMapper, tn9.a paymentCounterpartyMapper) {
        Intrinsics.checkNotNullParameter(charityItemsMapper, "charityItemsMapper");
        Intrinsics.checkNotNullParameter(beneficiaryNavBarMapperFactory, "beneficiaryNavBarMapperFactory");
        Intrinsics.checkNotNullParameter(cardOwnersMapper, "cardOwnersMapper");
        Intrinsics.checkNotNullParameter(cryptoAddressItemMapper, "cryptoAddressItemMapper");
        Intrinsics.checkNotNullParameter(apmContactMapper, "apmContactMapper");
        Intrinsics.checkNotNullParameter(paymentCounterpartyMapper, "paymentCounterpartyMapper");
        this.f231489a = beneficiaryNavBarMapperFactory;
        this.f231490b = cardOwnersMapper;
        this.f231491c = apmContactMapper;
        this.d = paymentCounterpartyMapper;
    }
}
