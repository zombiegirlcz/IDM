package hp;

import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class g {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f154362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzl.b f154363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f154364c;

    public g(z80.b phoneToolsProvider, zzl.b regexMatcher, c cpfValidator, b cnpjValidator) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        Intrinsics.checkNotNullParameter(cpfValidator, "cpfValidator");
        Intrinsics.checkNotNullParameter(cnpjValidator, "cnpjValidator");
        this.f154362a = phoneToolsProvider;
        this.f154363b = regexMatcher;
        this.f154364c = cnpjValidator;
    }

    public final PixIdentifiedType a(String value) {
        boolean zEquals;
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(value, "key");
        z80.b bVar = this.f154362a;
        boolean z = true;
        boolean z3 = bVar.k(value, "BR") && value.length() == 11;
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sb6 = new StringBuilder();
        int length = value.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = value.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb6.append(cCharAt);
            }
        }
        String string = sb6.toString();
        if (string.length() != 11) {
            zEquals = false;
        } else {
            for (int i2 = 0; i2 < string.length(); i2++) {
                if (string.charAt(i2) != string.charAt(0)) {
                    String strSubstring = string.substring(0, 9);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    String strA = c.a(strSubstring);
                    String strSubstring2 = string.substring(0, 9);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    String strA2 = c.a(strSubstring2 + strA);
                    String strSubstring3 = string.substring(0, 9);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                    zEquals = string.equals(strSubstring3 + strA + strA2);
                    break;
                }
            }
            zEquals = false;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = value.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        zzl.c cVar = (zzl.c) this.f154363b;
        if (cVar.a("^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$", lowerCase)) {
            String lowerCase2 = value.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            return new PixIdentifiedType.Valid.Random(lowerCase2);
        }
        if (cVar.a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", value)) {
            String lowerCase3 = value.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            return new PixIdentifiedType.Valid.Email(lowerCase3);
        }
        b bVar2 = this.f154364c;
        if (bVar2.c(value)) {
            return new PixIdentifiedType.Valid.Cnpj(bVar2.b(value));
        }
        if (zEquals && z3) {
            return new PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous(bVar.a(value, "BR", yk0.b.E164), jli.g.f(value));
        }
        if (zEquals) {
            return new PixIdentifiedType.Valid.Cpf(jli.g.f(value));
        }
        if (z3) {
            return new PixIdentifiedType.Valid.Phone(bVar.a(value, "BR", yk0.b.E164), true);
        }
        try {
            if (bVar.e(value) == null) {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        } catch (NullPointerException unused) {
            boolValueOf = null;
        }
        if (!a0.H(value, "+", false) || boolValueOf == null) {
            return null;
        }
        return new PixIdentifiedType.Valid.Phone(bVar.a(value, "BR", yk0.b.E164), false);
    }

    public final boolean b(String qrCode) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        String lowerCase = qrCode.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return d0.J(lowerCase, "0014br.gov.bcb.pix", false) && ch.qos.logback.core.util.a.x("^(?<payload>000201.+6304)(?<checksum>[0-9A-F]{4})$", qrCode);
    }
}
