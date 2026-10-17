package gsc;

import com.revolut.feature.sca_prompt.impl.data.service.CryptoScaPromptService;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee0.a f146375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f146376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nj0.a f146377c;
    public final fy9.b d;
    public final xmg.a e;
    public final c f = this;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f146378g = e4m.b.b(new b(this, 0));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f146379h = e4m.b.b(new b(this, 1));
    public final e4m.e i = e4m.b.b(new b(this, 2));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f146380j = e4m.b.b(new b(this, 4));
    public final e4m.e k = e4m.b.b(new b(this, 3));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f146381l = e4m.b.b(new b(this, 6));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f146382m = e4m.b.b(new b(this, 5));

    public c(ee0.a aVar, nj0.a aVar2, an0.c cVar, xmg.a aVar3, fsc.a aVar4, fy9.b bVar) {
        this.f146375a = aVar;
        this.f146376b = cVar;
        this.f146377c = aVar2;
        this.d = bVar;
        this.e = aVar3;
    }

    public final zrc.d a() {
        bsc.b bVar = new bsc.b((ue0.c) this.f146379h.get(), (j) this.i.get(), (CryptoScaPromptService) this.k.get());
        ay9.b bVar2 = (ay9.b) this.d.i.get();
        s.j(bVar2);
        return new zrc.d(bVar, bVar2, this.e.e());
    }

    public final hsc.c b() {
        msc.a legalEntityProvider = new msc.a();
        Intrinsics.checkNotNullParameter(legalEntityProvider, "legalEntityProvider");
        return new hsc.c();
    }

    public final zrc.e c() {
        return new zrc.e((bsc.c) this.f146382m.get());
    }
}
