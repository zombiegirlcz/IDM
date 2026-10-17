package mx0;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ActionMode;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mx0.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class i0 extends ExploreByTouchHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f209747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseIntArray f209748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f209749c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(p0 p0Var) {
        super(p0Var);
        this.f209749c = p0Var;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, new int[]{1});
        sparseArray.put(1, new int[]{2, 3, 4});
        sparseArray.put(2, new int[]{5, 6, 7});
        sparseArray.put(3, new int[]{8});
        this.f209747a = sparseArray;
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = this.f209747a.keyAt(i);
            int[] iArr = (int[]) this.f209747a.get(iKeyAt);
            Intrinsics.h(iArr);
            for (int i2 : iArr) {
                sparseIntArray.put(i2, iKeyAt);
            }
        }
        this.f209748b = sparseIntArray;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.List] */
    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final int getVirtualViewAt(float f, float f4) {
        ?? r87 = this.f209749c.f209898a;
        int size = r87.size();
        for (int i = 0; i < size; i++) {
            s0 s0Var = (s0) r87.get(i);
            if (s0Var.f209982b != k0.REMOVE) {
                float f5 = s0Var.d;
                if (f >= f5 && f < f5 + s0Var.e) {
                    return this.f209748b.get(s0Var.f, -1);
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void getVisibleVirtualViews(List virtualViewIds) {
        Intrinsics.checkNotNullParameter(virtualViewIds, "virtualViewIds");
        HashSet hashSet = new HashSet();
        ?? r4 = this.f209749c.f209898a;
        int size = r4.size();
        for (int i = 0; i < size; i++) {
            s0 s0Var = (s0) r4.get(i);
            if (s0Var.f209982b != k0.REMOVE) {
                hashSet.add(Integer.valueOf(this.f209748b.get(s0Var.f, -1)));
            }
        }
        if (hashSet.contains(0)) {
            virtualViewIds.add(0);
        }
        if (hashSet.contains(1)) {
            virtualViewIds.add(1);
        }
        if (hashSet.contains(2)) {
            virtualViewIds.add(2);
        }
        if (hashSet.contains(3)) {
            virtualViewIds.add(3);
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        ActionMode actionMode;
        p0 p0Var = this.f209749c;
        if (i != 0) {
            if (i == 1 || i == 2) {
                if (i2 == 16 && (actionMode = p0Var.I) != null) {
                    if (actionMode != null) {
                        actionMode.finish();
                    }
                    p0Var.I = null;
                    return true;
                }
                if (i2 == 16) {
                    p0.a aVar = p0.Companion;
                    p0Var.requestFocus();
                    kli.c.f(p0Var);
                    return true;
                }
                if (i2 != 32) {
                    return false;
                }
                p0.a aVar2 = p0.Companion;
                p0Var.startActionMode(new q0(p0Var), 1);
                return true;
            }
            if (i != 3 || i2 != 16) {
                return false;
            }
            Function0<Unit> onSuffixClickListener$ui_kit_components_release = p0Var.getOnSuffixClickListener$ui_kit_components_release();
            if (onSuffixClickListener$ui_kit_components_release != null) {
                onSuffixClickListener$ui_kit_components_release.invoke();
                return true;
            }
        } else {
            if (i2 != 16) {
                return false;
            }
            Function0<Unit> onPrefixClickListener$ui_kit_components_release = p0Var.getOnPrefixClickListener$ui_kit_components_release();
            if (onPrefixClickListener$ui_kit_components_release != null) {
                onPrefixClickListener$ui_kit_components_release.invoke();
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat node) {
        Editable text;
        Intrinsics.checkNotNullParameter(node, "node");
        node.setClassName(kotlin.jvm.internal.o0.f186429a.b(p0.class).m());
        p0 p0Var = this.f209749c;
        Rect rect = new Rect(0, 0, 0, p0Var.getHeight());
        SparseArray sparseArray = this.f209747a;
        int[] iArr = (int[]) sparseArray.get(i);
        if (iArr == null) {
            iArr = new int[0];
        }
        rect.left = Integer.MAX_VALUE;
        ?? r56 = p0Var.f209898a;
        int size = r56.size();
        for (int i2 = 0; i2 < size; i2++) {
            s0 s0Var = (s0) r56.get(i2);
            if (s0Var.f209982b != k0.REMOVE && kotlin.collections.d.G(iArr, s0Var.f)) {
                float f = rect.left;
                float f4 = s0Var.d;
                if (f > f4) {
                    rect.left = rim.d.c(f4);
                }
                float f5 = rect.right;
                float f6 = s0Var.d + s0Var.e;
                if (f5 < f6) {
                    rect.right = rim.d.c(f6);
                }
            }
        }
        if (rect.left > rect.right) {
            rect.setEmpty();
        }
        node.setBoundsInParent(rect);
        ArrayList arrayList = new ArrayList();
        int[] iArr2 = (int[]) sparseArray.get(i);
        if (iArr2 == null) {
            iArr2 = new int[0];
        }
        ?? r2 = p0Var.f209898a;
        int size2 = r2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            s0 s0Var2 = (s0) r2.get(i3);
            if (s0Var2.f209982b != k0.REMOVE && kotlin.collections.d.G(iArr2, s0Var2.f)) {
                arrayList.add(s0Var2);
            }
        }
        if (arrayList.size() > 1) {
            zhm.z.w(arrayList, new h0());
        }
        node.setContentDescription(zhm.d0.k0(arrayList, "", null, null, 0, new mul.k(19), 30));
        node.setClickable(i == 0 || i == 1 || (i == 2 ? p0Var.I != null : i == 3));
        node.setLongClickable((i == 1 || i == 2) && p0Var.I == null);
        node.setEditable(i == 1);
        node.setShowingHintText(i == 1 && ((text = p0Var.getMainEditText$ui_kit_components_release().getText()) == null || text.length() == 0));
        node.setInputType(i == 1 ? 146 : 0);
    }
}
