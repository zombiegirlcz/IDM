package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface zn0 extends be1 {

    public static final class a implements zn0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35645a = new a();

        private a() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return 1163414859;
        }

        public String toString() {
            return "OnBackButtonClicked";
        }
    }

    public static final class b implements zn0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f35646a = new b();

        private b() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return -662581369;
        }

        public String toString() {
            return "OnChangeDocumentButtonClicked";
        }
    }

    public static final class c implements zn0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f35647a = new c();

        private c() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof c);
        }

        public int hashCode() {
            return 1343303278;
        }

        public String toString() {
            return "OnCloseEnlargedButtonClicked";
        }
    }

    public static final class d implements zn0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f35648a = new d();

        private d() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof d);
        }

        public int hashCode() {
            return -392241608;
        }

        public String toString() {
            return "OnConfirmButtonClicked";
        }
    }

    public static final class e implements zn0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f35649a;

        public e(Bitmap image) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.f35649a = image;
        }

        public final Bitmap a() {
            return this.f35649a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof e) && Intrinsics.f(this.f35649a, ((e) obj2).f35649a);
        }

        public int hashCode() {
            return this.f35649a.hashCode();
        }

        public String toString() {
            return "OnEnlargedButtonClicked(image=" + this.f35649a + ")";
        }
    }

    public static final class f implements zn0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f35650a = new f();

        private f() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof f);
        }

        public int hashCode() {
            return 1678463010;
        }

        public String toString() {
            return "OnScreenShown";
        }
    }
}
