package hs3;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class w0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f154961c;
    public final HashMap d;

    public w0(String storyName, String str, u0 u0Var, HashMap map) {
        Intrinsics.checkNotNullParameter(storyName, "storyName");
        this.f154959a = storyName;
        this.f154960b = str;
        this.f154961c = u0Var;
        this.d = map;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Intrinsics.f(this.f154959a, w0Var.f154959a) && Intrinsics.f(this.f154960b, w0Var.f154960b) && Intrinsics.f(this.f154961c, w0Var.f154961c) && Intrinsics.f(this.d, w0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f154959a.hashCode() * 31;
        String str = this.f154960b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        u0 u0Var = this.f154961c;
        int iHashCode3 = (iHashCode2 + (u0Var == null ? 0 : u0Var.hashCode())) * 31;
        HashMap map = this.d;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }
}
