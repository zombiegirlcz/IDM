package uxe;

import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.models.open_banking_brazil.ThirdPartyBrazil;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tx0.r3;
import uwi.v;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne6.b f284000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je6.h f284001b;

    public q(ne6.b detailsFactory, je6.h institutionLogoMapper) {
        Intrinsics.checkNotNullParameter(detailsFactory, "detailsFactory");
        Intrinsics.checkNotNullParameter(institutionLogoMapper, "institutionLogoMapper");
        this.f284000a = detailsFactory;
        this.f284001b = institutionLogoMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f283995a;
        so6.a aVar = (so6.a) data.getContent();
        ThirdPartyBrazil thirdPartyBrazil = aVar != null ? aVar.d : null;
        so6.a aVar2 = (so6.a) data.getContent();
        List list = (List) iii.c.f(data, new v(this, 15), new utk.b(18), new tvh.e(this, domainState, 17));
        boolean loading = data.getLoading();
        io3.b bVar = thirdPartyBrazil != null ? thirdPartyBrazil.f73115a : null;
        return new o(list, loading, bVar != null ? new r3(new yy0.j(((di6.a) this.f284001b).c(bVar))) : null, thirdPartyBrazil != null ? thirdPartyBrazil.f73116b : null, aVar2 != null ? aVar2.f264788b : null);
    }
}
