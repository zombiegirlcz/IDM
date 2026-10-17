package w66;

import com.revolut.feature.defi.trade.impl.data.network.DefiAssetsService;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f295386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f295387b;

    public a(b bVar, int i) {
        this.f295386a = bVar;
        this.f295387b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f295386a;
        ee0.a aVar = bVar.f295388a;
        nj0.a aVar2 = bVar.f295389b;
        int i = this.f295387b;
        if (i == 0) {
            return new v66.b();
        }
        if (i == 1) {
            return new ne0.d();
        }
        if (i == 2) {
            je0.d mapper = aVar.d();
            s.j(mapper);
            xe0.f storageFactory = aVar.f();
            s.j(storageFactory);
            h.Companion.getClass();
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
            return xe0.f.e(storageFactory, "defi_trade_storage", mapper, 8);
        }
        if (i == 3) {
            return new u66.b((DefiAssetsService) bVar.i.get(), (j) bVar.f295391g.get(), (ue0.c) bVar.f295392h.get());
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        ek.a converterFactory = ((nj0.d) aVar2).d();
        ik0.b factory = ((nj0.d) aVar2).m();
        s.j(factory);
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object objCreate = ik0.b.a(factory, null, null, converterFactory, null, 27).create(DefiAssetsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        DefiAssetsService defiAssetsService = (DefiAssetsService) objCreate;
        s.k(defiAssetsService);
        return defiAssetsService;
    }
}
