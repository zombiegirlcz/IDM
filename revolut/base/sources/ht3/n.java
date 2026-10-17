package ht3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements Serializable {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f155290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155292c;
    public final f d;
    public final boolean e;

    public n(l mode, String str, String str2, f contentType, boolean z) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f155290a = mode;
        this.f155291b = str;
        this.f155292c = str2;
        this.d = contentType;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f155290a == nVar.f155290a && Intrinsics.f(this.f155291b, nVar.f155291b) && Intrinsics.f(this.f155292c, nVar.f155292c) && this.d == nVar.d && this.e == nVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f155290a.hashCode() * 31;
        String str = this.f155291b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f155292c;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }
}
