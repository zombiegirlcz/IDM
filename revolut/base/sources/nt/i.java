package nt;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f218938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f218939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f218940c;

    public i(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f218938a = textLocalisedClause;
        this.f218939b = textLocalisedClause2;
        this.f218940c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f218940c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f218938a.equals(iVar.f218938a) && this.f218939b.equals(iVar.f218939b) && this.f218940c.equals(iVar.f218940c);
    }

    public final int hashCode() {
        return this.f218940c.hashCode() + t61.a.a(this.f218938a.hashCode() * 31, 31, this.f218939b);
    }
}
