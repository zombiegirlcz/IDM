package ggk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f143785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143787c;
    public final List d;
    public final w e;

    public v(q avatar, String title, String str, List accessoryTexts, w wVar) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accessoryTexts, "accessoryTexts");
        this.f143785a = avatar;
        this.f143786b = title;
        this.f143787c = str;
        this.d = accessoryTexts;
        this.e = wVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f143785a, vVar.f143785a) && Intrinsics.f(this.f143786b, vVar.f143786b) && Intrinsics.f(this.f143787c, vVar.f143787c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f143785a.hashCode() * 31, 31, this.f143786b);
        String str = this.f143787c;
        int iD = p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        w wVar = this.e;
        return iD + (wVar != null ? wVar.hashCode() : 0);
    }
}
