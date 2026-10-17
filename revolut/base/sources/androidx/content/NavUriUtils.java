package androidx.content;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005¨\u0006\f"}, d2 = {"Landroidx/navigation/NavUriUtils;", "", "<init>", "()V", "encode", "", "s", "allow", "decode", "parse", "Landroid/net/Uri;", "uriString", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavUriUtils {

    @NotNull
    public static final NavUriUtils INSTANCE = new NavUriUtils();

    private NavUriUtils() {
    }

    public static /* synthetic */ String encode$default(NavUriUtils navUriUtils, String str, String str2, int i, Object obj2) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return navUriUtils.encode(str, str2);
    }

    @NotNull
    public final String decode(@NotNull String s2) {
        Intrinsics.checkNotNullParameter(s2, "s");
        String strDecode = Uri.decode(s2);
        Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
        return strDecode;
    }

    @NotNull
    public final String encode(@NotNull String s2, String allow) {
        Intrinsics.checkNotNullParameter(s2, "s");
        String strEncode = Uri.encode(s2, allow);
        Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
        return strEncode;
    }

    @NotNull
    public final Uri parse(@NotNull String uriString) {
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        Uri uri2 = Uri.parse(uriString);
        Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
        return uri2;
    }
}
