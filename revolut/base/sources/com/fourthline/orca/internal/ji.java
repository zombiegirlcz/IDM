package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ji {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f29920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c81 f29921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29922c;

    public ji(c81 text, c81 link, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f29920a = text;
        this.f29921b = link;
        this.f29922c = z;
    }

    public final ji a(c81 text, c81 link, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(link, "link");
        return new ji(text, link, z);
    }

    public final c81 b() {
        return this.f29921b;
    }

    public final c81 c() {
        return this.f29920a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ji)) {
            return false;
        }
        ji jiVar = (ji) obj2;
        return Intrinsics.f(this.f29920a, jiVar.f29920a) && Intrinsics.f(this.f29921b, jiVar.f29921b) && this.f29922c == jiVar.f29922c;
    }

    public int hashCode() {
        return (((this.f29920a.hashCode() * 31) + this.f29921b.hashCode()) * 31) + Boolean.hashCode(this.f29922c);
    }

    public String toString() {
        return "LinkButtonState(text=" + this.f29920a + ", link=" + this.f29921b + ", enabled=" + this.f29922c + ")";
    }

    public static /* synthetic */ ji a(ji jiVar, c81 c81Var, c81 c81Var2, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            c81Var = jiVar.f29920a;
        }
        if ((i & 2) != 0) {
            c81Var2 = jiVar.f29921b;
        }
        if ((i & 4) != 0) {
            z = jiVar.f29922c;
        }
        return jiVar.a(c81Var, c81Var2, z);
    }

    public final boolean a() {
        return this.f29922c;
    }
}
