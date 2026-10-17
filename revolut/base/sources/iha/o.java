package iha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f161344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f161345c;

    public o(i iVar, String text, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f161343a = text;
        this.f161344b = iVar;
        this.f161345c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f161343a, oVar.f161343a) && Intrinsics.f(this.f161344b, oVar.f161344b) && Intrinsics.f(this.f161345c, oVar.f161345c);
    }

    public final int hashCode() {
        int iHashCode = this.f161343a.hashCode() * 31;
        i iVar = this.f161344b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str = this.f161345c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
