package ael;

import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.k0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class f implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3612c;

    public /* synthetic */ f(g gVar, nel.k0 k0Var) {
        this.f3610a = 1;
        this.f3611b = gVar;
        this.f3612c = k0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f3610a) {
            case 0:
                nel.k0 k0Var = (nel.k0) this.f3612c;
                g gVar = (g) this.f3611b;
                nel.n nVar = (nel.n) obj2;
                nel.n nVar2 = (nel.n) obj3;
                if (k0Var instanceof k0.a) {
                    return ((k0.a) k0Var).f214584a ? kotlin.text.a0.q(nVar.d, nVar2.d) : cim.b.h().compare(nVar.d, nVar2.d);
                }
                if (k0Var instanceof k0.c) {
                    return ((k0.c) k0Var).f214586a ? kotlin.text.a0.q(nVar.e, nVar2.e) : cim.b.h().compare(nVar.e, nVar2.e);
                }
                if (!(k0Var instanceof k0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                Integer num = nVar.f214601l;
                Integer num2 = nVar2.f214601l;
                if (num != null && num2 != null) {
                    return num.intValue() - num2.intValue();
                }
                if (num != null || num2 != null) {
                    return num != null ? -1 : 1;
                }
                k0.c sortingOptions = ((k0.b) k0Var).f214585a;
                Intrinsics.checkNotNullParameter(sortingOptions, "sortingOptions");
                return new f(sortingOptions, gVar, 0).compare(nVar, nVar2);
            case 1:
                g gVar2 = (g) this.f3611b;
                nel.k0 sortingOptions2 = (nel.k0) this.f3612c;
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(sortingOptions2, "sortingOptions");
                return new f(sortingOptions2, gVar2, 0).compare(((nel.a0) obj2).f214560a, ((nel.a0) obj3).f214560a);
            default:
                Comparator comparator = (Comparator) this.f3612c;
                Comparator comparator2 = (Comparator) this.f3611b;
                int iCompare = comparator.compare(obj2, obj3);
                return iCompare != 0 ? iCompare : comparator2.compare(obj2, obj3);
        }
    }

    public /* synthetic */ f(Object obj2, Object obj3, int i) {
        this.f3610a = i;
        this.f3612c = obj2;
        this.f3611b = obj3;
    }
}
