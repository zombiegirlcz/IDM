package akl;

import com.revolut.sso.api.models.OAuthUserInfo;
import com.revolut.sso.impl.network.services.OAuthUserInfoService;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 {

    @NotNull
    private static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OAuthUserInfoService f6013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f6014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f6015c;
    public final x4l.c d;

    public f0(OAuthUserInfoService oauthUserInfoService, ue0.c storage, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(oauthUserInfoService, "oauthUserInfoService");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f6013a = oauthUserInfoService;
        this.f6014b = storage;
        this.f6015c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new a09.o(this, continuation, 5), new afa.q(this, 20), new ack.f(this, 22), new e0(this, continuation, 0), new a09.p(this, continuation, 6));
    }

    public static final OAuthUserInfo a(f0 f0Var) {
        ckl.o oVar = (ckl.o) j6.a.k(ckl.o.class, f0Var.f6014b, "OAUTH_USER_INFO");
        if (oVar == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        List<ckl.h> list = oVar.f24889a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (ckl.h hVar : list) {
            ckl.d dVar = hVar.f24879a;
            OAuthUserInfo.Client client = new OAuthUserInfo.Client(dVar.f24874a, dVar.f24875b, dVar.f24876c, dVar.d, dVar.e);
            List<ckl.k> list2 = hVar.f24880b;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
            for (ckl.k kVar : list2) {
                String str = kVar.f24882a;
                List<ckl.n> list3 = kVar.f24883b;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                for (ckl.n nVar : list3) {
                    arrayList3.add(new OAuthUserInfo.Scope(nVar.f24886a, nVar.f24887b));
                }
                arrayList2.add(new OAuthUserInfo.Connection(kVar.f24884c, str, arrayList3));
            }
            arrayList.add(new OAuthUserInfo.ConnectedClient(client, arrayList2));
        }
        return new OAuthUserInfo(arrayList);
    }
}
