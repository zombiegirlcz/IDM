package u2m;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f276727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f276728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f276729c;
    public final Integer d;
    public final Integer e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f276730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f276731h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f276732j;
    public final Integer k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f276733l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f276734m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f276735n;
    public final Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f276736p;

    public h(int i, int i2, Integer num, Map map, int i3, int i5) {
        Integer numValueOf = Integer.valueOf(R.string.tdcoreekyc__nfcTutorial_attention);
        Integer numValueOf2 = Integer.valueOf(R.string.tdcoreekyc__commonTutorial_cautionTitle);
        num = (i5 & 4) != 0 ? null : num;
        numValueOf = (i5 & 8) != 0 ? null : numValueOf;
        numValueOf2 = (i5 & 16) != 0 ? null : numValueOf2;
        this.f276727a = i;
        this.f276728b = i2;
        this.f276729c = num;
        this.d = numValueOf;
        this.e = numValueOf2;
        this.f = map;
        this.f276730g = i3;
        this.f276731h = num != null ? 0 : 8;
        this.i = numValueOf != null ? 0 : 8;
        this.f276732j = numValueOf2 != null ? 0 : 8;
        f fVar = (f) map.get(g.Left);
        this.k = fVar != null ? Integer.valueOf(fVar.f276725a) : null;
        this.f276733l = fVar != null ? Integer.valueOf(fVar.f276726b) : null;
        f fVar2 = (f) map.get(g.Center);
        this.f276734m = fVar2 != null ? Integer.valueOf(fVar2.f276725a) : null;
        this.f276735n = fVar2 != null ? Integer.valueOf(fVar2.f276726b) : null;
        f fVar3 = (f) map.get(g.Right);
        this.o = fVar3 != null ? Integer.valueOf(fVar3.f276725a) : null;
        this.f276736p = fVar3 != null ? Integer.valueOf(fVar3.f276726b) : null;
    }

    public static String a(Context context, Integer num) {
        if (num == null || num.intValue() <= 0) {
            return "";
        }
        String string = context.getString(num.intValue());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f276727a == hVar.f276727a && this.f276728b == hVar.f276728b && Intrinsics.f(this.f276729c, hVar.f276729c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && this.f.equals(hVar.f) && this.f276730g == hVar.f276730g;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f276728b, Integer.hashCode(this.f276727a) * 31, 31);
        Integer num = this.f276729c;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        return Integer.hashCode(this.f276730g) + p.a.b((iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Tutorial(imageResId=");
        sb6.append(this.f276727a);
        sb6.append(", descriptionResId=");
        sb6.append(this.f276728b);
        sb6.append(", subDescriptionResId=");
        sb6.append(this.f276729c);
        sb6.append(", remarkResId=");
        sb6.append(this.d);
        sb6.append(", warningResId=");
        sb6.append(this.e);
        sb6.append(", ngMap=");
        sb6.append(this.f);
        sb6.append(", buttonResId=");
        return j6.a.t(sb6, this.f276730g, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
