package gkl;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m APPLE;
    public static final m BIO_PUBLIC_KEY;

    @NotNull
    public static final l Companion;
    public static final m EMAIL;
    public static final m GOOGLE;
    public static final m IDENTITY_ID;
    public static final m PASSWORD;
    public static final m PHONE;
    public static final m PIN;
    public static final m PUBLIC_KEY;
    public static final m UNKNOWN;
    public static final m WEBAUTHN;

    @NotNull
    private final String value;

    static {
        m mVar = new m("APPLE", 0, "apple");
        APPLE = mVar;
        m mVar2 = new m("EMAIL", 1, "email");
        EMAIL = mVar2;
        m mVar3 = new m("GOOGLE", 2, "google");
        GOOGLE = mVar3;
        m mVar4 = new m("IDENTITY_ID", 3, "sub");
        IDENTITY_ID = mVar4;
        m mVar5 = new m("PASSWORD", 4, "password");
        PASSWORD = mVar5;
        m mVar6 = new m("PHONE", 5, "phone");
        PHONE = mVar6;
        m mVar7 = new m("PIN", 6, "pin");
        PIN = mVar7;
        m mVar8 = new m("BIO_PUBLIC_KEY", 7, "bio_public_key");
        BIO_PUBLIC_KEY = mVar8;
        m mVar9 = new m("PUBLIC_KEY", 8, "public_key");
        PUBLIC_KEY = mVar9;
        m mVar10 = new m("WEBAUTHN", 9, "webauthn");
        WEBAUTHN = mVar10;
        m mVar11 = new m("UNKNOWN", 10, "");
        UNKNOWN = mVar11;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11};
        $VALUES = mVarArr;
        $ENTRIES = vc.s.n(mVarArr);
        Companion = new l();
    }

    public m(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    public final String b() {
        return this.value;
    }
}
