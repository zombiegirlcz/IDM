package nig;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f216097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f216098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f216099c;

    public c(String str, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f216097a = items;
        this.f216098b = str;
        this.f216099c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f216097a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f216097a.equals(cVar.f216097a) && Intrinsics.f(this.f216098b, cVar.f216098b) && this.f216099c == cVar.f216099c;
    }

    public final int hashCode() {
        int iHashCode = this.f216097a.hashCode() * 31;
        String str = this.f216098b;
        return Boolean.hashCode(this.f216099c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
