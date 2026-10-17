package or0;

import android.view.KeyEvent;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f228029a = new p();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        KeyEvent.Callback it8 = (View) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        if (!(it8 instanceof fr0.h)) {
            it8 = null;
        }
        fr0.h hVar = (fr0.h) it8;
        if (hVar != null) {
            hVar.setScreenshotDrawingMode(false);
        }
        return Unit.f186387a;
    }
}
