package d27;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$string;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a f110741b;

    public /* synthetic */ e0(com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar, int i) {
        this.f110740a = i;
        this.f110741b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f110740a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar = this.f110741b;
                aVar.f74185x.getClass();
                yji.l.a1(aVar, aVar.X1(new y0(null, new nii.z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5)), null, null, null, 7);
                return Boolean.TRUE;
            default:
                xi0.b currency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(currency, "currency");
                return this.f110741b.v.j(new md6.a(md6.e.PRO, currency, (md6.d) null, (md6.f) null, 60));
        }
    }
}
