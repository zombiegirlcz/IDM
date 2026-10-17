package o8b;

import java.util.List;
import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    public static final d Companion;
    public static final e FRENCH;
    public static final e GERMAN;
    public static final e ITALIAN;

    @NotNull
    private final Lazy countries$delegate;

    static {
        wi0.b.Companion.getClass();
        wi0.b bVar = wi0.b.W;
        wi0.b bVar2 = wi0.b.k;
        wi0.b bVar3 = wi0.b.J;
        wi0.b bVar4 = wi0.b.T0;
        wi0.b bVar5 = wi0.b.f297771r;
        e eVar = new e("GERMAN", 0, bVar, bVar2, bVar3, bVar4, bVar5);
        GERMAN = eVar;
        e eVar2 = new e("FRENCH", 1, wi0.b.f297760n0, wi0.b.E, bVar5, bVar3, wi0.b.f297788x1);
        FRENCH = eVar2;
        e eVar3 = new e("ITALIAN", 2, bVar4, bVar3);
        ITALIAN = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
        Companion = new d();
    }

    public e(String str, int i, wi0.b... bVarArr) {
        this.countries$delegate = j.b(new o10.c(bVarArr, 10));
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final List a() {
        return (List) this.countries$delegate.getValue();
    }
}
