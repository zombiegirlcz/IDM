package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class en {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final en f28204c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f28205a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final en a() {
            return en.f28204c;
        }

        private a() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f28203b = new a(defaultConstructorMarker);
        f28204c = new en(0L, 1, defaultConstructorMarker);
    }

    public en(long j2) {
        this.f28205a = j2;
    }

    public final long b() {
        return this.f28205a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof en) && this.f28205a == ((en) obj2).f28205a;
    }

    public int hashCode() {
        return Long.hashCode(this.f28205a);
    }

    public String toString() {
        return "DocumentReadyPopupConfig(appearanceDelay=" + this.f28205a + ")";
    }

    public /* synthetic */ en(long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1500L : j2);
    }
}
