package q09;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.q implements Function1 {
    public static final e f = new e();

    public e() {
        super(1, q.class, "<init>", "<init>(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        LargeActionButtonDelegate.Model p0 = (LargeActionButtonDelegate.Model) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new q(p0);
    }
}
