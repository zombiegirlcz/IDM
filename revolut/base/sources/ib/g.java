package ib;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f160070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f160071c;
    public static final g d;
    private static final /* synthetic */ g[] e;
    private static final /* synthetic */ EnumEntries f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f160072a;

    static {
        g gVar = new g("LOCALHOST_MICRO", 0, "http://10.0.2.2:9090");
        f160070b = gVar;
        g gVar2 = new g("SANDBOX_MINI", 1, "https://com-fourthline-dev1.mini.snplow.net");
        f160071c = gVar2;
        g gVar3 = new g("PRODUCTION", 2, "com-fourthline-prod1.collector.snplow.net");
        d = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
        e = gVarArr;
        f = s.n(gVarArr);
    }

    public g(String str, int i, String str2) {
        this.f160072a = str2;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) e.clone();
    }

    public final String a() {
        return this.f160072a;
    }
}
