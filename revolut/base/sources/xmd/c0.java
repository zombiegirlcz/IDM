package xmd;

import android.view.ViewPropertyAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f307166a = new c0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ViewPropertyAnimator startAnimation = (ViewPropertyAnimator) obj2;
        Intrinsics.checkNotNullParameter(startAnimation, "$this$startAnimation");
        startAnimation.alpha(1.0f);
        return Unit.f186387a;
    }
}
