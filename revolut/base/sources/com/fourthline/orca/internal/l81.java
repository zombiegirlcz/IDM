package com.fourthline.orca.internal;

import com.fourthline.orca.internal.z;

/* JADX INFO: loaded from: classes23.dex */
public interface l81 {
    String a();

    default boolean b() {
        return d() && c();
    }

    default boolean c() {
        String strE = e();
        if (strE != null) {
            return z.a.f35469a.a(strE);
        }
        return false;
    }

    default boolean d() {
        if (a() != null) {
            return !kotlin.text.d0.W(r0);
        }
        return false;
    }

    String e();
}
