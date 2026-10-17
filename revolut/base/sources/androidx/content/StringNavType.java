package androidx.content;

import android.os.Bundle;
import androidx.os.SavedStateReader;
import androidx.os.SavedStateWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Landroidx/navigation/StringNavType;", "Landroidx/navigation/NavType;", "", "<init>", "()V", "name", "getName", "()Ljava/lang/String;", "put", "", "bundle", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "key", "value", "get", "parseValue", "serializeAsValue", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StringNavType extends NavType<String> {
    public StringNavType() {
        super(true);
    }

    @Override // androidx.content.NavType
    @NotNull
    public String getName() {
        return "string";
    }

    @Override // androidx.content.NavType
    public String get(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleM3590constructorimpl = SavedStateReader.m3590constructorimpl(bundle);
        if (!SavedStateReader.m3591containsimpl(bundleM3590constructorimpl, key) || SavedStateReader.m3612isNullimpl(bundleM3590constructorimpl, key)) {
            return null;
        }
        return SavedStateReader.m3607getStringimpl(bundleM3590constructorimpl, key);
    }

    @Override // androidx.content.NavType
    public String parseValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.f(value, "null")) {
            return null;
        }
        return value;
    }

    @Override // androidx.content.NavType
    public void put(@NotNull Bundle bundle, @NotNull String key, String value) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleM3615constructorimpl = SavedStateWriter.m3615constructorimpl(bundle);
        if (value != null) {
            SavedStateWriter.m3630putStringimpl(bundleM3615constructorimpl, key, value);
        } else {
            SavedStateWriter.m3625putNullimpl(bundleM3615constructorimpl, key);
        }
    }

    @Override // androidx.content.NavType
    @NotNull
    public String serializeAsValue(String value) {
        String strEncode$default;
        return (value == null || (strEncode$default = NavUriUtils.encode$default(NavUriUtils.INSTANCE, value, null, 2, null)) == null) ? "null" : strEncode$default;
    }
}
