package dv9;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @NotNull
    public static final c Companion;
    public static final d ERROR;
    public static final d SENDING;
    public static final d SENT;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f118062id;

    static {
        d dVar = new d("SENDING", 0, "SENDING");
        SENDING = dVar;
        d dVar2 = new d("SENT", 1, "SENT");
        SENT = dVar2;
        d dVar3 = new d("ERROR", 2, "ERROR");
        ERROR = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
        Companion = new c();
    }

    public d(String str, int i, String str2) {
        this.f118062id = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f118062id;
    }
}
