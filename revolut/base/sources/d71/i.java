package d71;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f111767c;
    public final j d;
    public final String e;

    public i(String title, String content, j mainAction, j jVar, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(mainAction, "mainAction");
        this.f111765a = title;
        this.f111766b = content;
        this.f111767c = mainAction;
        this.d = jVar;
        this.e = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f111765a, iVar.f111765a) && Intrinsics.f(this.f111766b, iVar.f111766b) && Intrinsics.f(this.f111767c, iVar.f111767c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f111767c.hashCode() + p.a.c(this.f111765a.hashCode() * 31, 31, this.f111766b)) * 31;
        j jVar = this.d;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        String str = this.e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
