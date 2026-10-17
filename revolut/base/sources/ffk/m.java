package ffk;

import com.revolut.data.model.Data;
import hha.f0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hha.u f134841b;

    public /* synthetic */ m(hha.u uVar, int i) {
        this.f134840a = i;
        this.f134841b = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f134840a) {
            case 0:
                hha.d plan = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(plan, "plan");
                return Boolean.valueOf(hha.s.h(plan, this.f134841b));
            default:
                List plans = (List) obj2;
                Intrinsics.checkNotNullParameter(plans, "plans");
                Object obj3 = null;
                List listP0 = zhm.d0.P0(plans, new f0(null));
                Iterator it8 = listP0.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        hha.d dVar = (hha.d) next;
                        if (hha.s.k(dVar) && hha.s.h(dVar, this.f134841b)) {
                            obj3 = next;
                        }
                    }
                }
                hha.d dVar2 = (hha.d) obj3;
                if (dVar2 == null) {
                    dVar2 = (hha.d) zhm.d0.o0(listP0);
                }
                return new Data(dVar2, null, false, 6, null);
        }
    }
}
