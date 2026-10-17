package sw4;

import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetLoadingDelegate;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f266097a;

    public d(h hVar, String str) {
        this.f266097a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Function0 it8 = (Function0) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        String widgetId = this.f266097a;
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return new AvatarWidgetLoadingDelegate.Model(widgetId, null, null);
    }
}
