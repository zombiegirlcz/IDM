package uz8;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final j Companion;
    public static final k US_LOCATION_POPUP;

    static {
        k kVar = new k("US_LOCATION_POPUP", 0);
        US_LOCATION_POPUP = kVar;
        k[] kVarArr = {kVar};
        $VALUES = kVarArr;
        $ENTRIES = vc.s.n(kVarArr);
        Companion = new j();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new ux7.g(24));
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
