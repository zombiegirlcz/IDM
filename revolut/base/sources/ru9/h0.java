package ru9;

import com.revolut.core.ui_kit.models.Custom;
import com.youTransactor.uCube.rpc.Constants;
import tof.a3;
import tof.v6;

/* JADX INFO: loaded from: classes5.dex */
public final class h0 {
    public static Custom a(a3 a3Var) {
        if (b(a3Var)) {
            return new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
        }
        return null;
    }

    public static boolean b(a3 a3Var) {
        v6 v6Var = a3Var != null ? a3Var.f : null;
        int i = v6Var == null ? -1 : g0.f257474a[v6Var.ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }
}
