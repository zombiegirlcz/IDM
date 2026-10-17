package fs9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru9.l0;
import ru9.o;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f137657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final du9.b f137658b;

    public d(l0 chatBubbleMapper, o bubblePositionMapper, du9.b disclaimerProvider) {
        Intrinsics.checkNotNullParameter(chatBubbleMapper, "chatBubbleMapper");
        Intrinsics.checkNotNullParameter(bubblePositionMapper, "bubblePositionMapper");
        Intrinsics.checkNotNullParameter(disclaimerProvider, "disclaimerProvider");
        this.f137657a = chatBubbleMapper;
        this.f137658b = disclaimerProvider;
    }
}
