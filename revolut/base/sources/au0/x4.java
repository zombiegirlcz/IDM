package au0;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x4 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9434b;

    public /* synthetic */ x4(Object obj2, int i) {
        this.f9433a = i;
        this.f9434b = obj2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        switch (this.f9433a) {
            case 0:
                Intrinsics.checkNotNullParameter(v, "v");
                ((z4) this.f9434b).a();
                break;
            case 1:
                Intrinsics.checkNotNullParameter(v, "v");
                ix0.f1 f1Var = (ix0.f1) this.f9434b;
                View view = f1Var.f169232a;
                int i = f1Var.f169233b == 0 ? 0 : 2;
                if (i != view.getLayerType()) {
                    view.setLayerType(i, null);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(v, "v");
                ((or0.c) this.f9434b).e = null;
                v.removeOnAttachStateChangeListener(this);
                v.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        switch (this.f9433a) {
            case 0:
                Intrinsics.checkNotNullParameter(v, "v");
                v.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(v, "v");
                ((ix0.f1) this.f9434b).f169232a.setLayerType(0, null);
                break;
            default:
                Intrinsics.checkNotNullParameter(v, "v");
                break;
        }
    }
}
