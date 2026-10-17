package wi1;

import com.revolut.feature.address.common.api.R$string;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c AVENIDA;
    public static final c CALLE;
    public static final c CARRERA;

    @NotNull
    public static final b Companion;
    public static final c DIAGONAL;
    public static final c TRANSVERSAL;
    private final int nameRes;

    static {
        c cVar = new c("CALLE", 0, R$string.address_form_co_street_type_calle);
        CALLE = cVar;
        c cVar2 = new c("CARRERA", 1, R$string.address_form_co_street_type_carrera);
        CARRERA = cVar2;
        c cVar3 = new c("AVENIDA", 2, R$string.address_form_co_street_type_avenida);
        AVENIDA = cVar3;
        c cVar4 = new c("DIAGONAL", 3, R$string.address_form_co_street_type_diagonal);
        DIAGONAL = cVar4;
        c cVar5 = new c("TRANSVERSAL", 4, R$string.address_form_co_street_type_transversal);
        TRANSVERSAL = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
        Companion = new b();
    }

    public c(String str, int i, int i2) {
        this.nameRes = i2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int b() {
        return this.nameRes;
    }
}
