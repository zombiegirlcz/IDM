package ht0;

import com.revolut.core.ui_kit.internal.views.diagram.TrendView;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrendView f155178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f155179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f155180c;
    public float d;
    public float e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f155181g;

    public t(TrendView trendView, p view) {
        Intrinsics.checkNotNullParameter(trendView, "trendView");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f155178a = trendView;
        this.f155179b = view;
        this.f155180c = j6.a.h("create(...)");
    }

    public final boolean a() {
        return this.f155179b.getParent() != null;
    }

    public final ifm.c b() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ifm.c cVarSubscribe = o70.a.f(te0.w.u0(this.f155180c)).subscribe(new hp5.b(new hs4.l(this, 9), 17));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        return cVarSubscribe;
    }
}
