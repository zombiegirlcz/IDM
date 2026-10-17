package tr2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block.BlockMerchantScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockMerchantScreenContract$InputData f273640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseScreen f273641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f273642c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f273643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f273644h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f273645j;
    public final e4m.e k;

    public j(m mVar, i iVar, BaseScreen baseScreen, BlockMerchantScreenContract$InputData blockMerchantScreenContract$InputData) {
        this.f273642c = mVar;
        this.f273640a = blockMerchantScreenContract$InputData;
        this.f273641b = baseScreen;
        this.d = e4m.b.b(e4m.c.a(baseScreen));
        int i = 8;
        this.e = e4m.b.b(new tg5.h(mVar, this, 2, i));
        this.f = e4m.b.b(new tg5.h(mVar, this, 1, i));
        this.f273643g = e4m.b.b(new tg5.h(mVar, this, 0, i));
        this.f273644h = e4m.b.b(new tg5.h(mVar, this, 4, i));
        this.i = e4m.b.b(new tg5.h(mVar, this, 6, i));
        this.f273645j = e4m.b.b(new tg5.h(mVar, this, 5, i));
        this.k = e4m.b.b(new tg5.h(mVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f273643g.get());
    }
}
