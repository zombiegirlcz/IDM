package lk;

import kg.o;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f196159a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f196160b = j.b(new lh9.b(6));

    public static o a() {
        Object value = f196160b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (o) value;
    }
}
