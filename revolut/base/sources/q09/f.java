package q09;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.q implements Function1 {
    public static final f f = new f();

    public f() {
        super(1, t.class, "<init>", "<init>(Lcom/revolut/core/ui_kit/delegates/InputChecklistDelegate$Model;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        InputChecklistDelegate.Model p0 = (InputChecklistDelegate.Model) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new t(p0);
    }
}
