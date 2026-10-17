package fad;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f133279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f133280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f133281c;

    public e(TextLocalisedClause title, TextLocalisedClause subtitle, TextLocalisedClause hint) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f133279a = title;
        this.f133280b = subtitle;
        this.f133281c = hint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f133279a.equals(eVar.f133279a) && this.f133280b.equals(eVar.f133280b) && this.f133281c.equals(eVar.f133281c);
    }

    public final int hashCode() {
        return this.f133281c.hashCode() + t61.a.a(this.f133279a.hashCode() * 31, 31, this.f133280b);
    }
}
