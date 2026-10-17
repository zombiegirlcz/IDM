package r9i;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zx0.o;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements o {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q9i.b f252732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f252733b;

    public e(q9i.b reactionsKeyboardInteractor, a reactionsKeyboardItemsMapper) {
        Intrinsics.checkNotNullParameter(reactionsKeyboardInteractor, "reactionsKeyboardInteractor");
        Intrinsics.checkNotNullParameter(reactionsKeyboardItemsMapper, "reactionsKeyboardItemsMapper");
        this.f252732a = reactionsKeyboardInteractor;
        this.f252733b = reactionsKeyboardItemsMapper;
    }
}
