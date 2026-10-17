package jkl;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Ljkl/b0;", "", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "a", "APPLE", "BIO_PUBLIC_KEY", "EMAIL", "GOOGLE", "IDENTITY_ID", "PASSWORD", "PHONE", "PIN", "PUBLIC_KEY", "WEBAUTHN", "UNKNOWN", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b0[] $VALUES;

    @lg.b("apple")
    public static final b0 APPLE;

    @lg.b("bio_public_key")
    public static final b0 BIO_PUBLIC_KEY;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @lg.b("email")
    public static final b0 EMAIL;

    @lg.b("google")
    public static final b0 GOOGLE;

    @lg.b("sub")
    public static final b0 IDENTITY_ID;

    @lg.b("password")
    public static final b0 PASSWORD;

    @lg.b("phone")
    public static final b0 PHONE;

    @lg.b("pin")
    public static final b0 PIN;

    @lg.b("public_key")
    public static final b0 PUBLIC_KEY;

    @he0.b
    public static final b0 UNKNOWN;

    @lg.b("webauthn")
    public static final b0 WEBAUTHN;

    @NotNull
    private final String value;

    /* JADX INFO: renamed from: jkl.b0$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public Companion(int i) {
        }
    }

    static {
        b0 b0Var = new b0("APPLE", 0, "apple");
        APPLE = b0Var;
        b0 b0Var2 = new b0("BIO_PUBLIC_KEY", 1, "bio_public_key");
        BIO_PUBLIC_KEY = b0Var2;
        b0 b0Var3 = new b0("EMAIL", 2, "email");
        EMAIL = b0Var3;
        b0 b0Var4 = new b0("GOOGLE", 3, "google");
        GOOGLE = b0Var4;
        b0 b0Var5 = new b0("IDENTITY_ID", 4, "sub");
        IDENTITY_ID = b0Var5;
        b0 b0Var6 = new b0("PASSWORD", 5, "password");
        PASSWORD = b0Var6;
        b0 b0Var7 = new b0("PHONE", 6, "phone");
        PHONE = b0Var7;
        b0 b0Var8 = new b0("PIN", 7, "pin");
        PIN = b0Var8;
        b0 b0Var9 = new b0("PUBLIC_KEY", 8, "public_key");
        PUBLIC_KEY = b0Var9;
        b0 b0Var10 = new b0("WEBAUTHN", 9, "webauthn");
        WEBAUTHN = b0Var10;
        b0 b0Var11 = new b0("UNKNOWN", 10, "");
        UNKNOWN = b0Var11;
        b0[] b0VarArr = {b0Var, b0Var2, b0Var3, b0Var4, b0Var5, b0Var6, b0Var7, b0Var8, b0Var9, b0Var10, b0Var11};
        $VALUES = b0VarArr;
        $ENTRIES = vc.s.n(b0VarArr);
        INSTANCE = new Companion(0);
    }

    public b0(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
