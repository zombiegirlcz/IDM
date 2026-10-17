package mri;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final i Companion;
    public static final j PERSONAL;
    public static final j PERSONAL_JOINT;
    public static final j TEEN;
    public static final j YOUTH;

    static {
        j jVar = new j("PERSONAL", 0);
        PERSONAL = jVar;
        j jVar2 = new j("PERSONAL_JOINT", 1);
        PERSONAL_JOINT = jVar2;
        j jVar3 = new j("YOUTH", 2);
        YOUTH = jVar3;
        j jVar4 = new j("TEEN", 3);
        TEEN = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        $VALUES = jVarArr;
        $ENTRIES = vc.s.n(jVarArr);
        Companion = new i();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new mq4.b(3));
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
