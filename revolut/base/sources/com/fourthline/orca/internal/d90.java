package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public interface d90 {
    static /* synthetic */ void a(d90 d90Var, String str, Integer num, Integer num2, String str2, Throwable th10, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: didFailRequest");
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        d90Var.a(str, num, num2, str2, th10);
    }

    void a(String str, Integer num);

    void a(String str, Integer num, Integer num2, String str2, bb0 bb0Var);

    void a(String str, Integer num, Integer num2, String str2, Throwable th10);
}
