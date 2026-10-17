package es0;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import mx0.mc;
import mx0.nc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class j {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f128831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f128832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f128833c;

    public j(ConstraintLayout container, i side) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(side, "side");
        this.f128831a = container;
        this.f128832b = side;
        this.f128833c = new ArrayList();
    }

    public final void a(ConstraintSet constraintSet, int i, int i2, float f) {
        int i3;
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        nc ncVarB = b();
        int iK = 0;
        int id10 = ncVarB != null ? ncVarB.getId() : 0;
        if (id10 == 0) {
            i3 = i2;
        } else {
            i3 = i2 == 7 ? 6 : 7;
        }
        if (f > BitmapDescriptorFactory.HUE_RED) {
            Context context = this.f128831a.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iK = kli.a.k(context, f);
        }
        constraintSet.connect(i, i2, id10, i3, iK);
    }

    public final nc b() {
        Object objPrevious;
        ArrayList arrayList = this.f128833c;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((nc) objPrevious).getVisibility() == 0) {
                break;
            }
        }
        return (nc) objPrevious;
    }

    public final efm.r c() {
        efm.r rVarDefer = efm.r.defer(new a31.l(this, 19));
        Intrinsics.checkNotNullExpressionValue(rVarDefer, "defer(...)");
        return rVarDefer;
    }

    public final boolean d(List actions) {
        ConstraintLayout constraintLayout;
        i iVar;
        int iK;
        nc ncVar;
        Intrinsics.checkNotNullParameter(actions, "actions");
        if (actions.size() > 3) {
            throw new IllegalArgumentException("Maximum 3 actions allowed");
        }
        ArrayList arrayList = this.f128833c;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 6;
            constraintLayout = this.f128831a;
            iVar = this.f128832b;
            if (i2 >= 3) {
                break;
            }
            mc mcVar = (mc) iVar.a(i2, actions);
            if (mcVar != null) {
                if (i2 < arrayList.size()) {
                    ncVar = (nc) arrayList.get(i2);
                } else {
                    Context context = constraintLayout.getContext();
                    Intrinsics.h(context);
                    nc ncVar2 = new nc(context, null, i3, i);
                    ncVar2.setId(View.generateViewId());
                    ncVar2.setMinimumWidth(kli.a.k(context, 36.0f));
                    arrayList.add(ncVar2);
                    constraintLayout.addView(ncVar2, new ConstraintLayout.LayoutParams(-2, kli.a.k(context, 36.0f)));
                    ncVar = ncVar2;
                }
                ncVar.setActionModel(mcVar);
                ncVar.setVisibility(0);
            } else if (i2 < arrayList.size()) {
                ((View) arrayList.get(i2)).setVisibility(8);
            }
            i2++;
        }
        boolean z = arrayList.size() > size;
        if (z) {
            int iB = iVar.b();
            ConstraintSet constraintSetL = v7.l(constraintLayout);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((nc) obj2).getVisibility() == 0) {
                    arrayList2.add(obj2);
                }
            }
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                nc ncVar3 = (nc) arrayList2.get(i5);
                nc ncVar4 = (nc) zhm.d0.e0(i5 - 1, arrayList2);
                int id10 = ncVar4 != null ? ncVar4.getId() : 0;
                constraintSetL.connect(ncVar3.getId(), 3, 0, 3);
                constraintSetL.connect(ncVar3.getId(), 4, 0, 4);
                if (i5 == 0) {
                    iK = 0;
                } else {
                    Context context2 = constraintLayout.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    iK = kli.a.k(context2, 8.0f);
                }
                constraintSetL.connect(ncVar3.getId(), iB, id10, i5 == 0 ? iB : iB == 7 ? 6 : 7, iK);
            }
            constraintSetL.applyTo(constraintLayout);
        }
        return z;
    }

    public /* synthetic */ j(ConstraintLayout constraintLayout) {
        this(constraintLayout, i.TRAILING);
    }
}
