package t96;

import e4m.e;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements e {
    public static s96.a a() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = Class.forName("com.revolut.feature.document_scanner.MlKitDocumentScanner").getDeclaredConstructor(null).newInstance(null);
        Intrinsics.i(objNewInstance, "null cannot be cast to non-null type com.revolut.feature.document_scanner.proxy.DocumentScanner");
        return (s96.a) objNewInstance;
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
