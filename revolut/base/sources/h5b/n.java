package h5b;

import com.revolut.data.model.Data;
import h43.q;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final List a(Data stateData) {
        Intrinsics.checkNotNullParameter(stateData, "stateData");
        List list = (List) iii.c.f(stateData, new h3d.a(19), new q(3), new gzb.d(5));
        yp0.b.k(list, 0, 0, 0, 0, 31);
        return list;
    }
}
