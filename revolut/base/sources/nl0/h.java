package nl0;

import java.util.Set;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.d0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;

    @NotNull
    public static final Set<h> ALL;
    public static final h BOLD;

    @NotNull
    public static final g Companion;
    public static final h HEADER;
    public static final h HTTP_HTTPS_LINK;
    public static final h ITALIC;
    public static final h LINK;
    public static final h NEW_LINE;
    public static final h ORDERED_LIST;
    public static final h STRIKE;
    public static final h UNORDERED_LIST;

    static {
        h hVar = new h("HEADER", 0);
        HEADER = hVar;
        h hVar2 = new h("UNORDERED_LIST", 1);
        UNORDERED_LIST = hVar2;
        h hVar3 = new h("ORDERED_LIST", 2);
        ORDERED_LIST = hVar3;
        h hVar4 = new h("BOLD", 3);
        BOLD = hVar4;
        h hVar5 = new h("ITALIC", 4);
        ITALIC = hVar5;
        h hVar6 = new h("STRIKE", 5);
        STRIKE = hVar6;
        h hVar7 = new h("LINK", 6);
        LINK = hVar7;
        h hVar8 = new h("HTTP_HTTPS_LINK", 7);
        HTTP_HTTPS_LINK = hVar8;
        h hVar9 = new h("NEW_LINE", 8);
        NEW_LINE = hVar9;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9};
        $VALUES = hVarArr;
        him.a aVarN = s.n(hVarArr);
        $ENTRIES = aVarN;
        Companion = new g();
        ALL = d0.i1(aVarN);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
