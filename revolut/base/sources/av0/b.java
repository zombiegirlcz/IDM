package av0;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.databind.JavaType;
import com.google.common.base.Preconditions;
import com.google.common.io.ByteStreams;
import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import ecm.e0;
import ecm.m1;
import ecm.o;
import gcm.e6;
import gcm.j1;
import hcm.p;
import java.io.IOException;
import jo0.m;
import k9.k;
import k9.r;
import kotlin.jvm.internal.Intrinsics;
import u9.i;
import vu0.u;
import x9.s;
import xu0.g;
import yu0.c;
import zu0.d;
import zu0.e;
import zu0.v;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9868c;
    public Object d;
    public final Object e;

    public b(SwipeToActionLayout layout, e layoutController, c itemController, g touchController, boolean z) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(layoutController, "layoutController");
        Intrinsics.checkNotNullParameter(itemController, "itemController");
        Intrinsics.checkNotNullParameter(touchController, "touchController");
        this.f9867b = layout;
        this.f9868c = layoutController;
        this.d = itemController;
        this.e = touchController;
        this.f9866a = z;
    }

    public static b d(JavaType javaType, r rVar, i iVar, boolean z) {
        String str = rVar == null ? null : rVar.f182194a;
        return new b(javaType, str != null ? new f9.i(str) : null, iVar, (k) null, z);
    }

    @Override // gcm.j1
    public void a(int i) {
    }

    @Override // gcm.j1
    public j1 b(o oVar) {
        return this;
    }

    @Override // gcm.j1
    public void c(kcm.a aVar) {
        e6 e6Var = (e6) this.f9868c;
        Preconditions.checkState(((byte[]) this.d) == null, "writePayload should not be called multiple times");
        try {
            this.d = ByteStreams.toByteArray(aVar);
            e0[] e0VarArr = e6Var.f142632a;
            e0[] e0VarArr2 = e6Var.f142632a;
            for (e0 e0Var : e0VarArr) {
                e0Var.j(0);
            }
            byte[] bArr = (byte[]) this.d;
            long length = bArr.length;
            long length2 = bArr.length;
            for (e0 e0Var2 : e6Var.f142632a) {
                e0Var2.k(0, length, length2);
            }
            long length3 = ((byte[]) this.d).length;
            for (e0 e0Var3 : e0VarArr2) {
                e0Var3.l(length3);
            }
            long length4 = ((byte[]) this.d).length;
            for (e0 e0Var4 : e0VarArr2) {
                e0Var4.m(length4);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // gcm.j1
    public void close() {
        this.f9866a = true;
        Preconditions.checkState(((byte[]) this.d) != null, "Lack of request message. GET request is only supported for unary requests");
        ((p) ((gcm.c) this.e)).o.n((m1) this.f9867b, (byte[]) this.d);
        this.d = null;
        this.f9867b = null;
    }

    public void e(boolean z, vu0.r direction) {
        ValueAnimator valueAnimator;
        g gVar = (g) this.e;
        ViewDragHelper viewDragHelper = gVar.f308870n;
        SwipeToActionLayout swipeToActionLayout = (SwipeToActionLayout) this.f9867b;
        Intrinsics.checkNotNullParameter(direction, "direction");
        e eVar = (e) this.f9868c;
        zu0.i iVar = eVar.f325196b;
        Rect rect = eVar.f325197c;
        Intrinsics.checkNotNullParameter(direction, "direction");
        int i = d.f325193a[direction.ordinal()];
        int iG = i != 1 ? i != 2 ? 0 : rect.left - iVar.g() : rect.left + iVar.g();
        if (z && m.f176851h) {
            swipeToActionLayout.setState$ui_kit_components_release(u.OPENING);
            View view = swipeToActionLayout.getMainView();
            int i2 = rect.top;
            Intrinsics.checkNotNullParameter(view, "view");
            viewDragHelper.smoothSlideViewTo(view, iG, i2);
        } else {
            swipeToActionLayout.setState$ui_kit_components_release(u.OPEN);
            viewDragHelper.abort();
            if (direction != vu0.r.NONE) {
                eVar.f325195a.getMainView().layout(iG, rect.top, rect.width() + iG, rect.bottom);
                eVar.e();
            }
            View view2 = swipeToActionLayout.getMainView();
            Intrinsics.checkNotNullParameter(view2, "view");
            gVar.f308869m.onViewPositionChanged(view2, view2.getLeft(), view2.getTop(), 0, 0);
            v vVar = eVar.f;
            if (vVar != null && (valueAnimator = vVar.f) != null) {
                valueAnimator.end();
            }
        }
        ViewCompat.postInvalidateOnAnimation(swipeToActionLayout);
    }

    @Override // gcm.j1
    public void flush() {
    }

    @Override // gcm.j1
    public boolean isClosed() {
        return this.f9866a;
    }

    public b(JavaType javaType, q qVar, i iVar, k kVar, boolean z) {
        this.f9867b = javaType;
        this.f9868c = qVar;
        this.d = iVar;
        this.e = kVar;
        this.f9866a = z;
    }

    public b(b bVar, s sVar, k kVar) {
        this.f9868c = bVar;
        this.f9867b = kVar;
        this.f9866a = sVar.d;
        this.d = sVar.f303530b;
        this.e = sVar.f303531c;
    }

    public b(gcm.c cVar, m1 m1Var, e6 e6Var) {
        this.e = cVar;
        this.f9867b = (m1) Preconditions.checkNotNull(m1Var, "headers");
        this.f9868c = (e6) Preconditions.checkNotNull(e6Var, "statsTraceCtx");
    }
}
