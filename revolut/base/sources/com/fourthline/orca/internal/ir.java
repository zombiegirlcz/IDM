package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface ir extends be1 {

    public static final class a implements ir {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29685a = new a();

        private a() {
        }
    }

    public static final class b implements ir {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29686a = new b();

        private b() {
        }
    }

    public static final class c implements ir {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DocumentType f29687a;

        public c(DocumentType documentType) {
            Intrinsics.checkNotNullParameter(documentType, "documentType");
            this.f29687a = documentType;
        }

        public final DocumentType a() {
            return this.f29687a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && this.f29687a == ((c) obj2).f29687a;
        }

        public int hashCode() {
            return this.f29687a.hashCode();
        }

        public String toString() {
            return "OnOptionClicked(documentType=" + this.f29687a + ")";
        }
    }

    public static final class d implements ir {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f29688a = new d();

        private d() {
        }
    }
}
