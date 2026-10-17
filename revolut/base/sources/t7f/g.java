package t7f;

import com.revolut.feature.wealth.models.robo.Template;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f268662a = new g();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Template it8 = (Template) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.k;
    }
}
