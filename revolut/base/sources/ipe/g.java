package ipe;

import ioe.o;
import ioe.p;
import ioe.q;
import ioe.r;
import ioe.s;
import ioe.t;
import ioe.u;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g MISSING_RESIDENCY;
    public static final g MISSING_TIN;
    public static final g POPUP;
    public static final g PRIMARY_COUNTRY_REQUIRED;
    public static final g PROHIBITED_RESIDENCY_ERROR;
    public static final g SELF_CERTIFICATION_CONFIRMATION_REQUIRED;
    private final int code;

    @NotNull
    private final Class<? extends u> dtoClass;

    static {
        g gVar = new g("MISSING_TIN", 0, 1010000, p.class);
        MISSING_TIN = gVar;
        g gVar2 = new g("MISSING_RESIDENCY", 1, 1010001, o.class);
        MISSING_RESIDENCY = gVar2;
        g gVar3 = new g("PRIMARY_COUNTRY_REQUIRED", 2, 1010003, r.class);
        PRIMARY_COUNTRY_REQUIRED = gVar3;
        g gVar4 = new g("POPUP", 3, 1010004, q.class);
        POPUP = gVar4;
        g gVar5 = new g("PROHIBITED_RESIDENCY_ERROR", 4, 1010005, s.class);
        PROHIBITED_RESIDENCY_ERROR = gVar5;
        g gVar6 = new g("SELF_CERTIFICATION_CONFIRMATION_REQUIRED", 5, 1010006, t.class);
        SELF_CERTIFICATION_CONFIRMATION_REQUIRED = gVar6;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6};
        $VALUES = gVarArr;
        $ENTRIES = vc.s.n(gVarArr);
    }

    public g(String str, int i, int i2, Class cls) {
        this.code = i2;
        this.dtoClass = cls;
    }

    public static EnumEntries c() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final int a() {
        return this.code;
    }

    public final Class b() {
        return this.dtoClass;
    }
}
