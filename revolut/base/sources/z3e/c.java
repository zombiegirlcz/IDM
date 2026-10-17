package z3e;

import com.revolut.data.database.models.openbanking.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f319258a;

    public c(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f319258a = storage;
    }

    public final void a(String storyKey) {
        Intrinsics.checkNotNullParameter(storyKey, "storyKey");
        d.D(Boolean.TYPE, this.f319258a, j6.a.q("STORY_KEY_SHOWN_", storyKey), Boolean.TRUE);
    }
}
