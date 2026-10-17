package as0;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import fu0.g;
import fu0.h;
import fu0.i;
import java.util.ArrayList;
import koi.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends RecyclerView.ItemDecoration {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ValueAnimator f8750c;
    public y9d.c e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f8751g;
    public final long d = 2000;
    public final ArrayList f = new ArrayList();

    public f(int i) {
        this.f8749b = Color.alpha(i);
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        this.f8751g = paint;
    }

    public final void a() {
        this.f.clear();
        this.e = null;
        this.f8748a = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(ScreenContentRecyclerView screenContentRecyclerView) {
        koi.b bVar;
        j jVar;
        y9d.c cVar;
        Object obj2;
        h highlightTarget;
        g[] gVarArrB;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((c) arrayList.get(i)).e = true;
        }
        int childCount = screenContentRecyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView.ViewHolder childViewHolder = screenContentRecyclerView.getChildViewHolder(screenContentRecyclerView.getChildAt(i2));
            if ((childViewHolder instanceof koi.b) && (jVar = (bVar = (koi.b) childViewHolder).e) != null && (cVar = this.e) != null && ((Boolean) cVar.invoke(jVar)).booleanValue()) {
                int size2 = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList.get(i3);
                    if (((c) obj2).f8738a == bVar) {
                        break;
                    } else {
                        i3++;
                    }
                }
                c cVar2 = (c) obj2;
                if (cVar2 != null) {
                    cVar2.e = false;
                } else {
                    i iVar = bVar instanceof i ? (i) bVar : null;
                    arrayList.add(new c(bVar, (iVar == null || (highlightTarget = iVar.getHighlightTarget()) == null || (gVarArrB = highlightTarget.b()) == null) ? false : !(gVarArrB.length == 0)));
                }
            }
        }
        a0.E(arrayList, new arf.h(1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas c2, RecyclerView parent, RecyclerView.State state) {
        Canvas canvas;
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(c2, parent, state);
        if (this.f8748a != 0) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty() || arrayList.isEmpty()) {
                return;
            }
            int i = this.f8748a;
            Paint paint = this.f8751g;
            paint.setAlpha(i);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                c cVar = (c) obj2;
                if (cVar.f8739b) {
                    canvas = c2;
                } else {
                    View itemView = cVar.f8738a.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    float left = itemView.getLeft();
                    float top = itemView.getTop() + itemView.getTranslationY();
                    float right = itemView.getRight();
                    float bottom = itemView.getBottom() + itemView.getTranslationY();
                    canvas = c2;
                    canvas.drawRect(left, top, right, bottom, paint);
                }
                i2++;
                c2 = canvas;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas c2, RecyclerView parent, RecyclerView.State state) {
        g[] gVarArr;
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(c2, parent, state);
        if (this.f8748a != 0) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                return;
            }
            int i = this.f8748a;
            Paint paint = this.f8751g;
            paint.setAlpha(i);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = arrayList.get(i2);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                c cVar = (c) obj2;
                if (cVar.f8739b && (gVarArr = cVar.f8740c) != null && gVarArr.length != 0) {
                    PointF pointF = cVar.d;
                    float f = pointF.x;
                    float f4 = pointF.y;
                    int iSave = c2.save();
                    c2.translate(f, f4);
                    try {
                        for (g gVar : gVarArr) {
                            gVar.b(c2, paint);
                        }
                    } finally {
                        c2.restoreToCount(iSave);
                    }
                }
            }
        }
    }
}
