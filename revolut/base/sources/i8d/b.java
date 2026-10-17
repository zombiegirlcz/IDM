package i8d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f159501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f159502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f159503c;
    public final ArrayList d;

    public b(TextLocalisedClause screenTitle, TextLocalisedClause submitAction, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(screenTitle, "screenTitle");
        Intrinsics.checkNotNullParameter(submitAction, "submitAction");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f159501a = screenTitle;
        this.f159502b = submitAction;
        this.f159503c = z;
        this.d = items;
    }

    @Override // jki.n
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f159501a.equals(bVar.f159501a) && this.f159502b.equals(bVar.f159502b) && this.f159503c == bVar.f159503c && this.d.equals(bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(t61.a.a(this.f159501a.hashCode() * 31, 31, this.f159502b), 31, this.f159503c);
    }
}
