package b9;

import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class l {
    private static final /* synthetic */ l[] $VALUES;
    public static final l UNSUPPORTED;
    public static final l active;
    private static final Map<String, l> cache;
    public static final l checked;
    public static final l disabled;
    public static final l empty;
    public static final l enabled;
    public static final l first_child;
    public static final l first_of_type;
    public static final l focus;
    public static final l hover;
    public static final l indeterminate;
    public static final l lang;
    public static final l last_child;
    public static final l last_of_type;
    public static final l link;
    public static final l not;
    public static final l nth_child;
    public static final l nth_last_child;
    public static final l nth_last_of_type;
    public static final l nth_of_type;
    public static final l only_child;
    public static final l only_of_type;
    public static final l root;
    public static final l target;
    public static final l visited;

    static {
        l lVar = new l("target", 0);
        target = lVar;
        l lVar2 = new l("root", 1);
        root = lVar2;
        l lVar3 = new l("nth_child", 2);
        nth_child = lVar3;
        l lVar4 = new l("nth_last_child", 3);
        nth_last_child = lVar4;
        l lVar5 = new l("nth_of_type", 4);
        nth_of_type = lVar5;
        l lVar6 = new l("nth_last_of_type", 5);
        nth_last_of_type = lVar6;
        l lVar7 = new l("first_child", 6);
        first_child = lVar7;
        l lVar8 = new l("last_child", 7);
        last_child = lVar8;
        l lVar9 = new l("first_of_type", 8);
        first_of_type = lVar9;
        l lVar10 = new l("last_of_type", 9);
        last_of_type = lVar10;
        l lVar11 = new l("only_child", 10);
        only_child = lVar11;
        l lVar12 = new l("only_of_type", 11);
        only_of_type = lVar12;
        l lVar13 = new l("empty", 12);
        empty = lVar13;
        l lVar14 = new l("not", 13);
        not = lVar14;
        l lVar15 = new l("lang", 14);
        lang = lVar15;
        l lVar16 = new l("link", 15);
        link = lVar16;
        l lVar17 = new l("visited", 16);
        visited = lVar17;
        l lVar18 = new l("hover", 17);
        hover = lVar18;
        l lVar19 = new l("active", 18);
        active = lVar19;
        l lVar20 = new l("focus", 19);
        focus = lVar20;
        l lVar21 = new l("enabled", 20);
        enabled = lVar21;
        l lVar22 = new l("disabled", 21);
        disabled = lVar22;
        l lVar23 = new l("checked", 22);
        checked = lVar23;
        l lVar24 = new l("indeterminate", 23);
        indeterminate = lVar24;
        l lVar25 = new l("UNSUPPORTED", 24);
        UNSUPPORTED = lVar25;
        $VALUES = new l[]{lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12, lVar13, lVar14, lVar15, lVar16, lVar17, lVar18, lVar19, lVar20, lVar21, lVar22, lVar23, lVar24, lVar25};
        cache = new HashMap();
        for (l lVar26 : values()) {
            if (lVar26 != UNSUPPORTED) {
                cache.put(lVar26.name().replace('_', CoreConstants.DASH_CHAR), lVar26);
            }
        }
    }

    public static l a(String str) {
        l lVar = cache.get(str);
        return lVar != null ? lVar : UNSUPPORTED;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
