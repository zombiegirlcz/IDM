package bjm;

import java.util.ServiceLoader;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import zhm.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f16195b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f16196c = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16197a;

    public /* synthetic */ a(int i) {
        this.f16197a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16197a) {
            case 0:
                BuiltInsLoader.Companion companion = BuiltInsLoader.Companion.f186460a;
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
                Intrinsics.h(serviceLoaderLoad);
                BuiltInsLoader builtInsLoader = (BuiltInsLoader) d0.c0(serviceLoaderLoad);
                if (builtInsLoader != null) {
                    return builtInsLoader;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            default:
                return new DefaultBuiltIns(false, 1, null);
        }
    }
}
