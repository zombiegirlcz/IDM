package fv4;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f138325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f138326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f138327c;

    public f(Data content, String str, List pagerItems) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f138325a = pagerItems;
        this.f138326b = str;
        this.f138327c = content;
    }

    @Override // oki.a
    public final List W() {
        return this.f138325a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f138325a, fVar.f138325a) && Intrinsics.f(this.f138326b, fVar.f138326b) && Intrinsics.f(this.f138327c, fVar.f138327c);
    }

    public final int hashCode() {
        int iHashCode = this.f138325a.hashCode() * 31;
        String str = this.f138326b;
        return this.f138327c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // oki.a
    public final String z() {
        return this.f138326b;
    }
}
