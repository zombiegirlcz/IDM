package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class b9 {

    @NotNull
    public static final a9 Companion = new a9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153040b;

    public /* synthetic */ b9(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(z8.f153399a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153039a = str;
        this.f153040b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b9)) {
            return false;
        }
        b9 b9Var = (b9) obj2;
        return Intrinsics.f(this.f153039a, b9Var.f153039a) && Intrinsics.f(this.f153040b, b9Var.f153040b);
    }

    public final int hashCode() {
        return this.f153040b.hashCode() + (this.f153039a.hashCode() * 31);
    }

    public b9(String date, String applicationFormId) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
        this.f153039a = date;
        this.f153040b = applicationFormId;
    }
}
