package vv1;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.feature.apm.core.api.product.ApmBreb;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import uv1.k;
import wp4.j0;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ActionWidgetDelegate.Model modelD;
        k contactsState = (k) obj2;
        Intrinsics.checkNotNullParameter(contactsState, "p0");
        wv1.e eVar = (wv1.e) this.receiver;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(contactsState, "contactsState");
        if (contactsState.f283277a) {
            modelD = ((s12.f) eVar.f300263a).d(ApmBreb.f61810c.e());
        } else {
            modelD = null;
        }
        return d0.E0((List) iii.c.f(contactsState.f283278b, new wuk.c(9), new wug.k(5), new j0(eVar, 8)), v.l(modelD));
    }
}
