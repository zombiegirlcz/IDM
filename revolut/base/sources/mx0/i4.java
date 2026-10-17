package mx0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class i4 extends kotlin.jvm.internal.q implements Function1 {
    public static final i4 f = new i4();

    public i4() {
        super(1, CharSequence.class, "toString", "toString()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        CharSequence p0 = (CharSequence) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.toString();
    }
}
