package tb;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class r extends kotlin.jvm.internal.u implements Function1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r f269403h;
    public static final r i;
    public final /* synthetic */ int f;

    static {
        int i2 = 1;
        f269403h = new r(i2, 0);
        i = new r(i2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f) {
            case 0:
                return Integer.valueOf(((Number) obj2).intValue());
            default:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj3 = it8.get(0);
                Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.Int");
                return new a0(((Integer) obj3).intValue());
        }
    }
}
