package com.fourthline.orca.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface rv0 extends be1 {

    public static final class a implements rv0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32843a = new a();

        private a() {
        }
    }

    public static final class b implements rv0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f32844a;

        public b(Map attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            this.f32844a = attributes;
        }

        public final Map a() {
            return this.f32844a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f32844a, ((b) obj2).f32844a);
        }

        public int hashCode() {
            return this.f32844a.hashCode();
        }

        public String toString() {
            return "OnDocumentClosed(attributes=" + this.f32844a + ")";
        }
    }

    public static final class c implements rv0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f32845a = new c();

        private c() {
        }
    }

    public static final class d implements rv0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f32846a = new d();

        private d() {
        }
    }

    public static final class e implements rv0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f32847a = new e();

        private e() {
        }
    }
}
