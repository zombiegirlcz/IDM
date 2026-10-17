package sv0;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import com.revolut.core.ui_kit.R$dimen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f265809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f265810b;

    public /* synthetic */ a(c cVar, int i) {
        this.f265809a = i;
        this.f265810b = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f265809a) {
            case 0:
                this.f265810b.f265816j.b();
                return Unit.f186387a;
            case 1:
                return Integer.valueOf(this.f265810b.f265817l.a());
            case 2:
                tv0.e eVar = (tv0.e) this.f265810b.i.d;
                return Boolean.valueOf((eVar != null ? eVar.f : null) != null);
            case 3:
                Window window = this.f265810b.f265812b;
                View viewFindFocus = window.getDecorView().findFocus();
                if (viewFindFocus == null) {
                    viewFindFocus = window.getDecorView();
                    Intrinsics.checkNotNullExpressionValue(viewFindFocus, "getDecorView(...)");
                }
                WindowCompat.getInsetsController(window, viewFindFocus).hide(WindowInsetsCompat.Type.ime());
                return Unit.f186387a;
            case 4:
                Context context = this.f265810b.f265812b.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return Integer.valueOf(kli.a.k(context, 24.0f));
            case 5:
                Context context2 = this.f265810b.f265812b.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return Integer.valueOf(kli.a.k(context2, 6.0f));
            default:
                return Integer.valueOf(this.f265810b.f265812b.getContext().getResources().getDimensionPixelSize(R$dimen.internal_keyboard_suggestions_bar_height));
        }
    }
}
