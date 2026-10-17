package cmf;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Flow f25245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f25246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f25247c;
    public final String d;

    public p(Flow itemsFlow, Function0 fallbackItems, List clickHandlers, String name) {
        Intrinsics.checkNotNullParameter(itemsFlow, "itemsFlow");
        Intrinsics.checkNotNullParameter(fallbackItems, "fallbackItems");
        Intrinsics.checkNotNullParameter(clickHandlers, "clickHandlers");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f25245a = itemsFlow;
        this.f25246b = fallbackItems;
        this.f25247c = clickHandlers;
        this.d = name;
    }
}
