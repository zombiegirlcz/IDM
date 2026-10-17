package au0;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.NumberlessCardView;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.views.NewRevolutCardView;
import ip0.bo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q4 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9328b;

    public /* synthetic */ q4(Object obj2, int i) {
        this.f9327a = i;
        this.f9328b = obj2;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f9327a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                SearchView searchView = (SearchView) this.f9328b;
                outline.setRoundRect((int) searchView.v, 0, searchView.getWidth() - ((int) searchView.f57344w), searchView.getHeight(), searchView.f57335j);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                byl.k kVar = (byl.k) this.f9328b;
                outline.setRect(0, 0, kVar.e, kVar.f);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((kotlin.jvm.internal.m0) this.f9328b).f186427a);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                bo boVar = (bo) this.f9328b;
                boVar.i.setBounds(0, 0, view.getWidth(), view.getHeight());
                boVar.i.getOutline(outline);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((NumberlessCardView) this.f9328b).f56290a);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((NewRevolutCardView) this.f9328b).f58798j);
                break;
            default:
                Matrix matrix = (Matrix) this.f9328b;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                boolean z = view.getLayoutDirection() == 1;
                float width = view.getWidth();
                float height = view.getHeight();
                Context context = view.getContext();
                Intrinsics.h(context);
                float fL = kli.a.l(context, 8.0f);
                float fL2 = kli.a.l(context, 10.0f);
                float fL3 = kli.a.l(context, 14.0f);
                float fL4 = kli.a.l(context, 18.0f);
                float fL5 = kli.a.l(context, 22.0f);
                float fL6 = kli.a.l(context, 30.0f);
                float fL7 = kli.a.l(context, 36.0f);
                float fL8 = kli.a.l(context, 50.0f);
                float fL9 = kli.a.l(context, 58.0f);
                float fL10 = kli.a.l(context, 62.0f);
                float fL11 = kli.a.l(context, 64.0f);
                Path path = new Path();
                path.lineTo(BitmapDescriptorFactory.HUE_RED, height);
                path.lineTo(fL, height);
                float f = height - fL;
                boolean z3 = z;
                path.cubicTo(fL2, height, fL3, height, fL3, f);
                float f4 = height - fL4;
                float f5 = height - fL6;
                path.cubicTo(fL3, f4, fL5, f5, fL7, f5);
                path.cubicTo(fL8, f5, fL9, f4, fL9, f);
                path.cubicTo(fL9, height, fL10, height, fL11, height);
                path.lineTo(width, height);
                path.lineTo(width, BitmapDescriptorFactory.HUE_RED);
                path.lineTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                if (z3) {
                    float width2 = view.getWidth();
                    matrix.setScale(-1.0f, 1.0f);
                    matrix.postTranslate(width2, BitmapDescriptorFactory.HUE_RED);
                    path.transform(matrix);
                }
                outline.setPath(path);
                break;
        }
    }
}
