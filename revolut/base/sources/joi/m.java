package joi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends RecyclerView.SimpleOnItemTouchListener implements RecyclerView.OnChildAttachStateChangeListener, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f177105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f177106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f177107c;
    public f d;
    public j e;
    public i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f177108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f177109h;

    public m(p pVar) {
        this.f177105a = pVar;
        this.f177106b = new l(this);
        this.f = i.IDLE;
        this.f177108g = new a();
        this.f177109h = new g();
    }

    public static boolean c(MotionEvent motionEvent, View view) {
        return motionEvent.getX() >= view.getX() && motionEvent.getX() <= view.getX() + ((float) view.getWidth()) && motionEvent.getY() >= view.getY() && motionEvent.getY() <= view.getY() + ((float) view.getHeight());
    }

    public final void a() {
        j jVar = this.e;
        if (jVar != null) {
            jVar.f177100a.removeCallbacks(jVar.f177101b);
        }
        this.e = null;
    }

    public final void b(f fVar) {
        if (this.d == fVar) {
            a aVar = this.f177108g;
            ValueAnimator valueAnimator = aVar.f177092a;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            aVar.f177092a = null;
            fVar.b();
            this.d = null;
            this.f177107c = null;
            this.f = i.IDLE;
        }
    }

    public final void d(RecyclerView recyclerView, f section, float f, float f4) {
        f section2 = this.d;
        p pVar = this.f177105a;
        if (section2 != null) {
            if (section2 == section) {
                section2 = null;
            }
            if (section2 != null) {
                if (pVar != null) {
                    Intrinsics.checkNotNullParameter(section2, "section");
                    if (pVar.e == section2) {
                        pVar.a();
                    }
                }
                section2.b();
                b(section2);
            }
        }
        this.f177107c = recyclerView;
        this.d = section;
        this.f = i.PRESSING;
        ArrayList arrayList = section.f177096c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((n) arrayList.get(i)).b(true);
        }
        if (pVar != null) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(section, "section");
            RecyclerView recyclerView2 = pVar.d;
            if (recyclerView2 != null) {
                recyclerView2.removeCallbacks(pVar.f177117c);
            }
            RippleDrawable rippleDrawable = pVar.f;
            if (rippleDrawable != null) {
                rippleDrawable.setCallback(null);
            }
            RippleDrawable rippleDrawable2 = pVar.f;
            if (rippleDrawable2 != null) {
                rippleDrawable2.setState(p.f177114m);
            }
            pVar.d = recyclerView;
            pVar.e = section;
            pVar.f177118g = false;
            float f5 = section.d;
            float[] fArr = new float[8];
            for (int i2 = 0; i2 < 8; i2++) {
                fArr[i2] = f5;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(-1);
            RippleDrawable rippleDrawable3 = new RippleDrawable(pVar.f177115a, null, shapeDrawable);
            rippleDrawable3.setCallback(pVar);
            rippleDrawable3.setHotspot(f, f4);
            pVar.c(section, rippleDrawable3);
            rippleDrawable3.setState(p.k);
            pVar.f = rippleDrawable3;
            recyclerView.invalidate();
        }
        Context context = section.f177095b.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!jq0.a.a(context)) {
            this.f = i.PRESSED;
            return;
        }
        h onEnd = new h(this, section, 0);
        a aVar = this.f177108g;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        aVar.a(recyclerView, section, 1.0f, onEnd);
    }

    public final void e() {
        i iVar;
        i iVar2;
        f fVar = this.d;
        if (fVar == null || (iVar = this.f) == i.IDLE || iVar == (iVar2 = i.RELEASE_PENDING) || iVar == i.RELEASING) {
            return;
        }
        Context context = fVar.f177095b.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!jq0.a.a(context)) {
            p pVar = this.f177105a;
            if (pVar != null) {
                pVar.b(fVar);
            }
            fVar.b();
            b(fVar);
            return;
        }
        i iVar3 = this.f;
        if (iVar3 == i.PRESSING) {
            this.f = iVar2;
        } else if (iVar3 == i.PRESSED) {
            f(fVar);
        }
    }

    public final void f(f section) {
        this.f = i.RELEASING;
        p pVar = this.f177105a;
        if (pVar != null) {
            pVar.b(section);
        }
        RecyclerView recyclerView = this.f177107c;
        h onEnd = new h(this, section, 1);
        a aVar = this.f177108g;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        aVar.a(recyclerView, section, BitmapDescriptorFactory.HUE_RED, onEnd);
    }

    public final void g() {
        i iVar;
        a();
        f fVar = this.d;
        if (fVar == null || (iVar = this.f) == i.IDLE || iVar == i.RELEASING) {
            return;
        }
        Context context = fVar.f177095b.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (jq0.a.a(context)) {
            f(fVar);
            return;
        }
        p pVar = this.f177105a;
        if (pVar != null) {
            pVar.b(fVar);
        }
        fVar.b();
        b(fVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewDetachedFromWindow(View view) {
        RippleDrawable rippleDrawable;
        Intrinsics.checkNotNullParameter(view, "view");
        j jVar = this.e;
        if (jVar != null) {
            float f = jVar.d;
            Intrinsics.checkNotNullParameter(view, "view");
            float f4 = jVar.f177102c;
            if (f4 >= view.getX() && f4 <= view.getX() + view.getWidth() && f >= view.getY() && f <= view.getY() + view.getHeight()) {
                a();
            }
        }
        f section = this.d;
        if (section == null) {
            return;
        }
        View view2 = section.f177095b;
        p pVar = this.f177105a;
        if (view2 == view) {
            if (pVar != null) {
                Intrinsics.checkNotNullParameter(section, "section");
                if (pVar.e == section) {
                    pVar.a();
                }
            }
            section.b();
            b(section);
            return;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        ArrayList arrayList = section.f177096c;
        for (int iJ = zhm.v.j(arrayList); -1 < iJ; iJ--) {
            n nVar = (n) arrayList.get(iJ);
            if (nVar.f177110a == view) {
                nVar.a();
                arrayList.remove(iJ);
            }
        }
        if (pVar != null) {
            Intrinsics.checkNotNullParameter(section, "section");
            if (pVar.e == section && (rippleDrawable = pVar.f) != null) {
                pVar.c(section, rippleDrawable);
                RecyclerView recyclerView = pVar.d;
                if (recyclerView != null) {
                    recyclerView.invalidate();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent event) {
        f fVarA;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            a();
            f fVar = this.d;
            if (fVar == null || !c(event, fVar.f177095b)) {
                e();
            }
            a();
            float x3 = event.getX();
            float y2 = event.getY();
            ag.q qVar = new ag.q(this, 24);
            this.e = new j(recyclerView, qVar, x3, y2);
            recyclerView.postDelayed(qVar, b.f177093a);
            return false;
        }
        if (actionMasked == 1) {
            j jVar = this.e;
            if (jVar != null) {
                RecyclerView recyclerView2 = jVar.f177100a;
                recyclerView2.removeCallbacks(jVar.f177101b);
                this.e = null;
                if (!jVar.b(event) && (fVarA = jVar.a(this.f177109h)) != null && c(event, fVarA.f177095b)) {
                    d(recyclerView2, fVarA, jVar.f177102c, jVar.d);
                }
            }
            e();
            return false;
        }
        if (actionMasked != 2) {
            if (actionMasked != 3) {
                return false;
            }
            a();
            e();
            return false;
        }
        j jVar2 = this.e;
        f fVar2 = this.d;
        if (jVar2 != null && jVar2.b(event)) {
            a();
            return false;
        }
        if (fVar2 == null || c(event, fVar2.f177095b)) {
            return false;
        }
        e();
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            g();
        }
    }

    public m() {
        this(null);
    }
}
