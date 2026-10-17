package gt6;

import kotlin.jvm.internal.Intrinsics;
import tof.k5;
import tof.l5;
import tof.m5;
import xr6.j;
import xr6.k;
import xr6.l;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public static l a(l5 l5Var) {
        m5 m5Var;
        xr6.h hVar;
        k5 k5Var = l5Var.f272915h;
        if (k5Var != null && (m5Var = k5Var.f) != null) {
            switch (d.f146559b[m5Var.ordinal()]) {
                case 1:
                    hVar = xr6.h.AMERICAN_EXPRESS;
                    break;
                case 2:
                    hVar = xr6.h.DISCOVER;
                    break;
                case 3:
                    hVar = xr6.h.JCB;
                    break;
                case 4:
                    hVar = xr6.h.MASTERCARD;
                    break;
                case 5:
                    hVar = xr6.h.PRIVATE_LABEL;
                    break;
                case 6:
                    hVar = xr6.h.VISA;
                    break;
                default:
                    hVar = null;
                    break;
            }
            if (hVar != null) {
                Intrinsics.h(k5Var);
                return new xr6.i(k5Var.f272883b, hVar);
            }
        }
        String str = l5Var.f;
        if (str != null) {
            return new j(str);
        }
        String str2 = l5Var.f272912b;
        if (str2 != null) {
            return new k(str2);
        }
        return null;
    }
}
