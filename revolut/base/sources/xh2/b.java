package xh2;

import anf.k;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import thf.f;
import thf.g;
import whf.p;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f305798a;

    public b(g transactionsItemMapper) {
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        this.f305798a = transactionsItemMapper;
    }

    public final ArrayList a(p transactionsContent) {
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        return ((k) this.f305798a).q(transactionsContent.f297646a, transactionsContent.f297647b, new f(false, 3));
    }
}
