package fnc;

import com.revolut.feature.wealth.models.robo.Template;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f136669a = new y();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Template template = (Template) obj2;
        Intrinsics.checkNotNullParameter(template, "template");
        return new noc.b(template.f95706a);
    }
}
