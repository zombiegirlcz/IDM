package bx0;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class r implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GestureDetector f19448b;

    public r(Context context, boolean z) {
        this.f19447a = z;
        this.f19448b = new GestureDetector(context, new q(this, 0));
    }

    public abstract void a();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(event, "event");
        return this.f19448b.onTouchEvent(event);
    }
}
