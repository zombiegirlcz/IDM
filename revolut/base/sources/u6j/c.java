package u6j;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import nil.e;
import org.jetbrains.annotations.NotNull;
import wd6.h;
import zhm.a1;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f277607c;
    public static final LinkedHashSet d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4i.a f277608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f277609b;

    static {
        h[] elements = {h.MARKET, h.LIMIT, h.STOP};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = d.y0(elements);
        f277607c = setY0;
        d = a1.m(setY0, h.RECURRING);
    }

    public c(l4i.a amountConverter, e wealthKeyboardSuggestionsInteractor) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(wealthKeyboardSuggestionsInteractor, "wealthKeyboardSuggestionsInteractor");
        this.f277608a = amountConverter;
        this.f277609b = wealthKeyboardSuggestionsInteractor;
    }
}
