package o23;

import com.revolut.feature.address.common.api.R$string;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class e0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 AVENIDA;
    public static final e0 CALLE;
    public static final e0 CARRERA;
    public static final e0 DIAGONAL;
    public static final e0 TRANSVERSAL;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f221445id;
    private final int nameRes;

    static {
        e0 e0Var = new e0("CALLE", 0, "Calle", R$string.address_form_co_street_type_calle);
        CALLE = e0Var;
        e0 e0Var2 = new e0("CARRERA", 1, "Carrera", R$string.address_form_co_street_type_carrera);
        CARRERA = e0Var2;
        e0 e0Var3 = new e0("AVENIDA", 2, "Avenida", R$string.address_form_co_street_type_avenida);
        AVENIDA = e0Var3;
        e0 e0Var4 = new e0("DIAGONAL", 3, "Diagonal", R$string.address_form_co_street_type_diagonal);
        DIAGONAL = e0Var4;
        e0 e0Var5 = new e0("TRANSVERSAL", 4, "Transversal", R$string.address_form_co_street_type_transversal);
        TRANSVERSAL = e0Var5;
        e0[] e0VarArr = {e0Var, e0Var2, e0Var3, e0Var4, e0Var5};
        $VALUES = e0VarArr;
        $ENTRIES = vc.s.n(e0VarArr);
    }

    public e0(String str, int i, String str2, int i2) {
        this.f221445id = str2;
        this.nameRes = i2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }

    public final int b() {
        return this.nameRes;
    }

    public final String getId() {
        return this.f221445id;
    }
}
