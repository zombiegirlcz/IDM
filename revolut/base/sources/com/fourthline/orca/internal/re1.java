package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class re1 extends kh0 {

    public static final class a extends re1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32703a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f32704b = 8;

        private a() {
            super("network_connection_lost", null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return -901154040;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ConnectionLost";
        }
    }

    public static final class b extends re1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f32705a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String message) {
            super("network_generic", null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.f32705a = message;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f32705a, ((b) obj2).f32705a);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f32705a;
        }

        public int hashCode() {
            return this.f32705a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Fatal(message=" + this.f32705a + ")";
        }
    }

    public static final class c extends re1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f32706a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f32707b = 8;

        private c() {
            super("network_recoverable", null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof c);
        }

        public int hashCode() {
            return 2036370072;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Recoverable";
        }
    }

    public /* synthetic */ re1(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private re1(String str) {
        super(null, null, str, 3, null);
    }
}
