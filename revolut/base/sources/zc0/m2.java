package zc0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class m2 extends kotlin.jvm.internal.q implements Function1 {
    public static final m2 f = new m2();

    public m2() {
        super(1, kotlin.text.r.class, "isBlank", "isBlank(Ljava/lang/CharSequence;)Z", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String p0 = (String) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(kotlin.text.d0.W(p0));
    }
}
