package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public abstract class t30 extends kh0 {

    public static final class a extends t30 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33188a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f33189b = 8;

        private a() {
            super(null, null, "canceled", 3, null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return 1179188621;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Canceled";
        }
    }

    public /* synthetic */ t30(String str, Throwable th10, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th10, str2);
    }

    private t30(String str, Throwable th10, String str2) {
        super(str, th10, str2);
    }

    public /* synthetic */ t30(String str, Throwable th10, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th10, str2, null);
    }
}
