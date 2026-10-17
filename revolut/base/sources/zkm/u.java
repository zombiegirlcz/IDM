package zkm;

import yhm.m;

/* JADX INFO: loaded from: classes13.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f323124a = 0;

    static {
        Object objA;
        Object objA2;
        a.a.f();
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = gim.a.class.getCanonicalName();
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (yhm.m.a(objA) != null) {
            objA = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objA2 = u.class.getCanonicalName();
        } catch (Throwable th11) {
            m.Companion companion3 = yhm.m.INSTANCE;
            objA2 = yhm.o.a(th11);
        }
        if (yhm.m.a(objA2) != null) {
            objA2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
