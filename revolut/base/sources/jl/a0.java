package jl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f175520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f175521b;

    public /* synthetic */ a0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f175520a = null;
        } else {
            this.f175520a = str;
        }
        if ((i & 2) == 0) {
            this.f175521b = null;
        } else {
            this.f175521b = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f175520a, a0Var.f175520a) && Intrinsics.f(this.f175521b, a0Var.f175521b);
    }

    public final int hashCode() {
        String str = this.f175520a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f175521b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return j6.a.s("DocumentTaskInput(preferredUserCountry=", this.f175520a, ", preferredUserDocumentType=", this.f175521b, ")");
    }
}
