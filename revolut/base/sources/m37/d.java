package m37;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f202294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f202295b;

    public d(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        this.f202294a = textLocalisedClause;
        this.f202295b = textLocalisedClause2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f202294a.equals(dVar.f202294a) && this.f202295b.equals(dVar.f202295b);
    }

    public final int hashCode() {
        return this.f202295b.hashCode() + (this.f202294a.hashCode() * 31);
    }
}
