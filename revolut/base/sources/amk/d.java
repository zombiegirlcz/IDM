package amk;

import cli.j;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f6468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6469b;

    public d(Data title, List documents) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f6468a = title;
        this.f6469b = documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f6468a, dVar.f6468a) && Intrinsics.f(this.f6469b, dVar.f6469b);
    }

    public final int hashCode() {
        return this.f6469b.hashCode() + (this.f6468a.hashCode() * 31);
    }
}
