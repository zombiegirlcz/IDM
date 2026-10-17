package joi;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f177100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ag.q f177101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f177102c;
    public final float d;
    public final int e;

    public j(RecyclerView recyclerView, ag.q runnable, float f, float f4) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f177100a = recyclerView;
        this.f177101b = runnable;
        this.f177102c = f;
        this.d = f4;
        this.e = ViewConfiguration.get(recyclerView.getContext()).getScaledTouchSlop();
    }

    public final f a(g targetResolver) {
        ks0.f fVar;
        koi.b bVarC;
        ks0.c section;
        float fL;
        qv0.h hVarA;
        Intrinsics.checkNotNullParameter(targetResolver, "targetResolver");
        targetResolver.getClass();
        RecyclerView recyclerView = this.f177100a;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        View touchView = recyclerView.findChildViewUnder(this.f177102c, this.d);
        if (touchView != null && touchView.isEnabled() && touchView.hasOnClickListeners()) {
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(touchView);
            koi.b bVar = childViewHolder instanceof koi.b ? (koi.b) childViewHolder : null;
            if (bVar != null) {
                koi.j jVar = bVar.e;
                qv0.i iVar = jVar instanceof qv0.i ? (qv0.i) jVar : null;
                if (iVar != null && iVar.getF55062g().b() && (bVarC = (fVar = new ks0.f(recyclerView)).c(bVar)) != null && bVarC == bVar && (section = fVar.e(bVar)) != null) {
                    koi.b bVar2 = section.f189065b;
                    f.Companion.getClass();
                    Intrinsics.checkNotNullParameter(touchView, "touchView");
                    Intrinsics.checkNotNullParameter(section, "section");
                    ArrayList arrayList = section.f189066c;
                    View itemView = bVar2.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    koi.j jVar2 = bVar2.e;
                    qv0.i iVar2 = jVar2 instanceof qv0.i ? (qv0.i) jVar2 : null;
                    qv0.c f53475m = iVar2 != null ? iVar2.getF55062g() : null;
                    qv0.a aVar = f53475m instanceof qv0.a ? (qv0.a) f53475m : null;
                    if (aVar == null || (hVarA = aVar.a()) == null) {
                        Context context = itemView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        fL = kli.a.l(context, qv0.h.EXTRA_LARGE.a());
                    } else {
                        fL = r6.b.a(itemView, "getContext(...)", hVarA.a());
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
                    arrayList2.add(new n(itemView));
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        View itemView2 = ((koi.b) arrayList.get(i)).itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                        arrayList2.add(new n(itemView2));
                    }
                    return new f(section.f189064a, touchView, arrayList2, fL);
                }
            }
        }
        return null;
    }

    public final boolean b(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        float fAbs = Math.abs(event.getX() - this.f177102c);
        float f = this.e;
        return fAbs > f || Math.abs(event.getY() - this.d) > f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f177100a, jVar.f177100a) && this.f177101b.equals(jVar.f177101b) && Float.compare(this.f177102c, jVar.f177102c) == 0 && Float.compare(this.d, jVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f177102c, (this.f177101b.hashCode() + (this.f177100a.hashCode() * 31)) * 31, 31);
    }
}
