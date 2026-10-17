package ikm;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorModuleDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f162001a = new a();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ErrorModuleDescriptor errorModuleDescriptor = ErrorModuleDescriptor.INSTANCE;
        return DefaultBuiltIns.Companion.getInstance();
    }
}
