package sp7;

import com.revolut.feature.insurance_car.impl.data.model.Answer;
import efm.r;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.i;
import y7a.w;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends a8a.d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f264902a = f0.f322471a;

    public static final class a {
        private a() {
        }
    }

    @Override // a8a.d
    public final boolean b(String query, i model) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(model, "model");
        return true;
    }

    @Override // a8a.d
    public final w d(Set ids, Object obj2) {
        Object next;
        Intrinsics.checkNotNullParameter(ids, "ids");
        Iterator it8 = ((Iterable) this.f264902a).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (ids.contains(jl7.b.b((Answer) next))) {
                break;
            }
        }
        Answer answer = (Answer) next;
        if (answer != null) {
            return new sp7.a(answer);
        }
        throw new IllegalStateException(("answer with ids " + ids + " not found in answers " + this.f264902a).toString());
    }

    @Override // a8a.d
    public final r e(Object obj2, Set selectedModelIds, List list) {
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        r rVarFromCallable = r.fromCallable(new pu9.a(obj2, this, 24));
        Intrinsics.checkNotNullExpressionValue(rVarFromCallable, "fromCallable(...)");
        return rVarFromCallable;
    }
}
