package kotlin.reflect;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wim.s;
import wim.t;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "Companion", "a", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class KTypeProjection {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final KTypeProjection f186454c = new KTypeProjection(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f186455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KType f186456b;

    /* JADX INFO: renamed from: kotlin.reflect.KTypeProjection$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/KTypeProjection$a;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static KTypeProjection a(KType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new KTypeProjection(t.INVARIANT, type);
        }
    }

    public KTypeProjection(t tVar, KType kType) {
        String str;
        this.f186455a = tVar;
        this.f186456b = kType;
        if ((tVar == null) == (kType == null)) {
            return;
        }
        if (tVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + tVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) obj2;
        return this.f186455a == kTypeProjection.f186455a && Intrinsics.f(this.f186456b, kTypeProjection.f186456b);
    }

    public final int hashCode() {
        t tVar = this.f186455a;
        int iHashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
        KType kType = this.f186456b;
        return iHashCode + (kType != null ? kType.hashCode() : 0);
    }

    public final String toString() {
        t tVar = this.f186455a;
        int i = tVar == null ? -1 : s.f297945a[tVar.ordinal()];
        if (i == -1) {
            return "*";
        }
        KType kType = this.f186456b;
        if (i == 1) {
            return String.valueOf(kType);
        }
        if (i == 2) {
            return "in " + kType;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + kType;
    }
}
