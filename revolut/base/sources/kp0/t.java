package kp0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f188094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f188095c;

    public t(String emojis, Integer num, TextLocalisedClause contentDescription) {
        Intrinsics.checkNotNullParameter(emojis, "emojis");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.f188093a = emojis;
        this.f188094b = num;
        this.f188095c = contentDescription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f188093a, tVar.f188093a) && Intrinsics.f(this.f188094b, tVar.f188094b) && this.f188095c.equals(tVar.f188095c);
    }

    public final int hashCode() {
        int iHashCode = this.f188093a.hashCode() * 31;
        Integer num = this.f188094b;
        return this.f188095c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }
}
