package et0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.v7;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f129070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f129071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f129072c;
    public final Float d;
    public final Function0 e;

    public m(Image image, Clause clause, TextClause textClause, Float f, k8e.a aVar) {
        this.f129070a = image;
        this.f129071b = clause;
        this.f129072c = textClause;
        this.d = f;
        this.e = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f129070a.equals(mVar.f129070a) && Intrinsics.f(this.f129071b, mVar.f129071b) && this.f129072c.equals(mVar.f129072c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f129070a.hashCode() * 31;
        Clause clause = this.f129071b;
        int iB = v7.b((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f129072c);
        Float f = this.d;
        int iHashCode2 = (iB + (f == null ? 0 : f.hashCode())) * 31;
        Function0 function0 = this.e;
        return iHashCode2 + (function0 != null ? function0.hashCode() : 0);
    }
}
