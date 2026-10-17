package sjm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;

/* JADX INFO: loaded from: classes14.dex */
public final class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f263746a = new d();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String it8 = (String) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        SignatureBuildingComponents.INSTANCE.getClass();
        return it8.length() > 1 ? p.a.l(';', "L", it8) : it8;
    }
}
