package z66;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f319703a = new r();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return Boolean.valueOf(obj2 instanceof RowDelegate.Model);
    }
}
