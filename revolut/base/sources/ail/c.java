package ail;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mif.e0;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements xhl.a {
    @Override // xhl.a
    public final String a(wgl.d params) {
        String str;
        Intrinsics.checkNotNullParameter(params, "params");
        wgl.b bVar = (wgl.b) params;
        int i = b.f5308a[bVar.f297340b.ordinal()];
        if (i == 1) {
            str = "MOST_TRADED";
        } else if (i == 2) {
            str = "MOST_BOUGHT";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "MOST_SOLD";
        }
        return com.google.android.gms.internal.mlkit_vision_face.a.p(str, "_", e0.P(bVar.f297339a), "_", e0.O(bVar.f297341c));
    }
}
