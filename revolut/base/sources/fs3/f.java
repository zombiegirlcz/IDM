package fs3;

import ft3.d1;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements Serializable {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f137580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f137582c;
    public final List d;

    public f(d1 productClassification, String str, String str2, List tags) {
        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f137580a = productClassification;
        this.f137581b = str;
        this.f137582c = str2;
        this.d = tags;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f137580a, fVar.f137580a) && Intrinsics.f(this.f137581b, fVar.f137581b) && Intrinsics.f(this.f137582c, fVar.f137582c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f137580a.hashCode() * 31;
        String str = this.f137581b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f137582c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
