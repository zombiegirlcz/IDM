package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ob implements rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31625a;

    public ob(String newInput) {
        Intrinsics.checkNotNullParameter(newInput, "newInput");
        this.f31625a = newInput;
    }

    public final String a() {
        return this.f31625a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ob) && Intrinsics.f(this.f31625a, ((ob) obj2).f31625a);
    }

    public int hashCode() {
        return this.f31625a.hashCode();
    }

    public String toString() {
        return "OnChanged(newInput=" + this.f31625a + ")";
    }
}
