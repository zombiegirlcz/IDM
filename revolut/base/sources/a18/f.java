package a18;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q87.z;
import qz9.u;
import r18.n;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public interface f {
    static List a(n nVar, Data data) {
        d displayOptions = new d(0);
        Intrinsics.checkNotNullParameter(displayOptions, "displayOptions");
        return data == null ? f0.f322471a : (List) iii.c.f(data, new qtb.c(nVar, displayOptions, 22), new u(nVar, 11), new z(nVar, displayOptions, 22));
    }
}
