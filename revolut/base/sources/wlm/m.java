package wlm;

import kotlin.jvm.internal.Intrinsics;
import mmm.h0;
import mmm.q0;
import mmm.s;
import mmm.t;

/* JADX INFO: loaded from: classes14.dex */
public final class m extends t {
    public m(s sVar) {
        super(sVar);
    }

    @Override // mmm.t, mmm.s
    public final q0 r(h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        h0 dir = file.c();
        if (dir != null) {
            Intrinsics.checkNotNullParameter(dir, "dir");
            h(dir);
        }
        return super.r(file);
    }
}
