package cie;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.q implements Function1 {
    public static final n f = new n();

    public n() {
        super(1, sfe.u.class, "<init>", "<init>(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        RowDelegate.Model p0 = (RowDelegate.Model) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new sfe.u(p0);
    }
}
