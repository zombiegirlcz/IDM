package t7d;

import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import h30.l;
import i7d.i;
import i7d.n;
import i7d.o;
import koi.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import sy6.j;
import vkm.q;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f268628c;
    public final o d;
    public ListSubheaderDelegate e;
    public InputDisclosureDelegate f;

    public c(i host, o modelExtension) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        this.f268628c = host;
        this.d = modelExtension;
    }

    @Override // yji.d
    public final void M() {
        i iVar = this.f268628c;
        k kVarC = iVar.b1().f.c(ListSubheaderDelegate.class);
        if (kVarC == null) {
            throw new IllegalStateException(l.r("No delegate found for class ", o0.f186429a.b(ListSubheaderDelegate.class).e()));
        }
        this.e = (ListSubheaderDelegate) kVarC;
        k kVarC2 = iVar.b1().f.c(InputDisclosureDelegate.class);
        if (kVarC2 == null) {
            throw new IllegalStateException(l.r("No delegate found for class ", o0.f186429a.b(InputDisclosureDelegate.class).e()));
        }
        this.f = (InputDisclosureDelegate) kVarC2;
        ListSubheaderDelegate listSubheaderDelegate = this.e;
        Continuation continuation = null;
        if (listSubheaderDelegate == null) {
            Intrinsics.r("subheaderDelegate");
            throw null;
        }
        vkm.d dVarB = rd0.e.b(listSubheaderDelegate.f52707c);
        InputDisclosureDelegate inputDisclosureDelegate = this.f;
        if (inputDisclosureDelegate != null) {
            yji.d.H(this, q.J(dVarB, rd0.e.b(inputDisclosureDelegate.f52538c)), new j(this, continuation, 22), 3);
        } else {
            Intrinsics.r("inputDisclosureDelegate");
            throw null;
        }
    }

    @Override // yji.d
    public final void onCreate() {
        i iVar = this.f268628c;
        koi.c cVar = iVar.b1().f;
        if (cVar.c(ListSubheaderDelegate.class) == null) {
            cVar.a(new ListSubheaderDelegate());
        }
        koi.c cVar2 = iVar.b1().f;
        if (cVar2.c(InputDisclosureDelegate.class) == null) {
            cVar2.a(new InputDisclosureDelegate());
        }
    }
}
