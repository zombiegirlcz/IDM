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
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final b MCY_ACCOUNT_VERIFICATION;

    @NotNull
    private static final Set<String> templates;

    @NotNull
    private final String template = "topup-india/account-verification";

    static {
        b bVar = new b();
        MCY_ACCOUNT_VERIFICATION = bVar;
        b[] bVarArr = {bVar};
        $VALUES = bVarArr;
        him.a aVarN = s.n(bVarArr);
        $ENTRIES = aVarN;
        Companion = new a();
        ArrayList arrayList = new ArrayList(w.t(aVarN, 10));
        Iterator<E> it8 = aVarN.iterator();
        while (it8.hasNext()) {
            arrayList.add(((b) it8.next()).template);
        }
        templates = d0.i1(arrayList);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
