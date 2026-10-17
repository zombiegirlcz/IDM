package com.fourthline.vision.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class w extends Exception {

    public static final class a extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f37034a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ a copy$default(a aVar, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = aVar.f37034a;
            }
            return aVar.copy(str);
        }

        public final String component1() {
            return this.f37034a;
        }

        @NotNull
        public final a copy(String str) {
            return new a(str);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f37034a, ((a) obj2).f37034a);
        }

        public final String getMsg() {
            return this.f37034a;
        }

        public int hashCode() {
            String str = this.f37034a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "CameraOpenException(msg=" + this.f37034a + ")";
        }

        public a(String str) {
            super(str, null);
            this.f37034a = str;
        }

        public /* synthetic */ a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    public static final class b extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f37035a;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ b copy$default(b bVar, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = bVar.f37035a;
            }
            return bVar.copy(str);
        }

        public final String component1() {
            return this.f37035a;
        }

        @NotNull
        public final b copy(String str) {
            return new b(str);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f37035a, ((b) obj2).f37035a);
        }

        public final String getMsg() {
            return this.f37035a;
        }

        public int hashCode() {
            String str = this.f37035a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "CameraSessionConfigureException(msg=" + this.f37035a + ")";
        }

        public b(String str) {
            super(str, null);
            this.f37035a = str;
        }

        public /* synthetic */ b(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    public static final class c extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f37036a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f37037b = 8;

        /* JADX WARN: Multi-variable type inference failed */
        private c() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    public static final class d extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f37038a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f37039b = 8;

        /* JADX WARN: Multi-variable type inference failed */
        private d() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    public static final class e extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f37040a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f37041b = 8;

        /* JADX WARN: Multi-variable type inference failed */
        private e() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ w(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private w(String str) {
        super(str);
    }

    public /* synthetic */ w(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, null);
    }
}
