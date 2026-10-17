package ar0;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.i5;
import mx0.l5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements View.OnTouchListener {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f8481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f8482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f8483c;
    public final h d;
    public final e e;
    public final a0.a f;

    public d(i5 onTouch, l5 onRelease, i5 onDeleteClick, h holder, e data) {
        Intrinsics.checkNotNullParameter(onTouch, "onTouch");
        Intrinsics.checkNotNullParameter(onRelease, "onRelease");
        Intrinsics.checkNotNullParameter(onDeleteClick, "onDeleteClick");
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f8481a = onTouch;
        this.f8482b = onRelease;
        this.f8483c = onDeleteClick;
        this.d = holder;
        this.e = data;
        this.f = new a0.a(this, 3);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        a0.a aVar = this.f;
        h hVar = this.d;
        if (action == 0) {
            hVar.f8496l.postDelayed(aVar, 300L);
            return true;
        }
        if (action != 1) {
            return true;
        }
        if (event.getEventTime() - event.getDownTime() > 300) {
            this.f8482b.invoke(hVar);
            return true;
        }
        hVar.f8496l.removeCallbacks(aVar);
        this.f8483c.invoke(this.e);
        return true;
    }
}
