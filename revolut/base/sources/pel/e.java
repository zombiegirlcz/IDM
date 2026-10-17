package pel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f235400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f8l.c f235401c;

    public e(String id10, BigDecimal fraction, f8l.c inputAssetType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(fraction, "fraction");
        Intrinsics.checkNotNullParameter(inputAssetType, "inputAssetType");
        this.f235399a = id10;
        this.f235400b = fraction;
        this.f235401c = inputAssetType;
        if (fraction.compareTo(BigDecimal.ZERO) < 0 || fraction.compareTo(BigDecimal.ONE) > 0) {
            throw new IllegalArgumentException("Fraction must be between 0 and 1");
        }
    }

    public final BigDecimal a() {
        Companion.getClass();
        BigDecimal fraction = this.f235400b;
        Intrinsics.checkNotNullParameter(fraction, "fraction");
        BigDecimal bigDecimalMovePointRight = fraction.movePointRight(2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMovePointRight, "movePointRight(...)");
        return bigDecimalMovePointRight;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f235399a, eVar.f235399a) && Intrinsics.f(this.f235400b, eVar.f235400b) && this.f235401c == eVar.f235401c;
    }

    @Override // pel.f
    public final String getId() {
        return this.f235399a;
    }

    public final int hashCode() {
        return this.f235401c.hashCode() + t61.a.d(this.f235400b, this.f235399a.hashCode() * 31, 31);
    }
}
