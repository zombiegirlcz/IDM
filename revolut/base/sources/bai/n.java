package bai;

import com.revolut.feature.terms.api.model.Terms;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Terms f14109b;

    public /* synthetic */ n(Terms terms, int i) {
        this.f14108a = i;
        this.f14109b = terms;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f14108a) {
            case 0:
                i update = (i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return i.a(update, null, new h(false, true, this.f14109b), 1);
            case 1:
                l0c.j update2 = (l0c.j) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return l0c.j.a(update2, this.f14109b, null, false, 6);
            default:
                nci.k update3 = (nci.k) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return nci.k.a(update3, this.f14109b.f90359h, null, false, 6);
        }
    }
}
