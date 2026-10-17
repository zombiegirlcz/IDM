package a7f;

import android.os.Parcelable;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import jlc.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f1863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final upc.d f1864b;

    public h(w recurringDepositWidgetMapper, upc.d spareChangeWidgetMapper) {
        Intrinsics.checkNotNullParameter(recurringDepositWidgetMapper, "recurringDepositWidgetMapper");
        Intrinsics.checkNotNullParameter(spareChangeWidgetMapper, "spareChangeWidgetMapper");
        this.f1863a = recurringDepositWidgetMapper;
        this.f1864b = spareChangeWidgetMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        s0 s0Var = new s0(2);
        s0Var.b(((tpc.d) this.f1863a).b(domainState.f1860a).toArray(new qv0.i[0]));
        s0Var.b(this.f1864b.a(domainState.f1861b).toArray(new qv0.i[0]));
        ArrayList arrayList = s0Var.f186433a;
        List listK = v.k(arrayList.toArray(new qv0.i[arrayList.size()]));
        return new e(!listK.isEmpty() ? yp0.b.g(listK, new ListSubheaderDelegate.Model("MANAGED_PORTFOLIO_RECURRING_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.managed_portfolios_details_orders_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126) : f0.f322471a);
    }
}
