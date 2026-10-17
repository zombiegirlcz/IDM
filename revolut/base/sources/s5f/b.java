package s5f;

import com.revolut.feature.trading.managed_portfolios.impl.data.network.template.TemplateIntroService;
import kotlin.jvm.internal.Intrinsics;
import ne0.d;
import qkf.r;
import rch.o;
import rnb.u;
import ryj.f;
import t5f.j;
import ue0.c;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements phm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TemplateIntroService f260068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f260069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f260070c;
    public final d d;
    public final x4l.c e;

    public b(TemplateIntroService service, j networkMapper, c storage, d cache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(networkMapper, "networkMapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f260068a = service;
        this.f260069b = networkMapper;
        this.f260070c = storage;
        this.d = cache;
        pti.d dVar = new pti.d(this, null, 16);
        int i = 0;
        u uVar = new u(1, this, b.class, "getFromMemory", "getFromMemory(Ljava/lang/String;)Lcom/revolut/feature/trading/managed_portfolios/impl/domain/template/model/TemplateIntro;", i, 18);
        int i2 = 2;
        o oVar = new o(i2, this, b.class, "setToMemory", "setToMemory(Ljava/lang/String;Lcom/revolut/feature/trading/managed_portfolios/impl/domain/template/model/TemplateIntro;)V", i, 4);
        int i3 = 4;
        this.e = new x4l.c(dVar, uVar, oVar, new f(i2, this, b.class, "getFromStorage", "getFromStorage(Ljava/lang/String;)Lcom/revolut/feature/trading/managed_portfolios/impl/domain/template/model/TemplateIntro;", i3, 2), new r(3, this, b.class, "setToStorage", "setToStorage(Ljava/lang/String;Lcom/revolut/feature/trading/managed_portfolios/impl/domain/template/model/TemplateIntro;)V", i3, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(s5f.b r5, java.lang.String r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof s5f.a
            if (r0 == 0) goto L13
            r0 = r7
            s5f.a r0 = (s5f.a) r0
            int r1 = r0.f260067x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f260067x = r1
            goto L18
        L13:
            s5f.a r0 = new s5f.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f260067x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            t5f.j r5 = r0.u
            yhm.o.b(r7)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            t5f.j r7 = r5.f260069b
            com.revolut.feature.trading.managed_portfolios.impl.data.network.template.TemplateIntroService r5 = r5.f260068a
            r0.u = r7
            r0.f260067x = r3
            java.lang.Object r5 = r5.getTemplateIntro(r6, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r4 = r7
            r7 = r5
            r5 = r4
        L46:
            t5f.e r7 = (t5f.e) r7
            r5.getClass()
            com.revolut.feature.trading.managed_portfolios.impl.domain.template.model.TemplateIntro r5 = t5f.j.a(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s5f.b.a(s5f.b, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // phm.a
    public final Object get() {
        return this.e;
    }
}
