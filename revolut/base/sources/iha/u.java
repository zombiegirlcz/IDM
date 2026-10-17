package iha;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f161356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f161357c;
    public final p d;
    public final List e;

    public u(String str, n content, l lVar, p pVar, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f161355a = str;
        this.f161356b = content;
        this.f161357c = lVar;
        this.d = pVar;
        this.e = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f161355a, uVar.f161355a) && Intrinsics.f(this.f161356b, uVar.f161356b) && Intrinsics.f(this.f161357c, uVar.f161357c) && Intrinsics.f(this.d, uVar.d) && Intrinsics.f(this.e, uVar.e);
    }

    public final int hashCode() {
        String str = this.f161355a;
        int iHashCode = (this.f161356b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        l lVar = this.f161357c;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        p pVar = this.d;
        int iHashCode3 = (iHashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        List list = this.e;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }
}
