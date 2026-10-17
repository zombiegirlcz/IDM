package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface nx {

    public static final class a implements nx {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ip0 f31497a;

        public a(ip0 fileType) {
            Intrinsics.checkNotNullParameter(fileType, "fileType");
            this.f31497a = fileType;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && this.f31497a == ((a) obj2).f31497a;
        }

        public int hashCode() {
            return this.f31497a.hashCode();
        }

        public String toString() {
            return "ExceedMaxSize(fileType=" + this.f31497a + ")";
        }
    }

    public static final class b implements nx {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ip0 f31498a;

        public b(ip0 fileType) {
            Intrinsics.checkNotNullParameter(fileType, "fileType");
            this.f31498a = fileType;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && this.f31498a == ((b) obj2).f31498a;
        }

        public int hashCode() {
            return this.f31498a.hashCode();
        }

        public String toString() {
            return "IncorrectFormat(fileType=" + this.f31498a + ")";
        }
    }

    public static final class c implements nx {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ip0 f31499a;

        public c(ip0 fileType) {
            Intrinsics.checkNotNullParameter(fileType, "fileType");
            this.f31499a = fileType;
        }

        public ip0 a() {
            return this.f31499a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && this.f31499a == ((c) obj2).f31499a;
        }

        public int hashCode() {
            return this.f31499a.hashCode();
        }

        public String toString() {
            return "Success(fileType=" + this.f31499a + ")";
        }
    }
}
