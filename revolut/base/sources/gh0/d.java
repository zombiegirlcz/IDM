package gh0;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d GOOGLE;
    public static final d HUAWEI;

    static {
        d dVar = new d() { // from class: gh0.b

            @NotNull
            private final String serviceCodeName = "GPS";

            @Override // gh0.d
            public final String a() {
                return this.serviceCodeName;
            }
        };
        GOOGLE = dVar;
        d dVar2 = new d() { // from class: gh0.c

            @NotNull
            private final String serviceCodeName = "HAG";

            @Override // gh0.d
            public final String a() {
                return this.serviceCodeName;
            }
        };
        HUAWEI = dVar2;
        d[] dVarArr = {dVar, dVar2};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public abstract String a();
}
