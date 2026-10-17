package vg0;

import androidx.credentials.exceptions.NoCredentialException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class k0 implements o0 {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NoCredentialException f288706a;

    public k0(NoCredentialException throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f288706a = throwable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && this.f288706a.equals(((k0) obj2).f288706a);
    }

    public final int hashCode() {
        return this.f288706a.hashCode();
    }
}
