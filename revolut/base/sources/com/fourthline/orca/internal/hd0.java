package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class hd0 extends kh0 {

    public static final class a extends hd0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29223a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29224b = 8;

        private a() {
            super(null, null, "connection_lost", 3, null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return 1649399982;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ConnectionLost";
        }
    }

    public static final class b extends hd0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29225a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29226b = 8;

        private b() {
            super(null, null, "nfc_not_enabled", 3, null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return -1106165267;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "NfcNotEnabled";
        }
    }

    public static final class c extends hd0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f29227a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29228b = 8;

        private c() {
            super(null, null, "nfc_not_supported", 3, null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof c);
        }

        public int hashCode() {
            return -1556049830;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "NfcNotSupported";
        }
    }

    public static final class d extends hd0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f29229c = new a(null);
        public static final int d = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Throwable f29231b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(String description, Throwable th10) {
                Intrinsics.checkNotNullParameter(description, "description");
                return new d(description, th10, null);
            }

            private a() {
            }

            public static /* synthetic */ d a(a aVar, String str, Throwable th10, int i, Object obj2) {
                if ((i & 2) != 0) {
                    th10 = null;
                }
                return aVar.a(str, th10);
            }
        }

        public /* synthetic */ d(String str, Throwable th10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th10);
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f29231b;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f29230a;
        }

        private d(String str, Throwable th10) {
            super(str, th10, "unexpected", null);
            this.f29230a = str;
            this.f29231b = th10;
        }
    }

    public static final class e extends hd0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final kf0 f29232a;

        public e(kf0 kf0Var) {
            super(null, null, "authentication_failed", 3, null);
            this.f29232a = kf0Var;
        }

        public final kf0 a() {
            return this.f29232a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof e) && Intrinsics.f(this.f29232a, ((e) obj2).f29232a);
        }

        public int hashCode() {
            kf0 kf0Var = this.f29232a;
            if (kf0Var == null) {
                return 0;
            }
            return kf0Var.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "WrongUnlockKey(key=" + this.f29232a + ")";
        }
    }

    public /* synthetic */ hd0(String str, Throwable th10, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th10, str2);
    }

    private hd0(String str, Throwable th10, String str2) {
        super(str, th10, str2);
    }

    public /* synthetic */ hd0(String str, Throwable th10, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th10, str2, null);
    }
}
