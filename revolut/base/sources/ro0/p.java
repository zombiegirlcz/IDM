package ro0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.view.View;
import ix0.b1;
import ix0.h0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f255759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f255760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f255761c;
    public final Function0 d;
    public final Function0 e;
    public RenderNode f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RenderNode f255762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f255763h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f255764j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f255765l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final uo0.b f255766m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e84.e f255767n;
    public final /* synthetic */ q o;

    public p(q qVar, View view, b1 insets, o blurVariant, Function0 blurFactorProvider, Function0 startYOffsetProvider) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(blurVariant, "blurVariant");
        Intrinsics.checkNotNullParameter(blurFactorProvider, "blurFactorProvider");
        Intrinsics.checkNotNullParameter(startYOffsetProvider, "startYOffsetProvider");
        this.o = qVar;
        this.f255759a = view;
        this.f255760b = insets;
        this.f255761c = blurVariant;
        this.d = blurFactorProvider;
        this.e = startYOffsetProvider;
        this.f255765l = new Rect();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f255766m = new uo0.b(context);
        e84.e eVar = null;
        if (!(blurVariant instanceof k)) {
            if (blurVariant instanceof l) {
                eVar = new e84.e(((l) blurVariant).f255753a, (h0) null);
            } else {
                if (!(blurVariant instanceof n)) {
                    throw new NoWhenBranchMatchedException();
                }
                n nVar = (n) blurVariant;
                Function0 function0 = nVar.f255757b;
                if (function0 != null) {
                    eVar = new e84.e(function0, nVar.f255758c);
                }
            }
        }
        this.f255767n = eVar;
    }

    public final Rect a() {
        m mVar;
        e84.e eVar = this.f255767n;
        if (eVar == null || (mVar = (m) eVar.d) == null) {
            return this.f255765l;
        }
        Rect rect = mVar.f255754a;
        o oVar = this.f255761c;
        if ((oVar instanceof k) || (oVar instanceof n)) {
            return rect;
        }
        if (!(oVar instanceof l)) {
            throw new NoWhenBranchMatchedException();
        }
        Rect rect2 = (Rect) eVar.i;
        rect2.set(rect);
        int i = rect2.top;
        Intrinsics.checkNotNullExpressionValue(this.f255759a.getContext(), "getContext(...)");
        z zVar = z.f255796a;
        rect2.top = i - ((int) Math.ceil(kli.a.l(r2, 68.0f)));
        return rect2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewGroup, pp0.a] */
    public final void b() {
        ?? r06 = this.o.f255768a;
        if (r06 == 0) {
            r6.b.r("host is null");
        } else {
            r06.getSelf().invalidate();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewGroup, pp0.a] */
    public final void c() {
        if (this.f != null) {
            d();
            ?? r06 = this.o.f255768a;
            if (r06 == 0) {
                r6.b.r("host is null");
            } else {
                View self = r06.getSelf();
                self.getParent().onDescendantInvalidated(self, self);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instruction units count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ro0.p.d():void");
    }

    public final void e() {
        this.o.f(this.f255759a);
    }
}
