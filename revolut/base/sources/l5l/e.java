package l5l;

import ald.o;
import android.app.Activity;
import android.os.Bundle;
import androidx.core.app.ComponentActivity;
import c86.f;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import efm.r;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import rp0.k1;
import rp0.m;
import te0.w;
import yhm.j;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends fsi.c {

    @NotNull
    public static final b Companion = new b();
    public static final fsi.b o = new fsi.b("SensitiveDataActivityDelegate");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ww0.b f192337h;
    public final eqi.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Activity f192338j;
    public final m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LargeActionButtonDelegate f192339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f192340m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f192341n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ww0.b sensitiveDataManager, eqi.c storage, Activity activity) {
        super(o);
        Intrinsics.checkNotNullParameter(sensitiveDataManager, "sensitiveDataManager");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f192337h = sensitiveDataManager;
        this.i = storage;
        this.f192338j = activity;
        this.k = new m();
        this.f192339l = new LargeActionButtonDelegate();
        this.f192341n = j.b(new a(this, 1));
    }

    @Override // fsi.a
    public final void onCreate(Bundle bundle) {
        Activity activity = this.f192338j;
        if (activity instanceof ComponentActivity) {
            this.f192340m = true;
            m mVar = this.k;
            mVar.e((ComponentActivity) activity);
            mVar.i(new a(this, 0));
        }
    }

    @Override // fsi.a
    public final void onResume() {
        if (this.f192340m) {
            r rVarHide = this.f192337h.d.hide();
            Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
            o oVar = new o(1, this, e.class, "handleAppearanceChange", "handleAppearanceChange(Lcom/revolut/core/ui_kit_core/sensitivedata/SensitiveDataAppearanceChange;)V", 0, 5);
            Function1 function1M = M();
            Function0 function0L = L();
            r rVarOnErrorResumeNext = rVarHide.onErrorResumeNext(new gn.b(3, new bo.c(new BreadcrumbException(), 13)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new bo.e(5, oVar), new bo.e(5, function1M), new f(5, function0L));
            ifm.b bVar = this.e;
            w.j0(bVar, cVarSubscribe);
            Intrinsics.h(cVarSubscribe);
            ihm.f fVar = this.f192339l.d.f121375b;
            d dVar = new d(1, 0, e.class, this, "handleButtonClick", "handleButtonClick(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V");
            Function1 function1M2 = M();
            Function0 function0L2 = L();
            r rVarOnErrorResumeNext2 = fVar.onErrorResumeNext(new gn.b(3, new bo.c(new BreadcrumbException(), 14)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new bo.e(5, dVar), new bo.e(5, function1M2), new f(5, function0L2));
            w.j0(bVar, cVarSubscribe2);
            Intrinsics.h(cVarSubscribe2);
            ihm.f fVar2 = ((k1) ((g1) this.f192341n.getValue())).d;
            o oVar2 = new o(1, this, e.class, "handleShotEvent", "handleShotEvent(Lcom/revolut/core/ui_kit/dialogs/ShotDialogDisplayer$Event;)V", 0, 6);
            Function1 function1M3 = M();
            Function0 function0L3 = L();
            r rVarOnErrorResumeNext3 = fVar2.onErrorResumeNext(new gn.b(3, new bo.c(new BreadcrumbException(), 15)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new bo.e(5, oVar2), new bo.e(5, function1M3), new f(5, function0L3));
            w.j0(bVar, cVarSubscribe3);
            Intrinsics.h(cVarSubscribe3);
        }
    }
}
