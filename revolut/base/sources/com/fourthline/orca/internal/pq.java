package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface pq extends be1 {

    public static final class a implements pq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32022a = new a();

        private a() {
        }
    }

    public static final class b implements pq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32023a = new b();

        private b() {
        }
    }

    public static final class c implements pq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f32024a = new c();

        private c() {
        }
    }

    public static final class d implements pq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DocumentType f32025a;

        public d(DocumentType documentType) {
            Intrinsics.checkNotNullParameter(documentType, "documentType");
            this.f32025a = documentType;
        }

        public final DocumentType a() {
            return this.f32025a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && this.f32025a == ((d) obj2).f32025a;
        }

        public int hashCode() {
            return this.f32025a.hashCode();
        }

        public String toString() {
            return "OnOptionClicked(documentType=" + this.f32025a + ")";
        }
    }

    public static final class e implements pq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f32026a = new e();

        private e() {
        }
    }
}
