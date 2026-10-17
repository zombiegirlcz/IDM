package ta1;

import com.youTransactor.uCube.rpc.Constants;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    public static final d Companion;
    public static final e RESOURCE_FILE_NOT_IMPLEMENTED;
    public static final e SAME_FILE_VERSION;
    public static final e SOMETHING_WENT_WRONG;
    private final int errorCode;

    static {
        e eVar = new e("SAME_FILE_VERSION", 0, Constants.UPDATE_WITH_SAME_VERSION);
        SAME_FILE_VERSION = eVar;
        e eVar2 = new e("RESOURCE_FILE_NOT_IMPLEMENTED", 1, -750);
        RESOURCE_FILE_NOT_IMPLEMENTED = eVar2;
        e eVar3 = new e("SOMETHING_WENT_WRONG", 2, -1);
        SOMETHING_WENT_WRONG = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
        Companion = new d();
    }

    public e(String str, int i, int i2) {
        this.errorCode = i2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final int a() {
        return this.errorCode;
    }
}
