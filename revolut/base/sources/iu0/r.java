package iu0;

import android.animation.Animator;
import android.graphics.Paint;
import com.revolut.core.ui_kit.internal.views.pincode.PlaceholderDotsView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlaceholderDotsView f168456b;

    public /* synthetic */ r(PlaceholderDotsView placeholderDotsView, int i) {
        this.f168455a = i;
        this.f168456b = placeholderDotsView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f168455a) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                PlaceholderDotsView placeholderDotsView = this.f168456b;
                q qVar = placeholderDotsView.f57455j;
                if (qVar instanceof o) {
                    Paint paint = placeholderDotsView.f57452c;
                    paint.setColor(iIntValue);
                    Intrinsics.checkNotNullParameter(paint, "<set-?>");
                    ((o) qVar).f168453b = paint;
                    placeholderDotsView.invalidate();
                }
                break;
            default:
                Animator animator = (Animator) obj2;
                Intrinsics.checkNotNullParameter(animator, "animator");
                PlaceholderDotsView placeholderDotsView2 = this.f168456b;
                q qVar2 = placeholderDotsView2.f57455j;
                if (qVar2 instanceof o) {
                    o oVar = (o) qVar2;
                    int i = oVar.f168452a;
                    oVar.f168452a = i == placeholderDotsView2.i + (-1) ? 0 : i + 1;
                    animator.start();
                }
                break;
        }
        return Unit.f186387a;
    }
}
