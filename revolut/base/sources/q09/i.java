package q09;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.dc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.q implements Function1 {
    public static final i f = new i();

    public i() {
        super(1, u.class, "<init>", "<init>(Lcom/revolut/core/ui_kit/views/SwipeableCardsView$PositionInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        dc p0 = (dc) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new u(p0);
    }
}
