package soh;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f264839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f264840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f264841c;

    public i(BigDecimal value, g type, h valueIncluded) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(valueIncluded, "valueIncluded");
        this.f264839a = value;
        this.f264840b = type;
        this.f264841c = valueIncluded;
    }

    public static i a(i iVar, BigDecimal value) {
        g type = iVar.f264840b;
        h valueIncluded = iVar.f264841c;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(valueIncluded, "valueIncluded");
        return new i(value, type, valueIncluded);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f264839a, iVar.f264839a) && this.f264840b == iVar.f264840b && this.f264841c == iVar.f264841c;
    }

    public final int hashCode() {
        return this.f264841c.hashCode() + ((this.f264840b.hashCode() + (this.f264839a.hashCode() * 31)) * 31);
    }
}
