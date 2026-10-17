package xgl;

import kg.o;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import xda.z;
import yhm.j;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f305772a = j.b(new z(17));

    private a() {
    }

    public static o a() {
        Object value = f305772a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (o) value;
    }
}
