package com.fourthline.orca.internal;

import com.fourthline.orca.internal.tr0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface rr0 extends be1 {

    public static final class a implements rr0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f32808a;

        public a(boolean z) {
            this.f32808a = z;
        }

        public final boolean a() {
            return this.f32808a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && this.f32808a == ((a) obj2).f32808a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f32808a);
        }

        public String toString() {
            return "OnClaimsToggled(isChecked=" + this.f32808a + ")";
        }
    }

    public static final class b implements rr0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final tr0.a.InterfaceC0287a f32809a;

        public b(tr0.a.InterfaceC0287a document) {
            Intrinsics.checkNotNullParameter(document, "document");
            this.f32809a = document;
        }

        public final tr0.a.InterfaceC0287a a() {
            return this.f32809a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f32809a, ((b) obj2).f32809a);
        }

        public int hashCode() {
            return this.f32809a.hashCode();
        }

        public String toString() {
            return "OnDocumentClicked(document=" + this.f32809a + ")";
        }
    }

    public static final class c implements rr0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f32810a = new c();

        private c() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof c);
        }

        public int hashCode() {
            return 1141629360;
        }

        public String toString() {
            return "OnPrimaryButtonClicked";
        }
    }

    public static final class d implements rr0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f32811a = new d();

        private d() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof d);
        }

        public int hashCode() {
            return 1360744296;
        }

        public String toString() {
            return "OnScreenShown";
        }
    }

    public static final class e implements rr0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f32812a = new e();

        private e() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof e);
        }

        public int hashCode() {
            return -270590914;
        }

        public String toString() {
            return "OnSecondaryButtonClicked";
        }
    }

    public static final class f implements rr0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f32813a = new f();

        private f() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof f);
        }

        public int hashCode() {
            return -2034244876;
        }

        public String toString() {
            return "OnShowLessClicked";
        }
    }

    public static final class g implements rr0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f32814a = new g();

        private g() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof g);
        }

        public int hashCode() {
            return 1676549560;
        }

        public String toString() {
            return "OnShowMoreClicked";
        }
    }

    public static final class h implements rr0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f32815a;

        public h(boolean z) {
            this.f32815a = z;
        }

        public final boolean a() {
            return this.f32815a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof h) && this.f32815a == ((h) obj2).f32815a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f32815a);
        }

        public String toString() {
            return "OnTermsToggled(isChecked=" + this.f32815a + ")";
        }
    }
}
