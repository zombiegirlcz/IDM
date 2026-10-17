package ks0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;
import zhm.z;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f189069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f189070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.material.color.utilities.g f189071c;
    public final afa.a d;

    public f(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f189069a = recyclerView;
        this.f189070b = new ArrayList();
        this.f189071c = new com.google.android.material.color.utilities.g(this);
        this.d = new afa.a(this, 4);
    }

    public static boolean a(qv0.i iVar, d dVar) {
        int i = e.f189067a[dVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return iVar.getF() instanceof c.a;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(iVar instanceof qv0.l)) {
            return false;
        }
        qv0.k v = ((qv0.l) iVar).getV();
        return v == qv0.k.Bottom || v == qv0.k.Single;
    }

    public static koi.b d(ArrayList arrayList, View view, d dVar) {
        int size = arrayList.size();
        int i = 0;
        koi.b bVar = null;
        boolean z = false;
        while (true) {
            if (i < size) {
                koi.b bVar2 = (koi.b) arrayList.get(i);
                View itemView = bVar2.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                if (itemView.getTranslationY() + itemView.getTop() <= view.getTranslationY() + view.getTop() || itemView == view) {
                    b bVarL = l(bVar2, bVar, dVar, z);
                    bVar = bVarL.f189062a;
                    z = bVarL.f189063b;
                    if (itemView != view) {
                        qv0.i iVarF = f(bVar2);
                        if (iVarF != null && a(iVarF, dVar)) {
                            bVar = null;
                        }
                        i++;
                    } else if (bVar != null && bVar.itemView != view) {
                        return bVar;
                    }
                } else if (bVar != null && bVar.itemView != view) {
                    return bVar;
                }
            } else if (bVar != null && bVar.itemView != view) {
                return bVar;
            }
        }
        return null;
    }

    public static qv0.i f(RecyclerView.ViewHolder viewHolder) {
        koi.b bVar = viewHolder instanceof koi.b ? (koi.b) viewHolder : null;
        koi.j jVar = bVar != null ? bVar.e : null;
        if (jVar instanceof qv0.i) {
            return (qv0.i) jVar;
        }
        return null;
    }

    public static d g(qv0.i iVar) {
        qv0.l lVar = iVar instanceof qv0.l ? (qv0.l) iVar : null;
        qv0.k v = lVar != null ? lVar.getV() : null;
        return (v == null || v == qv0.k.OutOfGroup) ? d.Box : d.Group;
    }

    public static int h(RecyclerView.ViewHolder viewHolder) {
        Integer numM = m(viewHolder.getOldPosition());
        if (numM != null) {
            return numM.intValue();
        }
        Integer numM2 = m(viewHolder.getAbsoluteAdapterPosition());
        if (numM2 != null) {
            return numM2.intValue();
        }
        Integer numM3 = m(viewHolder.getBindingAdapterPosition());
        if (numM3 != null) {
            return numM3.intValue();
        }
        Integer numM4 = m(viewHolder.getLayoutPosition());
        if (numM4 != null) {
            return numM4.intValue();
        }
        return -1;
    }

    public static boolean i(qv0.i iVar, d dVar) {
        int i = e.f189067a[dVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            qv0.c f = iVar.getF();
            if (!(f instanceof c.b) && !(f instanceof c.a)) {
                return false;
            }
        } else {
            if (!(iVar instanceof qv0.l)) {
                return false;
            }
            switch (e.f189068b[((qv0.l) iVar).getV().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    break;
                case 5:
                case 6:
                    return false;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    public static boolean j(qv0.i iVar, d dVar) {
        int i = e.f189067a[dVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            qv0.c f = iVar.getF();
            return (f instanceof c.f) || (f instanceof c.e);
        }
        if (iVar instanceof qv0.l) {
            qv0.l lVar = (qv0.l) iVar;
            if (lVar.getV() != qv0.k.Header) {
                if (lVar.getV() == qv0.k.OutOfGroup) {
                    qv0.c f4 = lVar.getF();
                    if ((f4 instanceof c.f) || (f4 instanceof c.e)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean k(String sectionKey, koi.b headerHolder) {
        Intrinsics.checkNotNullParameter(headerHolder, "headerHolder");
        Intrinsics.checkNotNullParameter(sectionKey, "sectionKey");
        qv0.i iVarF = f(headerHolder);
        return iVarF != null && Intrinsics.f(iVarF.getD(), sectionKey) && j(iVarF, g(iVarF));
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0098, code lost:
    
        if (h(r0) == h(r5)) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ks0.b l(koi.b r5, koi.b r6, ks0.d r7, boolean r8) {
        /*
            qv0.i r0 = f(r5)
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r0 = r1
            goto L18
        L9:
            boolean r2 = j(r0, r7)
            if (r2 == 0) goto L11
            r0 = r5
            goto L18
        L11:
            boolean r0 = i(r0, r7)
            if (r0 == 0) goto L7
            r0 = r6
        L18:
            r2 = 0
            if (r0 == r6) goto L1c
            r8 = r2
        L1c:
            qv0.i r6 = f(r5)
            if (r6 == 0) goto Lb8
            boolean r6 = i(r6, r7)
            r3 = 1
            if (r6 != r3) goto Lb8
            if (r0 != 0) goto L2d
            goto L9b
        L2d:
            ks0.d r6 = ks0.d.Box
            if (r7 == r6) goto L33
            goto La1
        L33:
            qv0.i r6 = f(r0)
            if (r6 == 0) goto La1
            qv0.c r6 = r6.getF()
            boolean r6 = r6 instanceof qv0.c.e
            if (r6 != r3) goto La1
            if (r8 != 0) goto La1
            android.view.View r6 = r0.itemView
            java.lang.String r7 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            android.view.View r4 = r5.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r7)
            int r7 = r4.getTop()
            float r7 = (float) r7
            float r4 = r4.getTranslationY()
            float r4 = r4 + r7
            int r7 = r6.getBottom()
            float r7 = (float) r7
            float r6 = r6.getTranslationY()
            float r6 = r6 + r7
            float r4 = r4 - r6
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L71
            r6 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L71
            goto La1
        L71:
            qv0.i r6 = f(r0)
            if (r6 == 0) goto L9b
            qv0.c r6 = r6.getF()
            boolean r7 = r6 instanceof qv0.c.e
            if (r7 == 0) goto L82
            qv0.c$e r6 = (qv0.c.e) r6
            goto L83
        L82:
            r6 = r1
        L83:
            if (r6 == 0) goto L9b
            boolean r6 = r6.f249515b
            if (r6 != r3) goto L9b
            int r6 = h(r0)
            r7 = -1
            if (r6 == r7) goto L9b
            int r6 = h(r0)
            int r5 = h(r5)
            if (r6 != r5) goto L9b
            goto La1
        L9b:
            ks0.b r5 = new ks0.b
            r5.<init>(r1, r2)
            return r5
        La1:
            ks0.b r5 = new ks0.b
            if (r8 != 0) goto Lb3
            qv0.i r6 = f(r0)
            if (r6 == 0) goto Lb4
            qv0.c r6 = r6.getF()
            boolean r6 = r6 instanceof qv0.c.e
            if (r6 != r3) goto Lb4
        Lb3:
            r2 = r3
        Lb4:
            r5.<init>(r0, r2)
            return r5
        Lb8:
            ks0.b r5 = new ks0.b
            r5.<init>(r0, r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ks0.f.l(koi.b, koi.b, ks0.d, boolean):ks0.b");
    }

    public static Integer m(int i) {
        Integer numValueOf = Integer.valueOf(i);
        if (i == -1) {
            return null;
        }
        return numValueOf;
    }

    public final koi.b b(View view, d dVar) {
        ArrayList arrayList = this.f189070b;
        arrayList.clear();
        RecyclerView recyclerView = this.f189069a;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
            koi.b bVar = childViewHolder instanceof koi.b ? (koi.b) childViewHolder : null;
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        try {
            z.w(arrayList, this.f189071c);
            return d(arrayList, view, dVar);
        } finally {
            arrayList.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a1, code lost:
    
        r3 = r13;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final koi.b c(androidx.recyclerview.widget.RecyclerView.ViewHolder r17) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ks0.f.c(androidx.recyclerview.widget.RecyclerView$ViewHolder):koi.b");
    }

    public final c e(RecyclerView.ViewHolder itemHolder) {
        qv0.i iVarF;
        Intrinsics.checkNotNullParameter(itemHolder, "itemHolder");
        koi.b bVarC = c(itemHolder);
        if (bVarC != null && (iVarF = f(bVarC)) != null) {
            d dVarG = g(iVarF);
            if (j(iVarF, dVarG)) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = this.f189070b;
                arrayList2.clear();
                RecyclerView recyclerView = this.f189069a;
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
                    koi.b bVar = childViewHolder instanceof koi.b ? (koi.b) childViewHolder : null;
                    if (bVar != null) {
                        arrayList2.add(bVar);
                    }
                }
                try {
                    if (h(bVarC) == -1) {
                        z.w(arrayList2, this.f189071c);
                    } else {
                        z.w(arrayList2, this.d);
                    }
                    int size = arrayList2.size();
                    boolean z = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        koi.b bVar2 = (koi.b) arrayList2.get(i2);
                        if (bVar2 == bVarC) {
                            z = true;
                        } else if (z) {
                            qv0.i iVarF2 = f(bVar2);
                            if (iVarF2 == null || !i(iVarF2, dVarG)) {
                                break;
                            }
                            arrayList.add(bVar2);
                            if (a(iVarF2, dVarG)) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    Unit unit = Unit.f186387a;
                    arrayList2.clear();
                    return new c(iVarF.getD(), bVarC, arrayList);
                } catch (Throwable th10) {
                    arrayList2.clear();
                    throw th10;
                }
            }
        }
        return null;
    }
}
