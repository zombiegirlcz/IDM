package kotlin.reflect.jvm.internal.impl.types.error;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class ErrorEntity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ErrorEntity[] $VALUES;
    public static final ErrorEntity ERROR_CLASS;
    public static final ErrorEntity ERROR_FUNCTION;
    public static final ErrorEntity ERROR_MODULE;
    public static final ErrorEntity ERROR_PROPERTY;
    public static final ErrorEntity ERROR_SCOPE;
    public static final ErrorEntity ERROR_TYPE;
    public static final ErrorEntity PARENT_OF_ERROR_SCOPE;

    @NotNull
    private final String debugText;

    static {
        ErrorEntity errorEntity = new ErrorEntity("ERROR_CLASS", 0, "<Error class: %s>");
        ERROR_CLASS = errorEntity;
        ErrorEntity errorEntity2 = new ErrorEntity("ERROR_FUNCTION", 1, "<Error function>");
        ERROR_FUNCTION = errorEntity2;
        ErrorEntity errorEntity3 = new ErrorEntity("ERROR_SCOPE", 2, "<Error scope>");
        ERROR_SCOPE = errorEntity3;
        ErrorEntity errorEntity4 = new ErrorEntity("ERROR_MODULE", 3, "<Error module>");
        ERROR_MODULE = errorEntity4;
        ErrorEntity errorEntity5 = new ErrorEntity("ERROR_PROPERTY", 4, "<Error property>");
        ERROR_PROPERTY = errorEntity5;
        ErrorEntity errorEntity6 = new ErrorEntity("ERROR_TYPE", 5, "[Error type: %s]");
        ERROR_TYPE = errorEntity6;
        ErrorEntity errorEntity7 = new ErrorEntity("PARENT_OF_ERROR_SCOPE", 6, "<Fake parent for error lexical scope>");
        PARENT_OF_ERROR_SCOPE = errorEntity7;
        ErrorEntity[] errorEntityArr = {errorEntity, errorEntity2, errorEntity3, errorEntity4, errorEntity5, errorEntity6, errorEntity7};
        $VALUES = errorEntityArr;
        $ENTRIES = s.n(errorEntityArr);
    }

    public ErrorEntity(String str, int i, String str2) {
        this.debugText = str2;
    }

    public static ErrorEntity valueOf(String str) {
        return (ErrorEntity) Enum.valueOf(ErrorEntity.class, str);
    }

    public static ErrorEntity[] values() {
        return (ErrorEntity[]) $VALUES.clone();
    }

    @NotNull
    public final String getDebugText() {
        return this.debugText;
    }
}
