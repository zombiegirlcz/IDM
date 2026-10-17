package g1;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import ip0.bn;
import ip0.cn;
import ip0.dn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f139512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f139513c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(float f, int i, Object obj2, Object obj3) {
        this.f139511a = i;
        this.f139512b = f;
        this.f139513c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f139511a;
        Object obj3 = this.d;
        Object obj4 = this.f139513c;
        float f = this.f139512b;
        switch (i) {
            case 0:
                return UpdatableAnimationState.animateToZero$lambda$1((UpdatableAnimationState) obj4, f, (Function1) obj3, ((Long) obj2).longValue());
            case 1:
                dn dnVar = (dn) obj4;
                Context context = (Context) obj3;
                ShapeDrawable createRoundRectDrawable = (ShapeDrawable) obj2;
                HighlightTileDelegate.Companion companion = HighlightTileDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(createRoundRectDrawable, "$this$createRoundRectDrawable");
                createRoundRectDrawable.getPaint().setStyle(Paint.Style.STROKE);
                createRoundRectDrawable.getPaint().setStrokeWidth(f);
                if (dnVar instanceof cn) {
                    createRoundRectDrawable.getPaint().setColor(kli.a.s(((cn) dnVar).f163763a, context));
                } else {
                    if (!(dnVar instanceof bn)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    createRoundRectDrawable.setShaderFactory(tz4.d.h(((bn) dnVar).f163631a, context));
                }
                return Unit.f186387a;
            default:
                return AndroidCursorHandle_androidKt.drawCursorHandle$lambda$0$0$0$0(f, (ImageBitmap) obj4, (ColorFilter) obj3, (ContentDrawScope) obj2);
        }
    }

    public /* synthetic */ e(UpdatableAnimationState updatableAnimationState, float f, Function1 function1) {
        this.f139511a = 0;
        this.f139513c = updatableAnimationState;
        this.f139512b = f;
        this.d = function1;
    }
}
