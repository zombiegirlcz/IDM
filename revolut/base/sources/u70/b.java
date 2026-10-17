package u70;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ERROR_MESSAGE_CUSTOM_KEY;
    public static final b FILE_NAME_CUSTOM_KEY;
    public static final b FUNCTION_NAME_CUSTOM_KEY;
    public static final b HTTP_STATUS_CODE_CUSTOM_KEY;
    public static final b REQUEST_ID_CUSTOM_KEY;
    public static final b URL_PATH_CUSTOM_KEY;

    @NotNull
    private final String value;

    static {
        b bVar = new b("ERROR_MESSAGE_CUSTOM_KEY", 0, "ApiError.ErrorMessage");
        ERROR_MESSAGE_CUSTOM_KEY = bVar;
        b bVar2 = new b("FILE_NAME_CUSTOM_KEY", 1, "ApiError.FileName");
        FILE_NAME_CUSTOM_KEY = bVar2;
        b bVar3 = new b("FUNCTION_NAME_CUSTOM_KEY", 2, "ApiError.FunctionName");
        FUNCTION_NAME_CUSTOM_KEY = bVar3;
        b bVar4 = new b("URL_PATH_CUSTOM_KEY", 3, "URL");
        URL_PATH_CUSTOM_KEY = bVar4;
        b bVar5 = new b("HTTP_STATUS_CODE_CUSTOM_KEY", 4, "ApiError.httpStatusCode");
        HTTP_STATUS_CODE_CUSTOM_KEY = bVar5;
        b bVar6 = new b("REQUEST_ID_CUSTOM_KEY", 5, "ApiError.RequestId");
        REQUEST_ID_CUSTOM_KEY = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public b(String str, int i, String str2) {
        this.value = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
