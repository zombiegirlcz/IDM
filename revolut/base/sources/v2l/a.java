package v2l;

import android.os.Bundle;
import com.revolut.retail.common.ui.R$id;
import hpi.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a extends u2l.a {

    @NotNull
    public static final C1577a Companion = new C1577a();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f285751t0 = R$id.fragment_container;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ jpi.a f285752s0 = new jpi.a(f285751t0);

    /* JADX INFO: renamed from: v2l.a$a, reason: collision with other inner class name */
    public static final class C1577a {
        private C1577a() {
        }
    }

    @Override // u2l.a
    public final int c1() {
        return 0;
    }

    public abstract c g1();

    @Override // u2l.a, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c configuration = g1();
        Intrinsics.checkNotNullParameter(this, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f285752s0.c(this, configuration);
    }
}
