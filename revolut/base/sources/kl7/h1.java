package kl7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f185332a;

    public h1(ArrayList benefitCategories) {
        Intrinsics.checkNotNullParameter(benefitCategories, "benefitCategories");
        this.f185332a = benefitCategories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h1) && this.f185332a.equals(((h1) obj2).f185332a);
    }

    public final int hashCode() {
        return this.f185332a.hashCode();
    }
}
