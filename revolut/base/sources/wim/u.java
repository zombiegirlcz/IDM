package wim;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class u extends kotlin.jvm.internal.q implements Function1 {
    public static final u f = new u();

    public u() {
        super(1, z.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Type p0 = (Type) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return z.a(p0);
    }
}
