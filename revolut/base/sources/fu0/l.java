package fu0;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements h {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final koi.b f138070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f138071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f138072c;
    public Outline d;
    public final float e;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g[] f138073g;

    public l(koi.b viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.f138070a = viewHolder;
        this.f138071b = new Rect();
        this.f138072c = new RectF();
        this.e = com.google.android.gms.internal.mlkit_vision_face.a.a(viewHolder.itemView, "getContext(...)", 16.0f);
        g gVar = new g();
        this.f = gVar;
        this.f138073g = new g[]{gVar};
    }

    @Override // fu0.h
    public final void B() {
        float fFloatValue;
        koi.j jVar = this.f138070a.e;
        Context context = getView().getContext();
        boolean z = jVar instanceof qv0.l;
        Rect rect = this.f138071b;
        if (z) {
            Intrinsics.h(context);
            qv0.l lVar = (qv0.l) jVar;
            fFloatValue = dr0.b.k(context, lVar.getI(), lVar.getO());
            dr0.b.m(context, rect, lVar.getI(), lVar.getO());
        } else if (jVar instanceof qv0.i) {
            Intrinsics.h(context);
            qv0.i iVar = (qv0.i) jVar;
            fFloatValue = dr0.b.j(context, iVar.getI());
            dr0.b.l(context, rect, iVar.getI());
        } else {
            Outline outline = this.d;
            if (outline == null) {
                outline = new Outline();
                this.d = outline;
            }
            outline.setEmpty();
            ViewOutlineProvider outlineProvider = getView().getOutlineProvider();
            fFloatValue = this.e;
            if (outlineProvider != null) {
                outlineProvider.getOutline(getView(), outline);
                float radius = outline.getRadius();
                Float fValueOf = Float.valueOf(radius);
                if (radius == BitmapDescriptorFactory.HUE_RED) {
                    fValueOf = null;
                }
                if (fValueOf != null) {
                    fFloatValue = fValueOf.floatValue();
                }
            }
            rect.setEmpty();
            Unit unit = Unit.f186387a;
        }
        float f = rect.left;
        float f4 = rect.top;
        float width = getView().getWidth() - rect.right;
        float height = getView().getHeight() - rect.bottom;
        RectF rectF = this.f138072c;
        rectF.set(f, f4, width, height);
        getView().getMatrix().mapRect(rectF);
        g gVar = this.f;
        gVar.f138064b = 2;
        Path path = gVar.d;
        if (path != null) {
            path.reset();
        }
        gVar.f138063a.set(0, 0, 0, 0);
        gVar.e = 0;
        gVar.f = 0;
        gVar.f138065c = fFloatValue;
        gVar.f138066g = true;
        gVar.d((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @Override // fu0.h
    public final g[] b() {
        return this.f138073g;
    }

    @Override // fu0.h
    public final View getView() {
        View itemView = this.f138070a.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        return itemView;
    }
}
