package f3f;

import kg.o;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f131972a = j.b(new af0.a(10));

    private a() {
    }

    public static o a() {
        Object value = f131972a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (o) value;
    }
}
