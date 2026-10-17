package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class s81 implements q81, m91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i91 f32939a;

    public s81(i91 flowAction) {
        Intrinsics.checkNotNullParameter(flowAction, "flowAction");
        this.f32939a = flowAction;
    }

    public final i91 c() {
        return this.f32939a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s81) && Intrinsics.f(this.f32939a, ((s81) obj2).f32939a);
    }

    public int hashCode() {
        return this.f32939a.hashCode();
    }

    public String toString() {
        return "Forward(flowAction=" + this.f32939a + ")";
    }
}
