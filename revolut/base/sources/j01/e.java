package j01;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class e implements View.OnTouchListener {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f169910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View[] f169911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f169912c;
    public final boolean[] d;
    public boolean e;

    public e(View[] viewsToHighlight) {
        Intrinsics.checkNotNullParameter(viewsToHighlight, "viewsToHighlight");
        this.f169910a = 200L;
        this.f169911b = viewsToHighlight;
        this.f169912c = new float[viewsToHighlight.length];
        this.d = new boolean[viewsToHighlight.length];
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[PHI: r3
      0x0023: PHI (r3v5 android.content.Context) = (r3v3 android.content.Context), (r3v10 android.content.Context) binds: [B:10:0x001f, B:5:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j01.e.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
