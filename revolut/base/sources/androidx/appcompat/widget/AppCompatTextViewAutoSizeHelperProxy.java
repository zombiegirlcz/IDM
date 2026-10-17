package androidx.appcompat.widget;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0004\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u0005¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/appcompat/widget/AppCompatTextViewAutoSizeHelperProxy;", "", "<init>", "()V", "invokeAndReturnWithDefault", "T", "obj", "methodName", "", "defaultValue", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppCompatTextViewAutoSizeHelperProxy {

    @NotNull
    public static final AppCompatTextViewAutoSizeHelperProxy INSTANCE = new AppCompatTextViewAutoSizeHelperProxy();

    private AppCompatTextViewAutoSizeHelperProxy() {
    }

    @NotNull
    public final <T> T invokeAndReturnWithDefault(@NotNull Object obj2, @NotNull String methodName, @NotNull T defaultValue) {
        Intrinsics.checkNotNullParameter(obj2, "obj");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t2 = (T) AppCompatTextViewAutoSizeHelper.invokeAndReturnWithDefault(obj2, methodName, defaultValue);
        Intrinsics.checkNotNullExpressionValue(t2, "invokeAndReturnWithDefault(...)");
        return t2;
    }
}
