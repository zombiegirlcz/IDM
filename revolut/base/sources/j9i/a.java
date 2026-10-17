package j9i;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature_reactions_keyboard.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f172341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f172342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f172343c;
    public final boolean d;
    public final List e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnalyticsProduct f172344g;

    public a() {
        this(null, CertificateBody.profileType);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f172341a == aVar.f172341a && this.f172342b == aVar.f172342b && this.f172343c == aVar.f172343c && this.d == aVar.d && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f && Intrinsics.f(this.f172344g, aVar.f172344g);
    }

    public final int hashCode() {
        return this.f172344g.hashCode() + j6.a.c(p.a.d(j6.a.c(j6.a.b(this.f172343c, j6.a.b(this.f172342b, Integer.hashCode(this.f172341a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public a(AnalyticsProduct.Retail retail, int i) {
        int i2 = R$string.reactions_keyboard_title;
        int i3 = R$string.reactions_keyboard_error_message;
        int i5 = R$string.reactions_keyboard_error_action;
        boolean z = (i & 8) != 0;
        List availableTypes = v.k(b.STICKER, b.GIF);
        boolean z3 = (i & 32) != 0;
        AnalyticsProduct analyticsProduct = retail;
        analyticsProduct = (i & 64) != 0 ? AnalyticsProduct.Shared.RevolutUIKit.f : analyticsProduct;
        Intrinsics.checkNotNullParameter(availableTypes, "availableTypes");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f172341a = i2;
        this.f172342b = i3;
        this.f172343c = i5;
        this.d = z;
        this.e = availableTypes;
        this.f = z3;
        this.f172344g = analyticsProduct;
    }
}
