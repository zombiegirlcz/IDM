package io.ktor.utils.io;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f163031a;

    public a(Throwable th10) {
        this.f163031a = th10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f163031a, ((a) obj2).f163031a);
    }

    public final int hashCode() {
        Throwable th10 = this.f163031a;
        if (th10 == null) {
            return 0;
        }
        return th10.hashCode();
    }

    public final String toString() {
        return "Closed(cause=" + this.f163031a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
