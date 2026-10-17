package gu0;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.revolut.core.ui_kit.views.NewRevolutCardView;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import ix0.a2;
import jy0.m;
import kotlin.jvm.internal.Intrinsics;
import mx0.ta;
import nv0.l;
import rp0.f2;
import up0.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements View.OnLayoutChangeListener, a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f146636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f146637c;

    public /* synthetic */ a(View view, int i, Object obj2) {
        this.f146635a = i;
        this.f146636b = view;
        this.f146637c = obj2;
    }

    @Override // ix0.a2
    public final void cancel() {
        switch (this.f146635a) {
            case 0:
                this.f146636b.removeOnLayoutChangeListener(this);
                break;
            case 1:
                this.f146636b.removeOnLayoutChangeListener(this);
                break;
            case 2:
                this.f146636b.removeOnLayoutChangeListener(this);
                break;
            case 3:
                this.f146636b.removeOnLayoutChangeListener(this);
                break;
            case 4:
                ((l) this.f146636b).removeOnLayoutChangeListener(this);
                break;
            case 5:
                ((TwinVerticalButton) this.f146636b).removeOnLayoutChangeListener(this);
                break;
            case 6:
                this.f146636b.removeOnLayoutChangeListener(this);
                break;
            case 7:
                this.f146636b.removeOnLayoutChangeListener(this);
                break;
            default:
                this.f146636b.removeOnLayoutChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        switch (this.f146635a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                ((c) this.f146637c).c();
                break;
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                ((f) this.f146637c).d();
                break;
            case 2:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                m mVar = (m) this.f146637c;
                mVar.d();
                mVar.A = true;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                NewRevolutCardView newRevolutCardView = (NewRevolutCardView) this.f146637c;
                ta taVar = newRevolutCardView.f58802p;
                if (taVar != null) {
                    newRevolutCardView.i(0L, taVar);
                }
                break;
            case 4:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                l lVar = (l) this.f146637c;
                lVar.i = null;
                lVar.y();
                break;
            case 5:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                TwinVerticalButton twinVerticalButton = (TwinVerticalButton) this.f146637c;
                twinVerticalButton.f59024s = null;
                TwinVerticalButton.h0(twinVerticalButton);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                f2 f2Var = (f2) this.f146637c;
                ColorDrawable colorDrawable = f2Var.f256080b;
                ViewGroup viewGroup = f2Var.d;
                colorDrawable.setBounds(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
                break;
            case 7:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                d0 d0Var = (d0) this.f146637c;
                d0Var.k = null;
                d0Var.h();
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                wu0.d dVar = (wu0.d) this.f146637c;
                wu0.b bVar = new wu0.b(dVar, 1);
                dVar.d = bVar;
                Handler handler = dVar.f300050b;
                Context context = dVar.f300049a.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                handler.postDelayed(bVar, (long) (jq0.a.b(context) * 1000));
                break;
        }
    }
}
