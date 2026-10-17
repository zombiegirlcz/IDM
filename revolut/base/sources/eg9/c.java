package eg9;

import cli.j;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f125571b;

    public c(String title, ArrayList fields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.f125570a = title;
        this.f125571b = fields;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f125570a, cVar.f125570a) && this.f125571b.equals(cVar.f125571b);
    }

    public final int hashCode() {
        return this.f125571b.hashCode() + (this.f125570a.hashCode() * 31);
    }
}
