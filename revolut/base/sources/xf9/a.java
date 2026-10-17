package xf9;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rd0.c;
import rd0.d;
import vkm.i;
import yji.n;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends n {
    @Override // yji.n
    public final void D2() {
    }

    @Override // yji.n
    public final void F2() {
    }

    @Override // yji.n
    public final void H2() {
    }

    public abstract boolean Z2(wi0.b bVar);

    public boolean b3() {
        return false;
    }

    public Flow c3() {
        return i.f290039a;
    }

    public void d(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("onMenuItemClicked: not supported: ", listId));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.WARNING, null, null, illegalStateException, h0Var);
    }

    public Flow d3() {
        return i.f290039a;
    }

    public abstract Flow e3();

    public abstract Unit f3();

    public void g3(String listId, String extractedValue, String str) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("onInputChanged: not supported: ", listId));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.WARNING, null, null, illegalStateException, h0Var);
    }

    public void h3(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("onInputHelperClauseClicked: not supported: ", clickData.f275445a));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.WARNING, null, null, illegalStateException, h0Var);
    }

    public void i3(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("onInputSecondaryIconClicked: not supported: ", model.f52580a));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.WARNING, null, null, illegalStateException, h0Var);
    }

    public void j3(LargeActionButtonDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("onLargeActionButtonClicked: not supported: ", model.f52613a));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.WARNING, null, null, illegalStateException, h0Var);
    }

    public void k1(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("onInputClicked: not supported: ", model.f52580a));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.WARNING, null, null, illegalStateException, h0Var);
    }

    public void k3(ListSubheaderDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("onListSubheaderItemStartImageClicked: not supported: ", model.f52708a));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.WARNING, null, null, illegalStateException, h0Var);
    }

    public void l3(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("onRowClicked: not supported: ", model.f53228a));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.WARNING, null, null, illegalStateException, h0Var);
    }

    public void m3(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
    }

    public void n3(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
    }
}
