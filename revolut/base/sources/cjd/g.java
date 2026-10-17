package cjd;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.PassportService;
import pjd.b;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shops.impl.ui.details.a f24644b;

    public /* synthetic */ g(com.revolut.feature.shops.impl.ui.details.a aVar, int i) {
        this.f24643a = i;
        this.f24644b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f24643a) {
            case 0:
                iub.a it8 = (iub.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.shops.impl.ui.details.a aVar = this.f24644b;
                aVar.n2(new l(aVar, null), new whi.b(6));
                return Unit.f186387a;
            default:
                return d.a((d) obj2, null, null, null, 0, false, b.a.a(((d) ((j2) this.f24644b.D.f22677a).getValue()).f, null, null, false, false, false, false, null, 95), false, false, PassportService.DEFAULT_MAX_BLOCKSIZE);
        }
    }
}
