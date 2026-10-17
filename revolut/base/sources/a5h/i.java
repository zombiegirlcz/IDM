package a5h;

import a5g.l;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4h.b f1409a;

    public i(u4h.b fitchRatingMapper) {
        Intrinsics.checkNotNullParameter(fitchRatingMapper, "fitchRatingMapper");
        this.f1409a = fitchRatingMapper;
    }

    public final List a(k3h.d state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Data data = state.f180737b;
        n nVar = state.f180738c;
        List list = (data == null || nVar == null) ? null : (List) iii.c.f(data, new a5g.h(this, 3), new l(1), new a0i.a(this, 1, state, nVar));
        return list == null ? f0.f322471a : list;
    }
}
