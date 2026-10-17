package hb;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class b {
    public static final b GRANTED;
    public static final b NOT_GRANTED;
    public static final b PENDING;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ b[] f150535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f150536b;

    static {
        b bVar = new b("PENDING", 0);
        PENDING = bVar;
        b bVar2 = new b("GRANTED", 1);
        GRANTED = bVar2;
        b bVar3 = new b("NOT_GRANTED", 2);
        NOT_GRANTED = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f150535a = bVarArr;
        f150536b = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f150535a.clone();
    }
}
