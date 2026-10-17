package ft1;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class h extends q implements Function1 {
    public static final h f = new h();

    public h() {
        super(1, ks1.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/apm/bizum/impl/databinding/ScreenBizumRegistrationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ks1.b.a(p0);
    }
}
