package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface is0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f29700b;

        public a(String filename, String downloadUrl) {
            Intrinsics.checkNotNullParameter(filename, "filename");
            Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
            this.f29699a = filename;
            this.f29700b = downloadUrl;
        }

        public final String a() {
            return this.f29700b;
        }

        public final String b() {
            return this.f29699a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f29699a, aVar.f29699a) && Intrinsics.f(this.f29700b, aVar.f29700b);
        }

        public int hashCode() {
            return (this.f29699a.hashCode() * 31) + this.f29700b.hashCode();
        }

        public String toString() {
            return "Input(filename=" + this.f29699a + ", downloadUrl=" + this.f29700b + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}
