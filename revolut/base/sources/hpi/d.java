package hpi;

import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.core.ui.activity.CustomTheme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d extends BaseDelegatesActivity {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ jpi.a f154555r0 = new jpi.a((Object) null);

    public final RecyclerView Z0() {
        a aVar = this.f154555r0.f177290b;
        if (aVar == null) {
            Intrinsics.r("layoutBuilder");
            throw null;
        }
        RecyclerView recyclerView = aVar.e;
        if (recyclerView != null) {
            return recyclerView;
        }
        throw new IllegalStateException("recyclerView hasn't been setup");
    }

    public abstract c b1();

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c configuration = b1();
        CustomTheme customTheme = this.c0;
        if ((customTheme != null ? customTheme.f98692b : null) != null) {
            configuration.f154554l = true;
        }
        ContextWrapper context = this.f98684b0;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f154555r0.c(context, configuration);
    }
}
