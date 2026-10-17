package com.fourthline.orca.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface qg0 {

    public interface a extends ib.f {
        @Override // ib.f
        @NotNull
        default Map getAttributes() {
            return zhm.r0.g();
        }

        @Override // ib.f
        default String getEventName() {
            return "TODO";
        }

        @Override // ib.f
        @NotNull
        /* bridge */ /* synthetic */ default String getSchema() {
            return "";
        }
    }

    void track(a aVar);
}
