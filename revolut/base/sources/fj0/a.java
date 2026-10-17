package fj0;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private a() {
    }

    public static Serializable a(int i) {
        try {
            m.Companion companion = m.INSTANCE;
            b.a(i);
            return new b(i);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            return o.a(th10);
        }
    }

    public static Serializable b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            m.Companion companion = m.INSTANCE;
            int i = Integer.parseInt(value);
            b.a(i);
            return new b(i);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            return o.a(th10);
        }
    }
}
