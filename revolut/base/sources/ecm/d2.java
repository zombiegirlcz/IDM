package ecm;

import java.util.Comparator;

/* JADX INFO: loaded from: classes13.dex */
public final class d2 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1 f124794a;

    public d2(q1 q1Var) {
        this.f124794a = q1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        q1 q1Var = this.f124794a;
        int iA = q1Var.a(obj2) - q1Var.a(obj3);
        return iA != 0 ? iA : obj2.getClass().getName().compareTo(obj3.getClass().getName());
    }
}
