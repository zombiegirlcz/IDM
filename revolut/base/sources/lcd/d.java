package lcd;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ACTIVE;
    public static final d CLOSED;
    public static final d CREATED;

    @NotNull
    public static final c Companion;
    public static final d PENDING_ACTIVATION;

    static {
        d dVar = new d("CREATED", 0);
        CREATED = dVar;
        d dVar2 = new d("PENDING_ACTIVATION", 1);
        PENDING_ACTIVATION = dVar2;
        d dVar3 = new d("ACTIVE", 2);
        ACTIVE = dVar3;
        d dVar4 = new d("CLOSED", 3);
        CLOSED = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
        Companion = new c();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
