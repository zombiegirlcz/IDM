package kotlin.reflect.jvm.internal.impl.storage;

import dki.h;
import fkm.i;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class c implements NullableLazyValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LockBasedStorageManager f187750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f187751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f187752c;

    public c(LockBasedStorageManager lockBasedStorageManager, Function0 function0) {
        if (function0 == null) {
            a(1);
            throw null;
        }
        this.f187752c = i.NOT_COMPUTED;
        this.f187750a = lockBasedStorageManager;
        this.f187751b = function0;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i == 2 || i == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 2) {
            objArr[1] = "recursionDetected";
        } else if (i != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i != 2 && i != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public void b(Object obj2) {
    }

    public h c(boolean z) {
        h hVarB = this.f187750a.b(null, "in a lazy value");
        if (hVarB != null) {
            return hVarB;
        }
        a(2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007b, B:35:0x007c, B:36:0x0082, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007b, B:35:0x007c, B:36:0x0082, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
    @Override // kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue, kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f187752c
            boolean r1 = r0 instanceof fkm.i
            if (r1 != 0) goto Lb
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.unescapeThrowable(r0)
            return r0
        Lb:
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r0 = r4.f187750a
            kotlin.reflect.jvm.internal.impl.storage.SimpleLock r0 = r0.f187746a
            r0.lock()
            java.lang.Object r0 = r4.f187752c     // Catch: java.lang.Throwable -> L24
            boolean r1 = r0 instanceof fkm.i     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L26
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.unescapeThrowable(r0)     // Catch: java.lang.Throwable -> L24
        L1c:
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r1 = r4.f187750a
            kotlin.reflect.jvm.internal.impl.storage.SimpleLock r1 = r1.f187746a
            r1.unlock()
            return r0
        L24:
            r0 = move-exception
            goto L83
        L26:
            fkm.i r1 = fkm.i.COMPUTING     // Catch: java.lang.Throwable -> L24
            if (r0 != r1) goto L3e
            fkm.i r2 = fkm.i.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L24
            r4.f187752c = r2     // Catch: java.lang.Throwable -> L24
            r2 = 1
            dki.h r2 = r4.c(r2)     // Catch: java.lang.Throwable -> L24
            boolean r3 = r2.o()     // Catch: java.lang.Throwable -> L24
            if (r3 != 0) goto L3e
            java.lang.Object r0 = r2.n()     // Catch: java.lang.Throwable -> L24
            goto L1c
        L3e:
            fkm.i r2 = fkm.i.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L24
            if (r0 != r2) goto L52
            r0 = 0
            dki.h r0 = r4.c(r0)     // Catch: java.lang.Throwable -> L24
            boolean r2 = r0.o()     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L52
            java.lang.Object r0 = r0.n()     // Catch: java.lang.Throwable -> L24
            goto L1c
        L52:
            r4.f187752c = r1     // Catch: java.lang.Throwable -> L24
            kotlin.jvm.functions.Function0 r0 = r4.f187751b     // Catch: java.lang.Throwable -> L60
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L60
            r4.b(r0)     // Catch: java.lang.Throwable -> L60
            r4.f187752c = r0     // Catch: java.lang.Throwable -> L60
            goto L1c
        L60:
            r0 = move-exception
            boolean r1 = kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt.isProcessCanceledException(r0)     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L7c
            java.lang.Object r1 = r4.f187752c     // Catch: java.lang.Throwable -> L24
            fkm.i r2 = fkm.i.COMPUTING     // Catch: java.lang.Throwable -> L24
            if (r1 != r2) goto L73
            java.lang.Object r1 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.escapeThrowable(r0)     // Catch: java.lang.Throwable -> L24
            r4.f187752c = r1     // Catch: java.lang.Throwable -> L24
        L73:
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r1 = r4.f187750a     // Catch: java.lang.Throwable -> L24
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$ExceptionHandlingStrategy r1 = r1.f187747b     // Catch: java.lang.Throwable -> L24
            java.lang.RuntimeException r0 = r1.handleException(r0)     // Catch: java.lang.Throwable -> L24
            throw r0     // Catch: java.lang.Throwable -> L24
        L7c:
            fkm.i r1 = fkm.i.NOT_COMPUTED     // Catch: java.lang.Throwable -> L24
            r4.f187752c = r1     // Catch: java.lang.Throwable -> L24
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L24
            throw r0     // Catch: java.lang.Throwable -> L24
        L83:
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r1 = r4.f187750a
            kotlin.reflect.jvm.internal.impl.storage.SimpleLock r1 = r1.f187746a
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.c.invoke():java.lang.Object");
    }

    public final boolean isComputed() {
        return (this.f187752c == i.NOT_COMPUTED || this.f187752c == i.COMPUTING) ? false : true;
    }
}
