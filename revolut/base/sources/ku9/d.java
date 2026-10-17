package ku9;

import android.content.Context;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uu9.f;
import yhm.j;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f189759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f189760b;

    public d(Context context, f pushSenderMapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pushSenderMapper, "pushSenderMapper");
        this.f189759a = pushSenderMapper;
        this.f189760b = j.b(new a01.c(context, 13));
    }
}
