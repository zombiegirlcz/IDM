package nqf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f218436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dnk.l f218437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f01.c f218438c;

    public c(fk3.a configurationInteractor, dnk.l countryChooserMapper, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(countryChooserMapper, "countryChooserMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f218436a = configurationInteractor;
        this.f218437b = countryChooserMapper;
        this.f218438c = uiKitResources;
    }

    public final ArrayList a() {
        List listB = ((ik3.c) this.f218436a).b();
        ArrayList arrayList = new ArrayList(w.t(listB, 10));
        Iterator it8 = listB.iterator();
        while (it8.hasNext()) {
            kii.e.B(wi0.b.Companion, (String) it8.next(), arrayList);
        }
        return arrayList;
    }
}
