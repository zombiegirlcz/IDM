package com.fourthline.vision.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class od {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36636b;

    public od(int i, int i2) {
        this.f36635a = i;
        this.f36636b = i2;
    }

    public static /* synthetic */ od copy$default(od odVar, int i, int i2, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            i = odVar.f36635a;
        }
        if ((i3 & 2) != 0) {
            i2 = odVar.f36636b;
        }
        return odVar.copy(i, i2);
    }

    public final int component1() {
        return this.f36635a;
    }

    public final int component2() {
        return this.f36636b;
    }

    @NotNull
    public final od copy(int i, int i2) {
        return new od(i, i2);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof od)) {
            return false;
        }
        od odVar = (od) obj2;
        return this.f36635a == odVar.f36635a && this.f36636b == odVar.f36636b;
    }

    public final int getHeight() {
        return this.f36636b;
    }

    public final int getWidth() {
        return this.f36635a;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f36635a) * 31) + Integer.hashCode(this.f36636b);
    }

    @NotNull
    public String toString() {
        return "Size(width=" + this.f36635a + ", height=" + this.f36636b + ")";
    }
}
