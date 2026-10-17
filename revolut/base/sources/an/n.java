package an;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rp0.p0;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.q implements Function1 {
    public static final n f = new n();

    public n() {
        super(1, g.class, "<init>", "<init>(Lcom/revolut/core/ui_kit/dialogs/PromptDialogDisplayer$ClickData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        p0.a p0 = (p0.a) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new g(p0);
    }
}
