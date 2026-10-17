package n61;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f212676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f212677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f212678c;

    public c(CompositeClause compositeClause, String str, ArrayList fieldTypes) {
        Intrinsics.checkNotNullParameter(fieldTypes, "fieldTypes");
        this.f212676a = compositeClause;
        this.f212677b = str;
        this.f212678c = fieldTypes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f212676a, cVar.f212676a) && Intrinsics.f(this.f212677b, cVar.f212677b) && this.f212678c.equals(cVar.f212678c);
    }

    public final int hashCode() {
        Clause clause = this.f212676a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        String str = this.f212677b;
        return this.f212678c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
