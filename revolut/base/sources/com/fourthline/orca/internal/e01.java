package com.fourthline.orca.internal;

import com.fourthline.orca.core.ProductConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class e01 implements ProductConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n01 f27962a;

    public e01(n01 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f27962a = flowConfig;
    }

    public final n01 a() {
        return this.f27962a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e01) && Intrinsics.f(this.f27962a, ((e01) obj2).f27962a);
    }

    public int hashCode() {
        return this.f27962a.hashCode();
    }

    public String toString() {
        return "SelfieConfig(flowConfig=" + this.f27962a + ")";
    }
}
