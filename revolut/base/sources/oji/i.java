package oji;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f225798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f225799b = new AtomicBoolean(false);

    public i(Object obj2) {
        this.f225798a = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f225798a, ((i) obj2).f225798a);
    }

    public final int hashCode() {
        Object obj2 = this.f225798a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }
}
