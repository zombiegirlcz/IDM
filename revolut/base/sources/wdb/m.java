package wdb;

import java.time.LocalDateTime;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m extends kotlin.jvm.internal.q implements Function1 {
    public static final m f = new m();

    public m() {
        super(1, LocalDateTime.class, "toLocalTime", "toLocalTime()Ljava/time/LocalTime;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        LocalDateTime p0 = (LocalDateTime) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.toLocalTime();
    }
}
