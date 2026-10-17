package eq5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wk5.k f128278b;

    public /* synthetic */ j0(wk5.k kVar, int i) {
        this.f128277a = i;
        this.f128278b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f128277a) {
            case 0:
                List blockchains = (List) obj2;
                Intrinsics.checkNotNullParameter(blockchains, "blockchains");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : blockchains) {
                    if (wk5.m.a((wk5.a) obj3) == this.f128278b) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            default:
                pd5.g it8 = (pd5.g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List list = it8.d;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(wk5.m.a((wk5.a) it9.next()));
                }
                return Boolean.valueOf(zhm.d0.i1(arrayList2).contains(this.f128278b));
        }
    }
}
