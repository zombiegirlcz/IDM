package zej;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f OPERATOR;
    public static final f PHONE_NUMBER;
    public static final f RECEIVER_NAME;

    @NotNull
    private final String formKey;

    static {
        f fVar = new f("PHONE_NUMBER", 0, "phoneNumber");
        PHONE_NUMBER = fVar;
        f fVar2 = new f("RECEIVER_NAME", 1, "receiverName");
        RECEIVER_NAME = fVar2;
        f fVar3 = new f("OPERATOR", 2, "operator");
        OPERATOR = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public f(String str, int i, String str2) {
        this.formKey = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final String b() {
        return this.formKey;
    }
}
