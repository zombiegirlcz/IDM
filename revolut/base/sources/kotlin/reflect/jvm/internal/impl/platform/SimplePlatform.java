package kotlin.reflect.jvm.internal.impl.platform;

import ch.qos.logback.core.CoreConstants;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes14.dex */
public abstract class SimplePlatform {
    @NotNull
    public String getTargetName() {
        return getTargetPlatformVersion().getDescription();
    }

    @NotNull
    public TargetPlatformVersion getTargetPlatformVersion() {
        return null;
    }

    @NotNull
    public String toString() {
        String targetName = getTargetName();
        if (targetName.length() > 0) {
            return a.l(CoreConstants.RIGHT_PARENTHESIS_CHAR, "null (", targetName);
        }
        return null;
    }
}
