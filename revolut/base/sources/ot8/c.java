package ot8;

import com.revolut.feature.kyc.core.impl.docs.KycDocsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mqc.p;
import ne0.j;
import od0.e;
import okf.m;
import or4.i;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KycDocsService f229574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f229575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f229576c;

    public c(KycDocsService kycDocsService, j memoryCache, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(kycDocsService, "kycDocsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f229574a = kycDocsService;
        this.f229575b = memoryCache;
        this.f229576c = new x4l.c(new m(networkStateRepository, this, (Continuation) null), new oqk.c(this, 13), new i(this, 2), new p(2, 17, null), new nfj.i(3, 8, null));
    }

    public static void a(String str, StringBuilder sb6) {
        if (str == null) {
            str = "";
        }
        sb6.append(str.length());
        sb6.append('#');
        sb6.append(str);
    }

    public static String b(b bVar) {
        StringBuilder sb6 = new StringBuilder();
        a(bVar.f229572b.name(), sb6);
        wi0.b bVar2 = bVar.f229571a;
        a(bVar2 != null ? bVar2.f297794a : null, sb6);
        a(bVar.f229573c, sb6);
        wi0.b bVar3 = bVar.d;
        a(bVar3 != null ? bVar3.f297794a : null, sb6);
        return sb6.toString();
    }

    @Override // od0.e
    public final void clear() {
        this.f229575b.clear();
    }
}
