package ggk;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f143788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143790c;
    public final ArrayList d;

    public w(q qVar, String title, String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f143788a = qVar;
        this.f143789b = title;
        this.f143790c = str;
        this.d = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f143788a, wVar.f143788a) && Intrinsics.f(this.f143789b, wVar.f143789b) && Intrinsics.f(this.f143790c, wVar.f143790c) && this.d.equals(wVar.d);
    }

    public final int hashCode() {
        q qVar = this.f143788a;
        int iC = p.a.c((qVar == null ? 0 : qVar.hashCode()) * 31, 31, this.f143789b);
        String str = this.f143790c;
        return this.d.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31);
    }
}
