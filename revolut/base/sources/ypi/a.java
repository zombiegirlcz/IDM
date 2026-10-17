package ypi;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import efm.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f315904a = v0.a.d("create(...)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.b f315905b = j6.a.h("create(...)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f315906c = j6.a.h("create(...)");
    public final ihm.b d = j6.a.h("create(...)");
    public final ihm.b e = j6.a.h("create(...)");
    public final ihm.f f = v0.a.d("create(...)");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.b f315907g = j6.a.h("create(...)");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.b f315908h = j6.a.h("create(...)");
    public final ihm.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.b f315909j;
    public final ihm.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.b f315910l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ihm.b f315911m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ihm.b f315912n;

    public a() {
        Intrinsics.checkNotNullExpressionValue(new ihm.b(), "create(...)");
        ihm.b bVarE = ihm.b.e(0);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.i = bVarE;
        this.f315909j = j6.a.h("create(...)");
        this.k = j6.a.h("create(...)");
        this.f315910l = j6.a.h("create(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.b(), "create(...)");
        ihm.b bVar = new ihm.b();
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        this.f315911m = bVar;
        Intrinsics.checkNotNullExpressionValue(new ihm.b(), "create(...)");
        ihm.b bVar2 = new ihm.b();
        Intrinsics.checkNotNullExpressionValue(bVar2, "create(...)");
        this.f315912n = bVar2;
    }

    @Override // ypi.i
    public final r a() {
        return this.f315909j;
    }

    @Override // ypi.i
    public final void d(boolean z) {
        this.e.onNext(Boolean.valueOf(z));
    }

    @Override // ypi.i
    public final r e() {
        return this.f;
    }

    @Override // ypi.i
    public final void f(Clause clause) {
        od0.i.Companion.getClass();
        this.f315906c.onNext(od0.h.a(clause));
    }

    @Override // ypi.i
    public final void g() {
        this.f315911m.onNext(Boolean.FALSE);
    }

    @Override // ypi.i
    public final r s() {
        return this.f315904a;
    }

    @Override // ypi.i
    public final void setAnalyticsContext(Parcelable parcelable) {
        od0.i.Companion.getClass();
        this.f315912n.onNext(od0.h.a(parcelable));
    }

    @Override // ypi.i
    public final void setEnabled(boolean z) {
        this.f315907g.onNext(Boolean.valueOf(z));
    }

    @Override // ypi.i
    public final void setVisible(boolean z) {
        this.f315908h.onNext(Boolean.valueOf(z));
    }

    @Override // ypi.i
    public final void t(k note) {
        Intrinsics.checkNotNullParameter(note, "note");
        this.d.onNext(note);
    }

    @Override // ypi.i
    public final void v(LargeActionButton.ButtonStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f315910l.onNext(style);
    }
}
