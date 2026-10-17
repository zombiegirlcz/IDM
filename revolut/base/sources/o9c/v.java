package o9c;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au0.q0 f223242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f223243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f223244c;

    public v(au0.q0 duoAvatar, TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(duoAvatar, "duoAvatar");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f223242a = duoAvatar;
        this.f223243b = title;
        this.f223244c = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f223242a.equals(vVar.f223242a) && this.f223243b.equals(vVar.f223243b) && this.f223244c.equals(vVar.f223244c);
    }

    public final int hashCode() {
        return this.f223244c.hashCode() + t61.a.a(this.f223242a.hashCode() * 31, 31, this.f223243b);
    }
}
