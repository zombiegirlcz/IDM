package ei0;

import com.google.android.gms.common.api.OptionalModuleApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f126335a = new d();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        OptionalModuleApi it8 = (OptionalModuleApi) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        String simpleName = it8.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
