package m4j;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.beneficiary.BankFieldDefinition;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f202736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f202737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BankFieldDefinition f202738c;

    public g(TextLocalisedClause title, ArrayList items, BankFieldDefinition bankFieldDefinition) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(bankFieldDefinition, "bankFieldDefinition");
        this.f202736a = title;
        this.f202737b = items;
        this.f202738c = bankFieldDefinition;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f202736a.equals(gVar.f202736a) && this.f202737b.equals(gVar.f202737b) && Intrinsics.f(this.f202738c, gVar.f202738c);
    }

    public final int hashCode() {
        return this.f202738c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f202737b, this.f202736a.hashCode() * 31, 31);
    }
}
