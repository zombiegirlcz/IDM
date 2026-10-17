package jkl;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Ljkl/j0;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BANK_ID", "BIO_PUBLIC_KEY", "DAP", "GOOGLE", "PUBLIC_KEY", "UAE_PASS", "WEBAUTHN", "UNKNOWN", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;

    @lg.b("bankid_se")
    public static final j0 BANK_ID;

    @lg.b("bio_public_key")
    public static final j0 BIO_PUBLIC_KEY;

    @lg.b("dap")
    public static final j0 DAP;

    @lg.b("google")
    public static final j0 GOOGLE;

    @lg.b("public_key")
    public static final j0 PUBLIC_KEY;

    @lg.b("uae_pass")
    public static final j0 UAE_PASS;

    @he0.b
    public static final j0 UNKNOWN;

    @lg.b("webauthn")
    public static final j0 WEBAUTHN;

    @NotNull
    private final String value;

    static {
        j0 j0Var = new j0("BANK_ID", 0, "bankid_se");
        BANK_ID = j0Var;
        j0 j0Var2 = new j0("BIO_PUBLIC_KEY", 1, "bio_public_key");
        BIO_PUBLIC_KEY = j0Var2;
        j0 j0Var3 = new j0("DAP", 2, "dap");
        DAP = j0Var3;
        j0 j0Var4 = new j0("GOOGLE", 3, "google");
        GOOGLE = j0Var4;
        j0 j0Var5 = new j0("PUBLIC_KEY", 4, "public_key");
        PUBLIC_KEY = j0Var5;
        j0 j0Var6 = new j0("UAE_PASS", 5, "uae_pass");
        UAE_PASS = j0Var6;
        j0 j0Var7 = new j0("WEBAUTHN", 6, "webauthn");
        WEBAUTHN = j0Var7;
        j0 j0Var8 = new j0("UNKNOWN", 7, "");
        UNKNOWN = j0Var8;
        j0[] j0VarArr = {j0Var, j0Var2, j0Var3, j0Var4, j0Var5, j0Var6, j0Var7, j0Var8};
        $VALUES = j0VarArr;
        $ENTRIES = vc.s.n(j0VarArr);
    }

    public j0(String str, int i, String str2) {
        this.value = str2;
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
