package vu0;

import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f292148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f292149b;

    public f(e eVar, int i) {
        this.f292149b = eVar;
        this.f292148a = i;
    }

    @Override // vu0.t
    public final void a(SwipeToActionLayout view) {
        Intrinsics.checkNotNullParameter(view, "view");
        e eVar = this.f292149b;
        if (eVar.f292146a == this.f292148a) {
            eVar.f292146a = -1;
        }
    }

    @Override // vu0.t
    public final void b(SwipeToActionLayout view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i = this.f292148a;
        e eVar = this.f292149b;
        eVar.f292146a = i;
        eVar.a(view);
    }

    @Override // vu0.t
    public final void c(SwipeToActionLayout view, u state) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(state, "state");
        if (state == u.CLOSING) {
            return;
        }
        int i = this.f292148a;
        e eVar = this.f292149b;
        eVar.f292146a = i;
        eVar.a(view);
    }
}
