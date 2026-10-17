package tr2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.details.BlockedMerchantDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockedMerchantDetailsScreenContract$InputData f273646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseScreen f273647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f273648c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f273649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f273650h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f273651j;
    public final e4m.e k;

    public k(m mVar, i iVar, BaseScreen baseScreen, BlockedMerchantDetailsScreenContract$InputData blockedMerchantDetailsScreenContract$InputData) {
        this.f273648c = mVar;
        this.f273646a = blockedMerchantDetailsScreenContract$InputData;
        this.f273647b = baseScreen;
        this.d = e4m.b.b(e4m.c.a(baseScreen));
        int i = 9;
        this.e = e4m.b.b(new tg5.h(mVar, this, 2, i));
        this.f = e4m.b.b(new tg5.h(mVar, this, 1, i));
        this.f273649g = e4m.b.b(new tg5.h(mVar, this, 0, i));
        this.f273650h = e4m.b.b(new tg5.h(mVar, this, 4, i));
        this.i = e4m.b.b(new tg5.h(mVar, this, 6, i));
        this.f273651j = e4m.b.b(new tg5.h(mVar, this, 5, i));
        this.k = e4m.b.b(new tg5.h(mVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f273649g.get());
    }
}
