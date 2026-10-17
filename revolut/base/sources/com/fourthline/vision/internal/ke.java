package com.fourthline.vision.internal;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface ke {

    public static final class a extends Throwable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Throwable f36456a;

        public a(Throwable th10) {
            super(th10);
            this.f36456a = th10;
        }

        public static /* synthetic */ a copy$default(a aVar, Throwable th10, int i, Object obj2) {
            if ((i & 1) != 0) {
                th10 = aVar.f36456a;
            }
            return aVar.copy(th10);
        }

        public final Throwable component1() {
            return this.f36456a;
        }

        @NotNull
        public final a copy(Throwable th10) {
            return new a(th10);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f36456a, ((a) obj2).f36456a);
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f36456a;
        }

        public int hashCode() {
            Throwable th10 = this.f36456a;
            if (th10 == null) {
                return 0;
            }
            return th10.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "RecordingFailed(cause=" + this.f36456a + ")";
        }
    }

    Object stop(@NotNull Continuation<? super Uri> continuation);
}
