package lq0;

import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q extends m {
    public final ArrayList d = new ArrayList();

    @Override // lq0.m
    public final void c(r holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((m) arrayList.get(i)).b(holder);
        }
    }

    @Override // lq0.m
    public final void e(r holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((m) arrayList.get(i)).d(holder);
        }
    }

    @Override // lq0.m
    public final b g(r rVar, r rVar2) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            b bVarF = ((m) arrayList.get(i)).f(rVar, rVar2);
            if (bVarF != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(bVarF);
            }
        }
        if (arrayList2 != null) {
            return new a(arrayList2);
        }
        return null;
    }

    @Override // lq0.m
    public final void j(ViewGroup root) {
        Intrinsics.checkNotNullParameter(root, "root");
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((m) arrayList.get(i)).i(root);
        }
    }

    @Override // lq0.m
    public final void l(ViewGroup root) {
        Intrinsics.checkNotNullParameter(root, "root");
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((m) arrayList.get(i)).k(root);
        }
    }

    public final void m(m transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        ArrayList arrayList = this.d;
        if (arrayList.contains(transition)) {
            return;
        }
        arrayList.add(transition);
    }
}
