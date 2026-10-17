package i28;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import java.util.Optional;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f157893a = new d();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        RowDelegate.Model it8 = (RowDelegate.Model) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return Optional.of(it8);
    }
}
