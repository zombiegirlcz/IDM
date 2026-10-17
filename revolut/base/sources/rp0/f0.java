package rp0;

import android.content.Context;
import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class f0 {

    @NotNull
    private static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f256077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f256078b;

    public f0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f256077a = context;
        this.f256078b = -1;
    }

    public final void a() {
        if (this.f256078b == 0) {
            this.f256078b = 1;
            ox0.w.Companion.getClass();
            nq0.a aVarA = ox0.v.a(this.f256077a);
            int i = aVarA.f218341b - 1;
            aVarA.f218341b = i;
            if (i == 0) {
                aVarA.f = SystemClock.uptimeMillis();
            }
        }
    }

    public final void b() {
        if (this.f256078b != 0) {
            this.f256078b = 0;
            ox0.w.Companion.getClass();
            nq0.a aVarA = ox0.v.a(this.f256077a);
            if (aVarA.f218341b == 0) {
                aVarA.e = SystemClock.uptimeMillis();
            }
            aVarA.f218341b++;
        }
    }
}
