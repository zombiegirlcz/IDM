package com.fourthline.orca.internal;

import com.fourthline.orca.internal.hq0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface gq0 {

    public interface a extends gq0 {
        default void a(hq0.c popupType) {
            Intrinsics.checkNotNullParameter(popupType, "popupType");
        }

        kh0 b();

        default void b(hq0.c popupType) {
            Intrinsics.checkNotNullParameter(popupType, "popupType");
        }
    }

    public interface b extends gq0 {
        default void a() {
        }

        hq0 c();

        default void d() {
        }

        default void a(int i) {
        }
    }

    zp0 getState();
}
