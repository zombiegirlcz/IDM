package yx5;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cryptocommodity_invest.api.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import y66.q;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ny5.e f317572a;

    public p(ny5.e rateTilesMapper) {
        Intrinsics.checkNotNullParameter(rateTilesMapper, "rateTilesMapper");
        this.f317572a = rateTilesMapper;
    }

    public final ArrayList a(cw5.a aVar, CompositeClause compositeClause) {
        return gw5.b.a(this.f317572a, new TextLocalisedClause(R$string.crypto_discovery_cryptos, u.c(Integer.valueOf(aVar.f109531a.size())), null, 12), compositeClause, aVar, gw5.a.ROWS, R$attr.uikit_dp16, null, "RatesListSubheader", f0.f322471a, null, null, null, 7680);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List list;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.d;
        String str = domainState.e;
        if (!z || d0.W(str)) {
            final int i = 0;
            list = (List) iii.c.f(domainState.f317557a, new Function1(this) { // from class: yx5.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p f317571b;

                {
                    this.f317571b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Function0 it8 = (Function0) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            break;
                    }
                    return this.f317571b.f317572a.e(4, gw5.a.ROWS, "");
                }
            }, new yw9.j(5), new q(this, domainState.f317559c, 18));
        } else {
            final int i2 = 1;
            list = (List) iii.c.f(domainState.f317558b, new Function1(this) { // from class: yx5.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p f317571b;

                {
                    this.f317571b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Function0 it8 = (Function0) obj2;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            break;
                    }
                    return this.f317571b.f317572a.e(4, gw5.a.ROWS, "");
                }
            }, new yw9.j(6), new q(this, str, 19));
        }
        return new c(list);
    }
}
