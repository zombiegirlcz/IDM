package t2m;

import android.widget.Button;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nd.l;
import x2m.f;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fragment f267599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f267600c;
    public final l d;
    public final ArrayList e;

    public b(Fragment fragment, List buttonResIds, f settings) {
        l uiColorChanger = new l();
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(buttonResIds, "buttonResIds");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(uiColorChanger, "uiColorChanger");
        super(settings);
        this.f267599b = fragment;
        this.f267600c = buttonResIds;
        this.d = uiColorChanger;
        ArrayList arrayList = new ArrayList(w.t(buttonResIds, 10));
        Iterator it8 = buttonResIds.iterator();
        while (it8.hasNext()) {
            arrayList.add((Button) this.f267599b.requireView().findViewById(((Number) it8.next()).intValue()));
        }
        this.e = arrayList;
        fragment.getLifecycle().addObserver(this);
    }

    @Override // t2m.c
    public final void a(f settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.d.getClass();
        Intrinsics.checkNotNullParameter(settings, "settings");
        ArrayList buttons = this.e;
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        l.b(settings, buttons);
    }

    @Override // t2m.c
    public final void b() {
        this.f267599b.getLifecycle().removeObserver(this);
    }
}
