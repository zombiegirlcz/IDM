package an;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rp0.v0;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.q implements Function1 {
    public static final p f = new p();

    public p() {
        super(1, j.class, "<init>", "<init>(Lcom/revolut/core/ui_kit/dialogs/PromptDialogDisplayer$VisibilityData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        v0 p0 = (v0) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new j(p0);
    }
}
