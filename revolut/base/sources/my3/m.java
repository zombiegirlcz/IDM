package my3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f210333b;

    public m(String title, ArrayList options) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f210332a = title;
        this.f210333b = options;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f210332a, mVar.f210332a) && this.f210333b.equals(mVar.f210333b);
    }

    public final int hashCode() {
        return this.f210333b.hashCode() + (this.f210332a.hashCode() * 31);
    }
}
