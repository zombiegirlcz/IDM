package com.fourthline.orca.internal;

import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface c81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27404a = a.f27405a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f27405a = new a();

        private a() {
        }

        public final d a(int i, int i2) {
            return new d(i, i2);
        }

        public final d b(int i) {
            return a(R.string.shared_validation_required, i);
        }

        public static /* synthetic */ d a(a aVar, int i, int i2, int i3, Object obj2) {
            if ((i3 & 2) != 0) {
                i2 = i;
            }
            return aVar.a(i, i2);
        }

        public final c a(int i, String... arguments) {
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            return new c(i, zhm.p.c(arguments));
        }

        public static /* synthetic */ d a(a aVar, int i, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                i = R.string.shared_validation_invalid;
            }
            return aVar.a(i);
        }

        public final d a(int i) {
            return a(R.string.shared_validation_invalid, i);
        }
    }

    public static final class b implements c81 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f27406b = new b();

        private b() {
        }
    }

    public static final class c implements c81 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f27407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f27408c;

        public c(int i, List arguments) {
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            this.f27407b = i;
            this.f27408c = arguments;
        }

        public final List a() {
            return this.f27408c;
        }

        public final int b() {
            return this.f27407b;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return this.f27407b == cVar.f27407b && Intrinsics.f(this.f27408c, cVar.f27408c);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f27407b) * 31) + this.f27408c.hashCode();
        }

        public String toString() {
            return "Formatted(resource=" + this.f27407b + ", arguments=" + this.f27408c + ")";
        }
    }

    public static final class e implements c81 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27411b;

        public e(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f27411b = value;
        }

        public final String a() {
            return this.f27411b;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof e) && Intrinsics.f(this.f27411b, ((e) obj2).f27411b);
        }

        public int hashCode() {
            return this.f27411b.hashCode();
        }

        public String toString() {
            return "SimpleString(value=" + this.f27411b + ")";
        }
    }

    public static final class d implements c81 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f27409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f27410c;

        public d(int i, int i2) {
            this.f27409b = i;
            this.f27410c = i2;
        }

        public final int a() {
            return this.f27410c;
        }

        public final int b() {
            return this.f27409b;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return this.f27409b == dVar.f27409b && this.f27410c == dVar.f27410c;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f27409b) * 31) + Integer.hashCode(this.f27410c);
        }

        public String toString() {
            return "Localised(resource=" + this.f27409b + ", accessibilityResource=" + this.f27410c + ")";
        }

        public /* synthetic */ d(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? i : i2);
        }
    }
}
