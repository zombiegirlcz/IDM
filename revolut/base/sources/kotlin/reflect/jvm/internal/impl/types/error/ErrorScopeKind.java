package kotlin.reflect.jvm.internal.impl.types.error;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class ErrorScopeKind {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ErrorScopeKind[] $VALUES;
    public static final ErrorScopeKind CAPTURED_TYPE_SCOPE;
    public static final ErrorScopeKind ERASED_RECEIVER_TYPE_SCOPE;
    public static final ErrorScopeKind ERROR_TYPE_SCOPE;
    public static final ErrorScopeKind INTEGER_LITERAL_TYPE_SCOPE;
    public static final ErrorScopeKind NON_CLASSIFIER_SUPER_TYPE_SCOPE;
    public static final ErrorScopeKind SCOPE_FOR_ABBREVIATION_TYPE;
    public static final ErrorScopeKind SCOPE_FOR_ERROR_CLASS;
    public static final ErrorScopeKind SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE;
    public static final ErrorScopeKind STUB_TYPE_SCOPE;
    public static final ErrorScopeKind UNSUPPORTED_TYPE_SCOPE;

    @NotNull
    private final String debugMessage;

    static {
        ErrorScopeKind errorScopeKind = new ErrorScopeKind("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");
        CAPTURED_TYPE_SCOPE = errorScopeKind;
        ErrorScopeKind errorScopeKind2 = new ErrorScopeKind("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");
        INTEGER_LITERAL_TYPE_SCOPE = errorScopeKind2;
        ErrorScopeKind errorScopeKind3 = new ErrorScopeKind("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");
        ERASED_RECEIVER_TYPE_SCOPE = errorScopeKind3;
        ErrorScopeKind errorScopeKind4 = new ErrorScopeKind("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");
        SCOPE_FOR_ABBREVIATION_TYPE = errorScopeKind4;
        ErrorScopeKind errorScopeKind5 = new ErrorScopeKind("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");
        STUB_TYPE_SCOPE = errorScopeKind5;
        ErrorScopeKind errorScopeKind6 = new ErrorScopeKind("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");
        NON_CLASSIFIER_SUPER_TYPE_SCOPE = errorScopeKind6;
        ErrorScopeKind errorScopeKind7 = new ErrorScopeKind("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");
        ERROR_TYPE_SCOPE = errorScopeKind7;
        ErrorScopeKind errorScopeKind8 = new ErrorScopeKind("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");
        UNSUPPORTED_TYPE_SCOPE = errorScopeKind8;
        ErrorScopeKind errorScopeKind9 = new ErrorScopeKind("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");
        SCOPE_FOR_ERROR_CLASS = errorScopeKind9;
        ErrorScopeKind errorScopeKind10 = new ErrorScopeKind("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s");
        SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE = errorScopeKind10;
        ErrorScopeKind[] errorScopeKindArr = {errorScopeKind, errorScopeKind2, errorScopeKind3, errorScopeKind4, errorScopeKind5, errorScopeKind6, errorScopeKind7, errorScopeKind8, errorScopeKind9, errorScopeKind10};
        $VALUES = errorScopeKindArr;
        $ENTRIES = s.n(errorScopeKindArr);
    }

    public ErrorScopeKind(String str, int i, String str2) {
        this.debugMessage = str2;
    }

    public static ErrorScopeKind valueOf(String str) {
        return (ErrorScopeKind) Enum.valueOf(ErrorScopeKind.class, str);
    }

    public static ErrorScopeKind[] values() {
        return (ErrorScopeKind[]) $VALUES.clone();
    }

    @NotNull
    public final String getDebugMessage() {
        return this.debugMessage;
    }
}
