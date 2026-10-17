package kxd;

import com.revolut.domain.models.topup.methods.TopupMethod;
import io3.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f190566b;

    public /* synthetic */ b(l lVar, int i) {
        this.f190565a = i;
        this.f190566b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f190565a) {
            case 0:
                com.revolut.domain.models.topup.methods.b it8 = (com.revolut.domain.models.topup.methods.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List list = it8.f60525a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    TopupMethod.StoredMethod storedMethod = (TopupMethod.StoredMethod) obj3;
                    if ((storedMethod instanceof TopupMethod.StoredMethod.Card) || (storedMethod instanceof TopupMethod.StoredMethod.PayTo)) {
                        if (com.revolut.domain.models.topup.methods.a.a(storedMethod, this.f190566b)) {
                            arrayList.add(obj3);
                        }
                    }
                }
                return arrayList;
            default:
                io3.d pocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                return Boolean.valueOf(pocket.e == this.f190566b && lyd.c.f200786a.contains(pocket.f));
        }
    }
}
