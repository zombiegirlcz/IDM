package d4h;

import cmf.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import d8l.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KType;
import v1.c;
import zhm.a0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f111321b;

    public /* synthetic */ a(List list, int i) {
        this.f111320a = i;
        this.f111321b = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        switch (this.f111320a) {
            case 0:
                List list = this.f111321b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof hdh.b) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 1:
                List list2 = this.f111321b;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    z = false;
                } else {
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        if (jjh.b.b((WealthAccount) it8.next())) {
                            z = true;
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                List list3 = this.f111321b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list3) {
                    if (jjh.b.a((WealthAccount) obj3)) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            case 3:
                List list4 = this.f111321b;
                ArrayList arrayList3 = new ArrayList();
                Iterator it9 = list4.iterator();
                while (it9.hasNext()) {
                    a0.x((Iterable) ((p) it9.next()).f25246b.invoke(), arrayList3);
                }
                return arrayList3;
            case 4:
                return this.f111321b;
            case 5:
                return d.k(this.f111321b);
            case 6:
                return ((KType) this.f111321b.get(0)).getF186441a();
            case 7:
                return ((KType) this.f111321b.get(0)).getF186441a();
            case 8:
                return new TextLocalisedClause(R$string.freelancer_sales_filters_payment_methods_header_title, c.v(this.f111321b), null, 12);
            case 9:
                return new TextLocalisedClause(R$string.freelancer_sales_filters_statuses_header_title, c.v(this.f111321b), null, 12);
            default:
                return new TextLocalisedClause(R$string.freelancer_sales_filters_types_header_title, c.v(this.f111321b), null, 12);
        }
    }
}
