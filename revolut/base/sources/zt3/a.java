package zt3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325065a;

    public a(String str) {
        this.f325065a = str;
    }

    @Override // zt3.c
    public final String a() {
        return "ERROR";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f325065a, ((a) obj2).f325065a);
    }

    public final int hashCode() {
        String str = this.f325065a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
