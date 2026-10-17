package kjm;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;
import zhm.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f184497a = new a();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MetadataExtensions.Companion companion = MetadataExtensions.Companion.f186835a;
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(MetadataExtensions.class, MetadataExtensions.class.getClassLoader());
        Intrinsics.checkNotNullExpressionValue(serviceLoaderLoad, "load(...)");
        List listD1 = d0.d1(serviceLoaderLoad);
        if (listD1.isEmpty()) {
            throw new IllegalStateException("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }
        return listD1;
    }
}
