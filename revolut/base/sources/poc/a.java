package poc;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p40.n;
import pj9.m;
import pnh.a0;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nnc.b f237957a;

    public a(nnc.d itemMapper, nnc.b cellMapper) {
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(cellMapper, "cellMapper");
        this.f237957a = cellMapper;
    }

    public final List a(Data data, Data data2) {
        Data dataT = (data == null || data2 == null) ? null : t1.t(data, data2);
        List list = dataT != null ? (List) iii.c.f(dataT, new a0(15), new m(27), new n(this, 13)) : null;
        return list == null ? f0.f322471a : list;
    }
}
