package kii;

import android.app.Activity;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tji.i;
import tji.l;

/* JADX INFO: loaded from: classes13.dex */
public final class f extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f184248c;
    public final ifm.b d;

    public f(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f184248c = activity;
        this.d = new ifm.b();
    }

    @Override // tji.i
    public final boolean a(l dialogModel) {
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        return false;
    }

    @Override // tji.i
    public final void b() {
        j();
    }

    @Override // tji.i
    public final void e() {
        j();
    }

    @Override // tji.i
    public final void i(l lVar) {
        e.A(lVar);
        Intrinsics.checkNotNullParameter(null, "dialogModel");
        Activity context = this.f184248c;
        if (context.isFinishing()) {
            return;
        }
        this.d.d();
        Intrinsics.checkNotNullParameter(context, "context");
        new WeakReference(context);
        p.a.h("toSerialized(...)");
        p.a.h("toSerialized(...)");
        p.a.h("toSerialized(...)");
        new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        throw null;
    }

    public final void j() {
        this.d.d();
    }
}
