package wk8;

import efm.r;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import pwa.n;
import rd0.e;
import vkm.d;
import w4l.h;
import w4l.i;
import w4l.k;
import wf6.o;
import wje.m;
import wwa.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zk8.a f298254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f298255b;

    public a(zk8.a repository, b inviteCampaignHomeInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(inviteCampaignHomeInteractor, "inviteCampaignHomeInteractor");
        this.f298254a = repository;
        this.f298255b = inviteCampaignHomeInteractor;
    }

    public final d a(String str, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-identity-auth-domain-model-RegisteredIdentityId$-juniorRegId$0");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        k kVar = i.f294643c;
        boolean zEquals = loadingStrategy.equals(kVar);
        n referralCampaignV4Type = n.JUNIOR_TO_JUNIOR;
        b bVar = this.f298255b;
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        mwa.b bVar2 = bVar.f300637a;
        if (!zEquals) {
            kVar = h.f294642c;
        }
        r map = e.c(mwa.b.c(bVar2, referralCampaignV4Type, kVar, str, 2), g.f186406a).map(new o(26, new m(19)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return e.b(map);
    }

    public final r b(String juniorId, boolean z) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        zk8.e eVar = (zk8.e) this.f298254a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        return eVar.d.f(juniorId, z);
    }
}
