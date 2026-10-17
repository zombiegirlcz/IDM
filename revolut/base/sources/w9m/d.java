package w9m;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes23.dex */
public final class d extends u implements Function2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f295767h;
    public static final d i;
    public final /* synthetic */ int f;

    static {
        int i2 = 2;
        f295767h = new d(i2, 0);
        i = new d(i2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f) {
            case 0:
                b layout = (b) obj2;
                c item = (c) obj3;
                Intrinsics.checkNotNullParameter(layout, "layout");
                Intrinsics.checkNotNullParameter(item, "item");
                layout.getClass();
                return Integer.valueOf((layout.f() - item.f295766a.getSize()) / 2);
            default:
                b layout2 = (b) obj2;
                c noName_1 = (c) obj3;
                Intrinsics.checkNotNullParameter(layout2, "layout");
                Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
                layout2.getClass();
                return 0;
        }
    }
}
