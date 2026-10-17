package yvh;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @NotNull
    public static final c Companion;
    public static final d JOINT;
    public static final d PERSONAL;
    public static final d PRO;
    public static final d YOUTH;

    @NotNull
    private final String scopeName;

    static {
        d dVar = new d("PERSONAL", 0, "PERSONAL");
        PERSONAL = dVar;
        d dVar2 = new d("JOINT", 1, "JOINT");
        JOINT = dVar2;
        d dVar3 = new d("YOUTH", 2, "YOUTH");
        YOUTH = dVar3;
        d dVar4 = new d("PRO", 3, "PRO");
        PRO = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
        Companion = new c();
    }

    public d(String str, int i, String str2) {
        this.scopeName = str2;
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

    public final String b() {
        return this.scopeName;
    }
}
