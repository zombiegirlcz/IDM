package k01;

import android.content.Context;
import android.text.TextPaint;
import android.widget.RemoteViews;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import com.revolut.core.ui_kit_remote.R$style;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s70.a f179895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f179896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContextThemeWrapper f179897c;

    public a(Context context, s70.a intentProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.f179895a = intentProvider;
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        this.f179896b = packageName;
        ContextThemeWrapper context2 = new ContextThemeWrapper(context, R$style.UiKitTheme_Widgets);
        this.f179897c = context2;
        Intrinsics.checkNotNullParameter(context2, "context");
        AndroidDensity_androidKt.Density(context2);
        new AtomicReference(new TextPaint());
    }

    public abstract RemoteViews a(n nVar, b9.e eVar);

    public abstract boolean b(n nVar);
}
