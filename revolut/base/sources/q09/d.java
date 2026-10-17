package q09;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.q implements Function1 {
    public static final d f = new d();

    public d() {
        super(1, r.class, "<init>", "<init>(Lcom/revolut/core/ui_kit/delegates/SingleChoiceDelegate$Model;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SingleChoiceDelegate.Model p0 = (SingleChoiceDelegate.Model) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new r(p0);
    }
}
