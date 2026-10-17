package c4l;

import android.content.Context;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends fsi.c implements b {

    @NotNull
    private static final c Companion = new c();
    public static final fsi.b k = new fsi.b("TOAST_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f21318h;
    public final ty0.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public WeakReference f21319j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, ty0.c clauseDisplayer) {
        super(k);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clauseDisplayer, "clauseDisplayer");
        this.f21318h = context;
        this.i = clauseDisplayer;
    }
}
