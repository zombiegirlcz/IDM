package tqj;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f273611b;

    public /* synthetic */ c(int i, long j2, String str) {
        if (3 != (i & 3)) {
            j1.f(a.f273609a.getDescriptor(), i, 3);
            throw null;
        }
        this.f273610a = str;
        this.f273611b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f273610a, cVar.f273610a) && this.f273611b == cVar.f273611b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f273611b) + (this.f273610a.hashCode() * 31);
    }

    public c(String categoryId, long j2) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f273610a = categoryId;
        this.f273611b = j2;
    }
}
