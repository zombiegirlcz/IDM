package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class gm extends kh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gm f28932a = new gm();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f28933b = 8;

    private gm() {
        super(null, null, "nationality_not_matching", 3, null);
    }

    public boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof gm);
    }

    public int hashCode() {
        return 372256468;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "DocumentNationalityNotValid";
    }
}
