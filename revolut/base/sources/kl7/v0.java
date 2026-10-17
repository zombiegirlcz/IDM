package kl7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f185396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185397b;

    public v0(String str, ArrayList description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f185396a = description;
        this.f185397b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return this.f185396a.equals(v0Var.f185396a) && Intrinsics.f(this.f185397b, v0Var.f185397b);
    }

    public final int hashCode() {
        int iHashCode = this.f185396a.hashCode() * 31;
        String str = this.f185397b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
