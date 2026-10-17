package zme;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f323494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f323495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f323496c;

    public h(j type, String displayText, i iVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(displayText, "displayText");
        this.f323494a = type;
        this.f323495b = displayText;
        this.f323496c = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f323494a == hVar.f323494a && Intrinsics.f(this.f323495b, hVar.f323495b) && Intrinsics.f(this.f323496c, hVar.f323496c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f323494a.hashCode() * 31, 31, this.f323495b);
        i iVar = this.f323496c;
        return iC + (iVar == null ? 0 : iVar.hashCode());
    }
}
