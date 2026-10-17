package njf;

import aqd.n1;
import com.revolut.data.model.Data;
import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen;
import efm.w;
import java.util.Optional;
import java.util.Set;
import kfm.o;
import kfm.p;
import kotlin.Function;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nhg.f0;
import nmb.v;
import nme.c0;
import nn3.z;
import nof.l;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements o, p, kfm.g, kfm.d, kfm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f216484b;

    public /* synthetic */ c(Function function, int i) {
        this.f216483a = i;
        this.f216484b = function;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f216483a) {
            case 16:
                ((noe.g) this.f216484b).invoke(obj2);
                break;
            case 17:
                ((noe.g) this.f216484b).invoke(obj2);
                break;
            case 18:
                ((noe.g) this.f216484b).invoke(obj2);
                break;
            case 19:
                ((noe.g) this.f216484b).invoke(obj2);
                break;
            default:
                ((nof.j) this.f216484b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f216483a;
        Function function = this.f216484b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((b) function).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((b) function).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((f0) function).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((b) function).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((f0) function).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (a) ((n1) function).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((b) function).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((d) function).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((b) function).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((b) function).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((b) function).invoke(p0);
            case 11:
                ContactsChooserScreen.Companion aVar = ContactsChooserScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (fn3.c) ((c0) function).invoke(p0);
            case 12:
                ContactsChooserScreen.Companion aVar2 = ContactsChooserScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (fn3.c) ((c0) function).invoke(p0);
            case 13:
                ContactsChooserScreen.Companion aVar3 = ContactsChooserScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (fn3.c) ((c0) function).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((nn3.w) function).invoke(p0);
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 25:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((z) function).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (l) ((nnf.h) function).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Set) ((nnf.h) function).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((z) function).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Optional) ((nnf.h) function).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((nof.j) function).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((nof.j) function).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        nnf.h hVar = (nnf.h) this.f216484b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) hVar.invoke(p0)).booleanValue();
    }

    @Override // kfm.d
    public boolean test(Object p0, Object p17) {
        v vVar = (v) this.f216484b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return ((Boolean) vVar.invoke(p0, p17)).booleanValue();
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        v vVar = (v) this.f216484b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (Pair) vVar.invoke(p0, p17);
    }
}
