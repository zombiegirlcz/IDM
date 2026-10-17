package l3e;

import a83.w0;
import ajd.t;
import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.f2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.store.api.R$string;
import h30.q;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l2c.v;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f191949a;

    public o(q storeAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(storeAvailabilityInteractor, "storeAvailabilityInteractor");
        this.f191949a = storeAvailabilityInteractor;
    }

    public static ListSubheaderDelegate.Model a() {
        return new ListSubheaderDelegate.Model("STORE_ORDERS_GIFT_CARDS_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.store_orders_gift_cards_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public static ListSubheaderDelegate.Model b() {
        return new ListSubheaderDelegate.Model("STORE_ORDERS_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.store_orders_purchases_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public static CellDetailsChevronDelegate.Model d() {
        return new CellDetailsChevronDelegate.Model("STORE_ORDERS_GIFT_CARDS_USED_EXPIRED_ID", new TextLocalisedClause(R$string.store_orders_gift_cards_used_and_expired, null, null, 14), f2.INTERNAL, 0, null, null, 2040);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f191937b;
        return new g(d0.E0(data == null ? f0.f322471a : (List) iii.c.f(data, new l2d.a(this, 13), new v(4), new w0(this, domainState.f191938c, 8)), (List) iii.c.f(domainState.f191936a, new l2d.a(this, 12), new v(3), new t(this, !r0.isEmpty(), 12))));
    }
}
