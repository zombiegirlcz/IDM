package a2l;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f916b;

    public m(String title, ArrayList buttons) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f915a = title;
        this.f916b = buttons;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f915a, mVar.f915a) && this.f916b.equals(mVar.f916b);
    }

    public final int hashCode() {
        return this.f916b.hashCode() + (this.f915a.hashCode() * 31);
    }
}
