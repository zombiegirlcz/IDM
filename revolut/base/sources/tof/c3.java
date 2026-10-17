package tof;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f272664c;
    public final Map d;

    public c3(String str, String str2, i iVar, Map map) {
        this.f272662a = str;
        this.f272663b = str2;
        this.f272664c = iVar;
        this.d = map;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj2;
        return Intrinsics.f(this.f272662a, c3Var.f272662a) && Intrinsics.f(this.f272663b, c3Var.f272663b) && this.f272664c == c3Var.f272664c && Intrinsics.f(this.d, c3Var.d);
    }

    public final String getId() {
        return this.f272662a;
    }

    public final int hashCode() {
        String str = this.f272662a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f272663b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        i iVar = this.f272664c;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Map map = this.d;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }
}
