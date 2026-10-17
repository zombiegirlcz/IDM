package gu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e1 {

    @NotNull
    public static final d1 Companion = new d1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146736b;

    public /* synthetic */ e1(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(c1.f146721a.getDescriptor(), i, 3);
            throw null;
        }
        this.f146735a = str;
        this.f146736b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return Intrinsics.f(this.f146735a, e1Var.f146735a) && Intrinsics.f(this.f146736b, e1Var.f146736b);
    }

    public final int hashCode() {
        return this.f146736b.hashCode() + (this.f146735a.hashCode() * 31);
    }

    public e1(String title, String phone) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f146735a = title;
        this.f146736b = phone;
    }
}
