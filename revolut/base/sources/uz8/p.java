package uz8;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final p COMPLETED;
    public static final p CONTENT_FINISHED;
    public static final p CONTENT_STARTED;

    @NotNull
    public static final o Companion;
    public static final p LOCKED;
    public static final p NOT_STARTED;
    public static final p QUIZ_STARTED;

    static {
        p pVar = new p("NOT_STARTED", 0);
        NOT_STARTED = pVar;
        p pVar2 = new p("CONTENT_STARTED", 1);
        CONTENT_STARTED = pVar2;
        p pVar3 = new p("CONTENT_FINISHED", 2);
        CONTENT_FINISHED = pVar3;
        p pVar4 = new p("QUIZ_STARTED", 3);
        QUIZ_STARTED = pVar4;
        p pVar5 = new p("COMPLETED", 4);
        COMPLETED = pVar5;
        p pVar6 = new p("LOCKED", 5);
        LOCKED = pVar6;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5, pVar6};
        $VALUES = pVarArr;
        $ENTRIES = vc.s.n(pVarArr);
        Companion = new o();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new ux7.g(26));
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
