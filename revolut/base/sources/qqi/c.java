package qqi;

import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import ihm.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lpi.e;
import o9h.d;
import org.jetbrains.annotations.NotNull;
import ozc.z;
import pak.h;
import qp5.x;
import t70.g;
import te0.w;
import upi.f;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends pri.c implements swl.a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f248550h;
    public final g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final npi.f f248551j;
    public final swl.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f248552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Function1 f248553m;

    public c(f mediaPickerView, g localization, npi.f dialogView, swl.b router, e bottomDialogView) {
        Intrinsics.checkNotNullParameter(mediaPickerView, "mediaPickerView");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(dialogView, "dialogView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(bottomDialogView, "bottomDialogView");
        this.f248550h = mediaPickerView;
        this.i = localization;
        this.f248551j = dialogView;
        this.k = router;
        this.f248552l = bottomDialogView;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        j jVar = ((upi.b) this.f248550h).k;
        a aVar = new a(this, 0);
        Function1 function1K = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = jVar.onErrorResumeNext(new h(new x(new BreadcrumbException(), 6)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new d(13, aVar), new d(13, function1K), new z(22, function0J));
        w.j0(this.f239031a, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
