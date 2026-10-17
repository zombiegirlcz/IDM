package c70;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.UserManager;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClipboardManager f21822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f21823b;

    public a(ClipboardManager clipboardManager, b copyPasteRestrictionChecker) {
        Intrinsics.checkNotNullParameter(clipboardManager, "clipboardManager");
        Intrinsics.checkNotNullParameter(copyPasteRestrictionChecker, "copyPasteRestrictionChecker");
        this.f21822a = clipboardManager;
        this.f21823b = copyPasteRestrictionChecker;
    }

    public static /* synthetic */ void b(a aVar, String str, CharSequence charSequence, boolean z, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        aVar.a(str, charSequence, z);
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public final void a(String str, CharSequence text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        ClipData clipDataNewPlainText = ClipData.newPlainText(str, text);
        if (z) {
            ClipDescription description = clipDataNewPlainText.getDescription();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putBoolean("android.content.extra.IS_SENSITIVE", true);
            description.setExtras(persistableBundle);
        }
        this.f21822a.setPrimaryClip(clipDataNewPlainText);
    }

    public final void c(String str, CharSequence text, boolean z, Function0 notificationAction) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(notificationAction, "notificationAction");
        a(str, text, z);
        if (g()) {
            Object systemService = this.f21823b.f21824a.getContext().getSystemService("user");
            UserManager userManager = systemService instanceof UserManager ? (UserManager) systemService : null;
            if (!(userManager == null ? false : userManager.hasUserRestriction("no_cross_profile_copy_paste"))) {
                return;
            }
        }
        notificationAction.invoke();
    }

    public final String d() {
        ClipData.Item itemAt;
        CharSequence text;
        ClipData primaryClip = this.f21822a.getPrimaryClip();
        if (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    public final String e() throws IOException {
        String strD = d();
        if (strD == null) {
            return null;
        }
        StringBuilder sb6 = new StringBuilder();
        int length = strD.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = strD.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb6.append(cCharAt);
            }
        }
        String string = sb6.toString();
        if (string != null) {
            return f0.U0(6, string);
        }
        return null;
    }

    public final boolean f(String mimeType) {
        ClipDescription primaryClipDescription;
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        ClipboardManager clipboardManager = this.f21822a;
        return clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null && primaryClipDescription.hasMimeType(mimeType);
    }
}
