package a82;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class y implements cli.n {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a12.j f2028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a12.e f2029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a12.o f2030c;
    public final c82.b d;
    public final a12.p e;
    public final ty9.b f;

    public y(a12.j apmAreaMapper, a12.e contactsMapper, a12.o transactionsMapper, c82.e withdrawalsMapper, c82.c moreMapper, c82.b cardsMapper, a12.p backgroundMapper, ty9.b sendFromClipboardItemProvider) {
        Intrinsics.checkNotNullParameter(apmAreaMapper, "apmAreaMapper");
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        Intrinsics.checkNotNullParameter(transactionsMapper, "transactionsMapper");
        Intrinsics.checkNotNullParameter(withdrawalsMapper, "withdrawalsMapper");
        Intrinsics.checkNotNullParameter(moreMapper, "moreMapper");
        Intrinsics.checkNotNullParameter(cardsMapper, "cardsMapper");
        Intrinsics.checkNotNullParameter(backgroundMapper, "backgroundMapper");
        Intrinsics.checkNotNullParameter(sendFromClipboardItemProvider, "sendFromClipboardItemProvider");
        this.f2028a = apmAreaMapper;
        this.f2029b = contactsMapper;
        this.f2030c = transactionsMapper;
        this.d = cardsMapper;
        this.e = backgroundMapper;
        this.f = sendFromClipboardItemProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = zhm.u.b();
        eVarB.add(a12.j.a(this.f2028a, zhm.v.k(a.Send, a.Request, a.Pay, a.Withdrawal)));
        RowDelegate.Model modelA = ty9.b.a(this.f);
        if (modelA != null) {
            eVarB.add(modelA);
        }
        eVarB.addAll((List) iii.c.f(domainState.f1997a, new l(this, 1), new a5g.l(12), new a15.n(domainState, this, 6)));
        return new e(zhm.u.a(eVarB), ((s12.l) this.e).a(ApmMultibanco.f61815c));
    }
}
