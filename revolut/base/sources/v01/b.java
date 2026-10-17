package v01;

import com.revolut.core.ui_kit_resources.R$attr;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements Serializable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f284709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f284710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f284711c;
    public final Integer d;
    public final int e;

    public static final class a {
        private a() {
        }
    }

    public b() {
        this(null, 0, null, null, CertificateBody.profileType);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f284709a, bVar.f284709a) && this.f284710b == bVar.f284710b && Intrinsics.f(this.f284711c, bVar.f284711c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e;
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.b(this.f284710b, this.f284709a.hashCode() * 31, 31), 961, this.f284711c);
        Integer num = this.d;
        return j6.a.b(this.e, (iC + (num == null ? 0 : num.hashCode())) * 31, 31);
    }

    public b(CharSequence text, int i, String typeface, Integer num, int i2) {
        text = (i2 & 1) != 0 ? "" : text;
        i = (i2 & 2) != 0 ? R$attr.uikit_colorForeground : i;
        typeface = (i2 & 4) != 0 ? "R_Medium" : typeface;
        num = (i2 & 16) != 0 ? null : num;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        this.f284709a = text;
        this.f284710b = i;
        this.f284711c = typeface;
        this.d = num;
        this.e = 2;
    }
}
