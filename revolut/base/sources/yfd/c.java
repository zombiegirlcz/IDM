package yfd;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreen;
import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.d1;
import qlm.j1;
import yfe.a0;
import yfe.b0;
import yfe.b3;
import yfe.d0;
import yfe.e0;
import yfe.f0;
import yfe.f2;
import yfe.h;
import yfe.h0;
import yfe.i0;
import yfe.k0;
import yfe.l0;
import yfe.n0;
import yfe.o1;
import yfe.o2;
import yfe.s1;
import yfe.t1;
import yfe.u1;
import yfe.w;
import yfe.w1;
import yfe.z;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f313213a;

    public /* synthetic */ c(int i) {
        this.f313213a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f313213a) {
            case 0:
                KProperty[] kPropertyArr = SharedFavouritesAddAssetScreen.f86802h0;
                return new TextDelegate();
            case 1:
                KProperty[] kPropertyArr2 = SharedFavouritesAddAssetScreen.f86802h0;
                return new FullScreenStateDelegate();
            case 2:
                TotalWealthCategoryKey.Companion aVar = TotalWealthCategoryKey.INSTANCE;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey", p0Var.b(TotalWealthCategoryKey.class), new KClass[]{p0Var.b(TotalWealthCategoryKey.Cash.class), p0Var.b(TotalWealthCategoryKey.Credit.class), p0Var.b(TotalWealthCategoryKey.Crypto.class), p0Var.b(TotalWealthCategoryKey.Invest.class), p0Var.b(TotalWealthCategoryKey.Joint.class), p0Var.b(TotalWealthCategoryKey.Linked.class), p0Var.b(TotalWealthCategoryKey.Pro.class), p0Var.b(TotalWealthCategoryKey.Savings.class), p0Var.b(TotalWealthCategoryKey.Youth.class)}, new KSerializer[]{new d1("cash", TotalWealthCategoryKey.Cash.INSTANCE, new Annotation[0]), new d1("credit", TotalWealthCategoryKey.Credit.INSTANCE, new Annotation[0]), new d1("crypto", TotalWealthCategoryKey.Crypto.INSTANCE, new Annotation[0]), new d1("invest", TotalWealthCategoryKey.Invest.INSTANCE, new Annotation[0]), new d1("joint", TotalWealthCategoryKey.Joint.INSTANCE, new Annotation[0]), new d1("linked", TotalWealthCategoryKey.Linked.INSTANCE, new Annotation[0]), new d1("pro", TotalWealthCategoryKey.Pro.INSTANCE, new Annotation[0]), new d1("savings", TotalWealthCategoryKey.Savings.INSTANCE, new Annotation[0]), TotalWealthCategoryKey.Youth.a.f89579a}, new Annotation[0]);
            case 3:
                return new d1("cash", TotalWealthCategoryKey.Cash.INSTANCE, new Annotation[0]);
            case 4:
                return new d1("credit", TotalWealthCategoryKey.Credit.INSTANCE, new Annotation[0]);
            case 5:
                return new d1("crypto", TotalWealthCategoryKey.Crypto.INSTANCE, new Annotation[0]);
            case 6:
                return new d1("invest", TotalWealthCategoryKey.Invest.INSTANCE, new Annotation[0]);
            case 7:
                return new d1("joint", TotalWealthCategoryKey.Joint.INSTANCE, new Annotation[0]);
            case 8:
                return new d1("linked", TotalWealthCategoryKey.Linked.INSTANCE, new Annotation[0]);
            case 9:
                return new d1("pro", TotalWealthCategoryKey.Pro.INSTANCE, new Annotation[0]);
            case 10:
                return new d1("savings", TotalWealthCategoryKey.Savings.INSTANCE, new Annotation[0]);
            case 11:
                h.Companion companion = yfe.h.INSTANCE;
                p0 p0Var2 = o0.f186429a;
                return new mlm.f("com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategorySnapshot", p0Var2.b(yfe.h.class), new KClass[]{p0Var2.b(yfe.g.class), p0Var2.b(yfe.k.class), p0Var2.b(yfe.n.class), p0Var2.b(yfe.q.class), p0Var2.b(yfe.t.class), p0Var2.b(a0.class), p0Var2.b(e0.class), p0Var2.b(h0.class), p0Var2.b(h.c.b.class), p0Var2.b(h.c.C1743c.class), p0Var2.b(k0.class), p0Var2.b(n0.class), p0Var2.b(h.c.d.class)}, new KSerializer[]{yfe.e.f313249a, yfe.i.f313266a, yfe.l.f313279a, yfe.o.f313287a, yfe.r.f313299a, yfe.u.f313309a, b0.f313242a, f0.f313253a, new d1("joint_empty", h.c.b.INSTANCE, new Annotation[0]), new d1("linked_empty", h.c.C1743c.INSTANCE, new Annotation[0]), i0.f313267a, l0.f313280a, new d1("junior_empty", h.c.d.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 12:
                h.a.Companion companion2 = h.a.INSTANCE;
                p0 p0Var3 = o0.f186429a;
                return new mlm.f("com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategorySnapshot.Active", p0Var3.b(h.a.class), new KClass[]{p0Var3.b(yfe.g.class), p0Var3.b(yfe.k.class), p0Var3.b(yfe.n.class), p0Var3.b(yfe.q.class), p0Var3.b(yfe.t.class), p0Var3.b(a0.class)}, new KSerializer[]{yfe.e.f313249a, yfe.i.f313266a, yfe.l.f313279a, yfe.o.f313287a, yfe.r.f313299a, yfe.u.f313309a}, new Annotation[0]);
            case 13:
                return new qlm.e(f2.Companion.serializer());
            case 14:
                return new qlm.e(s1.Companion.serializer());
            case 15:
                return t1.INSTANCE.serializer();
            case 16:
                return new qlm.e(o2.Companion.serializer());
            case 17:
                return new qlm.e(f2.Companion.serializer());
            case 18:
                return yfe.w.INSTANCE.serializer();
            case 19:
                w.Companion aVar2 = yfe.w.INSTANCE;
                p0 p0Var4 = o0.f186429a;
                return new mlm.f("youth_icon", p0Var4.b(yfe.w.class), new KClass[]{p0Var4.b(z.class), p0Var4.b(w.b.class), p0Var4.b(w.c.class)}, new KSerializer[]{yfe.x.f313321a, new d1("youth_icon_pocket", w.b.INSTANCE, new Annotation[0]), new d1("youth_icon_saving", w.c.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 20:
                return new d1("youth_icon_pocket", w.b.INSTANCE, new Annotation[0]);
            case 21:
                return new d1("youth_icon_saving", w.c.INSTANCE, new Annotation[0]);
            case 22:
                h.c.Companion companion3 = h.c.INSTANCE;
                p0 p0Var5 = o0.f186429a;
                return new mlm.f("com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategorySnapshot.Empty", p0Var5.b(h.c.class), new KClass[]{p0Var5.b(e0.class), p0Var5.b(h0.class), p0Var5.b(h.c.b.class), p0Var5.b(h.c.C1743c.class), p0Var5.b(k0.class), p0Var5.b(n0.class), p0Var5.b(h.c.d.class)}, new KSerializer[]{b0.f313242a, f0.f313253a, new d1("joint_empty", h.c.b.INSTANCE, new Annotation[0]), new d1("linked_empty", h.c.C1743c.INSTANCE, new Annotation[0]), i0.f313267a, l0.f313280a, new d1("junior_empty", h.c.d.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 23:
                return j1.b("com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategorySnapshot.Empty.Credit.SubtitleVariant", d0.values());
            case 24:
                return new d1("joint_empty", h.c.b.INSTANCE, new Annotation[0]);
            case 25:
                return new d1("linked_empty", h.c.C1743c.INSTANCE, new Annotation[0]);
            case 26:
                return new d1("junior_empty", h.c.d.INSTANCE, new Annotation[0]);
            case 27:
                return new d1("product", o1.INSTANCE, new Annotation[0]);
            case 28:
                return b3.Companion.serializer();
            default:
                t1.Companion aVar3 = t1.INSTANCE;
                p0 p0Var6 = o0.f186429a;
                return new mlm.f("com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthSnapshotSupplementary", p0Var6.b(t1.class), new KClass[]{p0Var6.b(w1.class)}, new KSerializer[]{u1.f313310a}, new Annotation[0]);
        }
    }
}
