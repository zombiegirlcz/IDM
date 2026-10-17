package wg1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.text.r;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a extends q implements Function1 {
    public static final a f = new a();

    public a() {
        super(1, r.class, "isNotEmpty", "isNotEmpty(Ljava/lang/CharSequence;)Z", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String p0 = (String) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(p0.length() > 0);
    }
}
