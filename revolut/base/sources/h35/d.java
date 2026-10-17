package h35;

import com.revolut.core.ui_kit.delegates.BannerDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class d extends q implements Function1 {
    public static final d f = new d();

    public d() {
        super(1, b.class, "<init>", "<init>(Lcom/revolut/core/ui_kit/delegates/BannerDelegate$Model;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        BannerDelegate.Model p0 = (BannerDelegate.Model) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new b(p0);
    }
}
