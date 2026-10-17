package ya5;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f311933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f311934b;

    public f(Data screenContent, String str) {
        Intrinsics.checkNotNullParameter(screenContent, "screenContent");
        this.f311933a = screenContent;
        this.f311934b = str;
    }

    public static f a(f fVar, Data screenContent, String str, int i) {
        if ((i & 1) != 0) {
            screenContent = fVar.f311933a;
        }
        if ((i & 2) != 0) {
            str = fVar.f311934b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(screenContent, "screenContent");
        return new f(screenContent, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f311933a, fVar.f311933a) && Intrinsics.f(this.f311934b, fVar.f311934b);
    }

    public final int hashCode() {
        int iHashCode = this.f311933a.hashCode() * 31;
        String str = this.f311934b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
