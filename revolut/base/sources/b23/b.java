package b23;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import n33.n;
import rp0.y;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, n.class, "<init>", "<init>(Lcom/revolut/core/ui_kit/dialogs/ExpandableDialogDisplayer$Model;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        y p0 = (y) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new n(p0);
    }
}
