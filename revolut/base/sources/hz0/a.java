package hz0;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import c01.b;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.background.StatefulAnimatedBackground;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f156933b;

    public /* synthetic */ a(e eVar, int i) {
        this.f156932a = i;
        this.f156933b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj2;
        ViewGroup viewGroup;
        switch (this.f156932a) {
            case 0:
                this.f156933b.e.onNext(b.a.f20093a);
                return Unit.f186387a;
            case 1:
                e eVar = this.f156933b;
                c01.a aVar = eVar.f;
                int i = aVar == null ? -1 : d.f156937a[aVar.ordinal()];
                if (i == 1) {
                    obj2 = b.d.f20096a;
                } else if (i == 2) {
                    obj2 = b.C0131b.f20094a;
                } else {
                    if (i != 3) {
                        return Unit.f186387a;
                    }
                    obj2 = b.c.f20095a;
                }
                eVar.e.onNext(obj2);
                return Unit.f186387a;
            default:
                View decorView = this.f156933b.f156938a.getDecorView();
                Intrinsics.i(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                View viewFindViewById = ((ViewGroup) decorView).findViewById(R.id.content);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                Iterator it8 = ViewGroupKt.getChildren((ViewGroup) viewFindViewById).iterator();
                do {
                    viewGroup = null;
                    if (it8.hasNext()) {
                        View view = (View) it8.next();
                        ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
                        if (viewGroup2 != null && !(viewGroup2 instanceof AnimatedBackgroundView) && !(viewGroup2 instanceof StatefulAnimatedBackground)) {
                            viewGroup = viewGroup2;
                        }
                    }
                    return viewGroup;
                } while (viewGroup == null);
                return viewGroup;
        }
    }
}
