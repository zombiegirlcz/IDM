package f39;

import a83.d0;
import akg.n;
import com.google.common.collect.ImmutableSet;
import com.revolut.data.model.Data;
import et6.u1;
import go.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f131917a;

    public c(ImmutableSet availabilityInteractors) {
        Intrinsics.checkNotNullParameter(availabilityInteractors, "availabilityInteractors");
        this.f131917a = availabilityInteractors;
    }

    public static n b(c cVar) {
        h0 additionalFeatures = h0.f322473a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(additionalFeatures, "additionalFeatures");
        return nim.a.v(cVar.a(), new d0(21, additionalFeatures));
    }

    public final Flow a() {
        Set set = this.f131917a;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            arrayList.add(((a39.a) it8.next()).a());
        }
        return arrayList.isEmpty() ? new g(new Data(null, null, false, 7, null), 2) : q.q(new u1((Flow[]) zhm.d0.d1(arrayList).toArray(new Flow[0]), this, 6));
    }
}
