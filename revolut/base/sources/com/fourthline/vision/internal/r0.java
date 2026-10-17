package com.fourthline.vision.internal;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface r0 {

    public static final class a implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Throwable f36746a;

        public a(Throwable th10) {
            this.f36746a = th10;
        }

        public static /* synthetic */ a copy$default(a aVar, Throwable th10, int i, Object obj2) {
            if ((i & 1) != 0) {
                th10 = aVar.f36746a;
            }
            return aVar.copy(th10);
        }

        public final Throwable component1() {
            return this.f36746a;
        }

        @NotNull
        public final a copy(Throwable th10) {
            return new a(th10);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f36746a, ((a) obj2).f36746a);
        }

        public final Throwable getThrowable() {
            return this.f36746a;
        }

        public int hashCode() {
            Throwable th10 = this.f36746a;
            if (th10 == null) {
                return 0;
            }
            return th10.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(throwable=" + this.f36746a + ")";
        }
    }

    public static final class b implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f36747a;

        public b(Uri uri2) {
            this.f36747a = uri2;
        }

        public static /* synthetic */ b copy$default(b bVar, Uri uri2, int i, Object obj2) {
            if ((i & 1) != 0) {
                uri2 = bVar.f36747a;
            }
            return bVar.copy(uri2);
        }

        public final Uri component1() {
            return this.f36747a;
        }

        @NotNull
        public final b copy(Uri uri2) {
            return new b(uri2);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f36747a, ((b) obj2).f36747a);
        }

        public final Uri getSavedUri() {
            return this.f36747a;
        }

        public int hashCode() {
            Uri uri2 = this.f36747a;
            if (uri2 == null) {
                return 0;
            }
            return uri2.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(savedUri=" + this.f36747a + ")";
        }
    }
}
