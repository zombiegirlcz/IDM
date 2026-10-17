package ln3;

import aii.g;
import aii.u;
import b60.e;
import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen;
import kotlin.jvm.internal.Intrinsics;
import nhi.f;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements e, f {
    @Override // nhi.h, aii.p
    public final void b() {
    }

    @Override // nhi.f
    public final g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof cn3.a)) {
            return null;
        }
        cn3.a aVar = (cn3.a) descriptor;
        return aVar.a(new ContactsChooserScreen(aVar.f25342a));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
