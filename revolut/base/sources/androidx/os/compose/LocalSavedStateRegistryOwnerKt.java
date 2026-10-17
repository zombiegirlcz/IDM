package androidx.os.compose;

import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.os.SavedStateRegistryOwner;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LocalSavedStateRegistryOwner", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/savedstate/SavedStateRegistryOwner;", "getLocalSavedStateRegistryOwner", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "savedstate-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class LocalSavedStateRegistryOwnerKt {

    @NotNull
    private static final ProvidableCompositionLocal<SavedStateRegistryOwner> LocalSavedStateRegistryOwner;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if ((r1 instanceof androidx.compose.runtime.ProvidableCompositionLocal) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r1 = (androidx.compose.runtime.ProvidableCompositionLocal) r1;
     */
    static {
        /*
            r0 = 0
            yhm.m$a r1 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L30
            java.lang.Class<androidx.savedstate.SavedStateRegistryOwner> r1 = androidx.os.SavedStateRegistryOwner.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L30
            kotlin.jvm.internal.Intrinsics.h(r1)     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "androidx.compose.ui.platform.AndroidCompositionLocals_androidKt"
            java.lang.String r3 = "getLocalSavedStateRegistryOwner"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.reflect.Method r1 = r1.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L30
            java.lang.annotation.Annotation[] r2 = r1.getAnnotations()     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "getAnnotations(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Throwable -> L30
            int r3 = r2.length     // Catch: java.lang.Throwable -> L30
            r4 = 0
        L23:
            if (r4 >= r3) goto L32
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L30
            boolean r5 = r5 instanceof yhm.d     // Catch: java.lang.Throwable -> L30
            if (r5 == 0) goto L2d
        L2b:
            r1 = r0
            goto L43
        L2d:
            int r4 = r4 + 1
            goto L23
        L30:
            r1 = move-exception
            goto L3d
        L32:
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L30
            boolean r2 = r1 instanceof androidx.compose.runtime.ProvidableCompositionLocal     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L2b
            androidx.compose.runtime.ProvidableCompositionLocal r1 = (androidx.compose.runtime.ProvidableCompositionLocal) r1     // Catch: java.lang.Throwable -> L30
            goto L43
        L3d:
            yhm.m$a r2 = yhm.m.INSTANCE
            yhm.n r1 = yhm.o.a(r1)
        L43:
            yhm.m$a r2 = yhm.m.INSTANCE
            boolean r2 = r1 instanceof yhm.n
            if (r2 == 0) goto L4a
            goto L4b
        L4a:
            r0 = r1
        L4b:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = (androidx.compose.runtime.ProvidableCompositionLocal) r0
            if (r0 != 0) goto L5a
            e18.i r0 = new e18.i
            r1 = 18
            r0.<init>(r1)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(r0)
        L5a:
            androidx.os.compose.LocalSavedStateRegistryOwnerKt.LocalSavedStateRegistryOwner = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.os.compose.LocalSavedStateRegistryOwnerKt.<clinit>():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SavedStateRegistryOwner LocalSavedStateRegistryOwner$lambda$3$lambda$2() {
        throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
    }

    @NotNull
    public static final ProvidableCompositionLocal<SavedStateRegistryOwner> getLocalSavedStateRegistryOwner() {
        return LocalSavedStateRegistryOwner;
    }
}
