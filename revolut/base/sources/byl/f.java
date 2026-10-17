package byl;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;
import tw0.u;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19863c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f19861a = i;
        this.f19862b = obj2;
        this.f19863c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        View viewB;
        int i33 = this.f19861a;
        Object obj2 = this.e;
        Object obj3 = this.f19863c;
        Object obj4 = this.f19862b;
        Object obj5 = this.d;
        switch (i33) {
            case 0:
                View view2 = (View) obj5;
                view.removeOnLayoutChangeListener(this);
                h hVar = (h) obj4;
                k kVar = (k) obj3;
                if (hVar.e == kVar && hVar.f19868b.isAttachedToWindow()) {
                    h.d(hVar, kVar, view2, (View) obj2);
                    h.a(hVar, kVar, view2);
                    break;
                }
                break;
            case 1:
                view.removeOnLayoutChangeListener(this);
                h hVar2 = (h) obj4;
                if (hVar2.f19868b.isAttachedToWindow() && (viewB = h.b(hVar2)) != null) {
                    h.c(hVar2, (UrlImage) obj3, (UrlImage) obj5, (UrlImage) obj2, viewB);
                    break;
                }
                break;
            case 2:
                view.removeOnLayoutChangeListener(this);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) obj2;
                OrientationHelper orientationHelperCreateHorizontalHelper = OrientationHelper.createHorizontalHelper(linearLayoutManager);
                Intrinsics.checkNotNullExpressionValue(orientationHelperCreateHorizontalHelper, "createHorizontalHelper(...)");
                u.a((u) obj4, (String) obj3, (RecyclerView) obj5, linearLayoutManager, orientationHelperCreateHorizontalHelper);
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                vp0.h hVar3 = wp0.h.f299001a;
                wp0.h.a((View) obj5, (oii.b) obj4, (o10.c) obj3, (wp0.f) obj2);
                break;
        }
    }

    public f(View view, oii.b bVar, o10.c cVar, wp0.f fVar) {
        this.f19861a = 3;
        this.d = view;
        this.f19862b = bVar;
        this.f19863c = cVar;
        this.e = fVar;
    }
}
