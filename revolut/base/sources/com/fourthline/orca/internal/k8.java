package com.fourthline.orca.internal;

import com.fourthline.orca.core.ProductConfig;
import com.fourthline.orca.core.ProductCustomization;
import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface k8 extends qg0 {

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.k8$a$a, reason: collision with other inner class name */
        public static final class C0234a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0234a f30177b = new C0234a();

            private C0234a() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof C0234a);
            }

            @Override // com.fourthline.orca.internal.k8.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.k8.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return -883888139;
            }

            public String toString() {
                return "OnDeviceCompromised";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Throwable f30178b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final ProductConfig f30179c;
            private final lg1 d;
            private final String e;

            public b(Throwable error, ProductConfig productConfig, lg1 networkConfig) {
                Intrinsics.checkNotNullParameter(error, "error");
                Intrinsics.checkNotNullParameter(productConfig, "productConfig");
                Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
                this.f30178b = error;
                this.f30179c = productConfig;
                this.d = networkConfig;
                this.e = "product-failed";
            }

            public final Throwable a() {
                return this.f30178b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.f30178b, bVar.f30178b) && Intrinsics.f(this.f30179c, bVar.f30179c) && Intrinsics.f(this.d, bVar.d);
            }

            @Override // com.fourthline.orca.internal.k8.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public String getEventName() {
                return this.e;
            }

            @Override // com.fourthline.orca.internal.k8.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return (((this.f30178b.hashCode() * 31) + this.f30179c.hashCode()) * 31) + this.d.hashCode();
            }

            public String toString() {
                return "OnProductFailed(error=" + this.f30178b + ", productConfig=" + this.f30179c + ", networkConfig=" + this.d + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ProductConfig f30180b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final lg1 f30181c;
            private final ProductCustomization d;
            private final String e;

            public c(ProductConfig productConfig, lg1 networkConfig, ProductCustomization customization) {
                Intrinsics.checkNotNullParameter(productConfig, "productConfig");
                Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
                Intrinsics.checkNotNullParameter(customization, "customization");
                this.f30180b = productConfig;
                this.f30181c = networkConfig;
                this.d = customization;
                this.e = "product-started";
            }

            public final ProductCustomization a() {
                return this.d;
            }

            public final ProductConfig b() {
                return this.f30180b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof c)) {
                    return false;
                }
                c cVar = (c) obj2;
                return Intrinsics.f(this.f30180b, cVar.f30180b) && Intrinsics.f(this.f30181c, cVar.f30181c) && Intrinsics.f(this.d, cVar.d);
            }

            @Override // com.fourthline.orca.internal.k8.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public String getEventName() {
                return this.e;
            }

            @Override // com.fourthline.orca.internal.k8.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return (((this.f30180b.hashCode() * 31) + this.f30181c.hashCode()) * 31) + this.d.hashCode();
            }

            public String toString() {
                return "OnProductStart(productConfig=" + this.f30180b + ", networkConfig=" + this.f30181c + ", customization=" + this.d + ")";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Object f30182b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final ProductConfig f30183c;
            private final lg1 d;
            private final String e;

            public d(Object result, ProductConfig productConfig, lg1 networkConfig) {
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(productConfig, "productConfig");
                Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
                this.f30182b = result;
                this.f30183c = productConfig;
                this.d = networkConfig;
                this.e = "product-completed";
            }

            public final Object a() {
                return this.f30182b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof d)) {
                    return false;
                }
                d dVar = (d) obj2;
                return Intrinsics.f(this.f30182b, dVar.f30182b) && Intrinsics.f(this.f30183c, dVar.f30183c) && Intrinsics.f(this.d, dVar.d);
            }

            @Override // com.fourthline.orca.internal.k8.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public String getEventName() {
                return this.e;
            }

            @Override // com.fourthline.orca.internal.k8.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return (((this.f30182b.hashCode() * 31) + this.f30183c.hashCode()) * 31) + this.d.hashCode();
            }

            public String toString() {
                return "OnProductSuccess(result=" + this.f30182b + ", productConfig=" + this.f30183c + ", networkConfig=" + this.d + ")";
            }
        }

        @Override // com.fourthline.orca.internal.qg0.a, ib.f
        @NotNull
        default Map getAttributes() {
            return zhm.r0.g();
        }

        @Override // com.fourthline.orca.internal.qg0.a, ib.f
        @NotNull
        /* bridge */ /* synthetic */ default String getSchema() {
            return "";
        }
    }

    private default void a() {
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(uq0.f34161b);
        }
    }

    default void onProductFailed(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
    }

    default void onProductStart(ProductConfig productConfig, ProductCustomization customization) {
        Intrinsics.checkNotNullParameter(productConfig, "productConfig");
        Intrinsics.checkNotNullParameter(customization, "customization");
    }

    default void onProductSuccess(Object result) {
        Intrinsics.checkNotNullParameter(result, "result");
    }

    default void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.C0234a) {
            a();
            return;
        }
        if (event instanceof a.c) {
            a.c cVar = (a.c) event;
            onProductStart(cVar.b(), cVar.a());
        } else if (event instanceof a.d) {
            onProductSuccess(((a.d) event).a());
        } else {
            if (!(event instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            onProductFailed(((a.b) event).a());
        }
    }
}
