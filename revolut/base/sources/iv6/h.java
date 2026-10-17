package iv6;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.g f168757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f168758b;

    public h(thf.g transactionItemMapper) {
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        this.f168757a = transactionItemMapper;
        pr6.m[] elements = {pr6.m.CREATED, pr6.m.ACTIVE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f168758b = kotlin.collections.d.y0(elements);
    }
}
