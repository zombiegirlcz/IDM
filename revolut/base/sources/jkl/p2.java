package jkl;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Ljkl/p2;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "ADDRESS", "BIRTHDATE", "CITIZENSHIP", "EMAIL", "NAME", "OPENID", "PHONE", "PROFILE", "UNKNOWN", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p2[] $VALUES;

    @lg.b("address")
    public static final p2 ADDRESS;

    @lg.b("birthdate")
    public static final p2 BIRTHDATE;

    @lg.b("citizenship")
    public static final p2 CITIZENSHIP;

    @lg.b("email")
    public static final p2 EMAIL;

    @lg.b("name")
    public static final p2 NAME;

    @lg.b("openid")
    public static final p2 OPENID;

    @lg.b("phone")
    public static final p2 PHONE;

    @lg.b("profile")
    public static final p2 PROFILE;

    @he0.b
    public static final p2 UNKNOWN;

    @NotNull
    private final String value;

    static {
        p2 p2Var = new p2("ADDRESS", 0, "address");
        ADDRESS = p2Var;
        p2 p2Var2 = new p2("BIRTHDATE", 1, "birthdate");
        BIRTHDATE = p2Var2;
        p2 p2Var3 = new p2("CITIZENSHIP", 2, "citizenship");
        CITIZENSHIP = p2Var3;
        p2 p2Var4 = new p2("EMAIL", 3, "email");
        EMAIL = p2Var4;
        p2 p2Var5 = new p2("NAME", 4, "name");
        NAME = p2Var5;
        p2 p2Var6 = new p2("OPENID", 5, "openid");
        OPENID = p2Var6;
        p2 p2Var7 = new p2("PHONE", 6, "phone");
        PHONE = p2Var7;
        p2 p2Var8 = new p2("PROFILE", 7, "profile");
        PROFILE = p2Var8;
        p2 p2Var9 = new p2("UNKNOWN", 8, "");
        UNKNOWN = p2Var9;
        p2[] p2VarArr = {p2Var, p2Var2, p2Var3, p2Var4, p2Var5, p2Var6, p2Var7, p2Var8, p2Var9};
        $VALUES = p2VarArr;
        $ENTRIES = vc.s.n(p2VarArr);
    }

    public p2(String str, int i, String str2) {
        this.value = str2;
    }

    public static p2 valueOf(String str) {
        return (p2) Enum.valueOf(p2.class, str);
    }

    public static p2[] values() {
        return (p2[]) $VALUES.clone();
    }
}
