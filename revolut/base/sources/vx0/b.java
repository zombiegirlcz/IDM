package vx0;

import android.view.View;
import aw0.v1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import tx0.u2;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f292771a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vx0.a f292772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u2 f292773c;
    public View d;

    public static final class a implements u2 {
        @Override // tx0.u2
        public final void a(v1 colorScheme, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        }
    }

    public final void a(vx0.a aVar) {
        u2 u2Var = this.f292773c;
        if (u2Var == null || Intrinsics.f(this.f292772b, aVar)) {
            return;
        }
        this.f292772b = aVar;
        u2Var.a(aVar.f292768a, aVar.f292769b, aVar.f292770c, aVar.d);
    }

    public final void b(View view) {
        vx0.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.f(this.d, view)) {
            return;
        }
        this.d = view;
        if (view == null || (aVar = (vx0.a) this.f292771a.get(view)) == null) {
            return;
        }
        a(aVar);
    }
}
