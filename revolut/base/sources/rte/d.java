package rte;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.d0;
import zhm.w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @NotNull
    public static final c Companion;
    public static final d MCY_TOPUP;

    @NotNull
    private static final Set<String> templates;

    @NotNull
    private final String template = "topup-india";

    static {
        d dVar = new d();
        MCY_TOPUP = dVar;
        d[] dVarArr = {dVar};
        $VALUES = dVarArr;
        him.a aVarN = s.n(dVarArr);
        $ENTRIES = aVarN;
        Companion = new c();
        ArrayList arrayList = new ArrayList(w.t(aVarN, 10));
        Iterator<E> it8 = aVarN.iterator();
        while (it8.hasNext()) {
            arrayList.add(((d) it8.next()).template);
        }
        templates = d0.i1(arrayList);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
