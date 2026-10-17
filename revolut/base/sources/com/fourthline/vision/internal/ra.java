package com.fourthline.vision.internal;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ra extends Throwable {

    public static class a extends ra {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final pa f36771a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull pa error, String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f36771a = error;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!getClass().equals(obj2 != null ? obj2.getClass() : null)) {
                return false;
            }
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.fourthline.vision.internal.scanner.ScannerException.Error");
            return this.f36771a == ((a) obj2).f36771a;
        }

        @NotNull
        public final pa getError() {
            return this.f36771a;
        }

        public int hashCode() {
            return this.f36771a.hashCode();
        }

        public /* synthetic */ a(pa paVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(paVar, (i & 2) != 0 ? null : str);
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f36772b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f36773c = 8;

        /* JADX WARN: Multi-variable type inference failed */
        private b() {
            super(pa.f36703n, null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f36774b = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f36775c = 8;

        /* JADX WARN: Multi-variable type inference failed */
        private c() {
            super(pa.f36704p, null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class d extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f36776b = new d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f36777c = 8;

        /* JADX WARN: Multi-variable type inference failed */
        private d() {
            super(pa.f36696b, null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class e extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f36778b = new e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f36779c = 8;

        /* JADX WARN: Multi-variable type inference failed */
        private e() {
            super(pa.f36700j, null, 2, 0 == true ? 1 : 0);
        }
    }

    public static abstract class f extends ra {

        public static final class a extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f36780a = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f36781b = 8;

            /* JADX WARN: Multi-variable type inference failed */
            private a() {
                super(null, 0 == true ? 1 : 0);
            }
        }

        public /* synthetic */ f(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private f(String str) {
            super(str, null);
        }
    }

    public static final class g extends ra {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f36782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f36783b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@NotNull List<? extends Enum<?>> warnings, String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(warnings, "warnings");
            this.f36782a = warnings;
            this.f36783b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ g copy$default(g gVar, List list, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                list = gVar.f36782a;
            }
            if ((i & 2) != 0) {
                str = gVar.f36783b;
            }
            return gVar.copy(list, str);
        }

        @NotNull
        public final List<Enum<?>> component1() {
            return this.f36782a;
        }

        public final String component2() {
            return this.f36783b;
        }

        @NotNull
        public final g copy(@NotNull List<? extends Enum<?>> warnings, String str) {
            Intrinsics.checkNotNullParameter(warnings, "warnings");
            return new g(warnings, str);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof g)) {
                return false;
            }
            g gVar = (g) obj2;
            return Intrinsics.f(this.f36782a, gVar.f36782a) && Intrinsics.f(this.f36783b, gVar.f36783b);
        }

        public final String getMsg() {
            return this.f36783b;
        }

        @NotNull
        public final List<Enum<?>> getWarnings() {
            return this.f36782a;
        }

        public int hashCode() {
            int iHashCode = this.f36782a.hashCode() * 31;
            String str = this.f36783b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "Warning(warnings=" + this.f36782a + ", msg=" + this.f36783b + ")";
        }

        public /* synthetic */ g(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : str);
        }
    }

    public static final class h extends ra {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Throwable f36784a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(@NotNull Throwable throwable) {
            super(throwable.getMessage(), null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.f36784a = throwable;
        }

        public static /* synthetic */ h copy$default(h hVar, Throwable th10, int i, Object obj2) {
            if ((i & 1) != 0) {
                th10 = hVar.f36784a;
            }
            return hVar.copy(th10);
        }

        @NotNull
        public final Throwable component1() {
            return this.f36784a;
        }

        @NotNull
        public final h copy(@NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new h(throwable);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof h) && Intrinsics.f(this.f36784a, ((h) obj2).f36784a);
        }

        @NotNull
        public final Throwable getThrowable() {
            return this.f36784a;
        }

        public int hashCode() {
            return this.f36784a.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "Wrapper(throwable=" + this.f36784a + ")";
        }
    }

    public /* synthetic */ ra(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private ra(String str) {
        super(str);
    }
}
