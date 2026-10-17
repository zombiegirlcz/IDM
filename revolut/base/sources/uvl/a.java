package uvl;

import com.revolut.data.model.Data;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import u3b.h;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    @NotNull
    public static final C1568a Companion = new C1568a();

    /* JADX INFO: renamed from: uvl.a$a, reason: collision with other inner class name */
    public static final class C1568a {
        private C1568a() {
        }
    }

    public final List a(qdf.c cVar) {
        Data data;
        List list = (cVar == null || (data = cVar.f244952a) == null) ? null : (List) iii.c.f(data, new uv1.c(9), new utk.b(7), new h(this, 29));
        return list == null ? f0.f322471a : list;
    }
}
