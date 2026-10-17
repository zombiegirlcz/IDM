package mh8;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final f COMPLETED;

    @NotNull
    public static final e Companion;
    public static final f IN_PROGRESS;
    public static final f WAITING_USER_INPUT;

    static {
        f fVar = new f("IN_PROGRESS", 0);
        IN_PROGRESS = fVar;
        f fVar2 = new f("WAITING_USER_INPUT", 1);
        WAITING_USER_INPUT = fVar2;
        f fVar3 = new f("COMPLETED", 2);
        COMPLETED = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
        Companion = new e();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new mfl.b(13));
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
