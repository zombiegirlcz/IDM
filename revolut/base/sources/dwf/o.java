package dwf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transport.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.g f120387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nvf.g f120388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nvf.o f120389c;

    public o(thf.g transactionItemMapper, nvf.g transitLocationInfoMapper, nvf.k transportDetailsFieldMapper, nvf.a componentsMapper, nvf.o qrCodeMapper, ruf.k timeLeftProvider, nvf.l getHelpProvider) {
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        Intrinsics.checkNotNullParameter(transitLocationInfoMapper, "transitLocationInfoMapper");
        Intrinsics.checkNotNullParameter(transportDetailsFieldMapper, "transportDetailsFieldMapper");
        Intrinsics.checkNotNullParameter(componentsMapper, "componentsMapper");
        Intrinsics.checkNotNullParameter(qrCodeMapper, "qrCodeMapper");
        Intrinsics.checkNotNullParameter(timeLeftProvider, "timeLeftProvider");
        Intrinsics.checkNotNullParameter(getHelpProvider, "getHelpProvider");
        this.f120387a = transactionItemMapper;
        this.f120388b = transitLocationInfoMapper;
        this.f120389c = qrCodeMapper;
    }

    public static CompositeClause a(long j2) {
        List listK = v.k(new TimeClause(j2, TimeClause.Format.DateLong.f57962b, null, null, 12), new TimeClause(j2, TimeClause.Format.TimeDefault.f57977b, null, null, 12));
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static CellDetailsDelegate.Model b() {
        return new CellDetailsDelegate.Model("STATUS_ITEM_ID", new TextLocalisedClause(R$string.transport_ticket_details_status_title, null, null, 14), new TextLocalisedClause(R$string.transport_ticket_details_status_expired, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        return new i((List) iii.c.f(domainState.f120375a, new ds4.b(28), new dug.d(3), new a0i.a(this, 12, domainState, ref$ObjectRef)), (g) ref$ObjectRef.f186409a);
    }
}
