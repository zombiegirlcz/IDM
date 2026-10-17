package oga;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f225076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f225077c;

    public j(String text, List params, i iVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f225075a = text;
        this.f225076b = params;
        this.f225077c = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f225075a, jVar.f225075a) && Intrinsics.f(this.f225076b, jVar.f225076b) && this.f225077c == jVar.f225077c;
    }

    public final int hashCode() {
        int iD = p.a.d(this.f225075a.hashCode() * 31, 31, this.f225076b);
        i iVar = this.f225077c;
        return iD + (iVar == null ? 0 : iVar.hashCode());
    }
}
