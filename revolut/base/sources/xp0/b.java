package xp0;

import android.content.Context;
import android.os.Build;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rp0.w1;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f307872a;

    public final void a(View view, js0.b onWhenViewReadyToBind, js0.b onEnd, g parameters, a startDelayVariant) {
        j70.d dVarA;
        if (Build.VERSION.SDK_INT < 33) {
            onWhenViewReadyToBind.run();
            onEnd.run();
            return;
        }
        f fVar = this.f307872a;
        if (fVar != null) {
            fVar.b();
        }
        this.f307872a = null;
        Context context = view.getContext();
        Intrinsics.h(context);
        Intrinsics.checkNotNullParameter(context, "context");
        j70.a aVarA = wr0.a.a(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (jq0.a.a(context)) {
            if (aVarA == null || (dVarA = ((j70.c) aVarA).a()) == null) {
                dVarA = j70.d.UNDEFINED;
            }
            if (dVarA.compareTo(j70.d.LOW) > 0) {
                if (!view.isLaidOut()) {
                    if (!view.isLaidOut() || view.isLayoutRequested()) {
                        view.addOnLayoutChangeListener(new w1(this, view, onWhenViewReadyToBind, onEnd, parameters, startDelayVariant));
                        return;
                    } else {
                        a(view, onWhenViewReadyToBind, onEnd, parameters, startDelayVariant);
                        return;
                    }
                }
                if (view.getWidth() == 0 || view.getHeight() == 0) {
                    onWhenViewReadyToBind.run();
                    onEnd.run();
                    return;
                }
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(onWhenViewReadyToBind, "onWhenViewReadyToBind");
                Intrinsics.checkNotNullParameter(onEnd, "onEnd");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                f fVar2 = new f(view, onWhenViewReadyToBind, onEnd, parameters);
                Intrinsics.checkNotNullParameter(startDelayVariant, "startDelayVariant");
                int i = e.f307875a[startDelayVariant.ordinal()];
                if (i == 1) {
                    fVar2.c();
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    x.b bVar = new x.b(fVar2, 4);
                    fVar2.i = bVar;
                    view.postDelayed(bVar, 100L);
                }
                this.f307872a = fVar2;
                return;
            }
        }
        onWhenViewReadyToBind.run();
        onEnd.run();
    }
}
