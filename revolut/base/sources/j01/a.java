package j01;

import android.view.View;
import efm.y;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ifm.c, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f169902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f169903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f169904c;

    public a(View view, y observer) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f169902a = view;
        this.f169903b = observer;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f169904c = true;
        this.f169902a.setOnClickListener(null);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f169904c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f169904c) {
            return;
        }
        this.f169903b.onNext(Unit.f186387a);
    }
}
