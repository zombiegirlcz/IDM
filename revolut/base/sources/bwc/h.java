package bwc;

import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f19315c;
    public final boolean d;

    public h(ArrayList tabs, String str, TextLocalisedClause description, boolean z) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f19313a = tabs;
        this.f19314b = str;
        this.f19315c = description;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f19313a.equals(hVar.f19313a) && Intrinsics.f(this.f19314b, hVar.f19314b) && this.f19315c.equals(hVar.f19315c) && this.d == hVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f19313a.hashCode() * 31;
        String str = this.f19314b;
        return Boolean.hashCode(this.d) + t61.a.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f19315c);
    }
}
