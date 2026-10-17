package mj6;

import cli.n;
import cli.o;
import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.models.open_banking_brazil.ThirdPartyBrazil;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mh4.x;
import org.jetbrains.annotations.NotNull;
import tx0.r3;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne6.b f205934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je6.h f205935b;

    public k(ne6.b detailsFactory, je6.h institutionLogoMapper) {
        Intrinsics.checkNotNullParameter(detailsFactory, "detailsFactory");
        Intrinsics.checkNotNullParameter(institutionLogoMapper, "institutionLogoMapper");
        this.f205934a = detailsFactory;
        this.f205935b = institutionLogoMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f205929a;
        so6.a aVar = (so6.a) data.getContent();
        ThirdPartyBrazil thirdPartyBrazil = aVar != null ? aVar.d : null;
        so6.a aVar2 = (so6.a) data.getContent();
        List list = (List) iii.c.f(data, new x(this, 17), new mh1.e(7), new m88.c(this, domainState, 7));
        boolean loading = data.getLoading();
        io3.b bVar = thirdPartyBrazil != null ? thirdPartyBrazil.f73115a : null;
        return new i(list, loading, bVar != null ? new r3(new yy0.j(((di6.a) this.f205935b).c(bVar))) : null, thirdPartyBrazil != null ? thirdPartyBrazil.f73116b : null, aVar2 != null ? aVar2.f264788b : null, aVar2 != null ? aVar2.f264789c : null);
    }
}
