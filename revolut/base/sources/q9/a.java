package q9;

import a0.d;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f243173c;
    public static final RuntimeException d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f243174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f243175b;

    static {
        a aVar = null;
        try {
            e = null;
            aVar = new a();
        } catch (RuntimeException e) {
            e = e;
        }
        f243173c = aVar;
        d = e;
    }

    public a() {
        try {
            this.f243174a = Class.class.getMethod("getRecordComponents", null);
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            this.f243175b = cls.getMethod("getName", null);
            cls.getMethod("getType", null);
        } catch (Exception e) {
            throw new RuntimeException(d.s("Failed to access Methods needed to support `java.lang.Record`: (", e.getClass().getName(), ") ", e.getMessage()), e);
        }
    }
}
