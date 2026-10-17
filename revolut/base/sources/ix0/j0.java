package ix0;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f169244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f169245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f169246c;

    public j0(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f169244a = view;
        this.f169245b = jb3.l.s(view);
    }

    public final f1 a() {
        return this.f169245b;
    }

    @Override // ix0.i0
    public final List b() {
        return this.f169246c;
    }

    @Override // ix0.i0
    public final void g(ArrayList arrayList) {
        if (Intrinsics.f(arrayList, this.f169246c)) {
            return;
        }
        this.f169246c = arrayList;
        this.f169244a.invalidate();
    }

    @Override // ix0.i0
    public final View getView() {
        return this.f169244a;
    }
}
