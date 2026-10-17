package w36;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import vnl.o;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f294150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.flow.b f294151b;

    public /* synthetic */ d(com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.flow.b bVar, int i) {
        this.f294150a = i;
        this.f294151b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f294150a) {
            case 0:
                h46.c output = (h46.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!Intrinsics.f(output, h46.c.f149324a)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.D2(this.f294151b.f71755r);
                return Unit.f186387a;
            case 1:
                u36.c output2 = (u36.c) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                t36.c cVar = output2.f276782a;
                com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.flow.b bVar = this.f294151b;
                bVar.l2(new o(bVar, cVar, null, 25), new d(bVar, 2));
                return Unit.f186387a;
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.flow.b bVar2 = this.f294151b;
                bVar2.f71754q.getClass();
                l.a1(bVar2, bVar2.X1(new y0(null, new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5)), null, null, null, 7);
                return Boolean.TRUE;
        }
    }
}
