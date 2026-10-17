package om4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class f2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x2 f226576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f226577c;

    public /* synthetic */ f2(x2 x2Var, List list, int i) {
        this.f226575a = i;
        this.f226576b = x2Var;
        this.f226577c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f226575a) {
            case 0:
                List list = this.f226577c;
                return x2.c(this.f226576b, (d2) obj2, list);
            default:
                List list2 = (List) obj2;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(x2.c(this.f226576b, (d2) it8.next(), this.f226577c));
                }
                return arrayList;
        }
    }
}
