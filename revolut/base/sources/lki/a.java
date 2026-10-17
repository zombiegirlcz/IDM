package lki;

import android.animation.Animator;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f196450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f196451c;
    public final /* synthetic */ View d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ z f;

    public /* synthetic */ a(int i, b bVar, View view, View view2, boolean z, z zVar) {
        this.f196449a = i;
        this.f196450b = bVar;
        this.f196451c = view;
        this.d = view2;
        this.e = z;
        this.f = zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b bVar = this.f196450b;
        if (this.f196449a == bVar.f196456c) {
            View view = this.f196451c;
            if (view != null) {
                b.b(0, view);
                Object parent = view.getParent();
                View view2 = parent instanceof View ? (View) parent : null;
                if (view2 != null) {
                    view2.invalidate();
                    Unit unit = Unit.f186387a;
                }
            }
            Animator animatorA = bVar.a(this.d, view, this.e);
            z zVar = this.f;
            zVar.p();
            bVar.f196454a = animatorA;
            bVar.f196455b = zVar;
            animatorA.addListener(new aq0.k(bVar, 6));
            animatorA.start();
        }
        return Unit.f186387a;
    }
}
