package um2;

import android.os.Parcelable;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$RetainedState;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$ThemeInfo;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k0 extends cli.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f281204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f281205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f281206c = zhm.h0.f322473a;

    @Override // cli.i
    public final Parcelable a(Object obj2) {
        a currentState = (a) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new ThemeCustomisationContract$RetainedState(currentState.f281179c, !this.f281204a ? currentState.f : null, currentState.f281180g, this.f281206c, (ThemeCustomisationContract$ThemeInfo) currentState.f281178b.getContent(), this.f281205b);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        a initialState = (a) obj2;
        ThemeCustomisationContract$RetainedState retainedState = (ThemeCustomisationContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        this.f281206c = retainedState.d;
        this.f281205b = retainedState.f;
        ThemeCustomisationContract$ThemeInfo themeCustomisationContract$ThemeInfo = retainedState.e;
        return a.a(initialState, null, themeCustomisationContract$ThemeInfo != null ? new Data(themeCustomisationContract$ThemeInfo, null, false, 6, null) : new Data(null, null, true, 3, null), retainedState.f63771a, null, false, retainedState.f63772b, retainedState.f63773c, null, 153);
    }
}
