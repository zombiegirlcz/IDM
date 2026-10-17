package god;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f145135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f145136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f145137c;

    public c(aim.e items, TextLocalisedClause saveButtonText, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(saveButtonText, "saveButtonText");
        this.f145135a = items;
        this.f145136b = z;
        this.f145137c = saveButtonText;
    }

    @Override // cli.p
    public final List c() {
        return this.f145135a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f145135a, cVar.f145135a) && this.f145136b == cVar.f145136b && this.f145137c.equals(cVar.f145137c);
    }

    public final int hashCode() {
        return this.f145137c.hashCode() + j6.a.c(this.f145135a.hashCode() * 31, 31, this.f145136b);
    }
}
