package i2m;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends u implements Function1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f158056h;
    public static final b i;
    public final /* synthetic */ int f;

    static {
        int i2 = 1;
        f158056h = new b(i2, 0);
        i = new b(i2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f) {
            case 0:
                return a0.d.v(new Object[]{Byte.valueOf(((Number) obj2).byteValue())}, 1, "%02x", "format(...)");
            default:
                String it8 = (String) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return "-d '" + it8 + CoreConstants.SINGLE_QUOTE_CHAR;
        }
    }
}
