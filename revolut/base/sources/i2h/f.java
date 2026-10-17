package i2h;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1h.e f157934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f157935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f157936c;

    public f(y1h.e selectionType, Set selectedIds, Data data) {
        Intrinsics.checkNotNullParameter(selectionType, "selectionType");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        this.f157934a = selectionType;
        this.f157935b = selectedIds;
        this.f157936c = data;
    }

    public static f a(f fVar, Set selectedIds, Data data, int i) {
        y1h.e selectionType = fVar.f157934a;
        if ((i & 2) != 0) {
            selectedIds = fVar.f157935b;
        }
        if ((i & 4) != 0) {
            data = fVar.f157936c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(selectionType, "selectionType");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        return new f(selectionType, selectedIds, data);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f157934a == fVar.f157934a && Intrinsics.f(this.f157935b, fVar.f157935b) && Intrinsics.f(this.f157936c, fVar.f157936c);
    }

    public final int hashCode() {
        int iF = p.a.f(this.f157934a.hashCode() * 31, 31, this.f157935b);
        Data data = this.f157936c;
        return iF + (data == null ? 0 : data.hashCode());
    }
}
