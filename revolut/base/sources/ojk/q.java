package ojk;

import com.revolut.feature.slot_manager.api.model.SlotContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class q extends oki.h implements c0 {
    public final q06.l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mkd.d f225836p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ajk.c f225837q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ajk.b f225838r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f225839s;

    public q(q06.l deeplinkRouter, mkd.d slotManagerFeedExtension, ajk.c bottomSheetNavigationResolver, ajk.b outOfAppNavigationProvider, boolean z) {
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(slotManagerFeedExtension, "slotManagerFeedExtension");
        Intrinsics.checkNotNullParameter(bottomSheetNavigationResolver, "bottomSheetNavigationResolver");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        this.o = deeplinkRouter;
        this.f225836p = slotManagerFeedExtension;
        this.f225837q = bottomSheetNavigationResolver;
        this.f225838r = outOfAppNavigationProvider;
        this.f225839s = z;
    }

    @Override // yji.l
    public void I1() {
        akd.s sVarI2 = I2();
        if (sVarI2 != null) {
            ((gld.f0) this.f225836p).c3(new mkd.a(new SlotContext(sVarI2, zhm.h0.f322473a)));
        }
    }

    public abstract akd.s I2();

    public final void J2(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        n2(new p(this, url2, null, 1), new whi.b(6));
    }

    public final void K2(Object obj2) {
        if (obj2 instanceof x) {
            H2(L2(), new l1.e(this, ((x) obj2).f225845a, !r5.f225846b, 24));
            return;
        }
        if (obj2 instanceof u) {
            J2(((u) obj2).f225843a);
        } else if (obj2 instanceof w) {
            B2();
        }
    }

    public abstract cli.y L2();

    public abstract v M2(v vVar, a0 a0Var);

    @Override // yji.l
    public void T1(long j2) {
        if (I2() != null) {
            yji.l.b1(this, ((gld.f0) this.f225836p).f144638l.h(), null, new o95.c(this, null, 25), 3);
        }
    }
}
