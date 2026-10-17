package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class te {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f166509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f166510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f166511c;
    public final int d;

    public te(TextLocalisedClause textLocalisedClause, ArrayList values, Integer num, int i) {
        textLocalisedClause = (i & 1) != 0 ? null : textLocalisedClause;
        int size = values.size() - 1;
        Intrinsics.checkNotNullParameter(values, "values");
        this.f166509a = textLocalisedClause;
        this.f166510b = values;
        this.f166511c = num;
        this.d = size;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof te)) {
            return false;
        }
        te teVar = (te) obj2;
        return Intrinsics.f(this.f166509a, teVar.f166509a) && Intrinsics.f(this.f166510b, teVar.f166510b) && Intrinsics.f(this.f166511c, teVar.f166511c) && this.d == teVar.d;
    }

    public final int hashCode() {
        Clause clause = this.f166509a;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f166510b, (clause == null ? 0 : clause.hashCode()) * 31, 31);
        Integer num = this.f166511c;
        return Integer.hashCode(0) + j6.a.b(this.d, (iB + (num == null ? 0 : num.hashCode())) * 31, 31);
    }
}
