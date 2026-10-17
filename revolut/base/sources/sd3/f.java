package sd3;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f261811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f261812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f261813c;

    public f(Data transactionsData, ArrayList activeSourceTypes, h selectedSourceTypeFilter) {
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        Intrinsics.checkNotNullParameter(activeSourceTypes, "activeSourceTypes");
        Intrinsics.checkNotNullParameter(selectedSourceTypeFilter, "selectedSourceTypeFilter");
        this.f261811a = transactionsData;
        this.f261812b = activeSourceTypes;
        this.f261813c = selectedSourceTypeFilter;
    }

    public static f a(f fVar, Data transactionsData, h selectedSourceTypeFilter, int i) {
        if ((i & 1) != 0) {
            transactionsData = fVar.f261811a;
        }
        ArrayList activeSourceTypes = fVar.f261812b;
        if ((i & 4) != 0) {
            selectedSourceTypeFilter = fVar.f261813c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        Intrinsics.checkNotNullParameter(activeSourceTypes, "activeSourceTypes");
        Intrinsics.checkNotNullParameter(selectedSourceTypeFilter, "selectedSourceTypeFilter");
        return new f(transactionsData, activeSourceTypes, selectedSourceTypeFilter);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f261811a, fVar.f261811a) && this.f261812b.equals(fVar.f261812b) && Intrinsics.f(this.f261813c, fVar.f261813c);
    }

    public final int hashCode() {
        return this.f261813c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f261812b, this.f261811a.hashCode() * 31, 31);
    }
}
