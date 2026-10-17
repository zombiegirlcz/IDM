package pwc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f240413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f240414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f240415c;
    public final Clause d;
    public final TextLocalisedClause e;
    public final List f;

    public q(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause buttonText, ArrayList items, List menuItems, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f240413a = z;
        this.f240414b = items;
        this.f240415c = title;
        this.d = textLocalisedClause;
        this.e = buttonText;
        this.f = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f240414b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f240413a == qVar.f240413a && this.f240414b.equals(qVar.f240414b) && this.f240415c.equals(qVar.f240415c) && Intrinsics.f(this.d, qVar.d) && this.e.equals(qVar.e) && Intrinsics.f(this.f, qVar.f);
    }

    public final int hashCode() {
        int iA = t61.a.a(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f240414b, Boolean.hashCode(this.f240413a) * 31, 31), 31, this.f240415c);
        Clause clause = this.d;
        return this.f.hashCode() + t61.a.a((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.e);
    }
}
