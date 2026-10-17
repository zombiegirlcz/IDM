package mli;

import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.d0;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tif.n;
import tif.o;
import tif.p;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ efm.b f206974b;

    public /* synthetic */ h(efm.b bVar, int i) {
        this.f206973a = i;
        this.f206974b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f206973a) {
            case 0:
                efm.b bVar = this.f206974b;
                Intrinsics.h(bVar);
                pfm.a aVar = new pfm.a(bVar, new kye.e(new m08.i(new BreadcrumbException(), 28)), 2);
                Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                Intrinsics.checkNotNullExpressionValue(aVar.w(new a0d.g(28, j.f206976a), i.f206975a), "subscribe(...)");
                return Unit.f186387a;
            case 1:
                Boolean enabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                if (!enabled.booleanValue()) {
                    return d0.m(Boolean.FALSE);
                }
                return this.f206974b.f(d0.m(Boolean.TRUE));
            case 2:
                Boolean isEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
                if (!isEnabled.booleanValue()) {
                    return d0.m(Boolean.FALSE);
                }
                return this.f206974b.f(d0.m(Boolean.TRUE));
            case 3:
                Boolean it8 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f206974b;
            default:
                p state = (p) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                boolean z = state instanceof o;
                efm.b bVar2 = this.f206974b;
                if (z) {
                    return bVar2.z(((o) state).f271516a, TimeUnit.MILLISECONDS, hhm.f.f152431c);
                }
                if (state instanceof n) {
                    return bVar2;
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
