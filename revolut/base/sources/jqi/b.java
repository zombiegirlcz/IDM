package jqi;

import android.app.Activity;
import android.view.View;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends fsi.c implements e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final fsi.b f177724l = new fsi.b("TWIN_HORIZONTAL_BUTTON_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f177725h;
    public final Activity i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TwinHorizontalButton f177726j;
    public final ihm.b k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Activity activity) {
        super(f177724l);
        d configuration = d.f177727b;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f177725h = configuration;
        this.i = activity;
        this.k = j6.a.h("create(...)");
    }

    @Override // fsi.a
    public final void I() {
        View viewFindViewById = this.i.findViewById(this.f177725h.f177728a);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TwinHorizontalButton twinHorizontalButton = (TwinHorizontalButton) viewFindViewById;
        this.f177726j = twinHorizontalButton;
        if (twinHorizontalButton != null) {
            twinHorizontalButton.addOnLayoutChangeListener(new androidx.camera.viewfinder.a(this, 15));
        } else {
            Intrinsics.r("twinHorizontalButton");
            throw null;
        }
    }
}
