package ip0;

import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class iy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f164755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f164756b;

    public iy(String text, Integer num) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f164755a = new TextClause(text, (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126);
        this.f164756b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof iy)) {
            return false;
        }
        iy iyVar = (iy) obj2;
        return Intrinsics.f(this.f164755a, iyVar.f164755a) && Intrinsics.f(this.f164756b, iyVar.f164756b);
    }

    public final int hashCode() {
        TextClause textClause = this.f164755a;
        int iHashCode = (textClause == null ? 0 : textClause.hashCode()) * 31;
        Integer num = this.f164756b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
