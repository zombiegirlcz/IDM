package androidx.glance.appwidget;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$AndroidRemoteViewsKt {

    @NotNull
    public static final ComposableSingletons$AndroidRemoteViewsKt INSTANCE = new ComposableSingletons$AndroidRemoteViewsKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f71lambda1 = ComposableLambdaKt.composableLambdaInstance(757789032, false, ComposableSingletons$AndroidRemoteViewsKt$lambda1$1.INSTANCE);

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$glance_appwidget_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m3489getLambda1$glance_appwidget_release() {
        return f71lambda1;
    }
}
