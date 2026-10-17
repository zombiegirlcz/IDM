package hlb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f153429a;

    public f(Data infoSheetData) {
        Intrinsics.checkNotNullParameter(infoSheetData, "infoSheetData");
        this.f153429a = infoSheetData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f153429a, ((f) obj2).f153429a);
    }

    public final int hashCode() {
        return this.f153429a.hashCode();
    }
}
