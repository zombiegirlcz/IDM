package ru6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257452a;

    public i(String note) {
        Intrinsics.checkNotNullParameter(note, "note");
        this.f257452a = note;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f257452a, ((i) obj2).f257452a);
    }

    public final int hashCode() {
        return this.f257452a.hashCode();
    }
}
