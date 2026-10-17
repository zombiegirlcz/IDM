package ail;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mif.e0;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements xhl.a {
    @Override // xhl.a
    public final String a(wgl.d params) {
        String str;
        Intrinsics.checkNotNullParameter(params, "params");
        wgl.c cVar = (wgl.c) params;
        int i = d.f5309a[cVar.f297343b.ordinal()];
        if (i == 1) {
            str = "TOP_GAINERS";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "TOP_LOSERS";
        }
        return com.google.android.gms.internal.mlkit_vision_face.a.p(str, "_", e0.P(cVar.f297342a), "_", e0.O(cVar.f297344c));
    }
}
