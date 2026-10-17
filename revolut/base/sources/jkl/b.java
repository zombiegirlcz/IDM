package jkl;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Ljkl/b;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "EVIDENCE_REQUIRED", "CLAIM_REQUIRED", "PERMISSION_REQUIRED", "EXISTING_ACCOUNT_FOUND", "LOCATION_REQUESTED", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @lg.b("2021")
    public static final b CLAIM_REQUIRED;

    @lg.b("2020")
    public static final b EVIDENCE_REQUIRED;

    @lg.b("2024")
    public static final b EXISTING_ACCOUNT_FOUND;

    @lg.b("2101")
    public static final b LOCATION_REQUESTED;

    @lg.b("2022")
    public static final b PERMISSION_REQUIRED;

    @NotNull
    private final String value;

    static {
        b bVar = new b("EVIDENCE_REQUIRED", 0, "2020");
        EVIDENCE_REQUIRED = bVar;
        b bVar2 = new b("CLAIM_REQUIRED", 1, "2021");
        CLAIM_REQUIRED = bVar2;
        b bVar3 = new b("PERMISSION_REQUIRED", 2, "2022");
        PERMISSION_REQUIRED = bVar3;
        b bVar4 = new b("EXISTING_ACCOUNT_FOUND", 3, "2024");
        EXISTING_ACCOUNT_FOUND = bVar4;
        b bVar5 = new b("LOCATION_REQUESTED", 4, "2101");
        LOCATION_REQUESTED = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
    }

    public b(String str, int i, String str2) {
        this.value = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
