package b4c;

import au6.a3;
import b4c.l;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends oki.h implements n {
    public final e3c.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dl2.a f12281p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kpj.e f12282q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mse.a f12283r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f12284s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.b f12285t;

    public u(cli.n stateMapper, e3c.a shopRepository, dl2.a merchantRevolutShopFiscalInteractor, kpj.e merchantRevolutShopInteractor, mse.a ticketsWidgetExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(shopRepository, "shopRepository");
        Intrinsics.checkNotNullParameter(merchantRevolutShopFiscalInteractor, "merchantRevolutShopFiscalInteractor");
        Intrinsics.checkNotNullParameter(merchantRevolutShopInteractor, "merchantRevolutShopInteractor");
        Intrinsics.checkNotNullParameter(ticketsWidgetExtension, "ticketsWidgetExtension");
        this.o = shopRepository;
        this.f12281p = merchantRevolutShopFiscalInteractor;
        this.f12282q = merchantRevolutShopInteractor;
        this.f12283r = ticketsWidgetExtension;
        this.f12284s = mra.d.b(this, new k(0L, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f12285t = new vii.b();
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, e3c.a.a(this.o), null, null, new p(this, continuation, 0), 3);
        yji.l.a1(this, (j2) ((tse.i) this.f12283r).f274111q.f22677a, null, null, new p(this, continuation, 1), 3);
        yji.l.a1(this, vkm.q.Q(this.f12285t, new a3(continuation, this, 10)), null, null, new p(this, continuation, 2), 3);
    }

    public final void I2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (obj2 instanceof d3c.p) {
            C2(new m((d3c.p) obj2));
        } else if (Intrinsics.f(listId, "ERROR_PRODUCTS_LIST_ID")) {
            this.f12285t.a();
        }
    }

    public final void J2(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        if (iHashCode == -1186666005) {
            if (listId.equals("ORDER_HISTORY_ITEM_ID")) {
                C2(l.c.f12270a);
            }
        } else if (iHashCode == 450276774) {
            if (listId.equals("CART_MENU_ITEM_ID")) {
                C2(l.b.f12269a);
            }
        } else if (iHashCode == 861362552 && listId.equals("CARD_READER_SETTINGS_ITEM_ID")) {
            C2(l.a.f12268a);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f12284s;
    }
}
