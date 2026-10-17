package ho9;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BPAY_BILLER;

    @NotNull
    public static final a Companion;
    public static final b NZ_BILLS_BILLER;
    public static final b TAPI_BILLER;
    public static final b UPI_CONTACT;

    @NotNull
    private final String value;

    static {
        b bVar = new b("BPAY_BILLER", 0, "bpay-biller");
        BPAY_BILLER = bVar;
        b bVar2 = new b("UPI_CONTACT", 1, "upi-contact");
        UPI_CONTACT = bVar2;
        b bVar3 = new b("TAPI_BILLER", 2, "tapi-biller");
        TAPI_BILLER = bVar3;
        b bVar4 = new b("NZ_BILLS_BILLER", 3, "nz-bills-biller");
        NZ_BILLS_BILLER = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
    }

    public b(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String b() {
        return this.value;
    }
}
