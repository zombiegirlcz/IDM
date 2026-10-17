package vd7;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rd7.m;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements n {
    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f287810a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            SmallCardDelegate.Model model = new SmallCardDelegate.Model(a0.d.n("IMAGE_ID", i), null, null, null, m.a((rd7.h) obj2, gz0.b.CenterCrop), null, null, Integer.valueOf(i), null, 1044382);
            yp0.b.m(model);
            arrayList.add(model);
            i = i2;
        }
        return new g(arrayList);
    }
}
