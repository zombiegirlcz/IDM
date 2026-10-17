package eo;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CERTIFICATE_GENERATION;
    public static final d DECRYPTION_WITH_CIPHER;
    public static final d SIGNATURE_DELETION;
    public static final d SIGNATURE_GENERATION;
    public static final d SIGNATURE_INITIALIZATION;
    public static final d SIGNATURE_SIGNING;

    @NotNull
    private final String value;

    static {
        d dVar = new d("CERTIFICATE_GENERATION", 0, "CERTIFICATE_GENERATION");
        CERTIFICATE_GENERATION = dVar;
        d dVar2 = new d("DECRYPTION_WITH_CIPHER", 1, "DECRYPTION_WITH_CIPHER");
        DECRYPTION_WITH_CIPHER = dVar2;
        d dVar3 = new d("SIGNATURE_DELETION", 2, "SIGNATURE_DELETION");
        SIGNATURE_DELETION = dVar3;
        d dVar4 = new d("SIGNATURE_GENERATION", 3, "SIGNATURE_GENERATION");
        SIGNATURE_GENERATION = dVar4;
        d dVar5 = new d("SIGNATURE_INITIALIZATION", 4, "SIGNATURE_INITIALIZATION");
        SIGNATURE_INITIALIZATION = dVar5;
        d dVar6 = new d("SIGNATURE_SIGNING", 5, "SIGNATURE_SIGNING");
        SIGNATURE_SIGNING = dVar6;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public d(String str, int i, String str2) {
        this.value = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
