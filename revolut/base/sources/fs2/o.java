package fs2;

import cli.y;
import com.revolut.feature.blocked_merchants.api.model.BlockMerchantsTabConfig;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.ContentUser;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.BlockedPaymentsListFlowContract$Input;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.BlockedPaymentsListFlowContract$PagerItem;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import vkm.t0;
import zh9.u0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends oki.h implements c {
    public final BlockedPaymentsListFlowContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k18.c f137571p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wsg.n f137572q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f137573r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ali.b f137574s;

    public o(p stateMapper, BlockedPaymentsListFlowContract$Input input, k18.c manageableJuniorProfileInteractor, wsg.n walletInteractor) {
        BlockedPaymentsListFlowContract$PagerItem blockedPaymentsListFlowContract$PagerItem;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(manageableJuniorProfileInteractor, "manageableJuniorProfileInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.o = input;
        this.f137571p = manageableJuniorProfileInteractor;
        this.f137572q = walletInteractor;
        BlockMerchantsTabConfig blockMerchantsTabConfig = input.f64251a;
        if (blockMerchantsTabConfig instanceof BlockMerchantsTabConfig.All) {
            blockedPaymentsListFlowContract$PagerItem = new BlockedPaymentsListFlowContract$PagerItem(ContentUser.Self.f64237b, "SELF_ID_MARKER");
        } else {
            if (!(blockMerchantsTabConfig instanceof BlockMerchantsTabConfig.OnlyJunior)) {
                throw new NoWhenBranchMatchedException();
            }
            BlockMerchantsTabConfig.OnlyJunior onlyJunior = (BlockMerchantsTabConfig.OnlyJunior) blockMerchantsTabConfig;
            String str = onlyJunior.f64204a;
            blockedPaymentsListFlowContract$PagerItem = new BlockedPaymentsListFlowContract$PagerItem(new ContentUser.Junior(str, onlyJunior.f64205b, onlyJunior.f64206c), str);
        }
        this.f137573r = mra.d.b(this, new i(u.c(blockedPaymentsListFlowContract$PagerItem), blockedPaymentsListFlowContract$PagerItem.f64253b), stateMapper, null, false, 12);
        this.f137574s = s.b(this, new fgj.g(this, 27));
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f137574s;
    }

    @Override // yji.l
    public final void I1() {
        BlockMerchantsTabConfig blockMerchantsTabConfig = this.o.f64251a;
        if (!(blockMerchantsTabConfig instanceof BlockMerchantsTabConfig.All)) {
            if (!(blockMerchantsTabConfig instanceof BlockMerchantsTabConfig.OnlyJunior)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        String str = ((BlockMerchantsTabConfig.All) blockMerchantsTabConfig).f64203a;
        yji.l.a1(this, new t0(rd0.e.e(mo3.a.g(nim.a.v(u0.m(this.f137571p.y(), rd0.e.b(this.f137572q.d0(null, w4l.h.f294642c))), new fo9.a(19)), null, new fq7.j(5), 1), h0.f322473a, new eob.e(3, 23, null)), 2), null, null, new m(this, str, null), 3);
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f137573r;
    }
}
