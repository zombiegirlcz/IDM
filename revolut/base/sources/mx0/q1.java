package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class q1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q1[] $VALUES;
    public static final q1 ABORTED_BY_SCREEN;
    public static final q1 ABORTED_BY_SCREEN_MARK_AS_VIEWED;
    public static final q1 CLICK_ON_ACTION;
    public static final q1 CLICK_ON_SKIP;
    public static final q1 FAILED_TO_PLAY_STORIES;
    public static final q1 SCREEN_FAILED_TO_PROVIDE_STORIES;
    public static final q1 STORIES_FINISHED;

    static {
        q1 q1Var = new q1("CLICK_ON_ACTION", 0);
        CLICK_ON_ACTION = q1Var;
        q1 q1Var2 = new q1("CLICK_ON_SKIP", 1);
        CLICK_ON_SKIP = q1Var2;
        q1 q1Var3 = new q1("STORIES_FINISHED", 2);
        STORIES_FINISHED = q1Var3;
        q1 q1Var4 = new q1("FAILED_TO_PLAY_STORIES", 3);
        FAILED_TO_PLAY_STORIES = q1Var4;
        q1 q1Var5 = new q1("SCREEN_FAILED_TO_PROVIDE_STORIES", 4);
        SCREEN_FAILED_TO_PROVIDE_STORIES = q1Var5;
        q1 q1Var6 = new q1("ABORTED_BY_SCREEN_MARK_AS_VIEWED", 5);
        ABORTED_BY_SCREEN_MARK_AS_VIEWED = q1Var6;
        q1 q1Var7 = new q1("ABORTED_BY_SCREEN", 6);
        ABORTED_BY_SCREEN = q1Var7;
        q1[] q1VarArr = {q1Var, q1Var2, q1Var3, q1Var4, q1Var5, q1Var6, q1Var7};
        $VALUES = q1VarArr;
        $ENTRIES = vc.s.n(q1VarArr);
    }

    public static q1 valueOf(String str) {
        return (q1) Enum.valueOf(q1.class, str);
    }

    public static q1[] values() {
        return (q1[]) $VALUES.clone();
    }
}
