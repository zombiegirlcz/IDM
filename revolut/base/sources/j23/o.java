package j23;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Flow f170671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f170672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f170673c;
    public final String d;

    public o(Flow itemsFlow, List clickHandlers, List clauseClickHandlers, String name, int i) {
        clickHandlers = (i & 2) != 0 ? f0.f322471a : clickHandlers;
        clauseClickHandlers = (i & 4) != 0 ? f0.f322471a : clauseClickHandlers;
        Intrinsics.checkNotNullParameter(itemsFlow, "itemsFlow");
        Intrinsics.checkNotNullParameter(clickHandlers, "clickHandlers");
        Intrinsics.checkNotNullParameter(clauseClickHandlers, "clauseClickHandlers");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f170671a = itemsFlow;
        this.f170672b = clickHandlers;
        this.f170673c = clauseClickHandlers;
        this.d = name;
    }
}
