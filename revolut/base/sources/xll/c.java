package xll;

import bjl.u;
import bjl.v;
import bjl.w;
import bjl.x;
import bjl.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f307048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.consent.app.b f307049b;

    public /* synthetic */ c(com.revolut.sso.impl.ui.consent.app.b bVar, int i) {
        this.f307048a = i;
        this.f307049b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f307048a) {
            case 0:
                com.revolut.sso.impl.ui.consent.app.b bVar = this.f307049b;
                yki.a aVar = bVar.v;
                y result = (y) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if ((result instanceof u) || (result instanceof v)) {
                    h.D2(aVar);
                } else {
                    if (!(result instanceof w) && !(result instanceof x)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.I2();
                    h.D2(aVar);
                }
                return Unit.f186387a;
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                h.D2(this.f307049b.v);
                return Boolean.FALSE;
        }
    }
}
