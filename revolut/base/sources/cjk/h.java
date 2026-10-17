package cjk;

import com.revolut.data.model.Data;
import com.revolut.domain.exceptions.NotFoundException;
import hha.s;
import hha.w0;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f24704b;

    public /* synthetic */ h(w0 w0Var, int i) {
        this.f24703a = i;
        this.f24704b = w0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f24703a) {
            case 0:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                List list = (List) data.getContent();
                w0 w0Var = this.f24704b;
                Object obj3 = null;
                if (list != null) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            Object next = it8.next();
                            if (s.f((hha.d) next) == w0Var) {
                                obj3 = next;
                            }
                        }
                    }
                    obj3 = (hha.d) obj3;
                }
                return new Data(obj3, (!data.getLoading() && data.getError() == null && obj3 == null) ? new NotFoundException("plan with tier " + w0Var + " not found") : data.getError(), data.getLoading());
            case 1:
                List<hha.d> plans = (List) obj2;
                Intrinsics.checkNotNullParameter(plans, "plans");
                for (hha.d dVar : plans) {
                    if (s.f(dVar) == this.f24704b) {
                        return dVar;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            default:
                return wkk.e.a((wkk.e) obj2, null, this.f24704b, 1);
        }
    }
}
