package fk;

import ag.q;
import android.os.Looper;
import android.view.View;
import efm.c0;
import efm.y;
import ifm.c;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements View.OnClickListener, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f135698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f135699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f135700c;

    public a(View view, y observer) {
        Intrinsics.j(view, "view");
        Intrinsics.j(observer, "observer");
        this.f135698a = new AtomicBoolean();
        this.f135699b = view;
        this.f135700c = observer;
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.f135698a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f135699b.setOnClickListener(null);
                return;
            }
            c0 c0Var = hfm.c.f152030a;
            m70.a.p(c0Var);
            c0Var.c(new q(this, 6));
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f135698a.get();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        Intrinsics.j(v, "v");
        if (this.f135698a.get()) {
            return;
        }
        this.f135700c.onNext(Unit.f186387a);
    }
}
